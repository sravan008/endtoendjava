package ksk.ds.custom;

public class Entry<K, V> {

    private K key;
    private V value;
    private Entry<K, V> node;

    //Entry

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public Entry<K, V> getNode() {
        return node;
    }

    public void setNode(Entry<K, V> node) {
        this.node = node;
    }
}
