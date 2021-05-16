package com.thread.syn;

import java.util.ArrayList;
import java.util.List;

public class SafeList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < 10000; i++) {
            synchronized (list) {
            new Thread(() -> {

                    list.add(Thread.currentThread().getName());
            }).start();
            }
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(list.size());
    }
}