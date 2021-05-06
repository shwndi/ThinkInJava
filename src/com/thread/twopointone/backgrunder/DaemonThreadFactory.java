package com.thread.twopointone.backgrunder;

import java.util.concurrent.ThreadFactory;

/**
 * @author czy
 * @date 2021/4/23
 */
public class DaemonThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r){
        Thread t = new Thread(r);
        t.setDaemon(true);
        return t;
    }
}
