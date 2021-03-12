package com.company.chapterSeventeen.map;

/**
 * @author czy
 * @date 2021/2/20
 */
public class ListHashMap<K, V> {
    Entry<K, V>[] entrys = new Entry[1000];

    class Entry<K, V> {
        private K k;
        private V v;
        private Entry<K, V> next;

        public Entry(K k, V v) {
            this.k = k;
            this.v = v;
        }
    }

    public void put(K k, V v) {
        int index = k.hashCode() % entrys.length;
        if (entrys[index] == null) {
            entrys[index] = new Entry<>(k, v);
        } else {
            entrys[index].next = new Entry<>(k, v);
        }
    }

    public V get(K k) {
        int index = k.hashCode() % entrys.length;
        for (Entry entrie = entrys[index]; entrie != null; entrie = entrie.next) {
            if (entrie.k.equals(k)) {
                return (V) entrie.v;
            }
        }
        return null;
    }

    public static void main(String[] args) {

    }
}
