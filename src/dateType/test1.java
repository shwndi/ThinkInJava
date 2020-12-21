package dateType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 引用和值的区别
 * @author czy
 * @date 2020-12-17
 */
public class test1 {
	public static void main(String[] args) {
		String s1 = "hellow";
		String s2 = "world";
		change(s1,s2);
		StringBuffer b1 = new StringBuffer("hellow");
		StringBuffer b2 = new StringBuffer("world");
		change(b1, b2);
		System.out.println(s1+"------------"+s2);
		System.out.println(b1+"------------"+b2);
//		List b = Arrays.asList(1,2,3,4,5);
//		List list = b.subList(0, b.indexOf(3));
//		System.out.println(list);
//		System.out.println(b.indexOf(3));
	}

	private static void change(StringBuffer b1, StringBuffer b2) {
		b1=b2;
		b2.append(b1);
	}

	private static void change(String s1, String s2) {
		s1= s2;
		s2=s1+s2;
	}
}
