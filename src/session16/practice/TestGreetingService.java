package session16.practice;

public class TestGreetingService {

    public static void main(String[] args) {
        //anonymuys class

        GreetingService annonymusGreetingService = new GreetingService() {
            @Override
            public void greeting(String message) {
                System.out.println("Hello " + message);
            }
        };
        annonymusGreetingService.greeting("Maria");

        //lambda
        GreetingService lambdaGreetingService = message -> System.out.println("Hello " + message);
        lambdaGreetingService.greeting("Maria");
    }
}
