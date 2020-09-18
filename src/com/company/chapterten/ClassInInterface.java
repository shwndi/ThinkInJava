package com.company.chapterten;

/**
 * @author czy
 * @date 2020-8-3
 */
public interface ClassInInterface {
	void howl();

	class Test implements ClassInInterface {
		int a;
		public Test setA(int a) {
			this.a = a;
			return this;
		}
		int b;
		public Test setB(int b) {
			this.b = b;
			return this;
		}
		@Override
		public void howl() {
			System.out.println("hello ");
		}

		public static void main(String[] args) {
			new Test().howl();
			new Test().setA(123).setB(345);
		}
	}

}
