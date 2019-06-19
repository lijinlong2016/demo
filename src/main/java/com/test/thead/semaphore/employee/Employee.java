package com.test.thead.semaphore.employee;

import java.util.Random;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * @Author: lijl
 * @Description:
 * @Date: Crated in 14:15 2019-06-19
 * @Modify By:
 */
public class Employee implements Runnable {


    private String id;
    private Semaphore semaphore;
    private static Random rand = new Random(47);

    public Employee(String id, Semaphore semaphore) {
        this.id = id;
        this.semaphore = semaphore;
    }

    public void run() {
        try {
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName() + " is using the toilet");
            TimeUnit.MILLISECONDS.sleep(rand.nextInt(2000));
            semaphore.release();
            System.out.println(Thread.currentThread().getName() + " is leaving");
        } catch (InterruptedException e) {
        }
    }
}
