package com.company.chapterseven;

/**
 * @author czy
 * @date 2020-7-16
 */
public class Animal {
	public Animal(){}
	public Animal(int i){
		System.out.println("animal");
	}
	public Animal(String s){
		System.out.println("String");
	}
	public int up(int i){
		System.out.println("向上走"+i+"bu");
		return i;
	}
	public int down(int i){
		System.out.println("向下走"+i+"bu");
		return i;
	}
	String name;
	protected void setName(String name){
		this.name= name;
		System.out.println(name);
	}

}
