package com.company.chapternine;

/**
 * 接口嵌套：（意义：出于对严格的语法一致性考虑）
 * 	1、接口作用域只有两种：1、public；2、包访问路径。
 * 	2、接口不能定义私有 元素默认为public
 *	3、private接口实现的类不能向上转型
 *	4、private接口不能再定义他的类之外实现
 *
 * @author czy
 * @date 2020-7-28
 */
public class NestingInterface {
//	public class BImp implements A.B {
//		@Override
//		public void f() {
//		}
//	}
//	public class CImpl implements A.C{
//		@Override
//		public void f(){}
//	}
//	public class DImpl implements A.D{
//		public void f(){}
//	}
}

//class A {
//	interface B {
//		void f();
//	}
//
//	public class BImpl implements B {
//		@Override
//		void f() {
//		}
//	}
//
//	private class BImpl2 implements B {
//		@Override
//		void f() {
//		}
//	}
//
//	public interface C {
//		void f();
//	}
//
//	public class CImpl implements C {
//		@Override
//		void f() {
//		}
//	}
//
//	private class CImpl2 implements C {
//		@Override
//		void f() {
//		}
//	}
//
//	private interface D {
//		void f();
//	}
//
//	public class DImpl implements D {
//		@Override
//		void f() {
//		}
//	}
//
////	private class DImpl2 implements D {
////
////		void f() {
////		}
////	}
//
//	public D getD() {
//		return new DImpl2();
//	}
//
//	private D dRef;
//
//	public void receiveD(D d) {
//		dRef = d;
//	}
//}
////接口不能定义私有 元素默认为public
//interface E {
//	interface G {
//		void f();
//	}
//
//	public interface F {
//		void f();
//	}
//
//	void g();
//	//private interface I{}
//}