package com.company.chapterfifteen;

import com.company.chapterfive.Cat;

import java.lang.reflect.Method;
import java.util.*;

/**
 * @author czy
 * @date 2021/1/25
 */
public class ContainerMethodDifferences {
    static Set<String> methodSet(Class<?> type) {
        TreeSet<String> result = new TreeSet<>();
        for (Method method : type.getMethods()) {
            result.add(method.getName());
        }
        return result;
    }

    static void interfaces(Class<?> type) {
        System.out.println("Interfaces in" +
                type.getSimpleName() + ":");
        ArrayList<String> result = new ArrayList<>();
        for (Class<?> c : type.getInterfaces()) {
            result.add(c.getSimpleName());
        }
        System.out.println(result);
    }

    static Set<String> object = methodSet(Object.class);

    static {
        object.add("clone");
    }

    static void difference(Class<?> superset, Class<?> subset) {
        System.out.println(superset.getSimpleName() + "extends" + subset.getSimpleName() +
                ", adds: ");
        Set<String> comp = Sets.difference(methodSet(superset), methodSet(subset));
        comp.removeAll(object);
        System.out.println(comp);
        interfaces(superset);
    }

    public static void main(String[] args) {
        System.out.println("Collection: " + methodSet(Collection.class));
        interfaces(Collection.class);
        difference(Set.class, Collection.class);
        difference(HashSet.class, Set.class);
        difference(LinkedHashSet.class, HashSet.class);
        difference(TreeSet.class, Set.class);
        difference(List.class, Collection.class);
        difference(ArrayList.class, List.class);
        difference(LinkedList.class, List.class);
        difference(Queue.class, Collection.class);
        difference(PriorityQueue.class, Queue.class);
        System.out.println("Map: " + methodSet(Map.class));
        difference(HashMap.class, Map.class);
        difference(LinkedHashMap.class, HashMap.class);
        difference(SortedMap.class, Map.class);
        difference(TreeMap.class, Map.class);
    }

    static class Sets {
        static <T> Set<T> difference(Set<T> a, Set<T> b) {
            HashSet<T> set = new HashSet<>(a);
            set.retainAll(b);
            return set;
        }
    }
}
