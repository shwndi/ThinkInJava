package com.company.chapterfourteen;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author czy
 * @date 2020-12-29
 */
class MethodSelector implements InvocationHandler {
	private Object proxied;

	public MethodSelector(Object proxied) {
		this.proxied = proxied;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if (method.getName().equals("interesting")) {
			System.out.println("Proxy detected the interesting method");
		}
		return method.invoke(proxied, args);
	}
}

interface SomeMethods {
	/**
	 * boring1
	 */
	void boring1();

	/**
	 * boring2
	 */
	void boring2();

	void interesting(String arg);

	void boring3();
}

class Implementation implements SomeMethods {

	@Override
	public void boring1() {
		System.out.println("boring1");
	}

	@Override
	public void boring2() {
		System.out.println("boring2");
	}

	@Override
	public void interesting(String arg) {
		System.out.println("interesting" + arg);
	}

	@Override
	public void boring3() {
		System.out.println("boring3");
	}
}

public class SelectingMethods {
	public static void main(String[] args) {
		ClassLoader classLoader = SomeMethods.class.getClassLoader();
		System.out.println(classLoader);
		MethodSelector selector = new MethodSelector(new Implementation());
		System.out.println(selector);
		SomeMethods someMethods = (SomeMethods) Proxy.newProxyInstance(classLoader,
				new Class[]{SomeMethods.class},
				selector);
		someMethods.boring1();
		someMethods.boring2();
		someMethods.interesting("bonobo");
		someMethods.boring3();
	}
}
