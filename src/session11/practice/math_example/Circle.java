package session11.practice.math_example;

public class Circle implements MathConstants {

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    double calculateRadius(){
        return PI  * radius * radius;
    }
}
