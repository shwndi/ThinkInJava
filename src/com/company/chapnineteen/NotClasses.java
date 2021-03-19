package com.company.chapnineteen;

/**
 * @author czy
 * @date 2021/3/18
 */
enum LinkClasses{
    WINKEN{
        @Override
        void behavior(){
        System.out.println("Behavior1");
    }},
    BLINKEN{
        @Override
        void behavior(){
        System.out.println("Behavior2");
    }},
    NOD{
        @Override
        void behavior(){
        System.out.println("Behavior3");
    }};
    abstract void behavior();

}
public class NotClasses {
}
//Compiled from "NotClasses.java" abstract class LinkClasses extends java.lang.Enum{
//public static final LinkClasses WINKEN;
//public static final LinkClasses BLINKEN;
//public static final LinkClasses NOD;
//
//}
