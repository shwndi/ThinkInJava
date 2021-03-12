package com.company.chapterfourteen;

/**
 * 划定范围:向Class添加泛型范围的语法是为了提供编译器的类型检查。
 * 如果使用普通的类引用，只有在运行到这里的时候才会发现。
 *
 * @author czy
 * @date 2020-12-1
 */
public class BroundedClassReferences {
    public static void main(String[] args) {
        Class<? extends Number> integerClass = int.class;
        integerClass = double.class;
        integerClass = Number.class;
    }
}
