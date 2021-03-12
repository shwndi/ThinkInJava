package com.company.chapterfive;

/**
 * 静态代码块（执行一次）
 *
 * @author czy
 * @date 2020-7-11
 */
public class Cup {
    static int high = 1;
    String name;
    static int age;

    static {
        age = 10;
        System.out.println("代码块");
    }

    public static void Arr1(String a, String... s) {
        for (String s1 : s) {
            System.out.print(s1);
        }
    }

    public static void Arr2(String... s) {
        for (String s1 : s) {
            System.out.print(s1);
        }
    }

    public static void main(String[] args) {
        Arr1("sd", "sda", "ashjf");
        System.out.println(Cup.age);
        System.out.println(Cup.high);
        Cup cup = new Cup();
        System.out.println(cup.name);
    }

}
