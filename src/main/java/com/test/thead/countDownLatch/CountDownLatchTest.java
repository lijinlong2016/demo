package com.test.thead.countDownLatch;

import java.util.concurrent.CountDownLatch;

/**
 * @Author: lijl
 * @Description:
 * @Date: Crated in 16:42 2019-06-18
 * @Modify By:
 */
public class CountDownLatchTest {

    private static CountDownLatch latch = new CountDownLatch(3);

    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            fatherToRes();
            latch.countDown();
            System.out.println("爸爸到了玩手机，等人齐");
        }).start();
        new Thread(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            motherToRes();
            latch.countDown();
            System.out.println("妈妈到了玩手机，等人齐");
        }).start();
        new Thread(() -> {
            meToRes();
            latch.countDown();
            System.out.println("我到了玩手机，等人齐");
        }).start();
        latch.await();

        togetherToEat();
    }


    /**
     * 模拟爸爸去饭店
     */
    public static void fatherToRes() {
        System.out.println("爸爸步行去饭店需要3小时。");
    }

    /**
     * 模拟妈妈去饭店
     */
    public static void motherToRes() {
        System.out.println("妈妈挤公交去饭店需要2小时。");
    }

    /**
     * 模拟我去饭店
     */
    public static void meToRes() {
        System.out.println("我乘地铁去饭店需要1小时。");
    }

    /**
     * 模拟一家人到齐了
     */
    public static void togetherToEat() {
        System.out.println("一家人到齐了，开始吃饭");
    }

}
