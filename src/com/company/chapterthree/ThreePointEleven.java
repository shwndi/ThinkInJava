package com.company.chapterthree;

/**
 * @author czy
 * @date 2020-7-8
 */
public class ThreePointEleven {
    public static String chat2binary(char c) {
        String s = Integer.toBinaryString(c);
        return s;
    }

    public static void main(String[] args) {
        System.out.println("a:\t" + chat2binary('a') + "\t" + (int) 'a');
        System.out.println("A:\t" + chat2binary('A') + "\t" + (int) 'A');
        int a = 2 + 4 + 6 + 8;
        System.out.println(a);
        System.out.println(Integer.toBinaryString(a));
        System.out.println("----------------------------------");

        do {
            a = a >> 1;
            System.out.println(Integer.toBinaryString(a));
        } while (a != 0);
        System.out.println("-----------------------0--0---");
        System.out.println(a);
        int b = 0b111111111111;
        do {
            b = b >>> 1;
            System.out.println(Integer.toBinaryString(b));
        } while (b != 0);
    }
}
