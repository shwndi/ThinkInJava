package com.company.chaptersix;

import com.company.tool.Print;

import static com.company.tool.Print.print;
import static com.company.tool.Print.printf;

/**
 * 静态方法
 *
 * @author czy
 * @date 2020-7-13
 */
public class SixPointOne {
	public static void main(String[] args) {
		/**
		 * 导入方法
		 */
		print("asdfa");
		print();
		/**
		 * 导入类
		 */
		Print.printnb("adfaioj");
		Print.printnb("1111");
		printf("sss", new Object[]{new Integer(12),"aaaa","dsa"});
	}
}
