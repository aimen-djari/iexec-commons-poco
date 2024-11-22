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

package com.iexec.commons.poco.contract.generated;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.DynamicBytes;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.abi.datatypes.generated.Bytes32;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
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
public class Dataset extends Contract {
    public static final String BINARY = "0x608060405234801561001057600080fd5b50610902806100206000396000f3fe608060405234801561001057600080fd5b50600436106100885760003560e01c806358dbcb541161005b57806358dbcb54146101ac5780637b1039991461035c5780638da5cb5b14610380578063a61ca6c51461038857610088565b80630847c4311461008d57806308c18c3b1461010a5780631ba99d7e146101125780633121db1c1461012c575b600080fd5b610095610390565b6040805160208082528351818301528351919283929083019185019080838360005b838110156100cf5781810151838201526020016100b7565b50505050905090810190601f1680156100fc5780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b61009561041d565b61011a610475565b60408051918252519081900360200190f35b6101aa6004803603604081101561014257600080fd5b6001600160a01b038235169190810190604081016020820135600160201b81111561016c57600080fd5b82018360208201111561017e57600080fd5b803590602001918460018302840111600160201b8311171561019f57600080fd5b50909250905061047b565b005b6101aa600480360360808110156101c257600080fd5b810190602081018135600160201b8111156101dc57600080fd5b8201836020820111156101ee57600080fd5b803590602001918460018302840111600160201b8311171561020f57600080fd5b91908080601f0160208091040260200160405190810160405280939291908181526020018383808284376000920191909152509295949360208101935035915050600160201b81111561026157600080fd5b82018360208201111561027357600080fd5b803590602001918460018302840111600160201b8311171561029457600080fd5b91908080601f0160208091040260200160405190810160405280939291908181526020018383808284376000920191909152509295949360208101935035915050600160201b8111156102e657600080fd5b8201836020820111156102f857600080fd5b803590602001918460018302840111600160201b8311171561031957600080fd5b91908080601f0160208091040260200160405190810160405280939291908181526020018383808284376000920191909152509295505091359250610524915050565b610364610571565b604080516001600160a01b039092168252519081900360200190f35b610364610580565b6100956105fd565b60018054604080516020600284861615610100026000190190941693909304601f810184900484028201840190925281815292918301828280156104155780601f106103ea57610100808354040283529160200191610415565b820191906000526020600020905b8154815290600101906020018083116103f857829003601f168201915b505050505081565b6002805460408051602060018416156101000260001901909316849004601f810184900484028201840190925281815292918301828280156104155780601f106103ea57610100808354040283529160200191610415565b60045481565b33610484610580565b6001600160a01b0316146104df576040805162461bcd60e51b815260206004820152601760248201527f63616c6c6572206973206e6f7420746865206f776e6572000000000000000000604482015290519081900360640190fd5b61051f8383838080601f01602080910402602001604051908101604052809392919081815260200183838082843760009201919091525061065892505050565b505050565b61052d336107c3565b8351610540906001906020870190610839565b508251610554906002906020860190610839565b508151610568906003906020850190610839565b50600455505050565b6000546001600160a01b031681565b60008054604080516331a9108f60e11b815230600482015290516001600160a01b0390921691636352211e91602480820192602092909190829003018186803b1580156105cc57600080fd5b505afa1580156105e0573d6000803e3d6000fd5b505050506040513d60208110156105f657600080fd5b5051905090565b6003805460408051602060026001851615610100026000190190941693909304601f810184900484028201840190925281815292918301828280156104155780601f106103ea57610100808354040283529160200191610415565b604080516302571be360e01b81527f91d1777781884d03a6757a803996e38de2a42967fb37eeaca72729271025a9e2600482015290516001600160a01b038416916302571be3916024808301926020929190829003018186803b1580156106be57600080fd5b505afa1580156106d2573d6000803e3d6000fd5b505050506040513d60208110156106e857600080fd5b505160405163c47f002760e01b81526020600482018181528451602484015284516001600160a01b039094169363c47f002793869383926044909201919085019080838360005b8381101561074757818101518382015260200161072f565b50505050905090810190601f1680156107745780820380516001836020036101000a031916815260200191505b5092505050602060405180830381600087803b15801561079357600080fd5b505af11580156107a7573d6000803e3d6000fd5b505050506040513d60208110156107bd57600080fd5b50505050565b6000546001600160a01b031615610817576040805162461bcd60e51b8152602060048201526013602482015272185b1c9958591e481a5b9a5d1a585b1a5e9959606a1b604482015290519081900360640190fd5b600080546001600160a01b0319166001600160a01b0392909216919091179055565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f1061087a57805160ff19168380011785556108a7565b828001600101855582156108a7579182015b828111156108a757825182559160200191906001019061088c565b506108b39291506108b7565b5090565b5b808211156108b357600081556001016108b856fea2646970667358221220090e144854c76e6549d600b7313da8c5e2097a48e09aa26eaabf30101d0d613a64736f6c634300060c0033";

    public static final String FUNC_M_DATASETCHECKSUM = "m_datasetChecksum";

    public static final String FUNC_M_DATASETMULTIADDR = "m_datasetMultiaddr";

    public static final String FUNC_M_DATASETNAME = "m_datasetName";

    public static final String FUNC_M_DATASETTAG = "m_datasetTag";

    public static final String FUNC_OWNER = "owner";

    public static final String FUNC_REGISTRY = "registry";

    public static final String FUNC_SETNAME = "setName";

    public static final String FUNC_INITIALIZE = "initialize";

    protected static final HashMap<String, String> _addresses;

    static {
        _addresses = new HashMap<String, String>();
    }

    @Deprecated
    protected Dataset(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected Dataset(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected Dataset(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected Dataset(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteFunctionCall<byte[]> m_datasetChecksum() {
        final Function function = new Function(FUNC_M_DATASETCHECKSUM, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteFunctionCall<byte[]> m_datasetMultiaddr() {
        final Function function = new Function(FUNC_M_DATASETMULTIADDR, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicBytes>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteFunctionCall<String> m_datasetName() {
        final Function function = new Function(FUNC_M_DATASETNAME, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<String> m_datasetTag() {
        final Function function = new Function(FUNC_M_DATASETTAG, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<String> owner() {
        final Function function = new Function(FUNC_OWNER, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<String> registry() {
        final Function function = new Function(FUNC_REGISTRY, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<TransactionReceipt> setName(String _ens, String _name) {
        final Function function = new Function(
                FUNC_SETNAME, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_ens), 
                new org.web3j.abi.datatypes.Utf8String(_name)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> initialize(String _datasetName, String _datasetTag, byte[] _datasetMultiaddr, byte[] _datasetChecksum) {
        final Function function = new Function(
                FUNC_INITIALIZE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(_datasetName), 
                new org.web3j.abi.datatypes.Utf8String(_datasetTag), 
                new org.web3j.abi.datatypes.DynamicBytes(_datasetMultiaddr), 
                new org.web3j.abi.datatypes.generated.Bytes32(_datasetChecksum)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    @Deprecated
    public static Dataset load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Dataset(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static Dataset load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Dataset(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static Dataset load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new Dataset(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static Dataset load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new Dataset(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<Dataset> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(Dataset.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<Dataset> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(Dataset.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    public static RemoteCall<Dataset> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(Dataset.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<Dataset> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(Dataset.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }

    protected String getStaticDeployedAddress(String networkId) {
        return _addresses.get(networkId);
    }

    public static String getPreviouslyDeployedAddress(String networkId) {
        return _addresses.get(networkId);
    }
}
