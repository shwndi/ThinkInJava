package com.company.chapterten;

/**
 * 工厂方法
 *
 * @author czy
 * @date 2020-8-3
 */
interface Service {
	void method1();

	void method2();
}

interface ServiceFactory {
	Service getService();
}

class Implementation1 implements Service {
	private Implementation1() {
	}

	@Override
	public void method1() {
		System.out.println("Implementation1 method1");
	}

	@Override
	public void method2() {
		System.out.println("Implementation1 method2");
	}

	public static ServiceFactory serviceFactory = new ServiceFactory() {
		@Override
		public Service getService() {
			return new Implementation1();
		}
	};
}

class Implementation2 implements Service {
	private Implementation2() {
	}

	@Override
	public void method1() {
		System.out.println("Implementation2 method1");
	}

	@Override
	public void method2() {
		System.out.println("Implementation2 method2");
	}

	public static ServiceFactory serviceFactory = new ServiceFactory() {
		@Override
		public Service getService() {
			return new Implementation2();
		}
	};
}

public class Factries {
	public static void serviceConsumer(ServiceFactory factory) {
		Service service = factory.getService();
		service.method1();
		service.method1();
	}

	public static void main(String[] args) {
		serviceConsumer(Implementation1.serviceFactory);
		serviceConsumer(Implementation2.serviceFactory);
	}
}
