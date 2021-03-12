package com.company.chaptereleven.collection;

import java.util.*;

/**
 * @author czy
 * @date 2020-9-25
 */
class ReversibleArrayList<T> extends ArrayList<T> {
    public ReversibleArrayList(Collection<T> asList) {
        super(asList);
    }

    public Iterable<T> reversed() {
        return new Iterable<T>() {
            @Override
            public Iterator<T> iterator() {
                return new Iterator<T>() {
                    int current = size() - 1;

                    @Override
                    public boolean hasNext() {
                        return current < 1;
                    }

                    @Override
                    public T next() {
                        return get(current--);
                    }
                };
            }
        };
    }
}

public class AdapterMethodIdiom {
    public static void main(String[] args) {
        ReversibleArrayList<String> ral = new ReversibleArrayList<String>(
                Arrays.asList("TO be or non to be".split(" ")));
        for (String s : ral) {
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println("----------------------");

        for (String s : ral.reversed()) {
            System.out.print(s + " ");
        }
    }
}
