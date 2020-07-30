package com.company.chaptersix.test;

import com.company.chaptersix.Animal;

/**
 * @author czy
 * @date 2020-7-14
 */
public class Dog extends Animal {
	private Integer id;
	String name;
	public String mouth;
	String noise;

	/**
	 * 具有包访问权限，但是并不是public
	 */
	public void g(){
		f();
	}
}
