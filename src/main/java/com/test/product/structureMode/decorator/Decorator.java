package com.test.product.structureMode.decorator;

/**
 * @Author: lijl
 * @Description:
 * @Date: Crated in 15:38 2019-04-17
 * @Modify By:
 */
public class Decorator implements Sourceable {

    private Sourceable source;


    public Decorator(Sourceable source) {
        super();
        this.source = source;
    }

    @Override
    public void method() {

        System.out.println("before decorator!");
        source.method();
        System.out.println("after decorator!");
    }
}
