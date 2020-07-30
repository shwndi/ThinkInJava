package com.company.chaptertwo;
import java.lang.*;
public class A {
    static Class<?> klass = B.class;
    static int i = C.i;
    static { System.out.print("A"); }
    public static void main(String[] args) {
        System.out.println("over !");
        Class<A> aClass = A.class;
        System.out.println(aClass);
    }
}
class B {
    static { System.out.print("B"); }
}
class C {
    static int i = 0;
    static { System.out.print("C"); }
}

