package com.thread.threepoint;

/**
 * @author czy
 * @date 2021/5/6
 */
public abstract class IntGenerator {
    private volatile boolean canceled = false;
    public abstract  int next();
    public void cancel(){
        canceled = true;
    }
    public boolean isCanceled(){
        return canceled;
    }
}
