package session6.challanges;

public class Challange12 {
    public static void main(String[] args) {
        String camel = "TheHorseIsInTheBarn";
        System.out.println("Camel case: " + camel + " as snake: " + camelToSnake(camel));
    }

    private static String camelToSnake(String str) {
        StringBuilder snakeString = new StringBuilder();

        for (int index = 0; index < str.length(); index++) {
            if (Character.isUpperCase(str.charAt(index))) {
                snakeString.append(("_" + Character.toLowerCase(str.charAt(index))));
                continue;
            }
            snakeString.append(str.charAt(index));
        }
        return snakeString.toString();
    }
}

