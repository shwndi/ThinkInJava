package com.company.chaptereleven.collection;

import java.util.*;

/**
 * @author czy
 * @date 2020-9-24
 */
public class SetOfInteger {
    public static void main(String[] args) {
        Random random = new Random(31);
        Set<Integer> intset = new HashSet<>();
        for (int i = 0; i < 10000; i++) {
            intset.add(random.nextInt(30));
        }
        System.out.println(intset);
    }
}
