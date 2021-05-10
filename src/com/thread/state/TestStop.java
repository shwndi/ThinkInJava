package com.thread.state;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 测试stop
 * 推荐线程自己停下来。
 * 1、建议线程正常停止-->利用次数，不建议死循环
 * 2、建议使用标志位--->设置一个标志位
 * 3、不要使用stop或者destroy等过时的或者jdk不建议使用的方法。
 *
 * @author czy
 * @date 2021/5/10
 */
public class TestStop implements Runnable{
    private boolean flag =true;
    @Override
    public void run() {
        int i = 0;
        while(flag){
            System.out.println("run......thread"+i++);
        }
    }
    public void stop(){
      this.flag = false;
    }

    public static void main(String[] args) {
        TestStop stop = new TestStop();
        new Thread(stop).start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("main"+i);
            if(i==900){
             stop.stop();
             System.out.println("该线程结束了");
            }
        }
    }
}
