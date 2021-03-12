package com.company.chapterthree;

/**
 * 、
 * 基本数据类型和对象的赋值区别
 *
 * @author czy
 * @date 2020-7-7
 */
public class BaseDataAndObject {
    int a;
    int b;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public BaseDataAndObject() {
    }

    public BaseDataAndObject(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "BaseDataAndObject{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public static void main(String[] args) {
        System.out.println("-----------------基本数据类型----------------");
        int a = 1;
        int b = a;
        a = 2;
        System.out.println(b);
        System.out.println("---------------------装箱包装类-------------------");
        Integer c = 1;
        Integer d = c;
        c = 2;
        System.out.println(d);
        System.out.println("--------------------new包装类-----------------------");
        Integer e = new Integer(1);
        Integer f = e;
        e = 2;
        System.out.println(f);
        System.out.println("--------------------String--------------------------");
        String g = "abc";
        String h = g;
        g = "def";
        System.out.println(h);
        System.out.println("--------------------new String----------------------");
        String i = new String("ghi");
        String j = i;
        i = "jkl";
        System.out.println(j);
        System.out.println("-------------------创建的对象------------------");
        BaseDataAndObject object1 = new BaseDataAndObject(1, 2);
        System.out.println(object1.toString());
        BaseDataAndObject object2 = object1;
        System.out.println(object2.toString());
        object1.setA(3);
        object1.setB(4);
        System.out.println(object2.toString());

    }
}
