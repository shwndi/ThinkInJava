package com.company.chapterseven;

/**
 * final成员初始化一定要赋值
 *
 * @author czy
 * @date 2020-7-21
 */
public class FinalInitialize {
	final int i= 1;
	final int j ;
	final Dog d;
	public FinalInitialize(){
		j =2;
		d = new Dog("sda");
	}
	public FinalInitialize(int j, Dog d){
		this.j=j;
		this.d = d;
	}

	public static void main(String[] args) {
		FinalInitialize finalInitialize = new FinalInitialize();
		//finalInitialize.d=new Dog("fff");
		System.out.println(finalInitialize);
	}
}
