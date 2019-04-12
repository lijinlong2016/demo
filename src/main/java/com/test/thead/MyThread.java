package com.test.thead;

/**
 * @Author: lijl
 * @Description: 继承重写run
 * @Date: Crated in 16:17 2019-04-12
 * @Modify By:
 */
public class MyThread extends Thread {


    @Override
    public void run() {
        System.out.println("MyThread running");
    }


    /**
     * 一旦线程启动后start方法就会立即返回，而不会等待到run方法执行完毕才返回。就好像run方法是在另外一个cpu上执行一样。当run方法执行后，将会打印出字符串MyThread running。
     *
     * @param args
     */
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        System.out.println(myThread.getName() + "myThread.start() end");

    }
}
