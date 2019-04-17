package com.test.product.structureMode.adapter.classAdapter.demo1;

/**
 * @Author: lijl
 * @Description:
 * @Date: Crated in 15:04 2019-04-17
 * @Modify By:
 */
public class AdapterTest {


    public static void main(String[] args) {
        Targetable targetable = new Adapter();
        targetable.method1();
        targetable.method2();

    }
}
