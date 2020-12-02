package com.company.chapterfourteen;

/**
 * @author czy
 * @date 2020-12-2
 */
class Building{}

class House extends Building{}

public class ClassCasts {
	public static void main(String[] args) {
		Building b = new House();
		Class<House> houseType = House.class;
		/**
		 * cast()方法接受参数对象，并将其转型成为Class引用的类型。
		 * 一种罕见的情况，无法直接转换成子类，可以先创建父类然后通过cast（父类型）
		 * 转换，然后在强制转型。
		 */
		House h = houseType.cast(b);
		h = (House)b;
	}
}
