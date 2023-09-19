package session6.practice;

public class StringVersusStringBuilder {
    public static void main(String[] args) {
        //using String
        String str = "";
        for (int index = 0; index < 10; index++) {
            str += "word" + index + " ";
        }
        System.out.println("Final string using String: " + str);

        //using StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        for (int index = 0; index < 10; index++) {
            stringBuilder.append("word").append(index).append(" ");
        }
        System.out.println("final stringBuilder using stringBuilder: "+ stringBuilder);

        String name="John";
        name.replace('o','a');
        System.out.println(name);
    }
}
