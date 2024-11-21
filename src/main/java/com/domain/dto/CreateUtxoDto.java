package com.domain.dto;

import com.domain.entity.Amount;

/**
 * <br>package name   : com.domain.dto
 * <br>file name      : CreateUtxoDto
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
public record CreateUtxoDto(
        String txId,
        Integer index,
        Amount amount,
        String lockingScript
) {
}
