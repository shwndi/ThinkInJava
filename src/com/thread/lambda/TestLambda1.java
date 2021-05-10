package com.thread.lambda;

/**
 * @author czy
 * @date 2021/5/7
 */
public class TestLambda1 {

    /**
     * 2、定义一个实现类
     */
   static class Like2 implements ILike{

        @Override
        public void lambda() {
            System.out.println("test lambda2");
        }
    }
    public static void main(String[] args) {
        //通过实现类
        ILike like = new Like1();
        like.lambda();

        like = new Like2();
        like.lambda();
        /**
         * 局部内部类
         * 注意：要先有内部类，才能使用。
         */
        class Like3 implements ILike{
            @Override
            public void lambda(){
                System.out.println("test lambda3");
            }
        }
        like = new Like3();
        like.lambda();

        /**
         * 4、匿名内部类
         */
        like = new ILike() {
            @Override
            public void lambda() {
                System.out.println("test lambda4");
            }
        };
        like.lambda();

        /**
         * lambda 表达式
         */
        like = ()->{
            System.out.println("test lambda5");
        };
        like.lambda();



    }
}

/**
 * 定义一个函数式接口
 */
interface ILike{
    void lambda();
}

/**
 * 1、定义一个实现类
 */
class Like1 implements ILike{

    @Override
    public void lambda() {
        System.out.println("test lambda1");
    }
}