package com.company.chapterfifteen.covariant;

import java.util.Arrays;
import java.util.List;

/**
 * @author czy
 * @date 2021/1/28
 */
public class CompilerIntelligence {
    public static void main(String[] args) {
        List<? extends Fruit> flist =
                Arrays.asList(new Apple());
        Apple a = (Apple) flist.get(0);
        flist.contains(new Apple());
        flist.indexOf(new Apple());
    }
}
