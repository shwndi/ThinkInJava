package com.company.chapterfifteen;

import java.util.ArrayList;
import java.util.List;

/**
 * @author czy
 * @date 2021/1/27
 */
public class ListOfGenerics<T> {
    private List<T> array = new ArrayList<>();

    public void add(T item) {
        array.add(item);
    }

    public T get(int index) {
        return array.get(index);
    }
}
