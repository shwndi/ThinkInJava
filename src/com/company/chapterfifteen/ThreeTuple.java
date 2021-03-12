package com.company.chapterfifteen;

/**
 * @author czy
 * @date 2020-12-31
 */
public class ThreeTuple<A, B, C> {
    public final A first;
    public final B second;
    public final C third;

    public ThreeTuple(A a, B b, C c) {
        this.first = a;
        this.second = b;
        this.third = c;
    }

    @Override
    public String toString() {
        return "(" +
                "first=" + first +
                ", second=" + second +
                ", thrid=" + third +
                ')';
    }
}
