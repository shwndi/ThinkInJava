package com.company.chapterfifteen;

/**
 * @author czy
 * @date 2021/1/31
 */
class Other {
}

class BasicOther extends BasicHolder<Other> {
}

public class Unconstrained {
    public static void main(String[] args) {
        BasicOther b1 = new BasicOther();
        BasicOther b2 = new BasicOther();
        b1.set(new Other());
        Other other = b1.get();
        b1.f();
    }
}
