package com.company.chaptertwenty.usercase;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**注解处理器
 * @author czy
 * @date 2021/3/22
 */
public class UseCaseTracker {
    public static void trackUseCases(List<Integer> useCases,Class<?> cl){
        for (Method method : cl.getDeclaredMethods()) {
            UseCase an = method.getAnnotation(UseCase.class);
            if (an!=null) {
                System.out.println("Found use case: "+an.id()+" " +an.description());
                useCases.remove(new Integer(an.id()));
            }
        }
        for (Integer i : useCases) {
            System.out.println("Warning :Missing use case-" +i);
        }
    }
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list,47,48,49,50,51);
        trackUseCases(list,PasswordUtils.class);
    }}
