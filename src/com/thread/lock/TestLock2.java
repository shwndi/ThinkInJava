package com.thread.lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author czy
 * @date 2021/5/17
 */
public class TestLock2 {
    public static void main(String[] args) {
        TestReentrantLock testReentrantLock = new TestReentrantLock();
/**
 * 多个对象操作同一个资源
 */
        new Thread(testReentrantLock).start();
        new Thread(testReentrantLock).start();
        new Thread(testReentrantLock).start();

    }
}

class TestReentrantLock implements Runnable {
    private int ticketNums = 10;
    private final ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        lock.lock();
        try {
            while (true) {
                if (ticketNums > 0) {
                    Thread.sleep(1000);
                } else {
                    break;
                }
                System.out.println(ticketNums--);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}