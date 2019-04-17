package com.test.product.structureMode.adapter.classAdapter.demo1;

/**
 * @Author: lijl
 * @Description:
 * @Date: Crated in 15:03 2019-04-17
 * @Modify By:
 */
public class Adapter extends Source implements Targetable{


    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }
}
