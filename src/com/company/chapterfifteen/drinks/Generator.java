package com.company.chapterfifteen.drinks;

/**
 * 泛型接口
 * （例如：生成器，是一种负责创建对象的类，这是工厂方法设计模式的一种应用
 *        但是使用生成器创建对象时）
 * @author czy
 * @date 2021-1-4
 */
public interface Generator<T> {
    /**
     * next()
     * @return
     */
    T next();
}
///:~