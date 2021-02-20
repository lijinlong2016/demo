package com.test.extend;

/**
 * @Author: lijl
 * @Description:
 * @Date: Crated in 19:01 2019-06-07
 * @Modify By:
 */
public class ShapeTest {


    public static void main(String[] args) {
        Circle circle = new Circle();
        Square square = new Square();
        Shape shape = new Shape();

        doSomeThings(circle);
        doSomeThings(square);
        doSomeThings(shape);


    }


    private static void doSomeThings(Shape shape) {
        shape.erase();
        shape.draw();

    }


}
