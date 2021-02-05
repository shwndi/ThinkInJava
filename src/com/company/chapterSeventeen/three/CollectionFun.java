package com.company.chapterSeventeen.three;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @author czy
 * @date 2021/2/3
 */
public class CollectionFun {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.fill(list,"adaf");
        List liat2= new ArrayList<>();
        liat2.add("qweq");
        liat2.add(1);
        boolean b = list.addAll(liat2);
        System.out.println(list);
    }
}
