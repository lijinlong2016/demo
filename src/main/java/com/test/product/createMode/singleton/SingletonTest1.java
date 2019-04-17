package com.test.product.createMode.singleton;

public class SingletonTest1 {

    private static SingletonTest1 instance = null;

    private SingletonTest1() {
    }

    private static synchronized void syncInit() {
        if (instance == null) {
            instance = new SingletonTest1();
        }
    }

    public static SingletonTest1 getInstance() {
        if (instance == null) {
            syncInit();
        }
        return instance;
    }
}