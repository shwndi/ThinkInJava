package com.thread.state;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 模拟倒计时
 * 获取系统时间
 *
 * sleep设置当前线程阻塞时间
 * sleep存在异常InterruptedException
 * sleep时间达到后线程进入就绪状态
 * sleep可以模拟网络延时和倒计时
 * 每个对象都有一个锁，sleep不会释放锁
 *
 * @author czy
 * @date 2021/5/10
 */
public class TestSleep2 {
    public static void main(String[] args) throws InterruptedException {
        //获取系统当前时间
        Date date = new Date(System.currentTimeMillis());

        while(true){
            Thread.sleep(1000);
            System.out.println(new SimpleDateFormat("HH:mm:ss").format(date));
            //更新系统时间
            date = new Date(System.currentTimeMillis());
        }

//        tenDown();
    }
    //模拟倒计时
    public static void tenDown() throws InterruptedException {
        int a = 10;
        while(true){
            Thread.sleep(1000);
            System.out.println(a--);
            if(a<=0){
                break;
            }
        }
    }
}
