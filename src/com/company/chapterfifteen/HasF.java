package com.company.chapterfifteen;

import com.company.chapterfive.Cat;

/**
 * @author czy
 * @date 2021/1/27
 */
public class HasF {
    public void f(){
        System.out.println("Hasf.f()");
    }
}
class Manipulator<T>{
    private T obj;
    public Manipulator(T t){
      this.obj=t;
    }
    public void manipulate(){
       // obj.f();
    }

}
class Manipulator2 <T extends HasF>{
    private T obj;
    public Manipulator2(T t){
        this.obj= t;
    }
    public void manipulate(){
        obj.f();
    }
}

class Manipulation{
    public static void main(String[] args) {
        HasF hf = new HasF();
        Manipulator<HasF> manipulator = new Manipulator<>(hf);
        manipulator.manipulate();
    }

}
class Foo<T>{
    T var;

    /**
     * new 丢失类型信息
     * @return
     */
    @Override
    public String toString() {
        return "Foo{" +
                "var=" + var +
                '}';
    }
}

class Run{
    public static void main(String[] args) {
        Foo<Cat> foo = new Foo<Cat>();
        System.out.println(foo);
    }
}
