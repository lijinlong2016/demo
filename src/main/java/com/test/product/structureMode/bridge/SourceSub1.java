package com.test.product.structureMode.bridge;

/**
 * @Author: lijl
 * @Description:
 * @Date: Crated in 16:09 2019-04-17
 * @Modify By:
 */
public class SourceSub1 implements Sourceable {


    @Override
    public void method() {
        System.out.println("this is the first sub!");
    }
}
