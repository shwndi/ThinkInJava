package com.company.chapterten;

/**
 * 多字段初始化时,匿名内部类由于没有名称，所以不能使用构造器
 * 但可以通过初始化达到构造器的效果。
 * 通过new 对象传入到基类之中，不会被匿名了内部类直接使用。
 *
 * @author czy
 * @date 2020-7-31
 */
public class AnonymousConstructor {
    public static Base getBase(int i) {
        return new Base(i) {
            {
                System.out.println("Inside instance initialize");
            }

            @Override
            public void f() {
                System.out.println("In anonymous f()");
            }
        };
    }

    public static void main(String[] args) {
        Base base = getBase(47);
        base.f();
    }

}

abstract class Base {
    public Base(int i) {
        System.out.println("Base.Constructor.i=" + i);
    }

    public abstract void f();
}
