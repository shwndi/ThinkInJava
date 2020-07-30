package com.company.chapterten;

import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;

/**
 * 内部类实例1
 *
 * @author czy
 * @date 2020-7-28
 */
public class Parcel1 {
	class Contents{
		private int i = 11;
		public int value(){
			return i;
		}
	}
	class Destination{
		private String label;
		Destination(String whereTo){
			label = whereTo;
		}
		String readLabel(){return  label;}
	}
	public void ship(String dest){
		Contents contents =new Contents();
		Destination destination = new Destination(dest);
		System.out.println(destination.readLabel());
	}

	public static void main(String[] args) {
		Parcel1 p = new Parcel1();
		p.ship("Tas");
	}
}
