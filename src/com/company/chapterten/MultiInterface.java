package com.company.chapterten;

/**
 * 内部类一个重要那个功能是实现“多重继承”
 *
 * @author czy
 * @date 2020-8-4
 */
interface  A{}
interface  B{}
class X implements A,B{ }
class Y implements A{
	B makeB(){
		return new B() {
		};
	}
}
public class MultiInterface {
	static void taskA(A a){};
	static void taskB(B b){};
	public static void main(String[] args) {
		X x = new X();
		Y y = new Y();
		taskA(x);
		taskB(x);
		taskA(y);
		taskB(y.makeB());
	}
}
