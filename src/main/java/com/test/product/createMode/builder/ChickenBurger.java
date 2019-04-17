package com.test.product.createMode.builder;

/**
 * @Author: lijl
 * @Description: 鸡肉汉堡
 * @Date: Crated in 14:23 2019-04-17
 * @Modify By:
 */
public class ChickenBurger extends Burger {
    /**
     * 名称
     *
     * @return
     */
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
