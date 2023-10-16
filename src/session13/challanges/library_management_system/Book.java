package session13.challanges.library_management_system;

public class Book {
    private String title;
    private Author author;
    private String publisher;
    private String ISBN;
    public int copies;


    public String bookInfo() {
        return "Book{" +
                "title= '" + title + '\'' +
                ", author= " + author.getName() +
                ", publisher= '" + publisher + '\'' +
                '}';
    }

    public void aviability() {
        if (copies == 0) {
            System.out.println("Book " + title + " unaviable!");
        } else {
            System.out.println("There are " + copies + " copies left of " + title + "!");
        }
    }

    public void removeCopies(int copies) {
        if (copies <= 0) {
            System.out.println("Invalid input!");
        } else {
            System.out.println("Removed " + copies + " copies");
            this.copies -= copies;
        }
    }

    public void addCopies(int copies) {
        if (copies <= 0) {
            System.out.println("Invalid input!");
        } else {
            System.out.println("Added " + copies + "copies");
            this.copies += copies;
        }
    }

    public Book(String title, Author author, String publisher, String ISBN) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }
}
