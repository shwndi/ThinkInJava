package com.thread.syn;

/**
 * 模拟买票 unsafe Thread
 *
 * @author czy
 * @date 2021/5/14
 */
public class UnsafeBuyTicket {
    public static void main(String[] args) {
        BuyTicket buyTicket = new BuyTicket();

        new Thread(buyTicket,"我").start();
        new Thread(buyTicket,"你").start();
        new Thread(buyTicket,"他").start();

    }
}

class BuyTicket implements Runnable {
    private int ticket = 10;
    private boolean flag = true;

    @Override
    public void run() {
        while (flag) {
            buy();
        }
    }

    private void buy() {
        System.out.println(Thread.currentThread().getName() + "买到了第" + ticket -- + "张票");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (ticket <1) {
            System.out.println("票卖完了");
            flag = false;
            return;
        }
    }
}
