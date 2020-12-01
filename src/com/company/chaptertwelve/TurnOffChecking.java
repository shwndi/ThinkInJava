package com.company.chaptertwelve;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author czy
 * @date 2020-10-14
 */
class WrapCheckedException{
	void throwRuntimeException(int type){
		try{
			switch (type){
				case 0: throw new FileNotFoundException();
				case 1: throw new IOException();
				case 2: throw new RuntimeException("Where am I ?");
				default:return;
			}
		}catch (Exception e){
			throw new RuntimeException(e);
		}
	}
}

class SomeOtherException extends Exception{}

public class TurnOffChecking {
	public static void main(String[] args) {
		WrapCheckedException wce = new WrapCheckedException();
		wce.throwRuntimeException(3);
		for (int i = 0; i < 4; i++) {
			try{
				if(i<3){
					wce.throwRuntimeException(i);
				}else{
					throw new SomeOtherException();
				}
			}catch (SomeOtherException s){
				System.out.println("SomeOtherException :"+ s);
			}catch (RuntimeException r){
				try{
					throw r.getCause();
				}catch (FileNotFoundException e){
					System.out.println("FileNotFoundException :" + e);
				}catch (IOException e){
					System.out.println("IOException :" + e);
				}catch (Throwable e){
					System.out.println("Throwable :" + e);
				}
			}
		}
	}
}
