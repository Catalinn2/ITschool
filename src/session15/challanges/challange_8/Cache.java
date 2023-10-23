import java.util.HashMap;

public class Cache<T> {
    private HashMap<Integer, T> cache;

    public Cache() {
        cache = new HashMap<>();
    }

    public void put(T key, T value) {
        int hashCode = key.hashCode();
        cache.put(hashCode, value);
    }

    public T get(T key) {
        int hashCode = key.hashCode();
        return cache.get(hashCode);
    }

    public boolean contains(T key) {
        int hashCode = key.hashCode();
        return cache.containsKey(hashCode);
    }

    public void remove(T key) {
        int hashCode = key.hashCode();
        cache.remove(hashCode);
    }

    public void clear() {
        cache.clear();
    }

    public int size() {
        return cache.size();
    }

    public boolean isEmpty() {
        return cache.isEmpty();
    }

    @Override
    public int hashCode() {
        // Ensure that objects with the same hash code are considered equal.
        return 1; // You can choose any constant value, as long as it's the same for all instances.
    }

    @Override
    public boolean equals(Object obj) {
        // Provide a robust equality comparison if needed.
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        return true; // You can customize this method based on your specific needs.
    }

    public static void main(String[] args) {
        Cache<String> stringCache = new Cache<>();

        stringCache.put("Key1", "Value1");
        stringCache.put("Key2", "Value2");
        stringCache.put("Key1", "UpdatedValue"); // Overwrites "Value1" with "UpdatedValue"

        System.out.println(stringCache.get("Key1")); // Output: UpdatedValue
        System.out.println(stringCache.get("Key2")); // Output: Value2
    }
}
