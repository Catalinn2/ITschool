package session11.challange.challange_3;

import java.text.DecimalFormat;

public class StudentA extends Marks {
    double mark1, mark2, mark3;

    public StudentA(double mark1, double mark2, double mark3) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    @Override
    void getPercentage() {
        double sum = 0;
        sum = mark1 + mark2 + mark3;
        System.out.println(sum / 300 * 100);

    }
}
