package com.company.chaptereight;

import com.company.chapterfive.Dog;

/**
 * 知识点：
 * 一、 方法覆盖时导出类的初始化：（顺序）
 * 1.变量重置为默认值。
 * 2.基类成员初始化。
 * 3.基类构造器对成员操作，如果才在调用方法并且该方法发生覆盖则调用导出类的方法。
 * 4.导出类成员初始化。
 * 5.导出类构造器对成员操作。
 * 6.实例创建完成。
 * 二、基类和导出类方法的重写：
 * 1.基类的方法修饰为public protected 和特殊的包访问路径时发生重写（同一个包）。
 * 2.重写后，执行过程是引用调用导出类的的方法。
 * 3.当方法具有final属性时,各用各的方法。
 * 三、1.导出类调用覆盖的方法
 * 2.基类调用自身的方法
 *
 * @author czy
 * @date 2020-7-24
 */
public class PloyConstructure {
    public static void main(String[] args) {
        Glyph glyph = new Glyph();
        System.out.println(glyph);
        Glyph g = new RoundGlyph(8);
        g.sdraw();
        RoundGlyph r = new RoundGlyph(9);
        r.draw();
    }
}

class Glyph {
    private int a = 1;
    public int b = 2;

    void draw() {
        System.out.println("Glyph draw()");
    }

    public void sdraw() {
        draw();
    }

    public Glyph() {
        System.out.println("Glyph before draw()");
        draw();
        System.out.println("Glyph after draw()");
    }
}

class RoundGlyph extends Glyph {
    private int radius = 3;
    public int c = 4;
    public Dog d;
    public Integer e;
    public boolean f;
    public double g;
    public char h;

    RoundGlyph(int r) {
        radius = r;
        System.out.println("RoundGlyph.RoundGlyph().radius = " + radius);
    }

    void draw() {
        System.out.println("RoundGlyph draw() radius = " + radius);
        System.out.println("RoundGlyph draw() dog = " + d);
    }

}
