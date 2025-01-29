package com.iexec.commons.poco.contract.generated;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.DynamicBytes;
import org.web3j.abi.datatypes.DynamicStruct;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.abi.datatypes.generated.Bytes32;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
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
public class IexecLibOrders_v5 extends Contract {
    public static final String BINARY = "0x61108a610026600b82828239805160001a60731461001957fe5b30600052607381538281f3fe73000000000000000000000000000000000000000030146080604052600436106101205760003560e01c8063735f5619116100ac5780639a6f72ee1161007b5780639a6f72ee146101fb578063b75cdd5314610203578063c49f91d31461020b578063c4b7bfc314610213578063fed985fe1461021b57610120565b8063735f5619146101ba57806374147c4d146101c25780637c0d54d3146101d55780638ac03f33146101e857610120565b806359b123db116100f357806359b123db1461017c5780635b559f6a1461018457806365db1dbb146101975780636cf30b8b1461019f5780636f84d2da146101b257610120565b806311b2eee214610125578063207dbbfe1461014e57806320aabe53146101565780634118eb9814610169575b600080fd5b610138610133366004610bd7565b61022e565b6040516101459190610e55565b60405180910390f35b6101386102b3565b610138610164366004610cb2565b6102d7565b610138610177366004610b79565b61031c565b61013861034c565b610138610192366004610d42565b610370565b6101386103a0565b6101386101ad366004610a9f565b6103c4565b6101386103f4565b610138610418565b6101386101d0366004610c09565b61043c565b6101386101e3366004610b3f565b610498565b6101386101f6366004610d10565b6104f9565b6101386105c7565b6101386105eb565b61013861060f565b610138610633565b610138610229366004610da0565b610657565b80516020808301516040808501516060860151608087015160a088015160c089015160e08a01516101008b0151965160009a6102969a7f7c7f292025b6b24c0ddd3908217aa1de3074e9e6557af3b4728f7a55269a8e139a9199919897969594939201610ee7565b604051602081830303815290604052805190602001209050919050565b7f60815a0eeec47dddf1615fe53b31d016c31444e01b9d796db365443a6445d00881565b80516000907f0ded7b52c2d77595a40d242eca751df172b18e686326dbbed3f4748828af77c790610307906104f9565b60208085015160405161029694939201610fc8565b80516000907fe28272c70a768eb8bd8c8344ff447007f9d421dbcef4f681ba817f691cf550a6906103079061022e565b7f322d980b7d7a6a1f7c39ff0c5445da6ae1d8e0393ff0dd468c8be3e2c864438881565b80516000907f322d980b7d7a6a1f7c39ff0c5445da6ae1d8e0393ff0dd468c8be3e2c86443889061030790610657565b7faa3429fb281b34691803133d3d978a75bb77c617ed6bc9aa162b9b30920022bb81565b80516000907f0638bb0702457e2b4b01be8a202579b8bf97e587fb4f2cc4d4aad01f21a06ee09061030790610498565b7f7c7f292025b6b24c0ddd3908217aa1de3074e9e6557af3b4728f7a55269a8e1381565b7f0ded7b52c2d77595a40d242eca751df172b18e686326dbbed3f4748828af77c781565b60007f8b73c3c69bb8fe3d512ecc4cf759cc79239f7b179b0ffacaa9a75d522b39400f60001b82600001518051906020012083602001518051906020012084604001518560600151604051602001610296959493929190610f9c565b80516020808301516040808501516060860151608087015160a088015160c089015160e08a01519551600099610296997f60815a0eeec47dddf1615fe53b31d016c31444e01b9d796db365443a6445d0089991989197969594939201610e99565b80516020808301516040808501516060860151608087015160a0880151935160009761054e977ff24e853034a3a450aba845a82914fbb564ad85accca6cf62be112a154520fae0979196919594939201610e5e565b60408051601f198184030181529082905260c084015160e08501516101008601516101208701516101408801516101608901516101808a01516101a08b015180516020918201206101c08d0151999a6105a99a919201610e01565b60408051601f19818403018152908290526102969291602001610dd2565b7ff24e853034a3a450aba845a82914fbb564ad85accca6cf62be112a154520fae081565b7f0638bb0702457e2b4b01be8a202579b8bf97e587fb4f2cc4d4aad01f21a06ee081565b7f8b73c3c69bb8fe3d512ecc4cf759cc79239f7b179b0ffacaa9a75d522b39400f81565b7fe28272c70a768eb8bd8c8344ff447007f9d421dbcef4f681ba817f691cf550a681565b80516020808301516040808501516060860151608087015160a088015160c089015160e08a01516101008b01516101208c0151975160009b6102969b7faa3429fb281b34691803133d3d978a75bb77c617ed6bc9aa162b9b30920022bb9b919a91999897969594939201610f3f565b80356001600160a01b03811681146106dd57600080fd5b92915050565b600082601f8301126106f3578081fd5b81356001600160401b03811115610708578182fd5b61071b601f8201601f1916602001610fee565b915080825283602082850101111561073257600080fd5b8060208401602084013760009082016020015292915050565b600061012080838503121561075e578182fd5b61076781610fee565b91505061077483836106c6565b81526020820135602082015260408201356040820152606082013560608201526107a183608084016106c6565b60808201526107b38360a084016106c6565b60a08201526107c58360c084016106c6565b60c082015260e082013560e0820152610100808301356001600160401b038111156107ef57600080fd5b6107fb858286016106e3565b82840152505092915050565b600061014080838503121561081a578182fd5b61082381610fee565b91505061083083836106c6565b815260208201356020820152604082013560408201526060820135606082015261085d83608084016106c6565b608082015261086f8360a084016106c6565b60a08201526108818360c084016106c6565b60c082015260e082013560e0820152610100808301358183015250610120808301356001600160401b038111156107ef57600080fd5b60006102008083850312156108ca578182fd5b6108d381610fee565b9150506108e083836106c6565b8152602082013560208201526108f983604084016106c6565b60408201526060820135606082015261091583608084016106c6565b608082015260a082013560a08201526109318360c084016106c6565b60c082015260e08281013590820152610100808301359082015261012080830135908201526101408083013590820152610160610970848285016106c6565b90820152610180610983848483016106c6565b908201526101a0828101356001600160401b03808211156109a357600080fd5b6109af868387016106e3565b838501526101c0925082850135838501526101e09250828501359150808211156109d857600080fd5b506107fb858286016106e3565b60006101608083850312156109f8578182fd5b610a0181610fee565b915050610a0e83836106c6565b81526020820135602082015260408201356040820152606082013560608201526080820135608082015260a082013560a0820152610a4f8360c084016106c6565b60c0820152610a618360e084016106c6565b60e0820152610100610a75848285016106c6565b908201526101208281013590820152610140808301356001600160401b038111156107ef57600080fd5b600060208284031215610ab0578081fd5b81356001600160401b0380821115610ac6578283fd5b9083019060608286031215610ad9578283fd5b610ae36060610fee565b823582811115610af1578485fd5b610afd8782860161074b565b8252506020830135610b0e81611044565b6020820152604083013582811115610b24578485fd5b610b30878286016106e3565b60408301525095945050505050565b600060208284031215610b50578081fd5b81356001600160401b03811115610b65578182fd5b610b718482850161074b565b949350505050565b600060208284031215610b8a578081fd5b81356001600160401b0380821115610ba0578283fd5b9083019060608286031215610bb3578283fd5b610bbd6060610fee565b823582811115610bcb578485fd5b610afd87828601610807565b600060208284031215610be8578081fd5b81356001600160401b03811115610bfd578182fd5b610b7184828501610807565b600060208284031215610c1a578081fd5b81356001600160401b0380821115610c30578283fd5b9083019060808286031215610c43578283fd5b610c4d6080610fee565b823582811115610c5b578485fd5b610c67878286016106e3565b825250602083013582811115610c7b578485fd5b610c87878286016106e3565b60208301525060408301356040820152610ca486606085016106c6565b606082015295945050505050565b600060208284031215610cc3578081fd5b81356001600160401b0380821115610cd9578283fd5b9083019060608286031215610cec578283fd5b610cf66060610fee565b823582811115610d04578485fd5b610afd878286016108b7565b600060208284031215610d21578081fd5b81356001600160401b03811115610d36578182fd5b610b71848285016108b7565b600060208284031215610d53578081fd5b81356001600160401b0380821115610d69578283fd5b9083019060608286031215610d7c578283fd5b610d866060610fee565b823582811115610d94578485fd5b610afd878286016109e5565b600060208284031215610db1578081fd5b81356001600160401b03811115610dc6578182fd5b610b71848285016109e5565b60008351610de4818460208801611014565b835190830190610df8818360208801611014565b01949350505050565b6001600160a01b03998a1681526020810198909852604088019690965260608701949094526080860192909252851660a085015290931660c083015260e08201929092526101008101919091526101200190565b90815260200190565b9687526001600160a01b03958616602088015260408701949094529184166060860152608085015290911660a083015260c082015260e00190565b9889526001600160a01b0397881660208a0152604089019690965260608801949094526080870192909252841660a0860152831660c085015290911660e08301526101008201526101200190565b998a526001600160a01b0398891660208b015260408a01979097526060890195909552608088019390935290851660a0870152841660c086015290921660e08401526101008301919091526101208201526101400190565b9a8b526001600160a01b03998a1660208c015260408b019890985260608a0196909652608089019490945260a088019290925260c0870152841660e086015283166101008501529091166101208301526101408201526101600190565b9485526020850193909352604084019190915260608301526001600160a01b0316608082015260a00190565b838152602081018390526060810160028310610fe057fe5b826040830152949350505050565b6040518181016001600160401b038111828210171561100c57600080fd5b604052919050565b60005b8381101561102f578181015183820152602001611017565b8381111561103e576000848401525b50505050565b6002811061105157600080fd5b5056fea2646970667358221220771e88d8a8bfc97a88ac87d7357eff623284690f4f8f6aad7321c874aef0353e64736f6c634300060c0033";

    public static final String FUNC_APPORDEROPERATION_TYPEHASH = "APPORDEROPERATION_TYPEHASH";

    public static final String FUNC_APPORDER_TYPEHASH = "APPORDER_TYPEHASH";

    public static final String FUNC_DATASETORDEROPERATION_TYPEHASH = "DATASETORDEROPERATION_TYPEHASH";

    public static final String FUNC_DATASETORDER_TYPEHASH = "DATASETORDER_TYPEHASH";

    public static final String FUNC_EIP712DOMAIN_TYPEHASH = "EIP712DOMAIN_TYPEHASH";

    public static final String FUNC_REQUESTORDEROPERATION_TYPEHASH = "REQUESTORDEROPERATION_TYPEHASH";

    public static final String FUNC_REQUESTORDER_TYPEHASH = "REQUESTORDER_TYPEHASH";

    public static final String FUNC_WORKERPOOLORDEROPERATION_TYPEHASH = "WORKERPOOLORDEROPERATION_TYPEHASH";

    public static final String FUNC_WORKERPOOLORDER_TYPEHASH = "WORKERPOOLORDER_TYPEHASH";

    public static final String FUNC_hash = "hash";

    protected static final HashMap<String, String> _addresses;

    static {
        _addresses = new HashMap<String, String>();
        _addresses.put("1736366506302", "0x8Da7D401438259e54a0B06E0b4aa0d3F2B3BB2d0");
    }

    @Deprecated
    protected IexecLibOrders_v5(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected IexecLibOrders_v5(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected IexecLibOrders_v5(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected IexecLibOrders_v5(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteFunctionCall<byte[]> APPORDEROPERATION_TYPEHASH() {
        final Function function = new Function(FUNC_APPORDEROPERATION_TYPEHASH, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteFunctionCall<byte[]> APPORDER_TYPEHASH() {
        final Function function = new Function(FUNC_APPORDER_TYPEHASH, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteFunctionCall<byte[]> DATASETORDEROPERATION_TYPEHASH() {
        final Function function = new Function(FUNC_DATASETORDEROPERATION_TYPEHASH, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteFunctionCall<byte[]> DATASETORDER_TYPEHASH() {
        final Function function = new Function(FUNC_DATASETORDER_TYPEHASH, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteFunctionCall<byte[]> EIP712DOMAIN_TYPEHASH() {
        final Function function = new Function(FUNC_EIP712DOMAIN_TYPEHASH, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteFunctionCall<byte[]> REQUESTORDEROPERATION_TYPEHASH() {
        final Function function = new Function(FUNC_REQUESTORDEROPERATION_TYPEHASH, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteFunctionCall<byte[]> REQUESTORDER_TYPEHASH() {
        final Function function = new Function(FUNC_REQUESTORDER_TYPEHASH, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteFunctionCall<byte[]> WORKERPOOLORDEROPERATION_TYPEHASH() {
        final Function function = new Function(FUNC_WORKERPOOLORDEROPERATION_TYPEHASH, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteFunctionCall<byte[]> WORKERPOOLORDER_TYPEHASH() {
        final Function function = new Function(FUNC_WORKERPOOLORDER_TYPEHASH, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteFunctionCall<byte[]> hash(DatasetOrder _datasetorder) {
        final Function function = new Function(FUNC_hash, 
                Arrays.<Type>asList(_datasetorder), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteFunctionCall<byte[]> hash(RequestOrderOperation _requestorderoperation) {
        final Function function = new Function(FUNC_hash, 
                Arrays.<Type>asList(_requestorderoperation), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteFunctionCall<byte[]> hash(DatasetOrderOperation _datasetorderoperation) {
        final Function function = new Function(FUNC_hash, 
                Arrays.<Type>asList(_datasetorderoperation), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteFunctionCall<byte[]> hash(WorkerpoolOrderOperation _workerpoolorderoperation) {
        final Function function = new Function(FUNC_hash, 
                Arrays.<Type>asList(_workerpoolorderoperation), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteFunctionCall<byte[]> hash(AppOrderOperation _apporderoperation) {
        final Function function = new Function(FUNC_hash, 
                Arrays.<Type>asList(_apporderoperation), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteFunctionCall<byte[]> hash(EIP712Domain _domain) {
        final Function function = new Function(FUNC_hash, 
                Arrays.<Type>asList(_domain), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteFunctionCall<byte[]> hash(AppOrder _apporder) {
        final Function function = new Function(FUNC_hash, 
                Arrays.<Type>asList(_apporder), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteFunctionCall<byte[]> hash(RequestOrder _requestorder) {
        final Function function = new Function(FUNC_hash, 
                Arrays.<Type>asList(_requestorder), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteFunctionCall<byte[]> hash(WorkerpoolOrder _workerpoolorder) {
        final Function function = new Function(FUNC_hash, 
                Arrays.<Type>asList(_workerpoolorder), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    @Deprecated
    public static IexecLibOrders_v5 load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new IexecLibOrders_v5(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static IexecLibOrders_v5 load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new IexecLibOrders_v5(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static IexecLibOrders_v5 load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new IexecLibOrders_v5(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static IexecLibOrders_v5 load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new IexecLibOrders_v5(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<IexecLibOrders_v5> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(IexecLibOrders_v5.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<IexecLibOrders_v5> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(IexecLibOrders_v5.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    public static RemoteCall<IexecLibOrders_v5> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(IexecLibOrders_v5.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<IexecLibOrders_v5> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(IexecLibOrders_v5.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
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

    public static class EIP712Domain extends DynamicStruct {
        public String name;

        public String version;

        public BigInteger chainId;

        public String verifyingContract;

        public EIP712Domain(String name, String version, BigInteger chainId, String verifyingContract) {
            super(new org.web3j.abi.datatypes.Utf8String(name), 
                    new org.web3j.abi.datatypes.Utf8String(version), 
                    new org.web3j.abi.datatypes.generated.Uint256(chainId), 
                    new org.web3j.abi.datatypes.Address(verifyingContract));
            this.name = name;
            this.version = version;
            this.chainId = chainId;
            this.verifyingContract = verifyingContract;
        }

        public EIP712Domain(Utf8String name, Utf8String version, Uint256 chainId, Address verifyingContract) {
            super(name, version, chainId, verifyingContract);
            this.name = name.getValue();
            this.version = version.getValue();
            this.chainId = chainId.getValue();
            this.verifyingContract = verifyingContract.getValue();
        }
    }

    public static class RequestOrderOperation extends DynamicStruct {
        public RequestOrder order;

        public byte[] sign;

        public RequestOrderOperation(RequestOrder order, byte[] sign) {
            super(order, 
                    new org.web3j.abi.datatypes.DynamicBytes(sign));
            this.order = order;
            this.sign = sign;
        }

        public RequestOrderOperation(RequestOrder order, DynamicBytes sign) {
            super(order, sign);
            this.order = order;
            this.sign = sign.getValue();
        }
    }

    public static class DatasetOrderOperation extends DynamicStruct {
        public DatasetOrder order;

        public byte[] sign;

        public DatasetOrderOperation(DatasetOrder order, byte[] sign) {
            super(order, 
                    new org.web3j.abi.datatypes.DynamicBytes(sign));
            this.order = order;
            this.sign = sign;
        }

        public DatasetOrderOperation(DatasetOrder order, DynamicBytes sign) {
            super(order, sign);
            this.order = order;
            this.sign = sign.getValue();
        }
    }

    public static class WorkerpoolOrderOperation extends DynamicStruct {
        public WorkerpoolOrder order;

        public byte[] sign;

        public WorkerpoolOrderOperation(WorkerpoolOrder order, byte[] sign) {
            super(order, 
                    new org.web3j.abi.datatypes.DynamicBytes(sign));
            this.order = order;
            this.sign = sign;
        }

        public WorkerpoolOrderOperation(WorkerpoolOrder order, DynamicBytes sign) {
            super(order, sign);
            this.order = order;
            this.sign = sign.getValue();
        }
    }

    public static class AppOrderOperation extends DynamicStruct {
        public AppOrder order;

        public byte[] sign;

        public AppOrderOperation(AppOrder order, byte[] sign) {
            super(order, 
                    new org.web3j.abi.datatypes.DynamicBytes(sign));
            this.order = order;
            this.sign = sign;
        }

        public AppOrderOperation(AppOrder order, DynamicBytes sign) {
            super(order, sign);
            this.order = order;
            this.sign = sign.getValue();
        }
    }
}
