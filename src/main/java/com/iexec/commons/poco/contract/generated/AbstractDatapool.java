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
import org.web3j.abi.datatypes.Utf8String;
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
import org.web3j.tuples.generated.Tuple2;
import org.web3j.tuples.generated.Tuple5;
import org.web3j.tuples.generated.Tuple9;
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

    public static final String FUNC_ALLDATASETS = "allDatasets";

    public static final String FUNC_ALLOWEDAPPS = "allowedApps";

    public static final String FUNC_ALLOWEDWORKERPOOLS = "allowedWorkerpools";

    public static final String FUNC_DATAPOOLADDRESSINREGISTRY = "datapoolAddressInRegistry";

    public static final String FUNC_DATASETENTRYEXITHISTORY = "datasetEntryExitHistory";

    public static final String FUNC_TASKHISTORY = "taskHistory";

    public static final String FUNC_TASKIDS = "taskIds";

    public static final String FUNC_TASKREWARDCLAIMED = "taskRewardClaimed";

    public static final String FUNC_INITIALIZE = "initialize";

    public static final String FUNC_SHOWDATAPOOL = "showDatapool";

    public static final String FUNC_SETDATAPOOLOWNERPRICE = "setDatapoolOwnerPrice";

    public static final String FUNC_SETDATASETPRICE = "setDatasetPrice";

    public static final String FUNC_ADDALLOWEDAPP = "addAllowedApp";

    public static final String FUNC_ADDALLOWEDWORKERPOOL = "addAllowedWorkerpool";

    public static final String FUNC_ADDDATASET = "addDataset";

    public static final String FUNC_REMOVEDATASET = "removeDataset";

    public static final String FUNC_ISACTIVEDATASET = "isActiveDataset";

    public static final String FUNC_ISINACTIVEDATASET = "isInactiveDataset";

    public static final String FUNC_GETACTIVEDATASETSFORTASK = "getActiveDatasetsForTask";

    public static final String FUNC_CREATETASK = "createTask";

    public static final String FUNC_FINALIZETASK = "finalizeTask";

    public static final String FUNC_ISDATASETPRESENTATTASKCREATION = "isDatasetPresentAtTaskCreation";

    public static final String FUNC_WITHDRAWTASKREWARD = "withdrawTaskReward";

    public static final String FUNC_WITHDRAWALLTASKSREWARDS = "withdrawAllTasksRewards";

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

    public static final Event DATAPOOLTASKCREATED_EVENT = new Event("DatapoolTaskCreated", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>(true) {}, new TypeReference<Address>(true) {}, new TypeReference<Uint256>() {}));
    ;

    public static final Event DATAPOOLTASKFINALIZED_EVENT = new Event("DatapoolTaskFinalized", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>(true) {}, new TypeReference<Uint256>() {}));
    ;

    public static final Event DATASETADDED_EVENT = new Event("DatasetAdded", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>(true) {}));
    ;

    public static final Event DATASETREMOVED_EVENT = new Event("DatasetRemoved", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>(true) {}));
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

    public static List<DatapoolTaskCreatedEventResponse> getDatapoolTaskCreatedEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = staticExtractEventParametersWithLog(DATAPOOLTASKCREATED_EVENT, transactionReceipt);
        ArrayList<DatapoolTaskCreatedEventResponse> responses = new ArrayList<DatapoolTaskCreatedEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            DatapoolTaskCreatedEventResponse typedResponse = new DatapoolTaskCreatedEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.taskid = (byte[]) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.datapoolAddressInRegistry = (String) eventValues.getIndexedValues().get(1).getValue();
            typedResponse.activeDatasetCount = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
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
                typedResponse.activeDatasetCount = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
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
            typedResponse.activeDatasetCount = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
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
                typedResponse.activeDatasetCount = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
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

    public RemoteFunctionCall<String> allDatasets(BigInteger param0) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_ALLDATASETS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
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

    public RemoteFunctionCall<Tuple5<BigInteger, Boolean, BigInteger, BigInteger, BigInteger>> taskHistory(byte[] param0) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_TASKHISTORY, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Bool>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}));
        return new RemoteFunctionCall<Tuple5<BigInteger, Boolean, BigInteger, BigInteger, BigInteger>>(function,
                new Callable<Tuple5<BigInteger, Boolean, BigInteger, BigInteger, BigInteger>>() {
                    @Override
                    public Tuple5<BigInteger, Boolean, BigInteger, BigInteger, BigInteger> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple5<BigInteger, Boolean, BigInteger, BigInteger, BigInteger>(
                                (BigInteger) results.get(0).getValue(), 
                                (Boolean) results.get(1).getValue(), 
                                (BigInteger) results.get(2).getValue(), 
                                (BigInteger) results.get(3).getValue(), 
                                (BigInteger) results.get(4).getValue());
                    }
                });
    }

    public RemoteFunctionCall<byte[]> taskIds(BigInteger param0) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_TASKIDS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteFunctionCall<Boolean> taskRewardClaimed(byte[] param0, String param1) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_TASKREWARDCLAIMED, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(param0), 
                new org.web3j.abi.datatypes.Address(param1)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteFunctionCall<TransactionReceipt> initialize(String _datapoolAddressInRegistry) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(
                FUNC_INITIALIZE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_datapoolAddressInRegistry)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<Tuple9<String, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, List<DatasetInfo>>> showDatapool() {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_SHOWDATAPOOL, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}, new TypeReference<DynamicArray<DatasetInfo>>() {}));
        return new RemoteFunctionCall<Tuple9<String, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, List<DatasetInfo>>>(function,
                new Callable<Tuple9<String, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, List<DatasetInfo>>>() {
                    @Override
                    public Tuple9<String, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, List<DatasetInfo>> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple9<String, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, List<DatasetInfo>>(
                                (String) results.get(0).getValue(), 
                                (BigInteger) results.get(1).getValue(), 
                                (BigInteger) results.get(2).getValue(), 
                                (BigInteger) results.get(3).getValue(), 
                                (BigInteger) results.get(4).getValue(), 
                                (BigInteger) results.get(5).getValue(), 
                                (BigInteger) results.get(6).getValue(), 
                                (BigInteger) results.get(7).getValue(), 
                                convertToNative((List<DatasetInfo>) results.get(8).getValue()));
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

    public RemoteFunctionCall<TransactionReceipt> addAllowedApp(String _app) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(
                FUNC_ADDALLOWEDAPP, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_app)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> addAllowedWorkerpool(String _workerpool) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(
                FUNC_ADDALLOWEDWORKERPOOL, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_workerpool)), 
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

    public RemoteFunctionCall<List> getActiveDatasetsForTask(byte[] _taskid) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_GETACTIVEDATASETSFORTASK, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(_taskid)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicArray<Address>>() {}));
        return new RemoteFunctionCall<List>(function,
                new Callable<List>() {
                    @Override
                    @SuppressWarnings("unchecked")
                    public List call() throws Exception {
                        List<Type> result = (List<Type>) executeCallSingleValueReturn(function, List.class);
                        return convertToNative(result);
                    }
                });
    }

    public RemoteFunctionCall<TransactionReceipt> createTask(AppOrder _apporder, WorkerpoolOrder _workerpoolorder, RequestOrder _requestorder) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(
                FUNC_CREATETASK, 
                Arrays.<Type>asList(_apporder, 
                _workerpoolorder, 
                _requestorder), 
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

    public RemoteFunctionCall<Boolean> isDatasetPresentAtTaskCreation(String _datasetAddress, byte[] _taskid) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_ISDATASETPRESENTATTASKCREATION, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_datasetAddress), 
                new org.web3j.abi.datatypes.generated.Bytes32(_taskid)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteFunctionCall<TransactionReceipt> withdrawTaskReward(byte[] _taskid, String _datasetAddress) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(
                FUNC_WITHDRAWTASKREWARD, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(_taskid), 
                new org.web3j.abi.datatypes.Address(_datasetAddress)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> withdrawAllTasksRewards(String _datasetAddress) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(
                FUNC_WITHDRAWALLTASKSREWARDS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_datasetAddress)), 
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

    public static class AppOrder extends DynamicStruct {
        public String app;

        public BigInteger appprice;

        public BigInteger volume;

        public byte[] tag;

        public String datasetrestrict;

        public String workerpoolrestrict;

        public String requesterrestrict;

        public byte[] salt;

        public byte[] sign;

        public AppOrder(String app, BigInteger appprice, BigInteger volume, byte[] tag, String datasetrestrict, String workerpoolrestrict, String requesterrestrict, byte[] salt, byte[] sign) {
            super(new org.web3j.abi.datatypes.Address(app), 
                    new org.web3j.abi.datatypes.generated.Uint256(appprice), 
                    new org.web3j.abi.datatypes.generated.Uint256(volume), 
                    new org.web3j.abi.datatypes.generated.Bytes32(tag), 
                    new org.web3j.abi.datatypes.Address(datasetrestrict), 
                    new org.web3j.abi.datatypes.Address(workerpoolrestrict), 
                    new org.web3j.abi.datatypes.Address(requesterrestrict), 
                    new org.web3j.abi.datatypes.generated.Bytes32(salt), 
                    new org.web3j.abi.datatypes.DynamicBytes(sign));
            this.app = app;
            this.appprice = appprice;
            this.volume = volume;
            this.tag = tag;
            this.datasetrestrict = datasetrestrict;
            this.workerpoolrestrict = workerpoolrestrict;
            this.requesterrestrict = requesterrestrict;
            this.salt = salt;
            this.sign = sign;
        }

        public AppOrder(Address app, Uint256 appprice, Uint256 volume, Bytes32 tag, Address datasetrestrict, Address workerpoolrestrict, Address requesterrestrict, Bytes32 salt, DynamicBytes sign) {
            super(app, appprice, volume, tag, datasetrestrict, workerpoolrestrict, requesterrestrict, salt, sign);
            this.app = app.getValue();
            this.appprice = appprice.getValue();
            this.volume = volume.getValue();
            this.tag = tag.getValue();
            this.datasetrestrict = datasetrestrict.getValue();
            this.workerpoolrestrict = workerpoolrestrict.getValue();
            this.requesterrestrict = requesterrestrict.getValue();
            this.salt = salt.getValue();
            this.sign = sign.getValue();
        }
    }

    public static class WorkerpoolOrder extends DynamicStruct {
        public String workerpool;

        public BigInteger workerpoolprice;

        public BigInteger volume;

        public byte[] tag;

        public BigInteger category;

        public BigInteger trust;

        public String apprestrict;

        public String datasetrestrict;

        public String requesterrestrict;

        public byte[] salt;

        public byte[] sign;

        public WorkerpoolOrder(String workerpool, BigInteger workerpoolprice, BigInteger volume, byte[] tag, BigInteger category, BigInteger trust, String apprestrict, String datasetrestrict, String requesterrestrict, byte[] salt, byte[] sign) {
            super(new org.web3j.abi.datatypes.Address(workerpool), 
                    new org.web3j.abi.datatypes.generated.Uint256(workerpoolprice), 
                    new org.web3j.abi.datatypes.generated.Uint256(volume), 
                    new org.web3j.abi.datatypes.generated.Bytes32(tag), 
                    new org.web3j.abi.datatypes.generated.Uint256(category), 
                    new org.web3j.abi.datatypes.generated.Uint256(trust), 
                    new org.web3j.abi.datatypes.Address(apprestrict), 
                    new org.web3j.abi.datatypes.Address(datasetrestrict), 
                    new org.web3j.abi.datatypes.Address(requesterrestrict), 
                    new org.web3j.abi.datatypes.generated.Bytes32(salt), 
                    new org.web3j.abi.datatypes.DynamicBytes(sign));
            this.workerpool = workerpool;
            this.workerpoolprice = workerpoolprice;
            this.volume = volume;
            this.tag = tag;
            this.category = category;
            this.trust = trust;
            this.apprestrict = apprestrict;
            this.datasetrestrict = datasetrestrict;
            this.requesterrestrict = requesterrestrict;
            this.salt = salt;
            this.sign = sign;
        }

        public WorkerpoolOrder(Address workerpool, Uint256 workerpoolprice, Uint256 volume, Bytes32 tag, Uint256 category, Uint256 trust, Address apprestrict, Address datasetrestrict, Address requesterrestrict, Bytes32 salt, DynamicBytes sign) {
            super(workerpool, workerpoolprice, volume, tag, category, trust, apprestrict, datasetrestrict, requesterrestrict, salt, sign);
            this.workerpool = workerpool.getValue();
            this.workerpoolprice = workerpoolprice.getValue();
            this.volume = volume.getValue();
            this.tag = tag.getValue();
            this.category = category.getValue();
            this.trust = trust.getValue();
            this.apprestrict = apprestrict.getValue();
            this.datasetrestrict = datasetrestrict.getValue();
            this.requesterrestrict = requesterrestrict.getValue();
            this.salt = salt.getValue();
            this.sign = sign.getValue();
        }
    }

    public static class RequestOrder extends DynamicStruct {
        public String app;

        public BigInteger appmaxprice;

        public String dataset;

        public BigInteger datasetmaxprice;

        public String workerpool;

        public BigInteger workerpoolmaxprice;

        public String requester;

        public BigInteger volume;

        public byte[] tag;

        public BigInteger category;

        public BigInteger trust;

        public String beneficiary;

        public String callback;

        public String params;

        public byte[] salt;

        public byte[] sign;

        public RequestOrder(String app, BigInteger appmaxprice, String dataset, BigInteger datasetmaxprice, String workerpool, BigInteger workerpoolmaxprice, String requester, BigInteger volume, byte[] tag, BigInteger category, BigInteger trust, String beneficiary, String callback, String params, byte[] salt, byte[] sign) {
            super(new org.web3j.abi.datatypes.Address(app), 
                    new org.web3j.abi.datatypes.generated.Uint256(appmaxprice), 
                    new org.web3j.abi.datatypes.Address(dataset), 
                    new org.web3j.abi.datatypes.generated.Uint256(datasetmaxprice), 
                    new org.web3j.abi.datatypes.Address(workerpool), 
                    new org.web3j.abi.datatypes.generated.Uint256(workerpoolmaxprice), 
                    new org.web3j.abi.datatypes.Address(requester), 
                    new org.web3j.abi.datatypes.generated.Uint256(volume), 
                    new org.web3j.abi.datatypes.generated.Bytes32(tag), 
                    new org.web3j.abi.datatypes.generated.Uint256(category), 
                    new org.web3j.abi.datatypes.generated.Uint256(trust), 
                    new org.web3j.abi.datatypes.Address(beneficiary), 
                    new org.web3j.abi.datatypes.Address(callback), 
                    new org.web3j.abi.datatypes.Utf8String(params), 
                    new org.web3j.abi.datatypes.generated.Bytes32(salt), 
                    new org.web3j.abi.datatypes.DynamicBytes(sign));
            this.app = app;
            this.appmaxprice = appmaxprice;
            this.dataset = dataset;
            this.datasetmaxprice = datasetmaxprice;
            this.workerpool = workerpool;
            this.workerpoolmaxprice = workerpoolmaxprice;
            this.requester = requester;
            this.volume = volume;
            this.tag = tag;
            this.category = category;
            this.trust = trust;
            this.beneficiary = beneficiary;
            this.callback = callback;
            this.params = params;
            this.salt = salt;
            this.sign = sign;
        }

        public RequestOrder(Address app, Uint256 appmaxprice, Address dataset, Uint256 datasetmaxprice, Address workerpool, Uint256 workerpoolmaxprice, Address requester, Uint256 volume, Bytes32 tag, Uint256 category, Uint256 trust, Address beneficiary, Address callback, Utf8String params, Bytes32 salt, DynamicBytes sign) {
            super(app, appmaxprice, dataset, datasetmaxprice, workerpool, workerpoolmaxprice, requester, volume, tag, category, trust, beneficiary, callback, params, salt, sign);
            this.app = app.getValue();
            this.appmaxprice = appmaxprice.getValue();
            this.dataset = dataset.getValue();
            this.datasetmaxprice = datasetmaxprice.getValue();
            this.workerpool = workerpool.getValue();
            this.workerpoolmaxprice = workerpoolmaxprice.getValue();
            this.requester = requester.getValue();
            this.volume = volume.getValue();
            this.tag = tag.getValue();
            this.category = category.getValue();
            this.trust = trust.getValue();
            this.beneficiary = beneficiary.getValue();
            this.callback = callback.getValue();
            this.params = params.getValue();
            this.salt = salt.getValue();
            this.sign = sign.getValue();
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

    public static class DatapoolTaskCreatedEventResponse extends BaseEventResponse {
        public byte[] taskid;

        public String datapoolAddressInRegistry;

        public BigInteger activeDatasetCount;
    }

    public static class DatapoolTaskFinalizedEventResponse extends BaseEventResponse {
        public byte[] taskid;

        public BigInteger activeDatasetCount;
    }

    public static class DatasetAddedEventResponse extends BaseEventResponse {
        public String dataset;
    }

    public static class DatasetRemovedEventResponse extends BaseEventResponse {
        public String dataset;
    }
}