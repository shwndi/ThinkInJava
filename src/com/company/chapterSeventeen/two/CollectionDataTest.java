package com.company.chapterSeventeen.two;

import com.company.chapterfifteen.drinks.Generator;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author czy
 * @date 2021/2/2
 */
class Government implements Generator<String> {
    String[] s = ("strange women lying in ponds " +
            "distributing swords is no basis for a system of " +
            "government").split(" ");

    private int index;

    @Override
    public String next() {
        return s[index++];
    }
}

public class CollectionDataTest {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>(new CollectionData<String>(new Government(), 10));
        System.out.println(set);
        set.addAll(CollectionData.list(new Government(), 15));
        System.out.println(set);
    }
}
