package com.thread.build;

import org.junit.internal.runners.statements.RunAfters;

/**
 * 龟兔赛跑
 * 1、确定赛道距离
 * 2、判断是否结束
 * 3、打印胜利者
 * 4、开始比赛
 * 5、模拟兔子睡觉
 * 6、乌龟必须赢
 *
 * @author czy
 * @date 2021/5/7
 */
public class Race implements Runnable {
    private static String winner;

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if(Thread.currentThread().getName().equals("兔子")&&i%10==0){
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            boolean over = gameOver(i);
            if (over){
                break;
            }
            System.out.println(Thread.currentThread().getName()+"跑了"+i+"步");
        }
    }

    private boolean gameOver(int step) {
        if (winner != null) {
            return true;
        }
        {
            if (step >= 100) {
                winner = Thread.currentThread().getName();
                System.out.println("winner is "+winner);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Race race = new Race();
        Thread tz = new Thread(race, "兔子");
        Thread wg = new Thread(race, "乌龟");
        tz.start();
        wg.start();
    }
}
