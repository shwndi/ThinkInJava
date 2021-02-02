package com.company.chapterSeventeen.two;

import com.company.chapterfifteen.drinks.Generator;

import java.util.ArrayList;

/**
 * @author czy
 * @date 2021/2/2
 */
public class CollectionData <T> extends ArrayList<T> {
    public CollectionData(Generator<T> gen, int quantity){
        for (int i = 0; i < quantity; i++) {
            add(gen.next());
        }
    }
    public static <T> CollectionData<T> list(Generator<T> gen, int quantity){
        return new CollectionData<T>(gen, quantity);
    }
}
