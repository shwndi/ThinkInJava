package com.company.chapterfifteen;

import java.awt.*;

/**
 * @author czy
 * @date 2021/1/28
 */
class HoldItem<T>{
    T item;
    HoldItem(T item){
        this.item=item;
    }
    T getItem(){
        return item;
    }
}

class Coloted2<T extends HasColor> extends HoldItem<T>{
    Coloted2(T item){
        super(item);
    }

    Color color(){
        return item.getColor();
    }
}
class ColoredDimension2<T extends Dimension& HasColor> extends Coloted2<T>{
    ColoredDimension2(T item){
        super(item);
    }
    int getX(){return item.x;}
    int getY(){return item.y;}
    int getZ(){return item.z;}
}
class Solid2<T extends Dimension& HasColor &Weight> extends ColoredDimension2<T>{
    Solid2(T item){
        super(item);
    }
    int weight(){
        return item.weight();
    }
}

public class InheritBounds {
    public static void main(String[] args) {
        Solid2<Bounded> solid2 = new Solid2<>(new Bounded());
        solid2.color();
        solid2.getY();
        solid2.weight();
    }
}
