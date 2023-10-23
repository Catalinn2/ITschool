package session15.challanges.challange_15;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class GenericRepository<T> {

    //create generic repo
    //hashmap
    //id
    private Map<Integer, T> repository;
    private int nextId;

    public GenericRepository() {
        repository = new HashMap<>();
        nextId = 1;
    }

    // add / get / remove / contains / size
    public void add(T object) {
        int id = nextId++;
        repository.put(id, object);
    }

    public void get(int id) {
        System.out.println(repository.get(id).toString());
    }

    public void remove(int id) {
        repository.remove(id);
    }

    public boolean contain(int id) {
        return repository.containsKey(id);
    }

    public int size() {
        return repository.size();
    }

    @Override
    public String toString() {
        return "GenericRepository{" +
                "repository=" + repository +
                ", nextId=" + nextId +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        GenericRepository<?> that = (GenericRepository<?>) object;
        return nextId == that.nextId && Objects.equals(repository, that.repository);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repository, nextId);
    }
}
