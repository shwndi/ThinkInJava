package com.company.chapterfifteen.covariant;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author czy
 * @date 2021/1/28
 */
public class GenericsAndCovariance {
    public static void main(String[] args) {
        List<? extends Fruit> flist = new ArrayList<Apple>();
//        flist.add(new Apple());
//        flist.add(new Fruit());
//        flist.add(new Orange());
//        flist.add(new Object());
        flist.add(null);
        Fruit fruit = flist.get(0);
        Number[] i = new Integer[5];
        i[0] = 0;
        System.out.println(i[0]);
        List<? extends Number> j =new ArrayList<Integer>();
        //j.add(1);
        j.add(null);
        System.out.println(j.get(0));
    }
}
