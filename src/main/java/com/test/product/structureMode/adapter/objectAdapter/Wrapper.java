package com.test.product.structureMode.adapter.objectAdapter;

/**
 * @Author: lijl
 * @Description:
 * @Date: Crated in 15:03 2019-04-17
 * @Modify By:
 */
public class Wrapper implements Targetable {

    private Source source;

    public Wrapper(Source source) {
        super();
        this.source = source;
    }

    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }
}
