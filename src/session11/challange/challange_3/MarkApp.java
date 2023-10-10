package session11.challange.challange_3;

import java.text.DecimalFormat;

public class MarkApp {

    public static void main(String[] args) {

        StudentA studentA = new StudentA(60, 50, 70.25);
        StudentB studentB = new StudentB(30.55, 100, 59.66, 88.80);
        studentA.getPercentage();
        studentB.getPercentage();

    }
}
