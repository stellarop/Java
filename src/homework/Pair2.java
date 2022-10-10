package homework;

public class Pair2<K, V> {
    private K key;
    private V value;

    public Pair2(K key, V value){
        this.key = key;
        this.value = value;
    }


    public void setKey(K key) {
        this.key = key;
    }
    public K getKey() {
        return key;
    }

    public void setValue(V value) {
        this.value = value;
    }
    public V getValue() {
        return value;
    }


}
