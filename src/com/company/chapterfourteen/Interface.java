package com.company.chapterfourteen;

/**
 * 静态代理
 *
 * @author czy
 * @date 2020-12-18
 */
public interface Interface {

    Integer doSomething(int a);

    Integer somethingElse(String arg, int a);
}

class RealObject implements Interface {
    @Override
    public Integer doSomething(int a) {
        System.out.println("dosomething");
        return a + 1;
    }

    @Override
    public Integer somethingElse(String arg, int a) {
        System.out.println("somethingElse" + arg);
        return a + 1;
    }
}

class SimpleProxy implements Interface {
    private Interface proxied;

    public SimpleProxy(Interface proxied) {
        this.proxied = proxied;
    }

    @Override
    public Integer doSomething(int a) {
        System.out.println("SimpleProxy doSomething");
        Integer integer = proxied.doSomething(a);
        return integer;
    }

    @Override
    public Integer somethingElse(String arg, int a) {
        System.out.println("SimpleProxy somethingElse" + arg);
        return proxied.somethingElse(arg, a);
    }
}

class SimpleProxyDemo {
    private static Integer i = 0;
    private static Integer rod = 0;
    private static Integer ros = 0;

    public static void consumer(Interface iface) {
        i++;
        rod = iface.doSomething(rod);
        ros = iface.somethingElse("bonobo", ros);
    }

    public static void main(String[] args) {
        consumer(new RealObject());
        System.out.println(i);
        System.out.println(rod);
        System.out.println(ros);
        consumer(new SimpleProxy(new RealObject()));
        System.out.println(i);
        System.out.println(rod);
        System.out.println(ros);
    }

}
