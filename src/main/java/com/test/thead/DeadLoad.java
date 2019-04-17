package com.test.thead;

/**
 * @Author: lijl
 * @Description:
 * @Date: Crated in 22:40 2019-04-14
 * @Modify By:
 */
public class DeadLoad {

    static Object objA = new Object();
    static Object objB = new Object();


    public static void main(String[] args) {

        new Thread(() -> {

            synchronized (objA) {
                try {
                    System.out.println(Thread.currentThread().getName() + "get objA");
                    Thread.sleep(1000);
                    synchronized (objB) {
                        System.out.println(Thread.currentThread().getName() + " get objB");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        },"线程1").start();


        new Thread(() -> {
            synchronized (objB) {
                try {
                    System.out.println(Thread.currentThread().getName() + "get objB");
                    Thread.sleep(1000);
                    synchronized (objA) {
                        System.out.println(Thread.currentThread().getName() + "get objB");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        },"线程2").start();
    }
}
