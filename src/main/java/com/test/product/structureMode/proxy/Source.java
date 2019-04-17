package com.test.product.structureMode.proxy;

/**
 * @Author: lijl
 * @Description:
 * @Date: Crated in 15:45 2019-04-17
 * @Modify By:
 */
public class Source implements Sourceable {


    @Override
    public void method() {
        System.out.println("the original method!");
    }
}
