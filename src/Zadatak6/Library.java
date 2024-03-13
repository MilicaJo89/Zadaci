package Zadatak6;


import java.util.ArrayList;
import java.util.List;

public class Library {

    String name;

    List<Book>books;

    Library(String name){
        this.name=name;
        books=new ArrayList<>();
    }
    void addBooks(Book book){
        books.add(book);
    }
    void removeBooks(Book book){
        books.remove(book);
    }

    List<Book>getAllBooks(){
        return books;
    }
}
