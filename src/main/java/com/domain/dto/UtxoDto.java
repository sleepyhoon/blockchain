package com.domain.dto;

// 트랜잭션 내부에 위차한 utxo
public record UtxoDto(
        Integer index,
        Integer amount,
        String lockingScript
) {
}
