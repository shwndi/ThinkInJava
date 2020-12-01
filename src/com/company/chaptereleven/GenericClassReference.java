package com.company.chaptereleven;

/**
 * @author czy
 * @date 2020-10-28
 */
public class GenericClassReference {
	public static void main(String[] args){
		Class intClass = int.class;
		Class<Integer> genericIntClass = int.class;
		genericIntClass = Integer.class;
		intClass = double.class;
	}
}
