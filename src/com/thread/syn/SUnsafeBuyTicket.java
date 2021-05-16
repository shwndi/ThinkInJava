package com.thread.syn;

import com.sun.org.apache.bcel.internal.generic.RET;

/**
 * 模拟买票 unsafe Thread
 *
 * @author czy
 * @date 2021/5/14
 */
public class SUnsafeBuyTicket {
    public static void main(String[] args) {
        SBuyTicket buyTicket = new SBuyTicket();

        new Thread(buyTicket,"我").start();
        new Thread(buyTicket,"你").start();
        new Thread(buyTicket,"他").start();

    }
}

class SBuyTicket implements Runnable {
    private int ticket = 10;
    private boolean flag = true;

    @Override
    public void run() {
        while (flag) {
            buy();
        }
    }
//synchronized 同步方法，锁的是this
    private synchronized void  buy() {
        if (ticket <=0) {
            System.out.println("票卖完了");
            flag = false;
            return;
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "买到了第" + ticket -- + "张票");
    }
}
