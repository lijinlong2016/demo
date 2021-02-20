package com.test.thead.cyclicBarrier.horse;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @Author: lijl
 * @Description:
 * @Date: Crated in 13:48 2019-06-19
 * @Modify By:
 */
public class HorseRace {

    static final int FINISH_LINE = 75;
    private List<Horse> horses = new ArrayList<Horse>();
    private ExecutorService exec = Executors.newCachedThreadPool();
    private CyclicBarrier barrier;

    /**
     * @param nHorses 几匹马（几个线程）
     * @param pause   每走完一轮，暂停一小会输出
     */
    public HorseRace(int nHorses, final int pause) {
        barrier = new CyclicBarrier(nHorses, new Runnable() {
            @Override
            public void run() {
                StringBuilder s = new StringBuilder();
                for (int i = 0; i < FINISH_LINE; i++) {
                    s.append("="); //打印赛道
                }
                System.out.println(s);
                for (Horse horse : horses) {
                    System.out.println(horse.tracks());  //打印每匹马的轨迹
                }
                for (Horse horse : horses) {
                    if (horse.getStrides() >= FINISH_LINE) {
                        System.out.println(horse + "won!");   //每次检查，如果哪匹马到终点了，终止所有线程
                        exec.shutdownNow();
                        return;
                    }
                }
                try {
                    TimeUnit.MILLISECONDS.sleep(pause); //每走完一轮，暂停一小会输出
                } catch (InterruptedException e) {
                    System.out.println("barrier-action sleep interrupted");
                }
            }
        });

        for (int i = 0; i < nHorses; i++) {
            Horse horse = new Horse(barrier);
            horses.add(horse);
            exec.execute(horse);  //所有马的线程开始执行
        }
    }

    public static void main(String[] args) {
        int nHorses = 9;
        int pause = 500;
        new HorseRace(nHorses, pause);
    }


}
