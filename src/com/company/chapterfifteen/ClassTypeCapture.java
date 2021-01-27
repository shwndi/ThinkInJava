package com.company.chapterfifteen;

import java.util.HashMap;
import java.util.Map;

/**
 * @author czy
 * @date 2021/1/27
 */
class Buliding{}
class  House extends Buliding{}
public class ClassTypeCapture <T>{
Class <T> kind;
Map<String, Class<T>> map = new HashMap<String,Class<T>>();
    public <P> void addType(String typeName,Class<T> t){
    map.put(typeName,t);
}
//Map<String,Class<?>> types = new HashMap<String,Class<?>>();
//public void addType(String typename, Class<?> kind) {
//        types.put(typename, kind);
//    }

public  Object  createNew(String typeName) throws IllegalAccessException, InstantiationException {
        Class tClass = map.get(typeName);
        return tClass.newInstance();
    }
public ClassTypeCapture(Class<T> kind){
    this.kind=kind;
}
public boolean f(Object arg){
    return kind.isInstance(arg);
}

    public static void main(String[] args) {
        ClassTypeCapture<Buliding> ctt1 = new ClassTypeCapture<>(Buliding.class);
        System.out.println(ctt1.f(new Buliding()));
        System.out.println(ctt1.f(new House()));
    }
}
