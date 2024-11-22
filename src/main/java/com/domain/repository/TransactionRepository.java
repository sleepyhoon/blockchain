package com.domain.repository;

import com.domain.entity.Transaction;
import java.util.Collection;
import java.util.LinkedHashMap;


public class TransactionRepository {
    //id를 통해 검색하며, 순서가 중요하기 때문에 LinkedHashMap으로 선언.
    private final LinkedHashMap<String, Transaction> linkedHashMap = new LinkedHashMap<>();

    public void save(Transaction transaction) {
        linkedHashMap.put(transaction.txId(),transaction);
    }

    public Transaction get(String id) {
        return linkedHashMap.get(id);
    }

    public Collection<Transaction> findAll() {
        return linkedHashMap.values();
    }
}
