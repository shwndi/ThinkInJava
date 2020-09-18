package com.company.chapterten;

/**
 * 测试类
 * 嵌套类用于测试，测试过后删掉
 *
 * @author czy
 * @date 2020-8-3
 */
public class TestBed {
	public void  f(){
		System.out.println("f()");
	}
	public static class Tester{
		public static void main(String[] args) {
			TestBed testBed = new TestBed();
			testBed.f();
		}
	}
}
