package com;

/**
 * @author czy
 * @date 2021/1/27
 */
class GenericBase<T>{
    private T element;
    public void set(T arg){
        arg = element;
        System.out.println(element);
    }

    public T get() {
        System.out.println(element);
        return element;
    }
}
class Derived1<T> extends GenericBase<T>{}
class Derived2 extends GenericBase{}
public class ErasureAndInheritance {
    //SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Derived2 d2 = new Derived2();
        Object obj = d2.get();
        d2.set(obj);
    }

}
