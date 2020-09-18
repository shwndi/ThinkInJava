package com.company.chaptereleven.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @author czy
 * @date 2020-8-19
 */
public class ListTest {
	public static void main(String[] args) {
		List<Object> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		System.out.println(list);
		list.add(2, "f");
		System.out.println(list);
		list.set(0, "z");
		System.out.println(list);
		List<Object> sub = list.subList(0, 3);
		System.out.println(list);
		System.out.println(sub);
		System.out.println("--------------------------------------");
		System.out.println(list.contains(sub));
		System.out.println(list.containsAll(sub));
		sub.set(1, "a");
		System.out.println(list.containsAll(sub));
		boolean b = list.retainAll(sub);
	}
}
