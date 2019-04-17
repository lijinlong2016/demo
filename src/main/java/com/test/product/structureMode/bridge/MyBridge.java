package com.test.product.structureMode.bridge;

/**
 * @Author: lijl
 * @Description:
 * @Date: Crated in 16:10 2019-04-17
 * @Modify By:
 */
public class MyBridge extends Bridge{


    public void method(){
        getSource().method();
    }
}
