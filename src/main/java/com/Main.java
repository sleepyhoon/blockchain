package com;


import com.global.config.FullNodeConfig;
import com.global.util.TxInitializer;



public class Main {
    public static void main(String[] args) {
        TxInitializer txInitializer = FullNodeConfig.getTxInitializer();
        System.out.println("==================start====================");
        txInitializer.initFullNode();
        System.out.println("===================end=====================");
    }
}