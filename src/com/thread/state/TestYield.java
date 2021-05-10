package com.thread.state;

/**
 * 礼让不一定成功
 * 当前线程暂停但不阻塞
 * 将线程运行状态转为就绪状态
 * 然后公平竞争cpu
 *
 * @author czy
 * @date 2021/5/10
 */
public class TestYield {
    public static void main(String[] args) {
        MyYield yield = new MyYield();
        new Thread(yield,"a").start();
        new Thread(yield,"b").start();
    }

}
class MyYield implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"线程开始执行”");
        Thread.yield();
        System.out.println(Thread.currentThread().getName()+"线程结束执行");
    }
}