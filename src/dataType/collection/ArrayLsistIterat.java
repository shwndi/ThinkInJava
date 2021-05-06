package dataType.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author czy
 * @date 2021/1/20
 */
public class ArrayLsistIterat {
    public static void main(String[] args) {
        List<String> s = (ArrayList) Arrays.asList("asdf sdf asdf fsd ef g re".split(" "));
        Iterator<String> iterator = s.iterator();
        while (iterator.hasNext()) {
            String s1 = iterator.next();
            System.out.println(s1);
            iterator.remove();
        }
    }
}
