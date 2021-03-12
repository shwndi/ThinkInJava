package com.company.chapterthirteen;

import java.util.ArrayList;
import java.util.List;

/**
 * @author czy
 * @date 2020-10-15
 */
public class InfiniteRecursion {
    @Override
    public String toString() {
        return super.toString();
        //return this+"";
    }

    public static void main(String[] args) {
        //System.out.format();
        InfiniteRecursion ir = new InfiniteRecursion();
        System.out.println(ir);
        List<InfiniteRecursion> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new InfiniteRecursion());
        }
        System.out.println(list);
    }
}
