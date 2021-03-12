package com.company.chapterfourteen;

/**
 * @author czy
 * @date 2020-10-22
 */
class Candy {
    static {
        System.out.println("Loading Candy");
    }
}

class Gum {
    static {
        System.out.println("Loading Gum");
    }
}

class Cookie {
    static {
        System.out.println("Loading Cookie");
    }
}

public class SweetShop {
    public static void main(String[] args) {
        System.out.println("inside main");
        new Candy();
        System.out.println("After creating Candy");
        try {
            Class.forName("com.company.chapterfourteen.Gum");
        } catch (ClassNotFoundException e) {
            System.out.println("Couldn`t find Gum");
        }
        System.out.println("After Class.forName(\"Gum\")");
        new Cookie();
        System.out.println("After creating Cooking");
    }
}
