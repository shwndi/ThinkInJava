package com.thread.state;

import com.thread.build.TestRunnable2;

/**
 *
 * 模拟网络延时，放大问题的发生性
 * @author czy
 * @date 2021/5/10
 */
public class TestSleep1 implements Runnable{
    /**
     * 总票数
     */
    private int ticketNums = 10;

    @Override
    public void run() {
        while(true){
            if (ticketNums<=0)
                break;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"-->拿到了第"+ticketNums--+"张票");
        }
    }

    public static void main(String[] args) {
        TestSleep1 thread2 = new TestSleep1();
        Thread t1 = new Thread(thread2, "萧炎");
        Thread t2 = new Thread(thread2, "林动");
        Thread t3 = new Thread(thread2, "牧尘");
        t1.start();
        t2.start();
        t3.start();
    }

}
