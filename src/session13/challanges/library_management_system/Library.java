package session13.challanges.library_management_system;

import java.util.ArrayList;

public class Library {

    private String name;
    private ArrayList<Book> libraryStock = new ArrayList<>();

    private ArrayList<Member> memberList = new ArrayList<>();

    public void searchBookByAuthor(String name) {
        for (Book book : libraryStock) {
            if (book.getAuthor().getName().equals(name)) {
                System.out.println("Books found!");
                book.getAuthor().getBooks();
            } else {
                System.out.println("Author not found!");
            }
        }
    }

    public void searchBookByISBN(String ISBN) {
        for (Book book : libraryStock) {
            if (book.getISBN().equals(ISBN)) {
                System.out.println("Book found!");
                System.out.println(book.bookInfo());
            } else {
                System.out.println("Book not found!");
            }
        }
    }


    public void searchBookByTitle(String title) {
        for (Book book : libraryStock) {
            if (book.getTitle().equals(title)) {
                System.out.println("Book found!");
                System.out.println(book.bookInfo());
            } else {
                System.out.println("Book not found!");
            }
        }
    }

    public void searchMemberByName(String name) {
        for (Member member : memberList) {
            if (member.getName().equals(name)) {
                System.out.println("Member found ! - > ");
                member.contactInfo();
            } else {
                System.out.println("Member not found");
            }
        }
    }

    public void showBooks() {
        System.out.println("Booklist in " + name + " ");
        for (Book book : libraryStock) {
            System.out.println(book.getTitle());
        }
    }

    public void showMembers() {
        System.out.println("Members in " + name + " : ");
        for (Member member : memberList) {
            System.out.println(member.getName());
        }
    }

    public ArrayList<Book> getLibraryStock() {
        return libraryStock;
    }

    public void setLibraryStock(ArrayList<Book> libraryStock) {
        this.libraryStock = libraryStock;
    }

    public ArrayList<Member> getMemberList() {
        return memberList;
    }

    public void setMemberList(ArrayList<Member> memberList) {
        this.memberList = memberList;
    }

    public void removeBook(Book book) {
        libraryStock.remove(book);
    }

    public void removeMember(Member member) {
        libraryStock.remove(member);
    }

    public void addBook(Book book) {
        libraryStock.add(book);
    }

    public void addMember(Member member) {
        memberList.add(member);
    }

    public Library(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
