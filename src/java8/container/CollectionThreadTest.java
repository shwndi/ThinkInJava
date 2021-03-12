package java8.container;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * @author czy
 * @date 2021/3/3
 */
public class CollectionThreadTest {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, NoSuchFieldException {
        Map<String, String> map = new HashMap<>();
        Collections.synchronizedMap(map);
        Hashtable<Object, Object> table = new Hashtable<>();
        table.put("asdf","d");
        Class<?> name = table.getClass();
        Field count = name.getDeclaredField("threshold");
        count.setAccessible(true);
        System.out.println("capacity : " + count.get(table));
    }
}
