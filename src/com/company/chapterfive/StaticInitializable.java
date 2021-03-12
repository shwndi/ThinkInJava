package com.company.chapterfive;

/**
 * @author czy
 * @date 2020-7-11
 */
public class StaticInitializable {
    StaticInitializable() {
        System.out.println("默认构造器");
    }

    public static void main(String[] args) {
        new StaticInitializable();
        new StaticInitializable();
        System.out.println(Bowl.mark);
        Bowl.mark = 100;
        System.out.println(Bowl.mark);
    }

    static Bowl bowl = new Bowl(1);
}
