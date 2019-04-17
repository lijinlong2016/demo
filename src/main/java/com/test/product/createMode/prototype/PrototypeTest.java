package com.test.product.createMode.prototype;

public class PrototypeTest implements Cloneable {

    public Object clone() throws CloneNotSupportedException {

        PrototypeTest prototypeTest = (PrototypeTest) super.clone();
        return prototypeTest;
    }


}