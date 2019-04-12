package com.test.thead;

import com.test.thead.testClass.NotThreadSafe;
import org.junit.Test;

/**
 * @Author: lijl
 * @Description: 实现 Runnable
 * @Date: Crated in 16:24 2019-04-12
 * @Modify By:
 */
public class MyRunnable implements Runnable {

    NotThreadSafe instance = null;

    public MyRunnable() {

    }


    public MyRunnable(NotThreadSafe notThreadSafe) {
        this.instance = notThreadSafe;
    }

    @Override
    public void run() {
        //测试对象成员
        this.instance.add("some text");

        System.out.println(Thread.currentThread().getName() + " MyRunnable running");

    }

    @Test
    public void test() {
        Thread thread = new Thread(new MyRunnable(), "线程名");
        thread.start();
        System.out.println(thread.getName() + " Thread类的构造函数中传入 MyRunnable的实例对象");
    }


    @Test
    public void test1() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

                System.out.println(Thread.currentThread().getName() + " Runnable running");
            }
        }, "线程名字");

        thread.start();
        String name = thread.getName();
        System.out.println(name + " Runnable 匿名类启动");

    }

    /**
     * 线程名
     */
    @Test
    public void test2() {
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + " running");
                }
            }, "线程" + i).start();
        }
    }

    /**
     * 线程名1
     */
    @Test
    public void test3() {
        for (int i = 0; i < 10; i++) {
            new Thread("线程名" + i) {
                @Override
                public void run() {
                    System.out.println(getName() + "running");
                }
            }.start();
        }


    }


}
