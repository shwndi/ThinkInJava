package com.thread.build;

/**
 * 几个线程同时调用start（）方法，并未按照顺序执行
 *
 * @author czy
 * @date 2021/5/6
 */
public class TestThread2 extends Thread{
    int a;
    public TestThread2(int a){
        this.a = a;
    }
    @Override
    public void run(){
        Method m1 = new Method();
        m1.f(a);
    }

    public static void main(String[] args) {
        TestThread2 m1 = new TestThread2(1);
        TestThread2 m2 = new TestThread2(2);
        TestThread2 m3 = new TestThread2(3);
        m1.start();
        m2.start();
        m3.start();
    }
}
class Method{
    public void f(int a){
        for (int i = 0; i < 2000; i++) {
            System.out.print("");
        }
        System.out.println(a);
    }
}