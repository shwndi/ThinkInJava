package com.company.chapterSeventeen.nine;

import com.company.chapterseven.Values;

import java.util.Map;
import java.util.Objects;

/**
 * @author czy
 * @date 2021/2/4
 */
public class MapEntry<K,V> implements Map.Entry<K,V> {
    private K key;
    private V value;

    public MapEntry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }

    @Override
    public V setValue(V value) {
        V result = value;
        this.value = value;
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof MapEntry)){
            return false;
        }
        MapEntry me = (MapEntry) o;
        return (key == null?me.getKey()==null: key.equals(me.getKey()))&&
                (value==null?me.getValue()==null:value.equals(me.getValue()));
     }

    @Override
    public int hashCode() {
        return (key==null?0:key.hashCode()^(value==null?0:value.hashCode()));
    }

    public static void main(String[] args) {

    }
}
