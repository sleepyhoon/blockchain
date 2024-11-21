package com.domain.entity;

import com.domain.dto.CreateTransactionDto;
import java.util.List;

public class Transaction {
    private final String txId;
    private final InputTransaction inputTransaction;
    private final List<Utxo> utxos;

    private Transaction(String txId, InputTransaction inputTransaction, List<Utxo> utxos) {
        this.txId = txId;
        this.inputTransaction = inputTransaction;
        this.utxos = utxos;
    }

    public String getTxId() {
        return txId;
    }

    public InputTransaction getInputTransaction() {
        return inputTransaction;
    }

    public List<Utxo> getUtxos() {
        return utxos;
    }

    public static Transaction create(CreateTransactionDto dto) {
        return new Transaction(dto.getTxId(),dto.getInputTransaction(),dto.getUtxos());
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id='" + txId + '\'' +
                ", inputTransaction=" + inputTransaction +
                ", utxos=" + utxos +
                '}';
    }
}
