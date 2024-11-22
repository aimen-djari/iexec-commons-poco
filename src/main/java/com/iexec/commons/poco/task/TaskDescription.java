/*
 * Copyright 2020-2023 IEXEC BLOCKCHAIN TECH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.iexec.commons.poco.task;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.iexec.commons.poco.chain.ChainDataset;
import com.iexec.commons.poco.chain.ChainDeal;
import com.iexec.commons.poco.chain.ChainTask;
import com.iexec.commons.poco.contract.generated.AbstractDatapool;
import com.iexec.commons.poco.dapp.DappType;
import com.iexec.commons.poco.tee.TeeEnclaveConfiguration;
import com.iexec.commons.poco.tee.TeeFramework;
import com.iexec.commons.poco.tee.TeeUtils;
import com.iexec.commons.poco.utils.BytesUtils;
import com.iexec.commons.poco.utils.MultiAddressHelper;
import lombok.Builder;
import lombok.Value;
import org.apache.commons.lang3.StringUtils;

import lombok.extern.slf4j.Slf4j;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Slf4j
@Value
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class TaskDescription {

        String chainTaskId;
        String requester;
        String beneficiary;
        String callback;
        DappType appType;
        String appUri;
        String appAddress;
        TeeEnclaveConfiguration appEnclaveConfiguration;
        String cmd;
        boolean isTeeTask;
        TeeFramework teeFramework;
        int botSize;
        int botFirstIndex;
        boolean datapool;
        List<String> datasetAddresses;
        List<String> datasetUris;
        List<String> datasetNames;
        List<String> datasetChecksums;
        List<String> inputFiles;
        boolean isResultEncryption;
        String resultStorageProvider;
        String resultStorageProxy;
        String smsUrl;
        Map<String, String> secrets;
        BigInteger trust;
        // from task
        int botIndex;
        long maxExecutionTime; // timeref ?
        long contributionDeadline;
        long finalDeadline;

        /**
         * Check if this task includes a dataset or not. The task is considered
         * as including a dataset only if all fields of the dataset are non-empty,
         * non-null values. The stack should ignore datasets with missing
         * information since they, inevitably, break the workflow. In the case
         * where those datasets are ignored, the worker will contribute an
         * application error caused by the missing dataset file.
         *
         * @return true if all dataset fields are all non-null,
         *         non-empty values, false otherwise.
         */
        public boolean containsDataset() {
                return datasetAddresses != null && datasetUris != null && datasetChecksums != null
                                && !datasetAddresses.isEmpty() && !StringUtils.isEmpty(datasetAddresses.get(0)) &&
                                !datasetAddresses.isEmpty() && !datasetAddresses.get(0).equals(BytesUtils.EMPTY_ADDRESS)
                                &&
                                !datasetUris.isEmpty() && !StringUtils.isEmpty(datasetUris.get(0)) &&
                                !datasetChecksums.isEmpty() && !StringUtils.isEmpty(datasetChecksums.get(0));
        }

        /**
         * Check if a callback is requested for this task.
         *
         * @return true if a callback address is found in the deal, false otherwise.
         */
        public boolean containsCallback() {
                return !StringUtils.isEmpty(callback) && !callback.equals(BytesUtils.EMPTY_ADDRESS);
        }

        /**
         * Check if this task includes some input files.
         *
         * @return true if at least one input file is present, false otherwise
         */
        public boolean containsInputFiles() {
                return inputFiles != null && !inputFiles.isEmpty();
        }

        public String getAppCommand() {
                String appArgs = appEnclaveConfiguration.getEntrypoint();
                // TODO: Add unit test
                if (!StringUtils.isEmpty(cmd)) {
                        appArgs = appArgs + " " + cmd;
                }
                return appArgs;
        }

        /**
         * A task is eligible to the Contribute And Finalize flow
         * if it matches the following conditions:
         * <ul>
         * <li>It is a TEE task
         * <li>Its trust is 1
         * <li>It does not contain a callback - bug in the PoCo, should be fixed
         * </ul>
         *
         * @return {@literal true} if eligible, {@literal false} otherwise.
         */
        public boolean isEligibleToContributeAndFinalize() {
                return isTeeTask
                                && BigInteger.ONE.equals(trust)
                                && !containsCallback();
        }

        /**
         * Create a {@link TaskDescription} from the provided chain deal. This method
         * if preferred to constructors or the builder method.
         *
         * @param chainDeal On-chain deal from PoCo smart contracts
         * @param chainTask On-chain task from PoCo smart contracts
         * @return the created taskDescription
         */
        public static TaskDescription toTaskDescription(ChainDeal chainDeal, ChainTask chainTask) {
                if (chainDeal == null || chainTask == null) {
                        return null;
                }
                List<String> datasetAddresses = new ArrayList<String>();
                List<String> datasetUris = new ArrayList<String>();
                List<String> datasetNames = new ArrayList<String>();
                List<String> datasetChecksums = new ArrayList<String>();
                boolean datapool = false;
                if (chainDeal.containsDataset()) {
                        ChainDataset chainDataset = chainDeal.getChainDataset();
                        AbstractDatapool datapoolContract = chainDataset.getDatapoolContract();
                        if (datapoolContract != null) {
                                datapool = true;
                                List<ChainDataset> datasets = chainDataset.getDatasets();
                                for (ChainDataset dataset : datasets) {
                                        try {
                                                Boolean isDatasetPresent = datapoolContract
                                                                .isDatasetPresentAtTaskCreation(
                                                                                dataset.getChainDatasetId(),
                                                                                BytesUtils.stringToBytes(chainTask
                                                                                                .getChainTaskId()))
                                                                .send();
                                                if (Boolean.TRUE.equals(isDatasetPresent)) {
                                                        datasetAddresses.add(dataset.getChainDatasetId());
                                                        datasetUris.add(MultiAddressHelper
                                                                        .convertToURI(dataset.getUri()));
                                                        datasetNames.add(dataset.getName());
                                                        datasetChecksums.add(dataset.getChecksum());
                                                }
                                        } catch (Exception e) {
                                                log.error("Failed to execute isDatasetPresentAtTaskCreation", e);
                                        }
                                }
                                log.info("task contains datapool: [datapoolAddress:{}, content:{}]",
                                                chainDataset.getChainDatasetId(), datasetAddresses);
                        } else {
                                datasetAddresses.add(chainDataset.getChainDatasetId());
                                datasetUris.add(MultiAddressHelper.convertToURI(chainDataset.getUri()));
                                datasetNames.add(chainDataset.getName());
                                datasetChecksums.add(chainDataset.getChecksum());
                                log.info("task contains dataset: [datasetAddress:{}, content:{}]",
                                                chainDataset.getChainDatasetId(), datasetAddresses.get(0));
                        }
                }
                final String tag = chainDeal.getTag();
                return TaskDescription.builder()
                                .chainTaskId(chainTask.getChainTaskId())
                                .requester(chainDeal
                                                .getRequester())
                                .beneficiary(chainDeal
                                                .getBeneficiary())
                                .callback(chainDeal
                                                .getCallback())
                                .appType(DappType.DOCKER)
                                .appUri(BytesUtils.hexStringToAscii(chainDeal.getChainApp()
                                                .getUri()))
                                .appAddress(chainDeal.getChainApp().getChainAppId())
                                .appEnclaveConfiguration(chainDeal.getChainApp()
                                                .getEnclaveConfiguration())
                                .cmd(chainDeal.getParams()
                                                .getIexecArgs())
                                .inputFiles(chainDeal.getParams()
                                                .getIexecInputFiles())
                                .isTeeTask(TeeUtils
                                                .isTeeTag(tag))
                                .teeFramework(TeeUtils
                                                .getTeeFramework(tag))
                                .isResultEncryption(chainDeal.getParams()
                                                .isIexecResultEncryption())
                                .resultStorageProvider(chainDeal.getParams()
                                                .getIexecResultStorageProvider())
                                .resultStorageProxy(chainDeal.getParams()
                                                .getIexecResultStorageProxy())
                                .secrets(chainDeal.getParams()
                                                .getIexecSecrets())
                                .datapool(datapool)
                                .datasetAddresses(datasetAddresses)
                                .datasetUris(datasetUris)
                                .datasetNames(datasetNames)
                                .datasetChecksums(datasetChecksums)
                                .botSize(chainDeal.getBotSize().intValue())
                                .botFirstIndex(chainDeal.getBotFirst().intValue())
                                .trust(chainDeal.getTrust())
                                // from task
                                .botIndex(chainTask.getIdx())
                                .maxExecutionTime(chainDeal.getChainCategory().getMaxExecutionTime()) // https://github.com/iExecBlockchainComputing/PoCo/blob/v5/contracts/modules/delegates/IexecPoco2Delegate.sol#L111
                                .contributionDeadline(chainTask.getContributionDeadline())
                                .finalDeadline(chainTask.getFinalDeadline())
                                .build();
        }
}
