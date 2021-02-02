package com.company.chapterSixteen;

/**
 * @author czy
 * @date 2021/2/1
 */
class ClassParameter<T>{
    public <T> T[] f(T[] arg){
        return arg;
    }
}
class MethodParameter{
    public static <T> T[] f(T[] arg){
        return arg;
    }
}
public class ParmetarizedArrayType {
    public static void main(String[] args) {
        Integer[] ints= {1,2,3,4,5};
        Double[] doules = {1.1,2.2,3.3,4.4,5.5};
        Integer[] ints2 = new ClassParameter<Integer>().f(ints);
        Double[] dou = new ClassParameter<Double>().f(doules);
        ints2 = MethodParameter.f(ints);
        dou=MethodParameter.f(dou);
    }
}
