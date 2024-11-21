package com;

import com.domain.entity.Transaction;
import com.global.config.FullNodeConfig;
import com.global.util.TxInitializer;
import com.repository.TransactionRepository;
import java.util.Collection;


public class Main {
    public static void main(String[] args) {
        TxInitializer txInitializer = FullNodeConfig.getTxInitializer();
        TransactionRepository transactionRepository = FullNodeConfig.getTransactionRepository();
        txInitializer.initTx();
        Collection<Transaction> all = transactionRepository.findAll();

        for (Transaction transaction : all) {
            System.out.println(transaction);
        }
    }
}