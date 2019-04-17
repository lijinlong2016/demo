package com.test.product.structureMode.adapter.interfaceAdapter;

/**
 * @Author: lijl
 * @Description:
 * @Date: Crated in 15:31 2019-04-17
 * @Modify By:
 */
public class WrapperTest {

    public static void main(String[] args) {
        Sourceable source1 = new SourceSub1();
        Sourceable source2 = new SourceSub2();

        source1.method1();
        source1.method2();
        source2.method1();
        source2.method2();
    }
}
