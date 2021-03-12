package com.company.chaptertwelve;

/**
 * @author czy
 * @date 2020-10-10
 */
public class WhoCalled {
    static void f() {
        try {
            throw new Exception();
        } catch (Exception e) {
            for (StackTraceElement element : e.getStackTrace()) {
                System.out.println(element.getMethodName());
            }
        }
    }

    static void g() {
        f();
    }

    static void h() {
        g();
    }

    static void m() throws Exception {
        try {
            throw new Exception();
        } catch (Exception e) {
            for (StackTraceElement element : e.getStackTrace()) {
                System.out.println(element.getMethodName());
            }
            throw e;
        }
    }

    public static void main(String[] args) {
        f();
        System.out.println("-----------------------------");
        g();
        System.out.println("-----------------------------");
        h();
    }
}
