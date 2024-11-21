package com.domain.repository;

import com.domain.entity.Transaction;
import java.util.Collection;
import java.util.LinkedHashMap;

/**
 * <br>package name   : com.repository
 * <br>file name      : TransactionRepository
 * <br>date           : 2024-11-21
 * <pre>
 * <span style="color: white;">[description]</span>
 *
 * </pre>
 * <pre>
 * <span style="color: white;">usage:</span>
 * {@code
 *
 * } </pre>
 * <pre>
 * modified log :
 * =======================================================
 * DATE           AUTHOR               NOTE
 * -------------------------------------------------------
 * 2024-11-21        SeungHoon              init create
 * </pre>
 */
public class TransactionRepository {
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
