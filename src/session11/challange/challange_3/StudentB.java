package session11.challange.challange_3;

import java.text.DecimalFormat;

public class StudentB extends Marks {

    double mark1, mark2, mark3, mark4;

    public StudentB(double mark1, double mark2, double mark3, double mark4) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        this.mark4 = mark4;
    }

    @Override
    void getPercentage() {
        double sum = mark1 + mark2 + mark3 + mark4;
        System.out.println(sum / 400 * 100);
    }
}
