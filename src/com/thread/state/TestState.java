package com.thread.state;

/**
 * @author czy
 * @date 2021/5/13
 */
public class TestState {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("/////");
        });
        Thread.State state = thread.getState();
        System.out.println(state);//NEW
        thread.start();
        state = thread.getState();
        System.out.println(state);//RUN

        while (state!=Thread.State.TERMINATED) {//不结束就继续
            Thread.sleep(100);
            state =thread.getState();
            System.out.println(state);
        }

    }
}
