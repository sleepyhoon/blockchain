package com.domain.service;


import java.util.Stack;

public class CheckSigCommandService implements CommandService{
    @Override
    public boolean execute(Stack<Object> stack) {
        String publicKey = (String) stack.pop();
        String signature = (String) stack.pop();


    }
}
