package com.test.thead;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @Author: lijl
 * @Description:
 * @Date: Crated in 13:24 2019-04-15
 * @Modify By:
 */
public class TestPool {


    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(1);
        threadPoolExecutor.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello");
            }
        });


    }
}
