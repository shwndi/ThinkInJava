package com.company.chapterten;

/**
 * 参数构造器
 * 匿名内部类加引号是表示表达式结束，而不是类的结束
 *
 * @author czy
 * @date 2020-7-30
 */
public class Pracel8 {
	public Wrapping wrapping(int x){
		return new Wrapping(x){
			@Override
			public int value(){
				return super.value()*47;
			}
		};
	}

	public static void main(String[] args) {
		Pracel8 pracel8 = new Pracel8();
		pracel8.wrapping(33);
	}

}
