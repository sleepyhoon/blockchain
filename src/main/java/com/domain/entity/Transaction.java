package com.domain.entity;

import com.domain.dto.CreateTransactionDto;
import com.domain.dto.UtxoDto;
import java.util.List;

public record Transaction(String txId, InputUtxo inputUtxo, List<UtxoDto> utxos) {
    public static Transaction create(CreateTransactionDto dto) {
        return new Transaction(dto.txId(), dto.inputUtxo(), dto.utxos());
    }
}
