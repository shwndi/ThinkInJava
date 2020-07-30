package com.company.chaptereleven.pavkage;

import com.company.chaptereleven.Animal;

/**
 * @author czy
 * @date 2020-7-20
 */
public class chenk extends Animal {
	String id;
	public void setId(String name ,String id){
		/**
		 * 继承权限99999999999999999
		 */
		setName(name);
		this.id=id;
		System.out.println(name+id);
	}
}
