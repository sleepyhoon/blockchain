package com.domain.service;

import java.util.Stack;

/**
 * <br>package name   : com.domain.service
 * <br>file name      : EqualVerifyCommandService
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
public class EqualVerifyCommandService implements CommandService {
    @Override
    public boolean execute(Stack<Object> stack) {
        String element1 = (String) stack.pop();
        String element2 = (String) stack.pop();
        if(element1.equals(element2)) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
