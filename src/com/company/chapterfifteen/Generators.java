package com.company.chapterfifteen;

import com.company.chapterfifteen.drinks.Coffee;
import com.company.chapterfifteen.drinks.CoffeeGenerator;
import com.company.chapterfifteen.drinks.Fibonacci;
import com.company.chapterfifteen.drinks.Generator;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author czy
 * @date 2021/1/21
 */
public class Generators {
    public static <T>Collection<T> fill(Collection<T>coll, Generator<T> gen, int n){
        for (int i = 0; i < n; i++) {
            coll.add(gen.next());
        }
        return coll;
    }

    public static void main(String[] args) {
        Collection<Coffee> coffees = fill(new ArrayList<Coffee>(),new CoffeeGenerator(),4);
        for (Coffee coffee : coffees) {
            System.out.println(coffee);
        }
        Collection<Integer> num = fill(new ArrayList<Integer>(),new Fibonacci(),12);
        for (Integer integer : num) {
            System.out.println(integer);
        }
    }
}
