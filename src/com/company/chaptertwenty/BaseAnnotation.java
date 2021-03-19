package com.company.chaptertwenty;

/**
 * @author czy
 * @Override:覆写
 * @Deprecated:不推荐谁用
 * @SuppressWarnings:禁止警告
 * @date 2021/3/19
 */
public class BaseAnnotation {
    @SuppressWarnings({})
    @Override
    public String toString() {
        return "BaseAnnotation{}";
    }
    @Deprecated
    public void deprecated() {
        System.out.println("禁止警告");
    }

    @SuppressWarnings({"if"})
    public void suppressWarning() {
        if (true)
            System.out.println("test");;
    }
}
