package com.company.chapterfifteen;

/**
 * @author czy
 * @date 2021/1/27
 */
interface FactoryI<T>{
    T create();
}
class Foo2<T>{
    private T x;
    public <F extends FactoryI<T>> Foo2(F factory){
        x = factory.create();
    }
}
class IntegerFactory implements FactoryI<Integer>{
    @Override
    public Integer create(){
        return new Integer(0);
    }

}
class Widget0 {
    public static class Factory implements FactoryI<Widget0>{
        @Override
        public Widget0 create(){
            return new Widget0();
        }
    }
}
public class FactoryConstraint {
    public static void main(String[] args) {
        new Foo2<Integer>(new IntegerFactory());
        new Foo2<Widget0>(new Widget0.Factory());
    }
}
