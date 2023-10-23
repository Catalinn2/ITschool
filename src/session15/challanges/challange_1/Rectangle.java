package session15.challanges.challange_1;

import java.util.Objects;

public class Rectangle {

    private int width;
    private int height;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Rectangle rectangle = (Rectangle) object;
        return getWidth() == rectangle.getWidth() && getHeight() == rectangle.getHeight();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getWidth(), getHeight());
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(15, 15);
        Rectangle rectangle1 = new Rectangle(15, 15);
        System.out.println(rectangle.equals(rectangle1));
    }
}
