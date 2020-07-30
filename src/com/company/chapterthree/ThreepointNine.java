package com.company.chapterthree;

/**
 * 直接常量（进制）
 *
 * @author czy
 * @date 2020-7-7
 */
public class ThreepointNine {
	public static void main(String[] args) {
		long l =  1231414154135L;
		float f = 2341.234141F;
		int i = 1341;
		String strl = Long.toBinaryString(l);
		System.out.println(strl);
		String stri = Integer.toBinaryString(i);
		System.out.println(stri);
		double maxD = Double.MAX_VALUE;
		double minD = Double.MIN_VALUE;
		float maxF = Float.MAX_VALUE;
		float minF = Float.MIN_VALUE;
		System.out.println( maxD+"\t"+minD+"\t"+maxF+"\t"+minF);
	}
}
