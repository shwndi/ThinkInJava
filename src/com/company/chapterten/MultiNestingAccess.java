package com.company.chapterten;

/**
 * @author czy
 * @date 2020-8-3
 */
class MMA{
	private void f(){}
	class A{
		private void g(){}
		class B{
			void h(){
				f();
				g();
			}
		}
	}
}
public class MultiNestingAccess {
	public static void main(String[] args) {
		MMA mma = new MMA();
		MMA.A a = mma.new A();
		MMA.A.B b = a.new B();
		b.h();
	}
}
