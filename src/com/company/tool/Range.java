package com.company.tool;


/**
 * 数组生成器
 *
 * @author czy
 * @date 2020-7-13
 */
public class Range {
	public static int[] range(int n) {
		int[] ints = new int[n];
		for (int i = 0; i < n; i++) {
			ints[i] = i;
		}
		return ints;
	}

	public static int[] range(int start, int end) throws Exception {
		if (start >= end) {
			throw new Exception("参数有误");
		}
		int size = end - start;
		int[] ints = new int[size];
		for (int i = start; i < end; i++) {
			ints[i] = i;
		}
		return ints;
	}

	public static int[] range(int start, int end, int jump) throws Exception {
		if (start >= end) {
			throw new Exception("参数有误");
		}
		int size = (end - start) / jump;
		int[] ints = new int[size];
		for (int i = start; i < end; i += jump) {
			ints[i] = i;
		}
		return ints;
	}
}
