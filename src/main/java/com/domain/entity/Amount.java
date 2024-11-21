package com.domain.entity;

/**
 * <br>package name   : com.domain
 * <br>file name      : Amount
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
public class Amount {
    private final int amount;

    public Amount(int amount) {
        if(amount < 0)
            throw new IllegalArgumentException();
        this.amount = amount;
    }
}
