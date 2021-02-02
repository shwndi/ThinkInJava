package com.company.chapterfifteen.covariant;

import com.company.chaptertwo.A;

import java.util.List;

/**
 * @author czy
 * @date 2021/1/29
 */
public class SuperTypeWIldcards {
    static void writeTo(List<? super Apple> apples){
        apples.add(new Apple());
//        apples.add(new Fruit());
        apples.add(new Jonathan());
    }
}
