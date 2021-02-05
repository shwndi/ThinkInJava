package com.company.chapterSeventeen.map;

import com.sun.xml.internal.ws.transport.Headers;

import java.util.*;

/**
 * @author czy
 * @date 2021/2/4
 */
public class Maps {
    public static void printKeys(Map<Integer,String> map){
        System.out.println("Size =" +map.size() +", ");
        System.out.println("Key: ");
        System.out.println(map.keySet());
    }
    public static void test(Map<Integer, String > map){
        System.out.println(map.getClass().getSimpleName());
//        map.putAll();
//        map.containsKey()
        TreeMap<Object, Object> treeMap = new TreeMap<>();
//        Comparator.com
        LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap = new LinkedHashMap<>(16,0.75f,true);
    }
}
