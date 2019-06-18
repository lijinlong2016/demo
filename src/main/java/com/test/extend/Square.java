package com.test.extend;

/**
 * @Author: lijl
 * @Description: 正方形
 * @Date: Crated in 19:00 2019-06-07
 * @Modify By:
 */
public class Square extends Shape {

    public Square() {
        System.out.println("子类构造器初始化");
    }

    public void erase() {
        System.out.println("正方形：擦除");
    }


    public void draw() {
        System.out.println("正方形：画画");
    }
}
