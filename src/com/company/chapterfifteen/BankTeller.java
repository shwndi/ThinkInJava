package com.company.chapterfifteen;

import com.company.chapterfifteen.drinks.Generator;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * @author czy
 * @date 2021/1/25
 */
class Teller {
    private static long counter = 1;
    private final long id = counter ++;
    private Teller(){}
    @Override
    public String toString(){
        return "teller "+id;
    }
    public static Generator<Teller> generator =
            new Generator<Teller>(){
                @Override
                public Teller next(){
                    return new Teller();
                }
            };
}
public class BankTeller{
    public static void serve(Teller t, Customer c){
        System.out.println(t+" service "+c);
    }

    public static void main(String[] args) {
        Random rand = new Random(47);
        List<Customer> line = new LinkedList<>();
        Generators.fill(line,Customer.generator(),15);
        System.out.println(line);

        List<Teller> tellers = new ArrayList<>();
        Generators.fill(tellers,Teller.generator,4);
        System.out.println(tellers);

        for (Customer c : line) {
            serve(tellers.get(rand.nextInt(tellers.size())),c);
        }
    }
}
