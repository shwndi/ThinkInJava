package com.company.chapterseven;

/**
 * 代理（代为处理）
 *
 * @author czy
 * @date 2020-7-16
 */
public class Cat {
	private Animal animal = new Animal();
	public int down(int i ){
		animal.down(i);
		return i;
	}

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.down(3);
	}

}
