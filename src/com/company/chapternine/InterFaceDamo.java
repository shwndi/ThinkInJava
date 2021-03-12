package com.company.chapternine;

import com.company.chapterfive.Dog;

/**
 * 接口
 * 1、不能有任何具体方法；
 * 2、可以有成员，成员要有初始值；
 *
 * @author czy
 * @date 2020-7-25
 */
public interface InterFaceDamo {
    int a = 0;
    Dog d = new Dog();

    void f();
//	void  g(){
//		System.out.println("InterFaceDamo g()");
//	}
}
