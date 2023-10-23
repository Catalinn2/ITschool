package session15.challanges.challange_9;

public class NineApp {

    public static void main(String[] args) {

        Animal dog =new Animal("Dog", "white", true);
        System.out.println(dog.toString());
        ToJson.stringToJson(dog);
    }
}
