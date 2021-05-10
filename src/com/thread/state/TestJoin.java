package com.thread.state;

/**
 * 线程插队
 * @author czy
 * @date 2021/5/10
 */
public class TestJoin implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("线程vip来了"+i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        TestJoin j = new TestJoin();
        Thread thread = new Thread(j);
        thread.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("main"+i);
            if (i==50){
                thread.join();
            }
        }
    }
}
