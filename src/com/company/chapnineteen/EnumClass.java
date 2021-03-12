package com.company.chapnineteen;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * 枚举类
 *
 * @author czy
 * @date 2021/3/12
 */
enum Shrubbery{GROUND,CRAWLING,HANGING}
public class EnumClass {
    public static void main(String[] args) {
        for (Shrubbery value : Shrubbery.values()) {
            System.out.println(value +"ordinal:"+value.ordinal());
            System.out.println(value.compareTo(Shrubbery.CRAWLING));
            System.out.println(value.equals(Shrubbery.CRAWLING));
            System.out.println(value==Shrubbery.CRAWLING);
            System.out.println(value.getClass());
            System.out.println(value.name());
            System.out.println("**************************");
        }
        for (String s : "GROUND,CRAWLING,HANGING".split(",")) {
            Shrubbery value = Enum.valueOf(Shrubbery.class, s);
            System.out.println(value);
        }
    }
}
