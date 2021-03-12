package com.company.chapterSeventeen.two;

import com.company.chapterSixteen.RandomGenerator;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * 容器长度是由构造器控制的
 *
 * @author czy
 * @date 2021/2/2
 */
public class CollectionDataGeneration {
    public static void main(String[] args) {
        System.out.println(new ArrayList<String>(
                CollectionData.list(
                        new RandomGenerator.String(9), 10)
        ));
        System.out.println(
                new HashSet<Integer>(
                        new CollectionData<Integer>(new RandomGenerator.Integer(5), 10)
                ));
    }
}
