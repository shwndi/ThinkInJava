package com.company.chaptersix;

import com.company.chaptersix.test.Cat;
import com.company.chaptersix.test.Dog;
import com.company.chaptersix.test.*;

/**
 * @author czy
 * @date 2020-7-14
 */
public class Test {
	public static void main(String[] args) {
		/**
		 * 同一个包下private不能访问
		 */
		Animal animal = new Animal();
		animal.eye = "123";
		animal.name = "456";

		/**
		 * 子包下的包访问权限不能被上级包访问，只有public可以访问。
		 */
		Dog dog = new Dog();
		dog.eye = "789";
		dog.mouth = "qwerq";

		Cat cat = new Cat();
		cat.Colour="ada";



	}
}
