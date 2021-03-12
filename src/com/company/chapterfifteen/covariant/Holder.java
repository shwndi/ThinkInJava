package com.company.chapterfifteen.covariant;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.Objects;

/**
 * @author czy
 * @date 2021/1/29
 */
public class Holder<T> {
    private T value;

    public Holder() {
    }

    public Holder(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        return value.equals(o);
    }

    public static void main(String[] args) {
        Holder<Apple> apple = new Holder<>(new Apple());
        System.out.println(apple);
        Apple d = apple.getValue();
        System.out.println(d);
        apple.setValue(d);
        System.out.println(apple);
//        Holder<Fruit> f=apple;
        Holder<? extends Fruit> f2 = apple;
        System.out.println(f2);
        Fruit value = f2.getValue();
        System.out.println(value);
        d = (Apple) f2.getValue();
        System.out.println(d);
        try {
            Orange orange = (Orange) f2.getValue();
        } catch (Exception e) {
            e.printStackTrace();
//            f2.setValue(new Apple());
//            f2.setValue(new Fruit());
            System.out.println(f2.equals(d));
        }

    }
}
