package com.domain.dto;

import com.domain.entity.InputUtxo;
import java.util.List;

public record CreateTransactionDto(
        String txId, InputUtxo inputUtxo, List<UtxoDto> utxos
) {
}

