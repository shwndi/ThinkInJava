package com.company.chapterten;

/**
 * 1、 闭包是一个可调用的对象，它记录了一些信息，这些信息来自于创建它的作用域。
 * 2、回调是指对象能够携带一些信息，这些信息允许它在稍后的某个时刻调用初始的对象，
 * 		类似于指针的功能。
 *
 * @author czy
 * @date 2020-8-6
 */
interface Incrementable{
	void increment();
}
class Callee1 implements Incrementable{
	private int i = 0;
	@Override
	public void increment() {
		i++;
		System.out.println(i);
	}
}
class MyIncrement{
	public void increment(){
		System.out.println("Other Operation; MyIncrement increment()");
	}
	static void f(MyIncrement mi){
		mi.increment();
	}
}
class Callee2 extends MyIncrement{
	private int i = 0;
	@Override
	public void increment(){
		//继承父类的increment()方法
		super.increment();
		i++;
		System.out.println(i);
	}
	private class Closure implements Incrementable{
		@Override
		public void increment() {
			//调用Callee2的increment()方法
			Callee2.this.increment();
		}
	}
	Incrementable getCallbackReference(){
		return new Closure();
	}
}
class Caller{
	private Incrementable callbackReference;
	Caller(Incrementable cbh){callbackReference = cbh;}
	void go(){
		callbackReference.increment();
	}
}
public class Callbacks {
	public static void main(String[] args) {
		Callee1 callee1 = new Callee1();
		Callee2 callee2 = new Callee2();
		MyIncrement.f(callee2);
		Caller caller1 = new Caller(callee1);
		Caller caller2 = new Caller(callee2.getCallbackReference());
		caller1.go();
		caller1.go();
		caller2.go();
		caller2.go();
	}
}
