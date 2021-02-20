package com.test.thead.semaphore.employee;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * @Author: lijl
 * @Description: 30个人上厕所，厕所最多容纳10个人
 * @Date: Crated in 14:16 2019-06-19
 * @Modify By:
 */
public class ToiletRace {

    private static final int THREAD_COUNT = 30;

    private static ExecutorService threadPool = Executors
            .newFixedThreadPool(THREAD_COUNT);

    private static ExecutorService a = Executors.newScheduledThreadPool(THREAD_COUNT);


    private static Semaphore s = new Semaphore(10);

    public static void main(String[] args) {
        for (int i = 0; i < THREAD_COUNT; i++) {
            threadPool.execute(new Employee(String.valueOf(i), s));
        }

        threadPool.shutdown();
    }

}
