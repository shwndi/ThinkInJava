package com.company.chapterfifteen.problem;

import cn.hutool.captcha.generator.RandomGenerator;
import com.company.chapterfifteen.drinks.Generator;

/**
 * @author czy
 * @date 2021/1/29
 */
class FArray {
    public static <T> T[] fill(T[] a, Generator<T> gen){
        for (int i = 0; i < a.length; i++) {
            a[i] = gen.next();
        }
        return a;
    }
}
public class PtimitiveGenericTest{
    public static void main(String[] args) {
    //String[] strings = FArray.fill(new String[7], new RandomGenerator.String(10));
    }
}
