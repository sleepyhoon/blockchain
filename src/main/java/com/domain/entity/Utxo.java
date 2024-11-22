package com.domain.entity;

import com.domain.dto.CreateUtxoDto;

public record Utxo(
        String utxoId,
        Integer amount,
        String lockingScript
) {
    public static Utxo of(CreateUtxoDto createUtxoDto) {
        return new Utxo(makeUxtoId(createUtxoDto.txId(),createUtxoDto.index()), createUtxoDto.amount(),
                createUtxoDto.lockingScript());
    }

    private static String makeUxtoId(String txId,Integer index) {
        return txId + ":" + index;
    }
}
