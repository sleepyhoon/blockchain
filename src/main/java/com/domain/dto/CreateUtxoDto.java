package com.domain.dto;



public record CreateUtxoDto(
        String txId,
        Integer index,
        Integer amount,
        String lockingScript
) {
}
