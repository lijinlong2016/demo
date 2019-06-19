package com.test.thead.cyclicBarrier.horse;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

/**
 * @Author: lijl
 * @Description:
 * 我们假设赛道长为75，马每次能走0,1或者2步，每次走完一轮后，互相等待。
 * 一旦所有马越过栅栏，它就会自动为下一回合的比赛做好准备。读者可以运行我的程序，在控制台上可以展示出一定的动画效果。
 * @Date: Crated in 13:47 2019-06-19
 * @Modify By:
 */
public class Horse implements Runnable {

        private static int counter = 0;
        private final int id = counter++;
        private int strides = 0;
        private static Random rand = new Random(47);
        private static CyclicBarrier barrier;
        public Horse(CyclicBarrier b) {barrier = b;}
        public synchronized int getStrides() {return strides;}
        public void run() {
            try {
                while (!Thread.interrupted()) {  //线程内不断循环
                    synchronized (this) {
                        strides += rand.nextInt(3);   //每次马可以走0,1或者2步
                    }
                    barrier.await();  //走完后，就等所有其它马也走完，才能开始下一回合
                }
            } catch (InterruptedException e) {

            } catch (BrokenBarrierException e) {
                throw new RuntimeException(e);
            }
        }

        @Override
        public String toString() {
            return "Horse " + id + " ";
        }

        public String tracks() {
            StringBuilder s =new StringBuilder();
            for(int i = 0; i < getStrides();i++)
                s.append("*");   //这里打印每个马走的轨迹
            s.append(id);
            return s.toString();
        }
    }
