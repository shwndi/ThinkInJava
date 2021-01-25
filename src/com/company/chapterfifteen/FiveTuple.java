package com.company.chapterfifteen;

/**
 * @author czy
 * @date 2020-12-31
 */
public class FiveTuple<A,B,C,D,E> {
	public final A first;
	public final B second;
	public final C third;
	public final D fourth;
	public final E fifth;
	public FiveTuple(A a, B b, C c, D d,E e){
		this.first = a;
		this.second = b;
		this.third = c;
		this.fourth = d;
		this.fifth = e;
	}

	@Override
	public String toString() {
		return "(" +
				"first=" + first +
				", second=" + second +
				", thrid=" + third +
				", fourth=" + fourth +
				", fifth=" + fifth +
				')';
	}
}
