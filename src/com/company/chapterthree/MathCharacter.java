package com.company.chapterthree;

import java.util.Random;

/**
 * 算术运算符
 *
 * @author czy
 * @date 2020-7-7
 */
public class MathCharacter {
	public static void main(String[] args) {
		Random random = new Random(10 );
		for (int i = 0; i < 100; i++) {
			System.out.println(random.nextInt(10));
		}
		double v = Math.E * 3;
		System.out.println(v);
		double m = v % 5;
		System.out.println("取模" + m);
		double mu = v / 5;
		System.out.println("除法" + mu);
	}
}
