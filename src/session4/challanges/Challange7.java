package session4.challanges;

public class Challange7 {
    public static void main(String[] args) {
        int sideOne = 15;
        int sideTwo = 15;
        int sideThree = 5;
        String type = (sideOne == sideTwo && sideOne == sideThree) ? "Equilateral" : (sideThree == sideTwo && sideThree!= sideOne) ? "Isosceles" :(sideOne == sideTwo && sideThree!= sideOne) ? "Isosceles" : "Scalene";
        System.out.println(type);
    }
}
