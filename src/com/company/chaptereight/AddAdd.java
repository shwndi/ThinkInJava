package com.company.chaptereight;

import java.util.ArrayList;

/**
 * 知识点：
 *
 * 自增自减
 * 自增优先级高于比较优先级
 * 自增直接改变数值，无论是什么操作。比如在if（）条件中。
 * @author czy
 * @date 2020-7-23
 */
public class AddAdd {
	public static void main(String[] args) {
		ArrayList<Object> objects = new ArrayList<>();
		int size = objects.size();
		System.out.println(size);
		int a = 1;
		if (a++ == 2) {
			System.out.println(a);
		}
		System.out.println(a);
		if (++a == 3) {
			System.out.println(a);
		}
		System.out.println(a);
	}
}
