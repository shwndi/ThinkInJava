package com.company.chapterfourteen;

/**
 * @author czy
 * @date 2020-12-1
 */
public class GenericClassRefreences {
	public static void main(String[] args) {
		Class intClass = int.class;
		Class<Integer> integerClass = intClass;
		integerClass = Integer.class;
		intClass = double.class;
	}
}
