package com.company.chapterfifteen;

import java.awt.*;

public class BasicBounds {

    //    static class MyClass extends Dimension implements HasColor {
//
//        @Override
//        public Color getColor() {
//            return null;
//        }
//    }
    public static void main(String[] args) {
        Solid<Bounded> solid =
                new Solid<Bounded>(new Bounded());
        solid.color();
        solid.getY();
        solid.weight();

//        HasColor hasColor = new HasColor() {
//            @Override
//            public Color getColor() {
//                return null;
//            }
//        };
//        Object o = null;
//        Coloted<HasColor> coloted = new Coloted<>(hasColor);
//        MyClass myClass = new MyClass();
//
//        ColoredDimension<MyClass> coloredDimension = new ColoredDimension<>(myClass);
    }
}
