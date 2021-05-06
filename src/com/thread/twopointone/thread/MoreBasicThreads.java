package com.thread.twopointone.thread;

import com.thread.twopointone.LiftOff;

/**
 * 由于线程调度机制是非确定性的，所以每次运行的结果可能不同。
 *
 * @author czy
 * @date 2021/4/22
 */
public class MoreBasicThreads {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {

            new Thread(new LiftOff()).start();
        }
        System.out.println("Waiting for LiftOff");
    }
}
