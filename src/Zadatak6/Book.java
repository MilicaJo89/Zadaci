package Zadatak6;

public class Book {

    String title;
    String author;
    int pubYear;
    String library;

    Book(String title, String author, int pubYear, String library){
        this.title=title;
        this.author=author;
        this.pubYear=pubYear;
        this.library=library;
    }

    public String toString() {
        return title+'\n'+author+'\n'+pubYear+'\n'+library;
    }
}
