package com.thread.lock;

/**
 * @author czy
 * @date 2021/5/18
 */
public class TestGM2 {
    public static void main(String[] args) {
        Led led = new Led();

        new Girlfriend2(led).start();
        new Me2(led).start();
    }

}

class Girlfriend2 extends Thread {
    private Led led;

    public Girlfriend2(Led led) {
        this.led = led;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                this.led.push("橘子" + i);
            } else {
                this.led.push("香蕉" + i);
            }
        }
    }
}

class Me2 extends Thread {
    private Led led;

    public Me2(Led led) {
        this.led = led;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            this.led.pop();
        }
    }
}

class Led {
    String o;
    boolean flag = true;

    public synchronized void push(String o) {
        if (!flag) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("女友剥了" + o);
        notifyAll();
        this.o = o;
        this.flag = !this.flag;
    }

    public synchronized void pop() {
        if (flag) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("我吃了" + this.o);
        notifyAll();
        this.flag = !this.flag;
    }
}

