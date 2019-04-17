package com.test.product.createMode.singleton;

import java.util.Vector;

/**
 * @author lijl
 * @ClassName: SingletonTest
 * @Description: 采用"影子实例"的办法为单例对象的属性同步更新
 */
public class SingletonTest {

    private static SingletonTest instance = null;
    @SuppressWarnings("rawtypes")
    private Vector properties = null;

    @SuppressWarnings("rawtypes")
    public Vector getProperties() {
        return properties;
    }

    private SingletonTest() {
    }

    private static synchronized void syncInit() {
        if (instance == null) {
            instance = new SingletonTest();
        }
    }

    public static SingletonTest getInstance() {
        if (instance == null) {
            syncInit();
        }
        return instance;
    }

    public void updateProperties() {
        SingletonTest shadow = new SingletonTest();
        properties = shadow.getProperties();
    }
}