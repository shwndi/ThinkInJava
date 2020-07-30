package com.company.chaptereight;

/**
 * 运行时类型识别
 * @author czy
 * @date 2020-7-25
 */
public class RTTI {
	public static void main(String[] args) {
		Useful[] x = {new Useful(), new MoreUseful(), new MoreUseful()};
		x[0].f();
		x[1].g();
//		向上转型之后不能像下转型
//		x[2].h();
	}
}

class Useful{
	public void f(){
		System.out.println("Useful f()");
	}
	public void g(){
		System.out.println("Useful f()");
	}
}
class MoreUseful extends Useful{
	public void g(){
		System.out.println("MoreUseful g()");
	}
	public void f(){
		System.out.println("MoreUseful f()");
	}
	public void h(){
		System.out.println("MoreUseful h()");
	}

}
