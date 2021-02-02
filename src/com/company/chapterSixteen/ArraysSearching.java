package com.company.chapterSixteen;

import com.company.chapterfifteen.drinks.Generator;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author czy
 * @date 2021/2/2
 */
public class ArraysSearching {
    public static void main(String[] args) {
        Generator<Integer> integer = new RandomGenerator.Integer(1000);
        //ConvertTo.primitive()
        //Arrays.binarySearch(String);
        int[] a= new int[10];
        ArrayList<int[]> o = new ArrayList<>();
        o.add(a);
        int[] ints = o.get(0);
        int[] b = new int[]{1,2,3};
        System.out.println(Arrays.toString(b));
    }
}
