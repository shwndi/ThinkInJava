package com.company.chapterten;

/**
 * 匿名内部类可以对字段进行初始化
 *
 * @author czy
 * @date 2020-7-30
 */
public class Pracel9 {
	public Destination destination(){
		return new Destination() {
			private int readLable =11;
			@Override
			public String readLable() {
				return String.valueOf(readLable);
			}
		};
	}

	public static void main(String[] args) {
		Pracel9 pracel9 = new Pracel9();
		pracel9.destination();
	}
}
