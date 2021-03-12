package com.company.chapterSeventeen.ten;

/**
 * @author czy
 * @date 2021/2/6
 */
public abstract class Test<C> {
    String name;

    public Test(String name) {
        this.name = name;
    }

    abstract int test(C container, TestParam tp);

}
