package com.domain.dto;

import com.domain.entity.InputTransaction;
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
public class CreateTransactionDto {
    private String txId;
    private InputTransaction inputTransaction;
    private List<Utxo> utxos;

    public CreateTransactionDto() {}

    public String getTxId() {
        return txId;
    }

    public InputTransaction getInputTransaction() {
        return inputTransaction;
    }

    public List<Utxo> getUtxos() {
        return utxos;
    }
}
