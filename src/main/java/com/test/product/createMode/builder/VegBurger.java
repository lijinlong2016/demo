package com.test.product.createMode.builder;

/**
 * @Author: lijl
 * @Description: 素汉堡
 * @Date: Crated in 14:22 2019-04-17
 * @Modify By:
 */
public class VegBurger extends Burger {


    /**
     * 名称
     *
     * @return
     */
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
