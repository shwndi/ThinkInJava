package com;

/**
 * @author czy
 * @date 2021/1/25
 */
public class Teller {
    private static long counter = 1;
    private final long id = counter ++;
    private Teller(){}
    @Override
    public String toString(){
        return "teller"+id;
    }
}
