package com.company.chapterfifteen.covariant;

import com.company.chaptertwo.A;

import java.util.ArrayList;
import java.util.List;

/**
 * Covariant 协变的
 * @author czy
 * @date 2021/1/28
 */
class Fruit{}
class Apple extends Fruit{}
class Jonathan extends Apple{}
class Orange extends Fruit{}

public class CovariantArrays {
    public static void main(String[] args) {
        Fruit[] fruit = new Apple[10];
        fruit[0] = new Apple();
        fruit[2] = new Jonathan();

        /**
         * 编译器允许，运行时异常，不可向上转型|
         * 数组的行为是他可以持有其他对象
         * 数组类型可以保留有关它们包含的对象类型的规则。就好像数组对他们持有的对象是有意识的
         * 因此，在编译期检查和运行时检查之间，不能滥用它们
         * 数组在运行时发现异常，而泛型则是将这种错误检测移动到编译期。
         */
        try {
            fruit[0] = new Fruit();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
        try {
            fruit[0] = new Orange();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
    }
}

/**
 * 容器的类型，不是容器持有的类型。
 * 与数组不同，泛型没有内建的协变类型，
 * 协变类型实数组在语言中定义的，因此可以内建了编译期和运行时的检查
 * 但是在使用泛型时，编译器和运行时系统不知道你想用类型做什么，采用什么规则。
 *
 */
class NonCovariantGenerics{
//    List<Fruit> flist =
//            new ArrayList<Apple>();
}