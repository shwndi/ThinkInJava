package com.company.chapterfour;

/**
 * @author czy
 * @date 2020-7-8
 */
public class SuShu {
	public static void main(String[] args) {
		System.out.println("1");
		for (long i = 2;;i++){
			boolean flag = false;
			for (long j =(int)i/2;j>1;j--){
				if (i%j==0){
					flag=true;
					break;
				}
			}
			if (flag==false){
				System.out.println(i);
			}
		}
	}
}
