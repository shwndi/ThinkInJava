package com.company.chapterfifteen;

import java.util.ArrayList;
import java.util.List;

/**
 * @author czy
 * @date 2021/1/27
 */
abstract class GenericWithCreate<T> {
    final T element;

    GenericWithCreate() {
        element = create();
    }

    abstract T create();
}

class X {
}

class Creator extends GenericWithCreate<X> {
    @Override
    X create() {
        return new X();
    }

    void f() {
        System.out.println(element.getClass().getSimpleName());
    }
}

public class CreatorGeneric {
    public static void main(String[] args) {
        Creator c = new Creator();
        c.f();
        List<String> strings = new ArrayList<>();
    }
}
