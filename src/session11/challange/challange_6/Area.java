package session11.challange.challange_6;

public class Area extends Shape{
    @Override
    void rectangleArea(int length, int breadth) {
        System.out.println(length*breadth);
    }

    @Override
    void circleArea(int radius) {
        System.out.println(radius*radius*Math.PI);

    }

    @Override
    void sqareArea(int side) {
        System.out.println(side*side);

    }
}
