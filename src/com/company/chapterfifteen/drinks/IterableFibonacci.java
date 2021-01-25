package com.company.chapterfifteen.drinks;

import java.util.Iterator;
import java.util.function.Consumer;

/**
 * 适配器（adapter）
 *
 * @author czy
 * @date 2021/1/21
 */
public class IterableFibonacci extends Fibonacci implements Iterable<Integer> {
    private Fibonacci fib = new Fibonacci();
    private int n;
    public IterableFibonacci(int count) { n = count; }
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() { return n > 0; }
            @Override
            public Integer next() {
                --n;
                return fib.next();
            }
            @Override
            public void remove() { // Not implemented
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        IterableFibonacci iterableFibonacci = new IterableFibonacci(18);;
        for(Integer i:iterableFibonacci){
            System.out.println(i + " ");
        }
    }

}
