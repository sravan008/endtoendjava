//package ksk.ds.custom;
//
////put
////contains
////get
//
//import java.util.Map;
//import java.util.Stack;
//
//public class HashMap<K, V> {
//
//    private int INTIAL_CAPACITY = 16;
//    private K key;
//    private V value;
//    private Map.Entry<K, V>[] node;
//    private int[] table;
//
//
//    HashMap() {
//        this.table = new int[INTIAL_CAPACITY];
//    }
//
//
//    void put(K key, V value) {
//        int hashcode = hash(key);
//        int index = hashcode & (INTIAL_CAPACITY - 1);
//        node[index] = ;
//    }
//
//
//    int hash(K k) {
//        return (int) k * value.hashCode();
//    }
//
//
//}
