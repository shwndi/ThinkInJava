package com.thread.twopointone.callable;

import cn.hutool.cron.TaskExecutor;

import java.util.ArrayList;
import java.util.concurrent.*;

/**
 * 任务中产生返回值
 *
 * @author czy
 * @date 2021/4/22
 */
class TaskWithResult implements Callable<String>{
private int id;
public TaskWithResult(int id){
    this.id=id;
}
    @Override
    public String call() throws Exception {
        return "result of TashWithResult " + id;
    }
}
public class CallableDemo {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        ArrayList<Future<String>> result = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            result.add(exec.submit(new TaskWithResult(i)));
        }
        for (Future<String> fs : result) {
            try {
                System.out.println(fs.isDone());
                System.out.println(fs.get());
                System.out.println(fs.isDone());
            }catch (InterruptedException e){
                System.out.println(e);
            }catch (ExecutionException e){
                System.out.println(e);
            }finally{
                exec.shutdown();
            }
        }
    }
}
