package com.company.chapterten;

/**
 * 将返回的类和类的定义放在一起，这个类是没有名字的是匿名的。
 * 默认构造器
 * 简化形式
 *
 * @author czy
 * @date 2020-7-30
 */
public class Pracel7 {
	public Contents contents(){
		return new Contents() {
			@Override
			public int value() {
				return i;
			}
		private int i =11;
		};
	}

	public static void main(String[] args) {
		Pracel7 pracel7 = new Pracel7();
		pracel7.contents();
	}
}
