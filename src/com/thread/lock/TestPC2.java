package com.thread.lock;

/**
 * 信号灯法
 *
 * @author czy
 * @date 2021/5/17
 */
public class TestPC2 {
    public static void main(String[] args) {
        TV tv = new TV();
        new Player(tv).start();
        new Watcher(tv).start();
    }
}

class Player extends Thread {
    TV tv;

    public Player(TV tv) {
        this.tv = tv;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                this.tv.play("喜羊羊");
            } else {
                this.tv.play("灰太狼");
            }
        }
    }
}

class Watcher extends Thread {
    TV tv;

    public Watcher(TV tv) {
        this.tv = tv;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            this.tv.watch();
        }
    }
}

class TV {
    String voice;

    boolean falg = true;

    //表演
    public synchronized void play(String voice) {
        if (!falg) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("演员表演了：" + voice);
        notifyAll();
        this.voice = voice;
        this.falg = !this.falg;
    }

    //观看
    public synchronized void watch() {
        if (falg) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("观众观看了：" + this.voice);
        this.notifyAll();
        this.falg = !this.falg;
    }
}
