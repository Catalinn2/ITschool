package session16.challange.challange_11;

import java.util.List;

@FunctionalInterface
public interface GenericElementInList<T> {
    boolean contains(List<T> list, T object);
}
