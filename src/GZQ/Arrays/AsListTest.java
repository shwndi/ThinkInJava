package GZQ.Arrays;

import java.util.*;

/**
 * 反向遍历
 *
 * @author czy
 * @date 2021/2/3
 */
public class AsListTest {
    public static void main(String[] args) {
        String s = "sd fa k j h sf qae h";
        List<String> list = Arrays.asList(s);
//        list.remove(list.size());
        List<String> a = new ArrayList<>(list);
        ListIterator<String> it = a.listIterator();
        System.out.println(it.toString());
        System.out.println("listIterator(): " + it);
        boolean b = it.hasNext();
        System.out.println("hasNext(): " + b);
        b = it.hasPrevious();
        System.out.println("hasPrevious(): " + b);
        String s1 = it.next();
        System.out.println("next(): " + s1);
        int i = it.nextIndex();
        System.out.println("nextIndex(): " + i);
        String previous = it.previous();
        System.out.println("previous(): " + previous);
        int i1 = it.previousIndex();
        System.out.println("previousIndex(): " + i1);

    }
}
