package com.company.chapterthree;

import com.company.chaptertwo.A;

/**
 * 别名机制
 * @author czy
 * @date 2020-7-7
 */
public class Alias {
	float f;

	public static void main(String[] args) {
		Alias A = new Alias();
		Alias B = new Alias();
		A.f=1.2F;
		B.f=2.4F;
		System.out.println(A.f+"\t"+B.f);
		B.f=A.f;
		System.out.println(A.f+"\t"+B.f);
		B.f=2.4F;
		B=A;
		System.out.println(A.f+"\t"+B.f);
		A.f=3.6F;
		System.out.println(A.f+"\t"+B.f);

	}
}
