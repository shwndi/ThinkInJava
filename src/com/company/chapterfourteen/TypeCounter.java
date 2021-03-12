package com.company.chapterfourteen;

import java.util.HashMap;
import java.util.Map;

/**
 * 递归计数
 *
 * @author czy
 * @date 2020-12-3
 */
public class TypeCounter extends HashMap<Class<?>, Integer> {
    private Class<?> baseType;

    public TypeCounter(Class<?> baseType) {
        this.baseType = baseType;
    }

    public void count(Object obj) {
        Class<?> type = obj.getClass();
        if (!baseType.isAssignableFrom(type)) {
            throw new RuntimeException(obj + "inconner type:" +
                    type + "shoule be type or subtype of" + baseType);
        }
        countClass(type);
    }

    private void countClass(Class<?> type) {
        Integer quentity = get(type);
        put(type, quentity == null ? 1 : quentity + 1);
        Class<?> superclass = type.getSuperclass();
        if (superclass != null && baseType.isAssignableFrom(superclass)) {
            countClass(superclass);
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("{");
        for (Map.Entry<Class<?>, Integer> pair : entrySet()) {
            result.append(pair.getKey().getSimpleName());
            result.append("=");
            result.append(pair.getValue());
            result.append(", ");
        }
        result.delete(result.length() - 2, result.length());
        result.append("}");

        return result.toString();
    }
}
