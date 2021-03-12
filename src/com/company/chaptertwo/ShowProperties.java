package com.company.chaptertwo;

/**
 * @author czy
 * @date 2020-7-2
 * @see Main
 * @see sun.tools.jar.Main
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
