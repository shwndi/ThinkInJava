package com.thread.syn;

public class SafeBank {
    public static void main(String[] args) {
        Account money = new Account(100,"易方达");
        new DrawMoney(money,50,"我").start();
        new DrawMoney(money,100,"你").start();
    }
}

class SAccount{
    String name;
    int money;

    public SAccount(int money, String name) {
        this.name = name;
        this.money = money;
    }
}

class SDrawMoney extends Thread {
    SAccount account;
    int drawMoney;
    public SDrawMoney(SAccount account,int drawMoney,String name){
        super(name);
        this.account=account;
        this.drawMoney=drawMoney;
    }
    @Override
    public void run(){
        //锁的对象，是不安全的量，正删改
        synchronized(account) {
            if (account.money - drawMoney < 0) {
                System.out.println(this.getName()+"取钱余额不足");
                return;
            }
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
            System.out.println(account.name + "还剩" + account.money + "钱");
            account.money = account.money - drawMoney;
            System.out.println(this.getName() + "取了" + drawMoney + "钱");
            System.out.println(account.name + "还有" + account.money + "钱");
        }
    }
}