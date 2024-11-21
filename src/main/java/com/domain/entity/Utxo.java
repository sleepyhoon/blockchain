package com.domain.entity;

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
        Integer index,
        Amount amount,
        String lockingScript
) {
    public static Utxo of(Integer index, Amount amount, String lockingScript) {
        return new Utxo(index, amount,lockingScript);
    }
}
