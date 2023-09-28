package session8.challanges;

import java.util.LinkedList;
import java.util.List;

public class Challange6 {
    public static void main(String[] args) {
        List<String> studentNames = new LinkedList<>();
        studentNames.add("John");
        studentNames.add("Tom");
        studentNames.add("Brad");
        studentNames.add("Michael");
        studentNames.add("David");
        if (studentNames.contains("Tom")) {
            studentNames.remove("Tom");
        }
        System.out.println("Updated student list :" + studentNames);
    }
}
