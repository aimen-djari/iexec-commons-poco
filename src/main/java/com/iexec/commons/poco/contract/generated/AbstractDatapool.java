package com.iexec.commons.poco.contract.generated;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import org.web3j.abi.EventEncoder;
import org.web3j.abi.FunctionEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Bool;
import org.web3j.abi.datatypes.DynamicArray;
import org.web3j.abi.datatypes.DynamicBytes;
import org.web3j.abi.datatypes.DynamicStruct;
import org.web3j.abi.datatypes.Event;
import org.web3j.abi.datatypes.StaticStruct;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Bytes32;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.DefaultBlockParameter;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.protocol.core.methods.request.EthFilter;
import org.web3j.protocol.core.methods.response.BaseEventResponse;
import org.web3j.protocol.core.methods.response.Log;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tuples.generated.Tuple12;
import org.web3j.tuples.generated.Tuple2;
import org.web3j.tuples.generated.Tuple4;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 1.4.2.
 */
@SuppressWarnings("rawtypes")
public class AbstractDatapool extends Contract {
    public static final String BINARY = "0x";

    public static final String FUNC_ALLOWEDAPPS = "allowedApps";

    public static final String FUNC_ALLOWEDWORKERPOOLS = "allowedWorkerpools";

    public static final String FUNC_DATAPOOLADDRESSINREGISTRY = "datapoolAddressInRegistry";

    public static final String FUNC_DATASETENTRYEXITHISTORY = "datasetEntryExitHistory";

    public static final String FUNC_TASKHISTORY = "taskHistory";

    public static final String FUNC_VERSIONREWARDCLAIMED = "versionRewardClaimed";

    public static final String FUNC_VERSIONID = "versionid";

    public static final String FUNC_VERSIONS = "versions";

    public static final String FUNC_INITIALIZE = "initialize";

    public static final String FUNC_SHOWDATAPOOL = "showDatapool";

    public static final String FUNC_SETDATAPOOLOWNERPRICE = "setDatapoolOwnerPrice";

    public static final String FUNC_SETDATASETPRICE = "setDatasetPrice";

    public static final String FUNC_ADDDATASET = "addDataset";

    public static final String FUNC_REMOVEDATASET = "removeDataset";

    public static final String FUNC_ISACTIVEDATASET = "isActiveDataset";

    public static final String FUNC_ISINACTIVEDATASET = "isInactiveDataset";

    public static final String FUNC_CREATESIGNEDDATAPOOLORDER = "createSignedDatapoolOrder";

    public static final String FUNC_REGISTERTASKS = "registerTasks";

    public static final String FUNC_FINALIZETASK = "finalizeTask";

    public static final String FUNC_ISDATASETINCLUDEDINTASK = "isDatasetIncludedInTask";

    public static final String FUNC_WITHDRAWVERSIONREWARD = "withdrawVersionReward";

    public static final String FUNC_TASKEXISTS = "taskExists";

    public static final String FUNC_TASKFINALIZED = "taskFinalized";

    public static final Event ALLOWEDAPPADDED_EVENT = new Event("AllowedAppAdded", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>(true) {}));
    ;

    public static final Event ALLOWEDWORKERPOOLADDED_EVENT = new Event("AllowedWorkerpoolAdded", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>(true) {}));
    ;

    public static final Event DATAPOOLINITIALIZED_EVENT = new Event("DatapoolInitialized", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>(true) {}));
    ;

    public static final Event DATAPOOLORDERCREATED_EVENT = new Event("DatapoolOrderCreated", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>(true) {}, new TypeReference<DatasetOrder>() {}));
    ;

    public static final Event DATAPOOLTASKCREATED_EVENT = new Event("DatapoolTaskCreated", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>(true) {}, new TypeReference<Address>(true) {}, new TypeReference<Uint256>() {}));
    ;

    public static final Event DATAPOOLTASKFINALIZED_EVENT = new Event("DatapoolTaskFinalized", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>(true) {}));
    ;

    public static final Event DATASETADDED_EVENT = new Event("DatasetAdded", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>(true) {}));
    ;

    public static final Event DATASETREMOVED_EVENT = new Event("DatasetRemoved", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>(true) {}));
    ;

    public static final Event PRICINGPOLICYUPDATED_EVENT = new Event("PricingPolicyUpdated", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}));
    ;

    protected static final HashMap<String, String> _addresses;

    static {
        _addresses = new HashMap<String, String>();
    }

    @Deprecated
    protected AbstractDatapool(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected AbstractDatapool(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected AbstractDatapool(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected AbstractDatapool(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static List<AllowedAppAddedEventResponse> getAllowedAppAddedEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = staticExtractEventParametersWithLog(ALLOWEDAPPADDED_EVENT, transactionReceipt);
        ArrayList<AllowedAppAddedEventResponse> responses = new ArrayList<AllowedAppAddedEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            AllowedAppAddedEventResponse typedResponse = new AllowedAppAddedEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.app = (String) eventValues.getIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<AllowedAppAddedEventResponse> allowedAppAddedEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new Function<Log, AllowedAppAddedEventResponse>() {
            @Override
            public AllowedAppAddedEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(ALLOWEDAPPADDED_EVENT, log);
                AllowedAppAddedEventResponse typedResponse = new AllowedAppAddedEventResponse();
                typedResponse.log = log;
                typedResponse.app = (String) eventValues.getIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<AllowedAppAddedEventResponse> allowedAppAddedEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(ALLOWEDAPPADDED_EVENT));
        return allowedAppAddedEventFlowable(filter);
    }

    public static List<AllowedWorkerpoolAddedEventResponse> getAllowedWorkerpoolAddedEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = staticExtractEventParametersWithLog(ALLOWEDWORKERPOOLADDED_EVENT, transactionReceipt);
        ArrayList<AllowedWorkerpoolAddedEventResponse> responses = new ArrayList<AllowedWorkerpoolAddedEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            AllowedWorkerpoolAddedEventResponse typedResponse = new AllowedWorkerpoolAddedEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.workerpool = (String) eventValues.getIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<AllowedWorkerpoolAddedEventResponse> allowedWorkerpoolAddedEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new Function<Log, AllowedWorkerpoolAddedEventResponse>() {
            @Override
            public AllowedWorkerpoolAddedEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(ALLOWEDWORKERPOOLADDED_EVENT, log);
                AllowedWorkerpoolAddedEventResponse typedResponse = new AllowedWorkerpoolAddedEventResponse();
                typedResponse.log = log;
                typedResponse.workerpool = (String) eventValues.getIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<AllowedWorkerpoolAddedEventResponse> allowedWorkerpoolAddedEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(ALLOWEDWORKERPOOLADDED_EVENT));
        return allowedWorkerpoolAddedEventFlowable(filter);
    }

    public static List<DatapoolInitializedEventResponse> getDatapoolInitializedEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = staticExtractEventParametersWithLog(DATAPOOLINITIALIZED_EVENT, transactionReceipt);
        ArrayList<DatapoolInitializedEventResponse> responses = new ArrayList<DatapoolInitializedEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            DatapoolInitializedEventResponse typedResponse = new DatapoolInitializedEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.datapoolAddressInRegistry = (String) eventValues.getIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<DatapoolInitializedEventResponse> datapoolInitializedEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new Function<Log, DatapoolInitializedEventResponse>() {
            @Override
            public DatapoolInitializedEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(DATAPOOLINITIALIZED_EVENT, log);
                DatapoolInitializedEventResponse typedResponse = new DatapoolInitializedEventResponse();
                typedResponse.log = log;
                typedResponse.datapoolAddressInRegistry = (String) eventValues.getIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<DatapoolInitializedEventResponse> datapoolInitializedEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(DATAPOOLINITIALIZED_EVENT));
        return datapoolInitializedEventFlowable(filter);
    }

    public static List<DatapoolOrderCreatedEventResponse> getDatapoolOrderCreatedEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = staticExtractEventParametersWithLog(DATAPOOLORDERCREATED_EVENT, transactionReceipt);
        ArrayList<DatapoolOrderCreatedEventResponse> responses = new ArrayList<DatapoolOrderCreatedEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            DatapoolOrderCreatedEventResponse typedResponse = new DatapoolOrderCreatedEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.datapoolAddressInRegistry = (String) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.datapoolorder = (DatasetOrder) eventValues.getNonIndexedValues().get(0);
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<DatapoolOrderCreatedEventResponse> datapoolOrderCreatedEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new Function<Log, DatapoolOrderCreatedEventResponse>() {
            @Override
            public DatapoolOrderCreatedEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(DATAPOOLORDERCREATED_EVENT, log);
                DatapoolOrderCreatedEventResponse typedResponse = new DatapoolOrderCreatedEventResponse();
                typedResponse.log = log;
                typedResponse.datapoolAddressInRegistry = (String) eventValues.getIndexedValues().get(0).getValue();
                typedResponse.datapoolorder = (DatasetOrder) eventValues.getNonIndexedValues().get(0);
                return typedResponse;
            }
        });
    }

    public Flowable<DatapoolOrderCreatedEventResponse> datapoolOrderCreatedEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(DATAPOOLORDERCREATED_EVENT));
        return datapoolOrderCreatedEventFlowable(filter);
    }

    public static List<DatapoolTaskCreatedEventResponse> getDatapoolTaskCreatedEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = staticExtractEventParametersWithLog(DATAPOOLTASKCREATED_EVENT, transactionReceipt);
        ArrayList<DatapoolTaskCreatedEventResponse> responses = new ArrayList<DatapoolTaskCreatedEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            DatapoolTaskCreatedEventResponse typedResponse = new DatapoolTaskCreatedEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.taskid = (byte[]) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.datapoolAddressInRegistry = (String) eventValues.getIndexedValues().get(1).getValue();
            typedResponse.datasetCount = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<DatapoolTaskCreatedEventResponse> datapoolTaskCreatedEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new Function<Log, DatapoolTaskCreatedEventResponse>() {
            @Override
            public DatapoolTaskCreatedEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(DATAPOOLTASKCREATED_EVENT, log);
                DatapoolTaskCreatedEventResponse typedResponse = new DatapoolTaskCreatedEventResponse();
                typedResponse.log = log;
                typedResponse.taskid = (byte[]) eventValues.getIndexedValues().get(0).getValue();
                typedResponse.datapoolAddressInRegistry = (String) eventValues.getIndexedValues().get(1).getValue();
                typedResponse.datasetCount = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<DatapoolTaskCreatedEventResponse> datapoolTaskCreatedEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(DATAPOOLTASKCREATED_EVENT));
        return datapoolTaskCreatedEventFlowable(filter);
    }

    public static List<DatapoolTaskFinalizedEventResponse> getDatapoolTaskFinalizedEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = staticExtractEventParametersWithLog(DATAPOOLTASKFINALIZED_EVENT, transactionReceipt);
        ArrayList<DatapoolTaskFinalizedEventResponse> responses = new ArrayList<DatapoolTaskFinalizedEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            DatapoolTaskFinalizedEventResponse typedResponse = new DatapoolTaskFinalizedEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.taskid = (byte[]) eventValues.getIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<DatapoolTaskFinalizedEventResponse> datapoolTaskFinalizedEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new Function<Log, DatapoolTaskFinalizedEventResponse>() {
            @Override
            public DatapoolTaskFinalizedEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(DATAPOOLTASKFINALIZED_EVENT, log);
                DatapoolTaskFinalizedEventResponse typedResponse = new DatapoolTaskFinalizedEventResponse();
                typedResponse.log = log;
                typedResponse.taskid = (byte[]) eventValues.getIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<DatapoolTaskFinalizedEventResponse> datapoolTaskFinalizedEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(DATAPOOLTASKFINALIZED_EVENT));
        return datapoolTaskFinalizedEventFlowable(filter);
    }

    public static List<DatasetAddedEventResponse> getDatasetAddedEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = staticExtractEventParametersWithLog(DATASETADDED_EVENT, transactionReceipt);
        ArrayList<DatasetAddedEventResponse> responses = new ArrayList<DatasetAddedEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            DatasetAddedEventResponse typedResponse = new DatasetAddedEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.dataset = (String) eventValues.getIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<DatasetAddedEventResponse> datasetAddedEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new Function<Log, DatasetAddedEventResponse>() {
            @Override
            public DatasetAddedEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(DATASETADDED_EVENT, log);
                DatasetAddedEventResponse typedResponse = new DatasetAddedEventResponse();
                typedResponse.log = log;
                typedResponse.dataset = (String) eventValues.getIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<DatasetAddedEventResponse> datasetAddedEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(DATASETADDED_EVENT));
        return datasetAddedEventFlowable(filter);
    }

    public static List<DatasetRemovedEventResponse> getDatasetRemovedEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = staticExtractEventParametersWithLog(DATASETREMOVED_EVENT, transactionReceipt);
        ArrayList<DatasetRemovedEventResponse> responses = new ArrayList<DatasetRemovedEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            DatasetRemovedEventResponse typedResponse = new DatasetRemovedEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.dataset = (String) eventValues.getIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<DatasetRemovedEventResponse> datasetRemovedEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new Function<Log, DatasetRemovedEventResponse>() {
            @Override
            public DatasetRemovedEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(DATASETREMOVED_EVENT, log);
                DatasetRemovedEventResponse typedResponse = new DatasetRemovedEventResponse();
                typedResponse.log = log;
                typedResponse.dataset = (String) eventValues.getIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<DatasetRemovedEventResponse> datasetRemovedEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(DATASETREMOVED_EVENT));
        return datasetRemovedEventFlowable(filter);
    }

    public static List<PricingPolicyUpdatedEventResponse> getPricingPolicyUpdatedEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = staticExtractEventParametersWithLog(PRICINGPOLICYUPDATED_EVENT, transactionReceipt);
        ArrayList<PricingPolicyUpdatedEventResponse> responses = new ArrayList<PricingPolicyUpdatedEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            PricingPolicyUpdatedEventResponse typedResponse = new PricingPolicyUpdatedEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.datapoolOwnerPrice = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            typedResponse.datasetPrice = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<PricingPolicyUpdatedEventResponse> pricingPolicyUpdatedEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new Function<Log, PricingPolicyUpdatedEventResponse>() {
            @Override
            public PricingPolicyUpdatedEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(PRICINGPOLICYUPDATED_EVENT, log);
                PricingPolicyUpdatedEventResponse typedResponse = new PricingPolicyUpdatedEventResponse();
                typedResponse.log = log;
                typedResponse.datapoolOwnerPrice = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                typedResponse.datasetPrice = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<PricingPolicyUpdatedEventResponse> pricingPolicyUpdatedEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(PRICINGPOLICYUPDATED_EVENT));
        return pricingPolicyUpdatedEventFlowable(filter);
    }

    public RemoteFunctionCall<Boolean> allowedApps(String param0) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_ALLOWEDAPPS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteFunctionCall<Boolean> allowedWorkerpools(String param0) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_ALLOWEDWORKERPOOLS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteFunctionCall<String> datapoolAddressInRegistry() {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_DATAPOOLADDRESSINREGISTRY, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<Tuple2<BigInteger, BigInteger>> datasetEntryExitHistory(String param0, BigInteger param1) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_DATASETENTRYEXITHISTORY, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(param0), 
                new org.web3j.abi.datatypes.generated.Uint256(param1)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}));
        return new RemoteFunctionCall<Tuple2<BigInteger, BigInteger>>(function,
                new Callable<Tuple2<BigInteger, BigInteger>>() {
                    @Override
                    public Tuple2<BigInteger, BigInteger> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple2<BigInteger, BigInteger>(
                                (BigInteger) results.get(0).getValue(), 
                                (BigInteger) results.get(1).getValue());
                    }
                });
    }

    public RemoteFunctionCall<Tuple4<BigInteger, BigInteger, BigInteger, Boolean>> taskHistory(byte[] param0) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_TASKHISTORY, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}, new TypeReference<Bool>() {}));
        return new RemoteFunctionCall<Tuple4<BigInteger, BigInteger, BigInteger, Boolean>>(function,
                new Callable<Tuple4<BigInteger, BigInteger, BigInteger, Boolean>>() {
                    @Override
                    public Tuple4<BigInteger, BigInteger, BigInteger, Boolean> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple4<BigInteger, BigInteger, BigInteger, Boolean>(
                                (BigInteger) results.get(0).getValue(), 
                                (BigInteger) results.get(1).getValue(), 
                                (BigInteger) results.get(2).getValue(), 
                                (Boolean) results.get(3).getValue());
                    }
                });
    }

    public RemoteFunctionCall<BigInteger> versionRewardClaimed(BigInteger param0, String param1) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_VERSIONREWARDCLAIMED, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0), 
                new org.web3j.abi.datatypes.Address(param1)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<BigInteger> versionid() {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_VERSIONID, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<Tuple4<BigInteger, BigInteger, BigInteger, PricingPolicy>> versions(BigInteger param0) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_VERSIONS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}, new TypeReference<PricingPolicy>() {}));
        return new RemoteFunctionCall<Tuple4<BigInteger, BigInteger, BigInteger, PricingPolicy>>(function,
                new Callable<Tuple4<BigInteger, BigInteger, BigInteger, PricingPolicy>>() {
                    @Override
                    public Tuple4<BigInteger, BigInteger, BigInteger, PricingPolicy> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple4<BigInteger, BigInteger, BigInteger, PricingPolicy>(
                                (BigInteger) results.get(0).getValue(), 
                                (BigInteger) results.get(1).getValue(), 
                                (BigInteger) results.get(2).getValue(), 
                                (PricingPolicy) results.get(3));
                    }
                });
    }

    public RemoteFunctionCall<TransactionReceipt> initialize(String _datapoolAddressInRegistry) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(
                FUNC_INITIALIZE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_datapoolAddressInRegistry)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<Tuple12<String, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, List<DatasetInfo>>> showDatapool() {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_SHOWDATAPOOL, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}, new TypeReference<DynamicArray<DatasetInfo>>() {}));
        return new RemoteFunctionCall<Tuple12<String, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, List<DatasetInfo>>>(function,
                new Callable<Tuple12<String, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, List<DatasetInfo>>>() {
                    @Override
                    public Tuple12<String, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, List<DatasetInfo>> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple12<String, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, List<DatasetInfo>>(
                                (String) results.get(0).getValue(), 
                                (BigInteger) results.get(1).getValue(), 
                                (BigInteger) results.get(2).getValue(), 
                                (BigInteger) results.get(3).getValue(), 
                                (BigInteger) results.get(4).getValue(), 
                                (BigInteger) results.get(5).getValue(), 
                                (BigInteger) results.get(6).getValue(), 
                                (BigInteger) results.get(7).getValue(), 
                                (BigInteger) results.get(8).getValue(), 
                                (BigInteger) results.get(9).getValue(), 
                                (BigInteger) results.get(10).getValue(), 
                                convertToNative((List<DatasetInfo>) results.get(11).getValue()));
                    }
                });
    }

    public RemoteFunctionCall<TransactionReceipt> setDatapoolOwnerPrice(BigInteger _newDatapoolOwnerPrice) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(
                FUNC_SETDATAPOOLOWNERPRICE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_newDatapoolOwnerPrice)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> setDatasetPrice(BigInteger _newDatasetPrice) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(
                FUNC_SETDATASETPRICE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_newDatasetPrice)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> addDataset(String _datasetAddress) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(
                FUNC_ADDDATASET, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_datasetAddress)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> removeDataset(String _datasetAddress) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(
                FUNC_REMOVEDATASET, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_datasetAddress)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<Boolean> isActiveDataset(String _dataset) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_ISACTIVEDATASET, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_dataset)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteFunctionCall<Boolean> isInactiveDataset(String _dataset) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_ISINACTIVEDATASET, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_dataset)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteFunctionCall<TransactionReceipt> createSignedDatapoolOrder(String _app, String _workerpool, BigInteger _volume) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(
                FUNC_CREATESIGNEDDATAPOOLORDER, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_app), 
                new org.web3j.abi.datatypes.Address(_workerpool), 
                new org.web3j.abi.datatypes.generated.Uint256(_volume)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> registerTasks(byte[] _dealid, BigInteger botFirst, BigInteger botSize, BigInteger _versionid) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(
                FUNC_REGISTERTASKS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(_dealid), 
                new org.web3j.abi.datatypes.generated.Uint256(botFirst), 
                new org.web3j.abi.datatypes.generated.Uint256(botSize), 
                new org.web3j.abi.datatypes.generated.Uint256(_versionid)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> finalizeTask(byte[] _taskid) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(
                FUNC_FINALIZETASK, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(_taskid)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<Boolean> isDatasetIncludedInTask(String _datasetAddress, byte[] _taskid) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_ISDATASETINCLUDEDINTASK, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_datasetAddress), 
                new org.web3j.abi.datatypes.generated.Bytes32(_taskid)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteFunctionCall<TransactionReceipt> withdrawVersionReward(BigInteger _versionid, String _datasetAddress) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(
                FUNC_WITHDRAWVERSIONREWARD, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_versionid), 
                new org.web3j.abi.datatypes.Address(_datasetAddress)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<Boolean> taskExists(byte[] _taskid) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_TASKEXISTS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(_taskid)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteFunctionCall<Boolean> taskFinalized(byte[] _taskid) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_TASKFINALIZED, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(_taskid)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    @Deprecated
    public static AbstractDatapool load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new AbstractDatapool(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static AbstractDatapool load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new AbstractDatapool(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static AbstractDatapool load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new AbstractDatapool(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static AbstractDatapool load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new AbstractDatapool(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<AbstractDatapool> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider, String _owner, BigInteger _datapoolOwnerPrice, BigInteger _datasetPrice, List<String> _allowedApps, List<String> _allowedWorkerpools, String _pocoDelegateAddress) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_owner), 
                new org.web3j.abi.datatypes.generated.Uint256(_datapoolOwnerPrice), 
                new org.web3j.abi.datatypes.generated.Uint256(_datasetPrice), 
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.Address>(
                        org.web3j.abi.datatypes.Address.class,
                        org.web3j.abi.Utils.typeMap(_allowedApps, org.web3j.abi.datatypes.Address.class)), 
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.Address>(
                        org.web3j.abi.datatypes.Address.class,
                        org.web3j.abi.Utils.typeMap(_allowedWorkerpools, org.web3j.abi.datatypes.Address.class)), 
                new org.web3j.abi.datatypes.Address(_pocoDelegateAddress)));
        return deployRemoteCall(AbstractDatapool.class, web3j, credentials, contractGasProvider, BINARY, encodedConstructor);
    }

    public static RemoteCall<AbstractDatapool> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider, String _owner, BigInteger _datapoolOwnerPrice, BigInteger _datasetPrice, List<String> _allowedApps, List<String> _allowedWorkerpools, String _pocoDelegateAddress) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_owner), 
                new org.web3j.abi.datatypes.generated.Uint256(_datapoolOwnerPrice), 
                new org.web3j.abi.datatypes.generated.Uint256(_datasetPrice), 
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.Address>(
                        org.web3j.abi.datatypes.Address.class,
                        org.web3j.abi.Utils.typeMap(_allowedApps, org.web3j.abi.datatypes.Address.class)), 
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.Address>(
                        org.web3j.abi.datatypes.Address.class,
                        org.web3j.abi.Utils.typeMap(_allowedWorkerpools, org.web3j.abi.datatypes.Address.class)), 
                new org.web3j.abi.datatypes.Address(_pocoDelegateAddress)));
        return deployRemoteCall(AbstractDatapool.class, web3j, transactionManager, contractGasProvider, BINARY, encodedConstructor);
    }

    @Deprecated
    public static RemoteCall<AbstractDatapool> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, String _owner, BigInteger _datapoolOwnerPrice, BigInteger _datasetPrice, List<String> _allowedApps, List<String> _allowedWorkerpools, String _pocoDelegateAddress) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_owner), 
                new org.web3j.abi.datatypes.generated.Uint256(_datapoolOwnerPrice), 
                new org.web3j.abi.datatypes.generated.Uint256(_datasetPrice), 
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.Address>(
                        org.web3j.abi.datatypes.Address.class,
                        org.web3j.abi.Utils.typeMap(_allowedApps, org.web3j.abi.datatypes.Address.class)), 
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.Address>(
                        org.web3j.abi.datatypes.Address.class,
                        org.web3j.abi.Utils.typeMap(_allowedWorkerpools, org.web3j.abi.datatypes.Address.class)), 
                new org.web3j.abi.datatypes.Address(_pocoDelegateAddress)));
        return deployRemoteCall(AbstractDatapool.class, web3j, credentials, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    @Deprecated
    public static RemoteCall<AbstractDatapool> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, String _owner, BigInteger _datapoolOwnerPrice, BigInteger _datasetPrice, List<String> _allowedApps, List<String> _allowedWorkerpools, String _pocoDelegateAddress) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_owner), 
                new org.web3j.abi.datatypes.generated.Uint256(_datapoolOwnerPrice), 
                new org.web3j.abi.datatypes.generated.Uint256(_datasetPrice), 
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.Address>(
                        org.web3j.abi.datatypes.Address.class,
                        org.web3j.abi.Utils.typeMap(_allowedApps, org.web3j.abi.datatypes.Address.class)), 
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.Address>(
                        org.web3j.abi.datatypes.Address.class,
                        org.web3j.abi.Utils.typeMap(_allowedWorkerpools, org.web3j.abi.datatypes.Address.class)), 
                new org.web3j.abi.datatypes.Address(_pocoDelegateAddress)));
        return deployRemoteCall(AbstractDatapool.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    protected String getStaticDeployedAddress(String networkId) {
        return _addresses.get(networkId);
    }

    public static String getPreviouslyDeployedAddress(String networkId) {
        return _addresses.get(networkId);
    }

    public static class DatasetOrder extends DynamicStruct {
        public String dataset;

        public BigInteger datasetprice;

        public BigInteger volume;

        public byte[] tag;

        public String apprestrict;

        public String workerpoolrestrict;

        public String requesterrestrict;

        public BigInteger deadline;

        public byte[] salt;

        public byte[] sign;

        public DatasetOrder(String dataset, BigInteger datasetprice, BigInteger volume, byte[] tag, String apprestrict, String workerpoolrestrict, String requesterrestrict, BigInteger deadline, byte[] salt, byte[] sign) {
            super(new org.web3j.abi.datatypes.Address(dataset), 
                    new org.web3j.abi.datatypes.generated.Uint256(datasetprice), 
                    new org.web3j.abi.datatypes.generated.Uint256(volume), 
                    new org.web3j.abi.datatypes.generated.Bytes32(tag), 
                    new org.web3j.abi.datatypes.Address(apprestrict), 
                    new org.web3j.abi.datatypes.Address(workerpoolrestrict), 
                    new org.web3j.abi.datatypes.Address(requesterrestrict), 
                    new org.web3j.abi.datatypes.generated.Uint256(deadline), 
                    new org.web3j.abi.datatypes.generated.Bytes32(salt), 
                    new org.web3j.abi.datatypes.DynamicBytes(sign));
            this.dataset = dataset;
            this.datasetprice = datasetprice;
            this.volume = volume;
            this.tag = tag;
            this.apprestrict = apprestrict;
            this.workerpoolrestrict = workerpoolrestrict;
            this.requesterrestrict = requesterrestrict;
            this.deadline = deadline;
            this.salt = salt;
            this.sign = sign;
        }

        public DatasetOrder(Address dataset, Uint256 datasetprice, Uint256 volume, Bytes32 tag, Address apprestrict, Address workerpoolrestrict, Address requesterrestrict, Uint256 deadline, Bytes32 salt, DynamicBytes sign) {
            super(dataset, datasetprice, volume, tag, apprestrict, workerpoolrestrict, requesterrestrict, deadline, salt, sign);
            this.dataset = dataset.getValue();
            this.datasetprice = datasetprice.getValue();
            this.volume = volume.getValue();
            this.tag = tag.getValue();
            this.apprestrict = apprestrict.getValue();
            this.workerpoolrestrict = workerpoolrestrict.getValue();
            this.requesterrestrict = requesterrestrict.getValue();
            this.deadline = deadline.getValue();
            this.salt = salt.getValue();
            this.sign = sign.getValue();
        }
    }

    public static class PricingPolicy extends StaticStruct {
        public BigInteger datapoolOwnerPrice;

        public BigInteger datasetPrice;

        public PricingPolicy(BigInteger datapoolOwnerPrice, BigInteger datasetPrice) {
            super(new org.web3j.abi.datatypes.generated.Uint256(datapoolOwnerPrice), 
                    new org.web3j.abi.datatypes.generated.Uint256(datasetPrice));
            this.datapoolOwnerPrice = datapoolOwnerPrice;
            this.datasetPrice = datasetPrice;
        }

        public PricingPolicy(Uint256 datapoolOwnerPrice, Uint256 datasetPrice) {
            super(datapoolOwnerPrice, datasetPrice);
            this.datapoolOwnerPrice = datapoolOwnerPrice.getValue();
            this.datasetPrice = datasetPrice.getValue();
        }
    }

    public static class DatasetInfo extends StaticStruct {
        public String dataset;

        public Boolean isActive;

        public DatasetInfo(String dataset, Boolean isActive) {
            super(new org.web3j.abi.datatypes.Address(dataset), 
                    new org.web3j.abi.datatypes.Bool(isActive));
            this.dataset = dataset;
            this.isActive = isActive;
        }

        public DatasetInfo(Address dataset, Bool isActive) {
            super(dataset, isActive);
            this.dataset = dataset.getValue();
            this.isActive = isActive.getValue();
        }
    }

    public static class AllowedAppAddedEventResponse extends BaseEventResponse {
        public String app;
    }

    public static class AllowedWorkerpoolAddedEventResponse extends BaseEventResponse {
        public String workerpool;
    }

    public static class DatapoolInitializedEventResponse extends BaseEventResponse {
        public String datapoolAddressInRegistry;
    }

    public static class DatapoolOrderCreatedEventResponse extends BaseEventResponse {
        public String datapoolAddressInRegistry;

        public DatasetOrder datapoolorder;
    }

    public static class DatapoolTaskCreatedEventResponse extends BaseEventResponse {
        public byte[] taskid;

        public String datapoolAddressInRegistry;

        public BigInteger datasetCount;
    }

    public static class DatapoolTaskFinalizedEventResponse extends BaseEventResponse {
        public byte[] taskid;
    }

    public static class DatasetAddedEventResponse extends BaseEventResponse {
        public String dataset;
    }

    public static class DatasetRemovedEventResponse extends BaseEventResponse {
        public String dataset;
    }

    public static class PricingPolicyUpdatedEventResponse extends BaseEventResponse {
        public BigInteger datapoolOwnerPrice;

        public BigInteger datasetPrice;
    }
}
