package com.thread.twopointone.exception;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author czy
 * @date 2021/4/30
 */
public class ExceptionThread implements Runnable{
    @Override
    public void run(){
        throw new RuntimeException();
    }
    public static void main(String[] args){
        ExecutorService pool = Executors.newCachedThreadPool();
        pool.execute(new ExceptionThread());
    }
}
