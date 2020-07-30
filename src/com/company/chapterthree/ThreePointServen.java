package com.company.chapterthree;

/**
 * 关系操作符
 *
 * @author czy
 * @date 2020-7-7
 */
public class ThreePointServen {
	static class Dog{
		String name;
		String says;
		public Dog(String name,String says){
			this.name=name;
			this.says=says;
		}

		public Dog() {

		}
	}

	public static void main(String[] args) {
		Dog dog1 = new Dog("夏明明", "爷爷，爷爷");
		Dog dog2 = new Dog("小红果", "爸爸，爸爸");
		Dog dog3 = new Dog("夏明明", "爷爷，爷爷");
		System.out.println(dog1.name+"说:"+dog1.says);
		System.out.println(dog2.name+"说:"+dog2.says);
		Dog dog = new Dog();
		dog=dog2;
		System.out.println(dog==dog3);
		System.out.println(dog.equals(dog3));
	}
}
