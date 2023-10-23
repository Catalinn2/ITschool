package session15.challanges.challange_9;

public class ToJson {

    public static <E> void stringToJson(E object) {
        StringBuilder toJson = new StringBuilder();
        String[] objectToString = object.toString().split(" ");
        for (int index = 0; index < objectToString.length - 1; index++) {
            toJson.append(objectToString[index]).append(" : ").append(objectToString[index + 1]).append("\n");
            if (index + 1 < objectToString.length - 1) {
                index++;
            }
        }
        System.out.println(toJson.toString());
    }
}
