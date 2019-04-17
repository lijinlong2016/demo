package com.test.product.structureMode.decorator;

/**
 * @Author: lijl
 * @Description:
 * @Date: Crated in 15:40 2019-04-17
 * @Modify By:
 */
public class DecoratorTest {


    public static void main(String[] args) {
        Sourceable source = new Source();
        Sourceable obj = new Decorator(source);
        obj.method();
    }
}
