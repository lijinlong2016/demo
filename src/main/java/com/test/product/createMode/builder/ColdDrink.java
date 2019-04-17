package com.test.product.createMode.builder;

/**
 * @Author: lijl
 * @Description: 冷饮
 * @Date: Crated in 14:21 2019-04-17
 * @Modify By:
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
