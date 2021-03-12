package com.company.chapterfifteen;


import java.util.ArrayList;
import java.util.List;

/**
 * @author czy
 * @date 2021/1/31
 */
class SelfBounded<T extends SelfBounded<T>> {
    T element;

    SelfBounded<T> set(T arg) {
        element = arg;
        return this.element;
    }

    T get() {
        return element;
    }
}

class A extends SelfBounded<A> {
}

class B extends SelfBounded<A> {
}

class C extends SelfBounded<C> {
    C setAndGet(C arg) {
        set(arg);
        return get();
    }
}

class D {
}

class F extends SelfBounded {
}

public class SelfBounding {
    public static void main(String[] args) {
        A a = new A();
        a.set(new A());
        A a1 = new A().get();
        SelfBounded<A> set = a.set(a1);
        a = a.get();
        C c = new C();
        // c = c.set(new C());
        List l = new ArrayList<String>();
    }
}
