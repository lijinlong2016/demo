package com.test.product.structureMode.adapter.classAdapter;

/**
 * @Author: lijl
 * @Description: 核心思想就是：有一个Source类，拥有一个方法，待适配，目标接口是Targetable，通过Adapter类，将Source的功能扩展到Targetable里
 * @Date: Crated in 14:59 2019-04-17
 * @Modify By:
 */
public class Source {

    public void method1() {
        System.out.println("this is original method!");
    }
}
