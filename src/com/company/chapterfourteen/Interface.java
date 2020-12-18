package com.company.chapterfourteen;

/**
 * @author czy
 * @date 2020-12-18
 */
public interface Interface {
	void doSomething();

	void somethingElse(String arg);
}

class RealObject implements Interface {
	@Override
	public void doSomething() {
		System.out.println("dosomething");
	}

	@Override
	public void somethingElse(String arg) {
		System.out.println("somethingElse" + arg);
	}
}
class SimpleProxy implements Interface{
	private  Interface proxied;
	public SimpleProxy (Interface proxied){
		this.proxied = proxied;
	}
	@Override
	public void doSomething(){
		System.out.println("SimpleProxy doSomething");
		proxied.doSomething();
	}
	@Override
	public void somethingElse(String arg){
		System.out.println("SimpleProxy somethingElse"+arg);
		proxied.somethingElse(arg);
	}
}
class SimpleProxyDemo{
	public static void consumer(Interface iface){
		iface.doSomething();
		iface.somethingElse("bonobo");
	}

	public static void main(String[] args) {
		consumer(new RealObject());
		consumer(new SimpleProxy(new RealObject()));
	}

}
