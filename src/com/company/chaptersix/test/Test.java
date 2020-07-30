package com.company.chaptersix.test;

import com.company.chaptersix.Animal;

import java.io.Serializable;

/**
 * 验证同一级才是同一个包。
 *
 * @author czy
 * @date 2020-7-14
 */
public class Test implements Serializable {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.eye = "asda";
		Dog dog = new Dog();
		dog.noise = "eqq";
		System.out.println("++++++++++++++++++");
		mkTest();

		Test.mkNew();
		Test.mkNew();
		System.out.println(Test.getNum());
	}

	private  String name;
	private Test(){}
	private static volatile Test test = null;
	private static int num = 0;
	public static Test mkTest(){
		if (test == null) {
			synchronized (test) {
				if (test == null) {
					test = new Test();

				}
			}
		}
		return test;
	}
	public static Test mkNew() {
		num++;
		return new Test();
	}
	public static int getNum() {
		return num;
	}
}
