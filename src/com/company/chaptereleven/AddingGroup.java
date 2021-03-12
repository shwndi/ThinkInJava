package com.company.chaptereleven;

import java.sql.Connection;
import java.util.*;

/**
 * @author czy
 * @date 2020-8-18
 */
public class AddingGroup {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6));
        Integer[] moreInt = {6, 4, 2, 4, 5};
        collection.addAll(Arrays.asList(moreInt));
        Collections.addAll(collection, 121, 32, 23, 23, 1);
        Collections.addAll(collection, moreInt);
        List<Integer> list = Arrays.asList(1, 2, 3, 55);
        list.set(1, 99);
    }
}
