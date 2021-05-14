package com.thread.state;

/**
 * @author czy
 * @date 2021/5/14
 */
public class TestPriority {
    public static void main(String[] args) {
        int priority = Thread.currentThread().getPriority();
        System.out.println(priority);
        MyRunnable runnable = new MyRunnable();
        Thread t1= new Thread(runnable);
        Thread t2= new Thread(runnable);
        Thread t3= new Thread(runnable);
        Thread t4= new Thread(runnable);
        Thread t5= new Thread(runnable);

        t1.start();

        t2.setPriority(Thread.MIN_PRIORITY);
        t2.start();

        t3.setPriority(4);
        t3.start();

        t4.setPriority(Thread.NORM_PRIORITY);
        t4.start();

        t5.setPriority(Thread.MAX_PRIORITY);
        t5.start();

    }
}
class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"-->"+Thread.currentThread().getPriority());
    }
}