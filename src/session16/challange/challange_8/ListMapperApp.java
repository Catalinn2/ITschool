package session16.challange.challange_8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class ListMapperApp {

    public static void main(String[] args) {

        ListMapper listMapper = (intList, mapper) -> {
            List<Integer> mappedList = new ArrayList<>();
            for (Integer element : intList) {
                mappedList.add(mapper.apply(element));
            }
            return mappedList;
        };

        List<Integer> intList = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
        Function<Integer, Integer> doubleFunction = x -> x * 2;
        List<Integer> mappedList = listMapper.mapList(intList, doubleFunction);
        System.out.println("Mapped list : " + mappedList);
    }
}
