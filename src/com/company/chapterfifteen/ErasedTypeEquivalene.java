package com.company.chapterfifteen;

import org.openjdk.jol.info.ClassLayout;

import java.util.ArrayList;

/**
 * @author czy
 * @date 2021/1/26
 */
public class ErasedTypeEquivalene {
    public static void main(String[] args) {
        Class c1 = new ArrayList<String>().getClass();
        Class c2 = new ArrayList<Integer>().getClass();
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(ClassLayout.parseInstance(c1).toPrintable());
        System.out.println(ClassLayout.parseInstance(c2).toPrintable());
        System.out.println(c1==c2);
    }
}
