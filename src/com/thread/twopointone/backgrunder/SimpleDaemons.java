package com.thread.twopointone.backgrunder;

import com.thread.twopointone.priority.SimplePriorities;

import java.util.concurrent.TimeUnit;

/**
 * 简单守护线程
 * 后台程序：只要还有非后台程序在运行，程序就不会终止。
 * 所有非后台程序终止时，会杀死进程中的所有后天线程。
 *
 * @author czy
 * @date 2021/4/23
 */
public class SimpleDaemons implements Runnable {
    @Override
    public void run() {
        try{
            while(true){
                TimeUnit.MILLISECONDS.sleep(1);
                System.out.println(Thread.currentThread()+" " +this);
            }
        }catch (InterruptedException e){
            System.out.println("sleep() interrupted");
        }
    }

    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 10; i++) {
            Thread daemon = new Thread(new SimpleDaemons());
            daemon.setDaemon(true);
            daemon.start();
        }
        System.out.println("All daemons started");
        TimeUnit.MILLISECONDS.sleep(175);
    }
}
