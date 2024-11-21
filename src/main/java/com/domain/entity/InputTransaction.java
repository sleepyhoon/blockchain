package com.domain.entity;

/**
 * <br>package name   : com.domain
 * <br>file name      : InputTransaction
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
public record InputTransaction (
        String inputUtxo, // txid:index 로 구성됨.
        String unlockingScript
) {
    public static InputTransaction of(String inputTxId,String unlockingScript) {
        return new InputTransaction(inputTxId,unlockingScript);
    }
}
