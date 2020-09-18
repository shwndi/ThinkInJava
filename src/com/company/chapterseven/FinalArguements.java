package com.company.chapterseven;

/**
 * final参数
 *
 * @author czy
 * @date 2020-7-21
 */
public class FinalArguements {
	public void with(final Gizmo g) {

	}
	public void withOut(final Gizmo g){
		//g=new Gizmo();
		g.spin("hehahe");
	}
	public int g(int i){
		return i+1;
	}
	public static void main(String[] args) {
		FinalArguements fa = new FinalArguements();
		fa.with(null);
		fa.withOut(null);

	}

}

class Gizmo {
	int a;
	public void spin(String s) {
		System.out.println(a+s);
	}
}