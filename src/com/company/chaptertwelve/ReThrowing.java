package com.company.chaptertwelve;

/**
 * @author czy
 * @date 2020-10-10
 */
public class ReThrowing {
	public static void f() throws Exception{
		System.out.println("originating the exception in f()");
		throw new Exception("thrown from f()");
	}
	public static void g() throws Exception{
		try{
			f();
		}catch(Exception e){
			System.out.println("Inside g(),e.printStackTrance()");
			e.printStackTrace(System.out);
			throw e;
		}
	}
	public static void h() throws Exception{
		try{
			f();
		}catch (Exception e){
			System.out.println("Inside h(),e.printStackTrance()");
			e.printStackTrace(System.out);
			throw (Exception)e.fillInStackTrace();
		}
	}

	public static void main(String[] args) {
		try{
			g();
		}catch (Exception e){
			System.out.println("main :printStackTrance()");
			e.printStackTrace(System.out);
		}
		try{
			h();
		}catch (Exception e){
			System.out.println("main :printStackTrance()");
			e.printStackTrace(System.out);
		}
	}
}
