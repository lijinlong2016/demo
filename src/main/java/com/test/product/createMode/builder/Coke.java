package com.test.product.createMode.builder;

/**
 * @Author: lijl
 * @Description:
 * @Date: Crated in 14:25 2019-04-17
 * @Modify By:
 */
public class Coke extends ColdDrink {
    /**
     * 名称
     *
     * @return
     */
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
