package com.company.chapterSeventeen.nine;

import java.util.*;

/**
 * @author czy
 * @date 2021/2/4
 */
public class SlowMap<K, V> extends AbstractMap<K, V> {
    private List<K> keys = new ArrayList<K>();
    private List<V> values = new ArrayList<V>();

    @Override
    public V put(K key, V value) {
        V oldValue = get(key);
        if (!keys.contains(key)) {
            keys.add(key);
            values.add(value);
        } else {
            values.set(keys.indexOf(key), value);
        }
        return oldValue;
    }

    @Override
    public V get(Object key) {
        if (!keys.contains(key)) {
            return null;
        }
        return values.get(keys.indexOf(key));
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        Set<Entry<K, V>> set = new HashSet<>();
        Iterator<K> ki = keys.iterator();
        Iterator<V> vi = values.iterator();
        while (ki.hasNext()) {
//            set.add(new MapEntry<K,V>(ki.next(),vi.next()));
        }
        return set;
    }

    public static void main(String[] args) {
        String s = "174307";
        int a = Integer.parseInt(s);
        System.out.println(a);
    }

}
