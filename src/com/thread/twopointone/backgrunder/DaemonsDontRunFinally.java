package com.thread.twopointone.backgrunder;

import java.util.concurrent.TimeUnit;

/**
 * @author czy
 * @date 2021/4/25
 */
class ADaemon implements Runnable{
    @Override
    public void run(){
        try{
            System.out.println("Starting ADaemon");
            TimeUnit.SECONDS.sleep(1);
        }catch (InterruptedException e){
            System.out.println("Exiting via InterruptedException");
        }finally{
            System.out.println("This should always run ?");
        }

    }
}
public class DaemonsDontRunFinally {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new ADaemon());
        t.setDaemon(false);
        t.start();
//        TimeUnit.SECONDS.sleep(1);
    }
}
