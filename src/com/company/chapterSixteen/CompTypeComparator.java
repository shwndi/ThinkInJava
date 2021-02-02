package com.company.chapterSixteen;

import java.util.Comparator;

/**
 * @author czy
 * @date 2021/2/2
 */
public class CompTypeComparator implements Comparator<CompType> {
    @Override
    public int compare(CompType o1, CompType o2) {
        return (o1.j<o2.j?-1:(o1.j==o2.j?0:1));
    }
}
