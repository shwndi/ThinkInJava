package dataType.collection;

import java.lang.reflect.Field;
import java.util.ArrayList;

/**
 * @author czy
 * @date 2021/3/8
 */
public class ArrayListCapacity {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>(2);
        Class<? extends ArrayList> clazz = list.getClass();
        try {
            Field capacity = clazz.getDeclaredField("DEFAULTCAPACITY_EMPTY_ELEMENTDATA");
            capacity.setAccessible(true);
            Object o = capacity.get(clazz);
            System.out.println(o instanceof Object[]);
            System.out.println();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
    }
}
