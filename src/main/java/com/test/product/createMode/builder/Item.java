package com.test.product.createMode.builder;

/**
 * @Author: lijl
 * @Description: 食物条目接口类
 * @Date: Crated in 14:13 2019-04-17
 * @Modify By:
 */
public interface Item {

    /**
     * 名称
     * @return
     */
    String name();

    /**
     * 包装
     * @return
     */
    Packing packing();

    /**
     * 价格
     * @return
     */
    float price();

}
