package com.company.chapterten;

/**
 * 非接口只能用内部类实现多重继承
 *
 * @author czy
 * @date 2020-8-6
 */
class D {
}

abstract class E {
}

class Z extends D {
    E makeE() {
        return new E() {
        };
    }
}

public class MultiImplimentation {
    static void taskedD(D d) {
    }

    static void taskedE(E e) {
    }

    public static void main(String[] args) {
        Z z = new Z();
        taskedD(z);
        taskedE(z.makeE());
    }
}
