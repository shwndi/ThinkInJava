package com.thread.build;

/**
 * 创建线程
 *
 * @author czy
 * @date 2021/5/7
 */
public class TestRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("我在看线程 " + i);
        }
    }
    public static void main(String[] args) {
        //创建runnable接口的实现类对象
        TestRunnable thread3 = new TestRunnable();
//        thread.run();
        //创建线程对象，通过线程对象开启线程，代理
        Thread thread = new Thread(thread3,"aa");
        thread.start();
        for (int i = 0; i < 20; i++) {
            System.out.println("我在看代码 "+i);
        }
    }

}
