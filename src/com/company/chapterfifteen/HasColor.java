package com.company.chapterfifteen;

import java.awt.*;

/**
 * @author czy
 * @date 2021/1/28
 */
public interface HasColor {
    Color getColor();
}
class Coloted< T extends  HasColor>{
    T item;
    Coloted (T item){
        this.item=item;
    }
    T getItem(){
        return  item;
    }
    Color color(){
        return item.getColor();
    }
}
class Dimension{
    public int x,y,z;
}
class ColoredDimension<T extends Dimension & HasColor>{
    T item;
    ColoredDimension(T item){
        this.item=item;
    }
    T getItem(){
        return item;
    }
    Color color(){
        return item.getColor();
    }
    int getX(){
        return item.x;
    }
    int getY(){
        return item.y;
    }
    int getZ(){
        return item.z;
    }
}
interface Weight{
    int weight();
}

/**
 * Bounded.class 正好符合该类参数的泛型机制
 * @param <T>
 */
class Solid<T extends Dimension & HasColor & Weight>{
    T item;
    Solid(T item){
        this.item=item;
    }
    T getItem(){
        return  item;
    }
    Color color(){
        return item.getColor();
    }
    int getX(){
        return item.x;
    }
    int getY(){
        return item.y;
    }
    int getZ(){
        return item.z;
    }
    int weight(){
        return item.weight();
    }
}
class Bounded extends Dimension implements HasColor ,Weight{
    @Override
    public Color getColor(){
        return null;
    }
    @Override
    public int weight(){
        return 0;
    }
}

