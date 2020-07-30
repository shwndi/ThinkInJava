package com.company.chapterten;

/**
 * 将返回的类和类的定义放在一起，这个类是没有名字的是匿名的。
 *
 * @author czy
 * @date 2020-7-30
 */
public class Pracel7b {
	public Contents contents(){
		return new MyContents();
	}
	class MyContents implements Contents{
		@Override
		public int value() {
			return i;
		}
		private int i =11;
	}

	public static void main(String[] args) {
		Pracel7b pracel7 = new Pracel7b();
		pracel7.contents();
	}
}
