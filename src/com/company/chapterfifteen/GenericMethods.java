package com.company.chapterfifteen;

/**
 * @author czy
 * @date 2021/1/21
 */
public class GenericMethods {
    private <T> void  f(T t){
        System.out.println(t.getClass());
        System.out.println(t.getClass().getName());
        System.out.println(t.getClass().getCanonicalName());
        System.out.println(t.getClass().getTypeName());
        System.out.println(t.getClass().getSimpleName());
        System.out.println();
    }

    public static void main(String[] args) {
        GenericMethods methods = new GenericMethods();
        methods.f(" ");
        methods.f(1);
        methods.f(1.0);
        methods.f(1.0F);
        methods.f('c');
        methods.f(methods);
    }
}
