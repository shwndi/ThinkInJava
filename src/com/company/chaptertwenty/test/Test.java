package com.company.chaptertwenty.test;

import javax.xml.bind.Element;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 没有元素的注解称为标注注解（marker annotation）
 * 注解元素看起来像接口的方法，区别是注解可以设置默认值
 *
 * @author czy
 * @date 2021/3/19
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Test {
}
