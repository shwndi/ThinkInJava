package com.company.chapterfifteen;

/**
 * @author czy
 * @date 2020-12-31
 */
public class Holder3<T> {
    private T a;

    public Holder3(T a) {
        this.a = a;
    }

    public void set(T a) {
        this.a = a;
    }

    public T get() {
        return a;
    }

    public static void main(String[] args) {
        Holder3<AutoMobile> holder3 = new Holder3<>(new AutoMobile());
        AutoMobile autoMobile = holder3.get();
//		holder3.set("Not a autoMobile");//Error
//		holder3.set(1);//Error
    }

}
