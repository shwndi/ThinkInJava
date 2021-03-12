package com.company.chapterfive;

/**
 * 房子
 *
 * @author czy
 * @date 2020-7-11
 */
public class House {
    Window w1 = new Window("w1");

    public House() {
        System.out.println("House()");
        w3 = new Window();
        System.out.println(w3);
    }

    Window w2 = new Window("w2");

    void f() {
        System.out.println("f()");
    }

    Window w3 = new Window() {
    };

    public static void main(String[] args) {
        House house = new House();
        house.f();
        System.out.println(house.w3);
        int a = 1;
    }
}
