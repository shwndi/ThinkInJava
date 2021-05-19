package com.thread.lock;

/**
 * 生产者消费者模型-->创建缓冲区：管程法
 *
 * @author czy
 * @date 2021/5/17
 */
public class TestPC {
    public static void main(String[] args) {
        SynContainer container = new SynContainer();
        new Productor(container).start();
        new Consumer(container).start();
    }
}

/**
 * 生产者
 */
class Productor extends Thread {
    private SynContainer container;

    public Productor(SynContainer container) {
        this.container = container;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("生产了" + i + "只鸡");
            container.push(new Checken(i));
        }
    }
}

/**
 * 消费者
 */
class Consumer extends Thread {
    private SynContainer container;

    public Consumer(SynContainer container) {
        this.container = container;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("吃掉了" + container.pop().i + "只鸡");
        }
    }
}

/**
 * 产品
 */
class Checken {
    int i;

    public Checken(int i) {
        this.i = i;
    }
}

/**
 * 缓冲区
 */
class SynContainer {
    Checken[] checkens = new Checken[10];
    int count = 0;

    //生产者放入产品
    public synchronized void push(Checken checken) {
        if (checkens.length == count) {
            //通知消费者消费，自己等待
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //向缓冲区添加商品
        checkens[count] = checken;
        count++;
        notifyAll();
    }


    //消费者消费产品
    public synchronized Checken pop() {
        if (count == 0) {
            //通知生产者，自己等待
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        count--;
        Checken checken = checkens[count];
        this.notifyAll();
        return checken;
    }


}
