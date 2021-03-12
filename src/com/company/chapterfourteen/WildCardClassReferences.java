package com.company.chapterfourteen;

/**
 * 通配符“?”
 *
 * @author czy
 * @date 2020-12-1
 */
public class WildCardClassReferences {
    public static void main(String[] args) {
        Class<?> integerClass = int.class;
        integerClass = Double.TYPE;
    }
}
