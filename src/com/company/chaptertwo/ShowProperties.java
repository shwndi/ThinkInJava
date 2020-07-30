package com.company.chaptertwo;
/**
 * @see Main
 * @see sun.tools.jar.Main
 * @author czy
 * @date 2020-7-2
 */
//: object/ShowProperties.java
public class ShowProperties {
	public static void main(String[] args) {
		System.getProperties().list(System.out);
		System.out.println("-----------------------------");
		System.out.println(System.getProperty("user.name"));
		System.out.println("-----------------------------");
		System.out.println(System.getProperty("java.library.path"));
	}///:~
}
