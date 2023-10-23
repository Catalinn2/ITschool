package session15.challanges.challange_6;

public class LightApp {
    public static void main(String[] args) {

        LightColor red = LightColor.RED;
        System.out.println("Color : " + red.name());
        System.out.println("Description : " + red.getDescription());
        System.out.println("Duration : " + red.getDurationInSecond());
    }
}
