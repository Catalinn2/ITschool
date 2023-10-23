package session15.challanges.challange_14;

public class TrafficLightApp {

    public static void main(String[] args) {
        printLightInfo();

    }

    private static void printLightInfo(){
        for (TrafficLightEnum light : TrafficLightEnum.values()){
            System.out.println(light.name() + " - > " + light.getDescription());
        }
    }
}
