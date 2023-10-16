package session13.challanges.library_management_system;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;

public class Author {

    private String name;
    private String nationality;
    private String dateOfBirth;

    private ArrayList<Book> books = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void getBooks() {
        System.out.println(name + " books : ");
        for (Book book : books){
            System.out.println(book.getTitle());
        }
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Author(String name, String nationality, String dateOfBirth) {
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
    }


    public String authorInfo() {
        return "Author{" +
                "name= '" + name + '\'' +
                ", nationality= '" + nationality + '\'' +
                ", dateOfBirth= '" + dateOfBirth + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
