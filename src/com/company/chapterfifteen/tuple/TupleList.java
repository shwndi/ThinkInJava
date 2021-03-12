package com.company.chapterfifteen.tuple;

import com.company.chapterfifteen.FourTuple;
import com.company.chapterfive.Cat;
import com.company.chapterfive.Dog;

import java.util.ArrayList;

/**
 * @author czy
 * @date 2021/1/26
 */
public class TupleList<A, B, C, D> extends ArrayList<FourTuple<A, B, C, D>> {
    public static void main(String[] args) {
        TupleList<Cat, Dog, String, Integer> f = new TupleList<>();
        f.add(TupleTest2.g2());
        f.add(TupleTest2.g2());
        for (FourTuple<Cat, Dog, String, Integer> fi : f) {
            System.out.println(fi);
        }
    }
}
