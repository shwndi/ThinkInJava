package com.company.chapterfourteen;

import java.util.ArrayList;
import java.util.List;

/**
 * @author czy
 * @date 2020-12-1
 */
class CountedInteger {
	private static long counter;
	private final long id = counter++;

	@Override
	public String toString() {
		return Long.toString(id);
	}
}

public class FiledList<T> {
	private Class<T> type;

	public FiledList(Class<T> type) {
		this.type = type;
	}
	public List<T> creat(int nElements){
		List<T> result = new ArrayList<>();
		try {
			for (int i = 0; i < nElements; i++) {
				result.add(type.newInstance());
			}
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return result;
	}

	public static void main(String[] args) {
		FiledList<CountedInteger> f1 = new FiledList<>(CountedInteger.class);
		System.out.println(f1.creat(15));
	}
}
