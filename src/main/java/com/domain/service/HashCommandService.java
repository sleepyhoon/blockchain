package com.domain.service;


import com.global.util.HashUtils;
import java.util.Stack;

/**
 * <br>package name   : com.domain.service
 * <br>file name      : HashCommandService
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
public class HashCommandService implements CommandService {
    @Override
    public boolean execute(Stack<Object> stack) {
        String object = (String) stack.pop();
        byte[] hash160 = HashUtils.hash160(object.getBytes());
        stack.push(hash160);
        return Boolean.TRUE;
    }
}
