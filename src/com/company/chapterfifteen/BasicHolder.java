package com.company.chapterfifteen;

/**
 * @author czy
 * @date 2021/1/31
 */
public class BasicHolder<T> {
    T element;

    void set(T arg) {
        element = arg;
    }

    T get() {
        return element;
    }

    void f() {
        System.out.println(element.getClass().getSimpleName());
    }
}
