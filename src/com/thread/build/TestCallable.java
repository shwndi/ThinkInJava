package com.thread.build;

import java.util.concurrent.*;

/**
 *  优点：
 *  可以定义返回值
 *  可以抛出异常
 * @author czy
 * @date 2021/5/7
 */
public class TestCallable implements Callable {
    int a;
    public TestCallable(int a){
        this.a = a;
    }
    @Override
    public Boolean call() throws Exception {
        Method m1 = new Method();
        m1.f(a);
        return true;
    }
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        TestCallable m1 = new TestCallable(1);
        TestCallable m2 = new TestCallable(2);
        TestCallable m3 = new TestCallable(3);
        ExecutorService exec = Executors.newFixedThreadPool(3);
        Future<Boolean> s1 = exec.submit(m1);
        Future<Boolean> s2 = exec.submit(m2);
        Future<Boolean> s3 = exec.submit(m3);
        boolean rs1 = s1.get();
        boolean rs2 = s2.get();
        boolean rs3 = s3.get();
        exec.shutdownNow();
    }
}
