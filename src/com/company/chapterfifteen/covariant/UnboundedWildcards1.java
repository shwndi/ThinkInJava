package com.company.chapterfifteen.covariant;

import java.util.ArrayList;
import java.util.List;

/**
 * @author czy
 * @date 2021/1/29
 */
public class UnboundedWildcards1 {
    static List list1;
    static List<?> list2;
    static List<? extends Object> list3;

    static void assignl(List list) {
        list1 = list;
        list2 = list;
        list3 = list;
    }

    static void assign2(List<?> list) {
        list1 = list;
        list2 = list;
        list3 = list;
    }

    static void assign3(List<? extends Object> list) {
        list1 = list;
        list2 = list;
        list3 = list;

    }

    public static void main(String[] args) {
        assignl(new ArrayList());
        assign2(new ArrayList());
        assign3(new ArrayList());

        assignl(new ArrayList<String>());
        assign2(new ArrayList<String>());
        assign3(new ArrayList<String>());

        List<?> wlist = new ArrayList<>();
        assignl(wlist);
        assign2(wlist);
        assign3(wlist);
    }
}
