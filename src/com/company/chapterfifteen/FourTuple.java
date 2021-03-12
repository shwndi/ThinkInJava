package com.company.chapterfifteen;

/**
 * @author czy
 * @date 2020-12-31
 */
public class FourTuple<A, B, C, D> {
    public final A first;
    public final B second;
    public final C third;
    public final D fourth;

    public FourTuple(A a, B b, C c, D d) {
        this.first = a;
        this.second = b;
        this.third = c;
        this.fourth = d;
    }

    @Override
    public String toString() {
        return "(" +
                "first=" + first +
                ", second=" + second +
                ", thrid=" + third +
                ", fourth=" + fourth +
                ')';
    }
}
