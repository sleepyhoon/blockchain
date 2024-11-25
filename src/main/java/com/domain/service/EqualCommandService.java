package com.domain.service;


import java.util.Stack;

public class EqualCommandService implements CommandService {

    @Override
    public boolean execute(Stack<Object> stack) {
        String element1 = (String) stack.pop();
        String element2 = (String) stack.pop();
        if(element1.equals(element2)) {
            stack.push(Boolean.TRUE);
        }
        else
            stack.push(Boolean.FALSE);
        return Boolean.TRUE;
    }
}
