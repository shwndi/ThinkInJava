package com.thread.state;

/**
 * @author czy
 * @date 2021/5/14
 */
public class TestDaemon {
    public static void main(String[] args) {
        Daemon daemon = new Daemon();
        Main main = new Main();
        Thread dt = new Thread(daemon);
        Thread mt = new Thread(main);
        dt.setDaemon(true);
        dt.start();
        mt.start();

    }
}

class Main implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("用户线程");
        }
        System.out.println("game over");
    }
}

class Daemon implements Runnable {

    @Override
    public void run() {
        while (true) {
            System.out.println("守护线程O.O");
        }
    }
}