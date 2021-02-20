package com.test.classload.bean;

public class Dog {
    public Dog() {
        ClassLoader classLoader = this.getClass().getClassLoader();
        ClassLoader parentLoader = classLoader.getParent();
        if (parentLoader != null) {
            System.out.println("Dog," + classLoader + "," + parentLoader);
        } else {
            System.out.println("Dog," + classLoader);
        }
    }
}