package com.thread.build;

/**
 * run（）方法是同步执行线程
 * start（）方法是先执行新线程
 * @author czy
 * @date 2021/5/6
 */
public class TestThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("w我在看线程 " + i);
        }
    }
    public static void main(String[] args) {
        TestThread thread = new TestThread();
        thread.run();
//        thread.start();
        for (int i = 0; i < 2000; i++) {
            System.out.println("我在看代码 "+i);
        }
    }

}

