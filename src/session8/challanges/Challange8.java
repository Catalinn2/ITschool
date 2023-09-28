package session8.challanges;

public class Challange8 {
    public static void main(String[] args) {
        String[] movies = {"Titanic", "Lord of the Rings", "Avatar", "Shutter Island"};
        String title = "Avatar";
        titleSearch(movies, title);

    }

    private static void titleSearch(String[] movies, String title) {
        for (int index = 0; index < movies.length; index++) {
            if (movies[index] == title) {
                System.out.println("Title position : " + index);
            }
        }
    }
}
