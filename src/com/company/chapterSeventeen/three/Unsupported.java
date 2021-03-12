package com.company.chapterSeventeen.three;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @author czy
 * @date 2021/2/3
 */
public class Unsupported {
    static void test(String msg, List<String> list) {
        System.out.println("--- " + msg + " ---");
        Collection<String> c = list;
        Collection<String> sublist = list.subList(1, 8);
        Collection<String> c2 = new ArrayList<>(sublist);
        try {
            c.retainAll(c2);
        } catch (Exception e) {
            System.out.println("c.retainAll() :" + e);
        }
        try {
        } catch (Exception e) {
        }
        try {
        } catch (Exception e) {
        }
        try {
        } catch (Exception e) {
        }
        try {
        } catch (Exception e) {
        }
        try {
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
//        test("saf", Arrays.asList(new String[]{"1", "2", "3", "4"}));
        String[] s = {"1", "2", "3", "4"};
        List<String> stringList = Arrays.asList(s);
        stringList.remove(3);
    }
}
