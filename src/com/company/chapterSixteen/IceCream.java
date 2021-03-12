package com.company.chapterSixteen;


import org.openjdk.jol.info.ClassLayout;

import java.util.Arrays;
import java.util.Random;

/**
 * @author czy
 * @date 2021/2/1
 */
public class IceCream {
    private static Random rand = new Random(47);
    static final String[] FLAVORS = {
            "Chocolate", "Strawberry", "Vanilla Fudge Swirl",
            "Mint Chip", "Mocha Almond Fudge", "Rum Raisin", "Praline Cream", "Mud Pie"
    };

    /**
     * pick 防止重复，do{}while（true）停止循环
     *
     * @param n
     * @return
     */
    public static String[] flavorSet(int n) {
        if (n > FLAVORS.length) {
            throw new IllegalArgumentException("Set too big");
        }
        String[] results = new String[n];
        boolean[] picked = new boolean[FLAVORS.length];
        for (int i = 0; i < n; i++) {
            int t;
            do {
                t = rand.nextInt(FLAVORS.length);
            } while (picked[t]);
            results[i] = FLAVORS[t];
            picked[t] = true;
        }
        return results;

    }

    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.deepToString(a));
        System.out.println(Arrays.deepHashCode(a));
        System.out.println(ClassLayout.parseInstance(a.getClass()).toPrintable());
        for (int i = 0; i < 7; i++) {
            System.out.println(Arrays.deepToString(flavorSet(3)));
        }
    }
}
