package com.company.chapterfifteen;

/**
 * @author czy
 * @date 2021/1/31
 */
class Subtype extends BasicHolder<Subtype> {
}

public class CRGWithBasicHolder {
    public static void main(String[] args) {
        Subtype st1 = new Subtype();
        Subtype st2 = new Subtype();
        st1.set(st2);
        Subtype subtype = st1.get();
        st1.f();
    }
}
