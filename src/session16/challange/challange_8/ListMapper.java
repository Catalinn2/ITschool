package session16.challange.challange_8;

import java.util.List;
import java.util.function.Function;

@FunctionalInterface
public interface ListMapper {
    List<Integer> mapList(List<Integer> intList, Function<Integer, Integer> mapper);
}
