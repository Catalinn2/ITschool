package session9.practice.book_management_system;

public class BookManagementSystem {

    public static void main(String[] args) {
        Authors alice = new Authors("Alice");
        Book book = new Book("Journey to Wonderland", alice);
        System.out.println("Book title " + book.getTitle());
        System.out.println("Book author " + book.getAuthorName());

    }
}
