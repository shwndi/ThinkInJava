package com.company.chapterfifteen;

import com.company.chapterfifteen.drinks.Generator;

/**
 * @author czy
 * @date 2021/1/22
 */
public class CountedObject {
    private static long counter = 0;
    private final long id = counter++;
    public long id (){
        return id;
    }
    @Override
    public String toString(){
        return "CountedObject"+id;
    }

    public static void main(String[] args) {
        Generator<CountedObject> gen =
                BasicGenerator.create(CountedObject.class);
        for (int i = 0; i < 5; i++) {
            System.out.println(gen.next());
        }
    }
}
