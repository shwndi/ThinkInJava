package com.company.chapterseven;

/**
 * @author czy
 * @date 2020-7-20
 */
public class chenk extends Animal {
	String id;
	public void setId(String name ,String id){
		setName(name);
		this.id=id;
		System.out.println(name+id);
	}
}
