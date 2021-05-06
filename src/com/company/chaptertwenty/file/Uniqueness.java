package com.company.chaptertwenty.file;

/**
 * @author czy
 * @date 2021/3/22
 */
public @interface Uniqueness {
    Constraints constraints() default @Constraints(unique = true);
}
