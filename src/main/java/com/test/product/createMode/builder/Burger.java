package com.test.product.createMode.builder;

/**
 * @Author: lijl
 * @Description: 汉堡
 * @Date: Crated in 14:20 2019-04-17
 * @Modify By:
 */
public abstract class Burger implements Item{


    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
