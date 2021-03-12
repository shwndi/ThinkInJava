package com.company.chapterfifteen.covariant;

import com.company.chaptertwo.A;

import java.util.ArrayList;
import java.util.List;

/**
 * @author czy
 * @date 2021/1/29
 */
public class GenericWriting {
    static <T> void writeExact(List<T> list, T item) {
        list.add(item);
        System.out.println(list.get(0));
    }

    static List<Apple> apples = new ArrayList<Apple>();
    static List<Fruit> fruits = new ArrayList<Fruit>();

    static void f1() {
        writeExact(apples, new Apple());
        writeExact(fruits, new Apple());
    }

    static <T> void writeWithWildcard(List<? super T> list, T item) {
        list.add(item);
        System.out.println(list.get(0));
    }

    static void f2() {
        writeWithWildcard(apples, new Apple());
        writeWithWildcard(fruits, new Apple());
    }

    public static void main(String[] args) {
        f1();
        f2();
    }
}
