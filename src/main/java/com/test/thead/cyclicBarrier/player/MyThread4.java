package com.test.thead.cyclicBarrier.player;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * @Author: lijl
 * @Description: 如果在执行屏障操作过程中发生异常，则该异常将传播到当前线程中
 * @Date: Crated in 14:00 2019-06-19
 * @Modify By:
 */
public class MyThread4 extends Thread {

    private CyclicBarrier cyclicBarrier;
    private String name;
    private int ID;

    public MyThread4(CyclicBarrier cyclicBarrier, String name, int ID) {
        super();
        this.cyclicBarrier = cyclicBarrier;
        this.name = name;
        this.ID = ID;

    }

    @Override
    public void run() {
        System.out.println(name + "开始准备");
        try {
            Thread.sleep(ID * 1000);
            System.out.println(name + "准备完毕！在起跑线等待发令枪");
            try {
                try {
                    cyclicBarrier.await(ID * 1000, TimeUnit.MILLISECONDS);
                } catch (TimeoutException e) {
                    e.printStackTrace();
                }
                System.out.println(name + "跑完了路程！");
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
                System.out.println(name + "看不见起跑线了");
            }
            System.out.println(name + "退场！");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

    }

    static Map<Integer, Thread> threads = new HashMap<>();

    public static void main(String[] args) throws InterruptedException {
        CyclicBarrier barrier = new CyclicBarrier(5, new Runnable() {
            @Override
            public void run() {
                System.out.println("发令枪响了，跑！");

            }
        });

        for (int i = 0; i < 5; i++) {
            MyThread4 t = new MyThread4(barrier, "运动员" + i + "号", i);
            threads.put(i, t);
            t.start();
        }

    }
}
