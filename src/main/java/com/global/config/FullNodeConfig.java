package com.global.config;

import com.domain.repository.UtxoRepository;
import com.global.util.TxInitializer;
import com.domain.repository.TransactionRepository;

public class FullNodeConfig {
    private static final TransactionRepository transactionRepository = new TransactionRepository();
    private static final UtxoRepository utxoRepository = new UtxoRepository();
    private static final TxInitializer txInitializer = new TxInitializer(transactionRepository,utxoRepository);
    private FullNodeConfig() {}

    public static TxInitializer getTxInitializer() {
        return txInitializer;
    }

    public static TransactionRepository getTransactionRepository() {
        return transactionRepository;
    }
}
