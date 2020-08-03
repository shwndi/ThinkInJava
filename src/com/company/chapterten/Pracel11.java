package com.company.chapterten;

/**
 * 嵌套类
 *
 * @author czy
 * @date 2020-8-3
 */
public class Pracel11 {
	private static class PracelContents implements Contents {
		private int i = 11;

		@Override
		public int value() {
			return i;
		}
	}

	protected static class PracelDestination implements Destination {
		private String label;

		private PracelDestination(String toWhere) {
			label = toWhere;
		}

		@Override
		public String readLable() {
			return label;
		}

		public static void f() {
		}

		static int x = 10;
	}

	public static Destination destination(String s) {
		return new PracelDestination(s);
	}
	public static Contents contents(){
		return  new PracelContents();
	}

	public static void main(String[] args) {
		Contents contents = contents();
		Destination test = destination("test");
	}
}
