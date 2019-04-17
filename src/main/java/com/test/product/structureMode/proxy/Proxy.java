package com.test.product.structureMode.proxy;

/**
 * @Author: lijl
 * @Description:
 * @Date: Crated in 15:45 2019-04-17
 * @Modify By:
 */
public class Proxy implements Sourceable {

    private Source source;

    public Proxy() {
        super();
        this.source = new Source();
    }

    @Override
    public void method() {
        before();
        source.method();
        atfer();
    }

    private void before() {
        System.out.println("before proxy!");
    }

    private void atfer() {
        System.out.println("after proxy!");
    }
}
