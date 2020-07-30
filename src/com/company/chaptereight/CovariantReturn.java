package com.company.chaptereight;

/**
 * 协变返回值：
 * 	在java SE5之后返回的是更加具体类型，之前是返回基类类型
 *
 * @author czy
 * @date 2020-7-25
 */
public class CovariantReturn {
	public static void main(String[] args) {
		Mill m = new Mill();
		Grain g = m.process();
		System.out.println(g);
		m = new WheatMill();
		g = m.process();
		System.out.println(g);
	}
	
}
class Grain{
	public String toString(){
		return "Grain";
	}
}
class Wheat extends Grain{
	public String toString(){
		return "Wheat";
	}
}
class Mill{
	Grain process(){
		return new Grain();
	}
}
class WheatMill extends Mill{
	Wheat process(){
		return new Wheat();
	}
}