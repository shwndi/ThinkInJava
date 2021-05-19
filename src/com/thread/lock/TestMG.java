package com.thread.lock;

/**
 * 主线程开启通信
 *
 * @author czy
 * @date 2021/5/18
 */
public class TestMG{
    public static void main(String[] args){
        Basket b = new Basket();

        new Girlfriend(b).start();
        new Me(b).start();
    }
}

/**
 * 产品
 */
class Orange{
    int num;
    public Orange(int num){
        this.num = num;
    }
}

/**
 * 生产者
 */
class Girlfriend extends Thread{
    private Basket b;
    public Girlfriend(Basket b){
        this.b = b;
    }
    @Override
    public void run(){
        for(int i = 0;i<100 ;i++ ){
            System.out.println("女朋友剥了"+i+"个橘子");
            b.push(new Orange(i));
        }
    }
}

/**
 *消费者
 */
class Me extends Thread{
    private Basket b;
    public Me(Basket b){
        this.b =b;
    }

    @Override
    public void run(){
        for(int i =0;i<100 ; i++){
            System.out.println("我吃了"+b.pop().num+"个橘子");
        }
    }
}

/**
 * 缓冲区
 */
class Basket {
    Orange[] oranges  = new Orange[10];
    int count = 0;
    //生产者要剥橘子
    public synchronized void push(Orange orange) {
        //如果
        if (count == oranges.length) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        oranges[count] = orange;
        count++;
        this.notifyAll();
    }
        //消费者要吃橘子
        public synchronized Orange pop(){
            if(count ==0){
                try{
                    this.wait();
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
            count--;
            Orange r = oranges[count];
            this.notifyAll();
            return r;
        }
    }