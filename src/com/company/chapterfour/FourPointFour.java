package com.company.chapterfour;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

/**
 * @author czy
 * @date 2020-7-8
 */
public class FourPointFour {
    public static void main(String[] args) {
        // 47是个特殊的值
        Random random = new Random();
        int r = Integer.MAX_VALUE + Integer.MIN_VALUE;
        Random rand1 = new Random();
        Random rand2 = new Random();
        for (int i = 0; i < 25; i++) {
            int x = rand1.nextInt();
            int y = rand2.nextInt();
            if (x < y) System.out.println(x + " < " + y);
            else if (x > y) System.out.println(x + " > " + y);
            else System.out.println(x + " = " + y);
        }
        Random rand3 = new Random();
        Random rand4 = new Random();
        for (int i = 0; i < 25; i++) {
            int x = rand3.nextInt(10);
            int y = rand4.nextInt(10);
            if (x < y) {
                System.out.println(x + " < " + y);
            } else if (x > y) {
                System.out.println(x + " > " + y);
            } else {
                System.out.println(x + " = " + y);
            }
        }
        for (int a = 0, j = 2;
             a + j < 10;
             a += 2, j -= 1) {

        }

		/*for (int i1 = 0; ; i1++) {
			double random1 = Math.random();
			System.out.System.out.println(random1);

		}*/
    }
}
