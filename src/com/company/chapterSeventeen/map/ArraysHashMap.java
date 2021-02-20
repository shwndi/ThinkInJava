package com.company.chapterSeventeen.map;

/**
 * @author czy
 * @date 2021/2/20
 */
public class ArraysHashMap<K,V> {
    private Entry<K,V>[] entrys = new Entry[1000];
    private class Entry<K,V>{
        private K k;
        private V v;

        public Entry(K k, V v) {
            this.k = k;
            this.v = v;
        }
    }
    public void put(K k,V v){
        int index = k.hashCode()% entrys.length;
        Entry<K, V> entry = new Entry<>(k, v);
        entrys[index] =entry;
    }

    public V get(K k ){
        int index = k.hashCode()% entrys.length;
        Entry<K, V> entry = entrys[index];
        if (entry==null){
            return null;
        }
        return (V)entry.v;
    }

    /**
     * 会产生hash冲突问题
     * @param args
     */
    public static void main(String[] args) {
        ArraysHashMap hashMap = new ArraysHashMap<>();
        hashMap.put("a","a");
        hashMap.put(97,"a97");
        System.out.println(hashMap.get("a"));
        "a".hashCode();
    }
}
