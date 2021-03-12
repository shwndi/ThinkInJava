package com.company.chapterthree;

/**
 * 自增前缀后缀的区别:
 * 前缀先取再用
 * 后缀先用再取
 *
 * @author czy
 * @date 2020-7-7
 */
public class ThreePoindSix {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        System.out.println("前缀" + ++a);
        System.out.println("最终" + a);
        System.out.println("后缀" + b++);
        System.out.println("最终" + b);
    }
}
