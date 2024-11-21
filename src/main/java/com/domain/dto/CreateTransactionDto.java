package com.domain.dto;

import com.domain.entity.InputUtxo;
import com.domain.entity.Utxo;
import java.util.List;

/**
 * <br>package name   : com.domain.dto
 * <br>file name      : CreateTransactionDto
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
public record CreateTransactionDto(
        String txId, InputUtxo inputUtxo, List<UtxoDto> utxos
) {
}

