package com.company.chaptereight;


/**
 * 知识点：
 * <p>
 * 继承、多态、组合构建顺序
 * 1、纵向向上寻找基类，从基类构造器开始构建（继承）
 * 2、横向成员按照顺序逐步构造（组合）
 * 3、后期绑定：动态绑定：运行时绑定未体现（多态）
 *
 * @author czy
 * @date 2020-7-22
 */
public class InitializeOrder extends ProTableLunch {
    private Bread bread = new Bread();
    private Cheese cheese = new Cheese();
    private ProTableLunch lettuce = new ProTableLunch();

    public InitializeOrder() {
        System.out.println("InitializeOrder()");
    }

    public static void main(String[] args) {
        new InitializeOrder();
    }

}

class Meal {
    Meal() {
        System.out.println("Meal()");
    }
}

class Bread {
    Bread() {
        System.out.println("Bread()");
    }
}

class Cheese {
    Cheese() {
        System.out.println("Cheese()");
    }
}

class Lettuce {
    Lettuce() {
        System.out.println("Lettuce()");
    }
}

class Lunch extends Meal {
    //构造器没有多态@Override
    Lunch() {
        System.out.println("Lunch()");
    }
}

class ProTableLunch extends Lettuce {
    ProTableLunch() {
        System.out.println("ProTableLunch()");
    }
}
