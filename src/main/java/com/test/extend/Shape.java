package com.test.extend;

/**
 * @Author: lijl
 * @Description:
 * @Date: Crated in 18:57 2019-06-07
 * @Modify By:
 */
public class Shape {

    public Shape() {
        System.out.println("父类构造器初始化");
    }

    public void erase() {
        System.out.println("形状：擦除");
    }


    public void draw() {
        System.out.println("形状：画画");
    }

}
