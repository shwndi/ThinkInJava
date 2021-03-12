package java8.container;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * 容量
 *
 * @author czy
 * @date 2021/3/3
 */
public class Capacity {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Map<String, String> map = new HashMap<String, String>();

        map.put("hollis", "hollischuang");


        Class<?> mapType = map.getClass();

        Method capacity = mapType.getDeclaredMethod("capacity");

        capacity.setAccessible(true);

        System.out.println("capacity : " + capacity.invoke(map));


        Field size = mapType.getDeclaredField("size");

        size.setAccessible(true);

        System.out.println("size : " + size.get(map));

    }
}
