package GZQ;

import java.util.Collection;

/**
 * @author czy
 * @date 2021/1/26
 */
public class Generators {
    public static <T> Collection<T> fill(Collection<T> list, Gemerator<T> g, int i) {
        for (int j = 0; j < i; j++) {
            list.add(g.newClass());
        }
        return list;
    }

}
