package com.test.thead;

/**
 * @Author: lijl
 * @Description: 数据竞争
 * @Date: Crated in 23:00 2019-04-14
 * @Modify By:
 */
public class RaceTest {


    static public volatile int a = 0;


    /**
     * 输出结果3种情况
     * 1、线程先执行，if后执行。无输出
     * 2、if先执行，线程后执行。输出0
     * 3、if先执行，线程执行，输出在执行。输出1
     * @param args
     */
    public static void main(String[] args) {

        new Thread(() -> {
            a = 1;
        }, "Thread-1").start();


        if (0 == a) {
            System.out.println(a);
        }
    }


}
