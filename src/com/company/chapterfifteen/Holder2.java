package com.company.chapterfifteen;

/**
 * @author czy
 * @date 2020-12-31
 */
public class Holder2 {
	private Object a;
	public Holder2(Object a){
		this.a = a;
	}
	public Object get() {
		return a;
	}
	public void set(Object a) {
		this.a = a;
	}

	public static void main(String[] args) {
		Holder2 holder2 = new Holder2(new AutoMobile());
		AutoMobile mobile = (AutoMobile) holder2.get();
		holder2.set("not a AutoMobel");
		String s = (String) holder2.get();
		holder2.set(1);
		Integer integer = (Integer) holder2.get();
	}
}
