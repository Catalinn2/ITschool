package session13.challanges.library_management_system;

import java.util.ArrayList;

public class Member {
    private String name;
    private String adress;
    private String phoneNumber;
    private String email;

    private ArrayList<Book> borrowedBooks = new ArrayList<>();

    public void returnBook(Book book) {
        System.out.println(name + "has returned: " + book.getTitle());
        this.borrowedBooks.remove(book);
        book.addCopies(1);
        System.out.println("Copies left: " + book.copies);

    }

    public void showBorrowedBooks() {
        System.out.println(name + " has borrowed : ");
        for (Book book : this.borrowedBooks) {
            System.out.println(book.getTitle());
        }
    }

    public void borrowBook(Book book) {
        System.out.println(name + "has borrowed: " + book.getTitle());
        this.borrowedBooks.add(book);
        book.removeCopies(1);
        System.out.println("Copies left: " + book.copies);
    }

    public void contactInfo() {
        System.out.println(name + " contact info are : " + "Phone number : " + phoneNumber + " and email : " + email);
    }

    public Member(String name, String adress, String phoneNumber, String email) {
        this.name = name;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
