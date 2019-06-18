package com.test.extend;

/**
 * @Author: lijl
 * @Description: 圆形
 * @Date: Crated in 18:59 2019-06-07
 * @Modify By:
 */
public class Circle extends Shape {

    public Circle() {
        System.out.println("子类构造器初始化");
    }


    public void erase() {
        System.out.println("圆形：擦除");
    }


    public void draw() {
        System.out.println("圆形：画画");
    }


}
