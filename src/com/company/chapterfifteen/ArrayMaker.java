package com.company.chapterfifteen;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author czy
 * @date 2021/1/27
 */
public class ArrayMaker<T> {
    private Class<T> kind;

    public ArrayMaker(Class<T> kind) {
        this.kind = kind;
    }

    T[] create(int size) {

        return (T[]) Array.newInstance(kind, size);
    }

    public static void main(String[] args) {
        ArrayMaker<String> maker = new ArrayMaker<>(String.class);
        String[] makers = maker.create(9);
        System.out.println(Arrays.toString(makers));
    }
}
