package com.company.chapnineteen;

import sun.misc.OSEnvironment;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author czy
 * @date 2021/3/15
 */
enum Explore {HERE, THERE}

public class Reflection {
    public static Set<String> analyze(Class<?> enumClass) {
        System.out.println("--------- Analyze " + enumClass + " -------------");
        System.out.println("interfaces：");
        for (Type type : enumClass.getGenericInterfaces()) {
            System.out.println(type);
        }
        System.out.println("Base: " + enumClass.getGenericSuperclass());
        System.out.println("Methods: ");
        Set<String> methods = new TreeSet<>();
        for (Method m : enumClass.getMethods()) {
            methods.add(m.getName());
        }
        System.out.println(methods);
        return methods;
    }

    public static void main(String[] args) {
        Set<String> exploreMethods = analyze(Explore.class);
        Set<String> enummethods = analyze(Explore.class);
        System.out.println("Explore.containAll(Enum)? " +
                exploreMethods.containsAll(enummethods));
        System.out.println("Explore.removeAll(Enum): ");
        exploreMethods.removeAll(enummethods);
        System.out.println(exploreMethods);
        //OSExecute.command("javap Explore");
    }
}
