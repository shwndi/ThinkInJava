package com.thread.syn;

import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class UnsafeCapture {
    public static void main(String[] args) throws InterruptedException {
        List<String> list = new ArrayList();
        for (int i = 0; i < 10000; i++) {
            new Thread(()->{
                list.add(Thread.currentThread().getName());
            }).start();
        }
        Thread.sleep(100);
        System.out.println(list.size());
    }
}
