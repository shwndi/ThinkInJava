package com.company.chapternine;

/**
 * 不含抽象方法的抽象类
 * 1、父类不能创建实例对象
 * 2、子类和普通继承性质相同
 *
 * @author czy
 * @date 2020-7-25
 */
public class AbstractDamo {
    public static void main(String[] args) {
        Son son = new Son();
        son.f();
        son.g();
        //Parent parent = new Parent();
    }
}

abstract class Parent {
    Parent() {
        System.out.println("Parent Parent()");
    }

    void f() {
        System.out.println("Parent f()");
    }
}

class Son extends Parent {
    Son() {
        System.out.println("Son Son()");
    }

    void f() {
        System.out.println("Son f()");
    }

    void g() {
        System.out.println("Son g()");
    }
}
