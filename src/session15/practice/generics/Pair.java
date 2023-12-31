package session15.practice.generics;

public class Pair<K, V> {

    public static void main(String[] args) {

        Pair<String, Integer> pair = new Pair<>("Alice", 23);
        System.out.println(pair.getKey() + " is " + pair.getValue() + " years old." );

    }

    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

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


}
