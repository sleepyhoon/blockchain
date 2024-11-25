package com.domain.service;

import java.util.Stack;

/**
 * <br>package name   : com.domain.service
 * <br>file name      : CommandService
 * <br>date           : 2024-11-22
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
 * 2024-11-22        SeungHoon              init create
 * </pre>
 */
public interface CommandService {
    boolean execute(Stack<Object> stack);
}
