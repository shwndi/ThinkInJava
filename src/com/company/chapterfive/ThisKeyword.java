package com.company.chapterfive;

/**
 * @author czy
 * @date 2020-7-9
 */
public class ThisKeyword {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.setName("小黑")
				.setColour("black");
		System.out.println(dog);
		Dog dog2 = new Dog();
		dog2.setName("小红");
		dog2.setColour("yellow");
		System.out.println(dog2);
	}
}
