package com;

import java.util.HashSet;
import java.util.Set;

/**
 * @author czy
 * @date 2021/1/22
 */
public class Sets {
    public static <T> Set<T> union(Set<T> a,Set<T> b){
        Set<T> result = new HashSet<T>(a);
        result.addAll(b);
        return result;
    }

}
