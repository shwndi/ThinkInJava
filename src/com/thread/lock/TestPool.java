package com.thread.lock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author czy
 * @date 2021/5/17
 */
public class TestPool {
    public static void main(String[] args) {
        ExecutorService ser = Executors.newFixedThreadPool(10);

        ser.execute(new MyThread());
        ser.execute(new MyThread());
        ser.execute(new MyThread());
        ser.execute(new MyThread());

        ser.shutdown();
    }
}

class MyThread implements Runnable{
    @Override
    public void run() {
            System.out.println(Thread.currentThread().getName());
    }
}