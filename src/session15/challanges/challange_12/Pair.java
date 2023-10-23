package session15.challanges.challange_12;

public class Pair <K,V>{

    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }

    public static void main(String[] args) {

        Pair<String,Integer> pair = new Pair<>("Key", 20);
        System.out.println(pair.toString());
        System.out.println(pair.key);
        System.out.println(pair.value);
    }
}
