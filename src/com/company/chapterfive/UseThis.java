package com.company.chapterfive;

/**
 * @author czy
 * @date 2020-7-9
 */
public class UseThis {
    private String name;
    private int age;

    public UseThis() {
        this("UseThis", 123);
        System.out.println("无参构造");
    }

    public UseThis(String name) {
        this.name = name;
        System.out.println("name:" + name);
    }

    public UseThis(int age) {
        this.age = age;
        System.out.println("age:" + age);
    }

    public UseThis(String name, int age) {
        this(name);
        this.age = age;
        System.out.println("全参构造");
        System.out.println("UseThis:{" + "name:" + name + "\tage:" + age + "}");
    }

    public static void main(String[] args) {
        /***
         * 反斜杠替换，一个使用四个"\"，即为"\\\\"。
         */
        String a = "Y:_record_1594364266855.V3";
        a = a.replaceAll("_", "\\\\");
        System.out.println(a);
        System.out.println("\\");
        new UseThis("小明", 23);
        System.out.println("--------------结束--------------");
        new UseThis();
    }
}
