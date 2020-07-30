package com.company.tool;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.PrintStream;

/**
 * @author czy
 * @date 2020-7-13
 */
public class Print {
	public static void print(Object obj){
		System.out.println(obj);
	}
	public static void print(){
		System.out.println();
	}
	public static void printnb(Object obj){
		System.out.print(obj);
	}
	public static PrintStream printf(String format, Object... args){
		return System.out.printf(format,args);
	}
}
