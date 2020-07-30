package com.company.chapterten;

/**
 * 定义在方法中的类
 *
 * @author czy
 * @date 2020-7-30
 */
public class Parcel5 {
	public Destination destination(String s){
		class PDestination implements Destination{
			private String label;
			private PDestination(String whereTo){
				label = whereTo;
			}

			@Override
			public String readLable() {
				return label;
			}
		}
		return new PDestination(s);
	}

	public static void main(String[] args) {
		Parcel5 p = new Parcel5();
		Destination parcel5 = p.destination("parcel5");
	}

}
