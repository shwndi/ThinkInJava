package com.thread.build;

/**
 * 买票模型
 *
 * @author czy
 * @date 2021/5/7
 */
public class TestRunnable2 implements Runnable{
    /**
     * 总票数
     */
    private int ticketNums = 10;

    @Override
    public void run() {
        while(true){
            if (ticketNums<=0)
                break;
            System.out.println(Thread.currentThread().getName()+"-->拿到了第"+ticketNums--+"张票");
        }
    }

    public static void main(String[] args) {
        TestRunnable2 thread2 = new TestRunnable2();
        Thread t1 = new Thread(thread2, "萧炎");
        Thread t2 = new Thread(thread2, "林动");
        Thread t3 = new Thread(thread2, "牧尘");
        t1.start();
        t2.start();
        t3.start();
    }
}
