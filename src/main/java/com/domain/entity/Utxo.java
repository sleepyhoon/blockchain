package com.domain.entity;

import com.domain.dto.CreateUtxoDto;

/**
 * <br>package name   : com.domain
 * <br>file name      : OutputTransaction
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
public record Utxo(
        String utxoId,
        Amount amount,
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
