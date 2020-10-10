package com.company.chaptereleven.collection;

import java.util.Arrays;

/**
 * @author czy
 * @date 2020-9-25
 */
public class ArrayIsNoIterable {
	static <T> void test(Iterable<T> ib) {
		for (T t : ib) {
			System.out.println(t + " ");
		}
	}

	public static void main(String[] args) {
		test(Arrays.asList(1,2,3));
		String[] strings = {"A","B","C"};
//		test(strings);
		test(Arrays.asList(strings));
	}
}
