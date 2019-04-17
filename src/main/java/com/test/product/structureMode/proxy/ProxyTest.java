package com.test.product.structureMode.proxy;

/**
 * @Author: lijl
 * @Description:
 * @Date: Crated in 15:47 2019-04-17
 * @Modify By:
 */
public class ProxyTest {


    public static void main(String[] args) {
        Sourceable obj = new Proxy();
        obj.method();
    }
}
