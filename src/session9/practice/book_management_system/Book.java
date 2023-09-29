package session9.practice.book_management_system;

public class Book {

        public String title;
        public Authors authors;

        public Book(String title, Authors author){
            this.title = title;
            this.authors = author;
        }

        public String getTitle(){
            return title;
        }
        public String getAuthorName() {
            return authors.getName();
        }
}
