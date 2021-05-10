package com.thread.lambda;

/**
 * @author czy
 * @date 2021/5/10
 */
public class TestLambda {
    public static void main(String[] args){
//        Test t = (String a)->{
//            System.out.println(a+"在测试λ表达式的简化写法。");
//        };
        Test t = (a,b)->{
            System.out.println(a+"在测试λ表达式的简化写法。");
            System.out.println(b+"在测试λ表达式的简化写法。");
        };
        t.f("张三",11);
    }
}
//函数式接口
interface Test{
    void f(String a,int b);
}