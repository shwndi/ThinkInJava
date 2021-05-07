package com.thread.lambda;

/**
 * @author czy
 * @date 2021/5/7
 */
public class TestLambda1 {
    public static void main(String[] args) {
        //通过实现类
        ILike like = new Like();
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
 * 定义一个实现类
 */
class Like implements ILike{

    @Override
    public void lambda() {
        System.out.println("test lambda1");
    }
}