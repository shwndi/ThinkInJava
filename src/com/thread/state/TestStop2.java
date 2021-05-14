package com.thread.state;

/**
 * @author czy
 * @date 2021/5/13
 */
public class TestStop2 implements Runnable{
    private  boolean flag =true;
    @Override
    public void run() {
        int i=0;
        while(flag){
            System.out.println("thread 执行了"+i+++"次");
        }
    }
    public void stop() {
        this.flag = false;
    }
    public static void main(String[] args) throws InterruptedException {
        TestStop2 stop2 = new TestStop2();
        new Thread(stop2).start();
        for (int i = 0; i <= 1000; i++) {
            System.out.println("main 执行第"+i+"次");
            if (i==900){
                stop2.stop();
                System.out.println("main 执行第"+i+"次,线程停止");
            }
        }
    }


}
