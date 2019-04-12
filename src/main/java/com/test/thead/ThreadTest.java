package com.test.thead;

/**
 * @Author: lijl
 * @Description: 匿名类实现
 * @Date: Crated in 16:14 2019-04-12
 * @Modify By:
 */
public class ThreadTest {

    public static void main(String[] args) {

        /**
         * Thread的匿名子类
         */
        Thread thread = new Thread(){
            @Override
            public void run() {
                System.out.println("Thread running");
            }
        };
        thread.start();
        System.out.println("Thread的匿名子类");


    }
}
