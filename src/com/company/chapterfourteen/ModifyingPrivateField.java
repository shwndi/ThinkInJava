package com.company.chapterfourteen;

import java.lang.reflect.Field;

/**
 * private 并不保险，final 不可变更，在遭到修改时是安全的（除了抛出异常）。
 *
 * @author czy
 * @date 2020-12-31
 */
class WithPrivateFinalField {
    private int i = 1;
    private final String s = "I'm totally safe";
    private String s2 = "Am I safe ?";

    @Override
    public String toString() {
        return "i=" + i + ",  " + s + ", " + s2;
    }
}

public class ModifyingPrivateField {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        WithPrivateFinalField pf = new WithPrivateFinalField();
        System.out.println(pf);
        Field f = pf.getClass().getDeclaredField("i");
        f.setAccessible(true);
        System.out.println("f.getInt(pf) :" + f.getInt(pf));
        f.setInt(pf, 47);
        System.out.println(pf);
        f = pf.getClass().getDeclaredField("s");
        f.setAccessible(true);
        System.out.println("f.get(pf):" + f.get(pf));
        f.set(pf, "NO, you are not");
        System.out.println(pf);
        f = pf.getClass().getDeclaredField("s2");
        f.setAccessible(true);
        System.out.println("f.get(pf):" + f.get(pf));
        f.set(pf, "No, you're not");
        System.out.println(pf);
    }
}
