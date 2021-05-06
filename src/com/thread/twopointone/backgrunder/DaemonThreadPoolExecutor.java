package com.thread.twopointone.backgrunder;

import sun.nio.ch.ThreadPool;

import java.sql.Time;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author czy
 * @date 2021/4/23
 */
public class DaemonThreadPoolExecutor  extends ThreadPoolExecutor {
    public DaemonThreadPoolExecutor(){
        super(0,Integer.MAX_VALUE,60L, TimeUnit.SECONDS,
                new SynchronousQueue<Runnable>(),
                new DaemonThreadFactory());
    }
}
