package com.company.chapterfourteen;

import java.util.Arrays;
import java.util.List;

/**
 * @author czy
 * @date 2020-10-17
 */
abstract class Shape {
    void draw() {
        System.out.println(this + ".draw()");
    }

    /**
     * toString()方法；
     *
     * @return
     */
    @Override
    abstract public String toString();
}

class Circle extends Shape {
    @Override
    public String toString() {
        return "Circle";
    }
}

class Square extends Shape {
    @Override
    public String toString() {
        return "Square";
    }
}

class Triangle extends Shape {
    @Override
    public String toString() {
        return "Triangle";
    }
}

public class Shapes {
    public static void main(String[] args) {
        List<Shape> shapeList = Arrays.asList(
                new Circle(), new Square(), new Triangle()
        );
        for (Shape shape : shapeList) {
            shape.draw();
        }
    }
}
