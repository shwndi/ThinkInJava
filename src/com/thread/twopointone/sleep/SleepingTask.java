package com.thread.twopointone.sleep;

import com.thread.twopointone.LiftOff;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * 休眠，影响任务行为，这将为任务终止执行给定时间
 *
 * @author czy
 * @date 2021/4/23
 */
public class SleepingTask extends LiftOff {
    @Override
    public void run(){
        try {
            while (countDown-- > 0) {
                System.out.println(status());
                TimeUnit.MILLISECONDS.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            System.out.println("this is the "+i+"thread");
            exec.execute(new SleepingTask());
        }
        exec.shutdown();
    }
}
