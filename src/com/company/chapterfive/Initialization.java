package com.company.chapterfive;

/**
 * 没有初始化的对象类型字段不能使用该对象中的字段
 *
 * @author czy
 * @date 2020-7-11
 */
public class Initialization {
    int i = 1;
    Cat cat;

    public static void main(String[] args) {
        Initialization initialization = new Initialization();
        String name = initialization.cat.name + "猫";
        System.out.println(name);
    }
}
