package com.company.chapterfourteen;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author czy
 * @date 2020-12-18
 */
public class DynamicProxyHandler implements InvocationHandler {
    private Object proxied;

    public DynamicProxyHandler(Object proxied) {
        this.proxied = proxied;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws InvocationTargetException, IllegalAccessException {
        System.out.println("***** proxy : " + proxy.getClass() + ",method: " + method + " args: " + args);
        if (args != null) {
            for (Object arg : args) {
                System.out.println("  " + arg);
            }
        }
        return method.invoke(proxied, args);
    }
}

class SimpleDynamicProxy {
    private static Integer i = 0;
    private static Integer rod = 0;
    private static Integer ros = 0;

    public static void consumer(Interface iface) {
        i++;
        rod = iface.doSomething(rod);
        ros = iface.somethingElse("bonobo", ros);
    }

    public static void main(String[] args) {
        RealObject real = new RealObject();
        consumer(real);
        Interface proxy = (Interface) Proxy.newProxyInstance(
                Interface.class.getClassLoader(),
                new Class[]{Interface.class},
                new DynamicProxyHandler(real)
        );
        consumer(proxy);
    }
}