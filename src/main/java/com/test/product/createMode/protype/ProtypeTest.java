package com.test.product.createMode.protype;

public class ProtypeTest implements Cloneable {

    public Object clone() throws CloneNotSupportedException {

        ProtypeTest prototypeTest = (ProtypeTest) super.clone();
        return prototypeTest;
    }


}