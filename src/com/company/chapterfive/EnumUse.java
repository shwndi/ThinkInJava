package com.company.chapterfive;

import javax.xml.bind.SchemaOutputResolver;

/**
 * @author czy
 * @date 2020-7-13
 */
public class EnumUse {
	public static void main(String[] args) {
		SimpleEnum first = SimpleEnum.FIRST;
		/**
		 * toString、枚举所有具名值
		 */
		SimpleEnum[] val = SimpleEnum.values();
		System.out.println(first);
		System.out.println(val);
		/**
		 * 获取具名值的顺序
		 */
		System.out.println(SimpleEnum.SECOND.ordinal());

	}
}
