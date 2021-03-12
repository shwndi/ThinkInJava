package com.company.chapterSixteen;

import com.company.chapterfifteen.drinks.Generator;

import java.util.Arrays;

/**
 * @author czy
 * @date 2021/2/1
 */
public class GeneratorTest {
    public static int size = 10;

    public static void test(Class<?> surroundingClass) {
        for (Class<?> type : surroundingClass.getClasses()) {
            System.out.println(type.getSimpleName() + ": ");
            try {
                Generator<?> g = (Generator<?>) type.newInstance();
                for (int i = 0; i < size; i++) {
                    System.out.print(g.next() + " ");
                }
                System.out.println();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
//        System.out.println(Arrays.toString(CountingGenerator.class.getClasses()));
//        test(CountingGenerator.class);
        test(RandomGenerator.class);
    }
}
