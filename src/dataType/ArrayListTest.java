package dataType;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author czy
 * @date 2021/3/8
 */
public class ArrayListTest {
    public static void main(String[] args) {
//        exception();
        printDefaultCapacityList();
        printEmptyCapacityList();
//        concurrentModificationException();
    }

    private static void concurrentModificationException() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        remove(list);
        System.out.println(list);
    }

    private static void remove(ArrayList<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            Integer next = iterator.next();
            if (next%2 ==0){
                list.remove(next);
            }
        }
    }

    public static void printDefaultCapacityList() {
        ArrayList defaultCapacity = new ArrayList();
        System.out.println(
                "default 初始化长度：" + getCapacity(defaultCapacity));

        defaultCapacity.add(1);
        System.out.println(
                "default add 之后 长度：" + getCapacity(defaultCapacity));
    }

    public static void printEmptyCapacityList() {
        ArrayList emptyCapacity = new ArrayList(0);
        System.out.println(
                "empty 初始化长度：" + getCapacity(emptyCapacity));

        emptyCapacity.add(1);
        emptyCapacity.add(2);
        System.out.println(
                "empty add 之后 长度：" + getCapacity(emptyCapacity));
    }

    public static int getCapacity(ArrayList<?> arrayList) {
        Class<ArrayList> arrayListClass = ArrayList.class;
        try {
            // 获取 elementData 字段
            Field field = arrayListClass.getDeclaredField("elementData");
            // 开启访问权限
            field.setAccessible(true);
            // 把示例传入get，获取实例字段elementData的值
            Object[] objects = (Object[]) field.get(arrayList);
            //返回当前ArrayList实例的容量值
            return objects.length;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
    public static void exception(){
        List<String> list = new ArrayList<>(Arrays.asList("list"));
        // class java.util.ArrayList
        System.out.println(list.getClass());

        Object[] listArray = list.toArray();
        // class [Ljava.lang.Object;
        System.out.println(listArray.getClass());
        listArray[0] = new Object();

        System.out.println();

        List<String> asList = Arrays.asList("asList");
        // class java.util.Arrays$ArrayList
        System.out.println(asList.getClass());

        Object[] asListArray = asList.toArray();
        // class [Ljava.lang.String;
        System.out.println(asListArray.getClass());
        // java.lang.ArrayStoreException
        asListArray[0] = new Object();
    }
}
