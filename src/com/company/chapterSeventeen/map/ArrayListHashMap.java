package com.company.chapterSeventeen.map;

import java.util.ArrayList;
import java.util.List;

/**
 * @author czy
 * @date 2021/2/20
 */
public class ArrayListHashMap<K, V> {
    ArrayList<Entry> mapList = new ArrayList<Entry>();

    private class Entry<K, V> {
        private K k;
        private V v;

        public Entry(K k, V v) {
            this.k = k;
            this.v = v;
        }
    }

    public void put(K k, V v) {
        Entry<K, V> entry = new Entry<>(k, v);
        mapList.add(entry);
    }

    public V get(K k) {
        for (Entry entry : mapList) {
            if (entry.k == k) {
                return (V) entry.v;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        ArrayListHashMap map = new ArrayListHashMap<>();
        map.put("a", "a");
        map.put(97, "a");
        System.out.println(map.get("a"));
    }
}
