package com.company.chapterfifteen.tuple;

import com.company.chapterfifteen.FourTuple;
import com.company.chapterfifteen.ThreeTuple;
import com.company.chapterfifteen.TwoTuple;
import com.company.chapterfive.Cat;
import com.company.chapterfive.Dog;

/**
 * @author czy
 * @date 2021/1/22
 */
public class TupleTest2 {

    static TwoTuple<String, Integer> f(){
        return Tuple.tuple("hi",47);
    }
    static TwoTuple f2(){
        return Tuple.tuple("hi",47);
    }
    static ThreeTuple<Cat,String, Integer> g(){
        return Tuple.tuple(new Cat(),"hi" ,47);
    }
    static FourTuple<Cat, Dog,String, Integer> g2(){
        return Tuple.tuple(new Cat(),new Dog(),"hi" ,47);
    }

    public static void main(String[] args) {
        TwoTuple<String,Integer> ttsi=f();
        System.out.println(ttsi);
        System.out.println(f());
        TwoTuple x = f2();

        System.out.println(x);
        System.out.println(g());
    }

}
