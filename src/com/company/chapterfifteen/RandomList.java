package com.company.chapterfifteen;

import java.util.ArrayList;
import java.util.Random;

/**
 * 随机元素选择
 *
 * @author czy
 * @date 2021-1-4
 */
public class RandomList<T> {
    private ArrayList<T> storage = new ArrayList<T>();
    private Random rand = new Random(47);

    public void add(T item) {
        storage.add(item);
    }

    public T select() {
        return storage.get(rand.nextInt(storage.size()));
    }

    public static void main(String[] args) {
        RandomList<String> rs = new RandomList<>();
        for (String s : ("The quick brown fox jumped over the lazy brown dog").split(" ")) {
            rs.add(s);
        }
        for (int i = 0; i < 11; i++) {
            System.out.println(rs.select() + " ");
        }

    }
}
