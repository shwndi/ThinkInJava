package com.company.chapterfourteen;

import java.util.Random;

/**
 * @author czy
 * @date 2020-10-27
 */
class Initable {
    static final int staticFinal = 47;
    static final int staticFinal2 =
            ClassInitialization.rand.nextInt(1000);

    static {
        System.out.println("Initializing Initable");
    }
}

class Initable2 {
    static int staticNonFinal = 147;

    static {
        System.out.println("Initializing Initable2");
    }
}

class Initable3 {
    static int staticNonFinal = 74;

    static {
        System.out.println("Initializing Initable3");
    }
}

public class ClassInitialization {
    public static Random rand = new Random(47);

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class initable = Initable.class;
        System.out.println(initable);
        System.out.println("After creating Initable ref");
        System.out.println(Initable.staticFinal);
        System.out.println(Initable.staticFinal2);
        System.out.println(Initable2.staticNonFinal);
        Class initable3 = Class.forName("com.company.chapterfourteen.Initable3");
        System.out.println(initable3);
        System.out.println("After creating Initable3 ref");
        System.out.println(Initable3.staticNonFinal);
        System.out.println("---------------------------");
        Initable3 initable31 = new Initable3();
    }
}
