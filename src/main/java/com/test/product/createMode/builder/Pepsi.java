package com.test.product.createMode.builder;

/**
 * @Author: lijl
 * @Description: 百世可乐
 * @Date: Crated in 14:26 2019-04-17
 * @Modify By:
 */
public class Pepsi extends ColdDrink {
    /**
     * 名称
     *
     * @return
     */
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
