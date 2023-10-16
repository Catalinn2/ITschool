package session13.challanges.library_management_system;

public class AltheaLibrary {

    public static void main(String[] args) {

        Author author1 = new Author("Mihai Eminescu", "Romanian", "1850-01-15");
        System.out.println(author1.authorInfo());
        Book book1 = new Book("Poezii", author1, "Art", "9780879684662");
        System.out.println(book1.bookInfo());
        book1.aviability();
        book1.addCopies(50);
        book1.aviability();
        author1.addBook(book1);
        author1.getBooks();
        Book book2 = new Book("Luceafarul", author1, "Art", "9780940471597");
        author1.addBook(book2);
        author1.getBooks();
        Member member1 = new Member("John", "Bucharest", "0741414141", "johntherockstar@gmail.com");
        member1.contactInfo();
        Library althea = new Library("Althea");
        althea.addBook(book1);
        althea.addBook(book2);
        althea.addMember(member1);
        althea.showBooks();
        althea.showMembers();
        althea.showBooks();
        althea.searchMemberByName("John");
        althea.searchBookByTitle("Poezii");
        althea.searchBookByISBN("9780940471597");
        althea.searchBookByAuthor("Mihai Eminescu");
        member1.borrowBook(book1);
        member1.showBorrowedBooks();
        member1.returnBook(book1);
    }
}
