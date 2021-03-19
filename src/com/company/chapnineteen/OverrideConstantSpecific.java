package com.company.chapnineteen;

/**
 * @author czy
 * @date 2021/3/18
 */
public enum OverrideConstantSpecific {
    NUT,BOLT,
    WASHER{
        @Override
        void f(){
            System.out.println("Overridden Method");
        };
    };
    void f(){
        System.out.println("default behavior");
    }
    public static void main(String[] args) {
        for (OverrideConstantSpecific value : values()) {
            System.out.print(value+":");
            value.f();
        }
    }
}
