package com.thread.twopointone.thread;

import com.thread.twopointone.LiftOff;

/**
 * 说明：start()看起来是产生了一个对长期运行方法的调用
 *  但是从输出来看，start()迅速地返回了。
 *  实际上，产生的是对liftOff()的方法调用，并且这个方法还未完成。
 *  但是因为LiftOff.run()是由不同的线程执行的，因此main()方法仍然被执行。
 *  任何线程都可以启动另一个线程。
 *
 * @author czy
 * @date 2021/4/22
 */
public class BasicThreads {
    public static void main(String[] args) {
        Thread t = new Thread(new LiftOff());
        t.start();
        System.out.println("Waiting for LiftOff");
    }
}
