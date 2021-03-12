package com.company.chapterthree;

/**
 * 类型转换：结尾和舍入
 *
 * @author czy
 * @date 2020-7-8
 */
public class ThreePointFourteen {
    public static void main(String[] args) {
        double d = 123144.52514151D;
        int maxValue = Integer.MAX_VALUE;
        System.out.println("int类型最大值：\t" + maxValue);
        System.out.println("--------截尾--------");
        int I = (int) d;
        System.out.println(I);
        System.out.println("--------舍入--------");
        long L = Math.round(d);
        System.out.println(L);
        System.out.println("--------窄化转换---------");
        L = 214748364798L;
        int Res = (int) L;
        System.out.println(Res);
        System.out.println("--------扩展装换---------");
        Res = 123;
        long EX = Res;
        System.out.println(EX);
    }
}
