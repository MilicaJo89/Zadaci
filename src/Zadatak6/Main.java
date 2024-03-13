package Zadatak6;

public class Main {
    public static void main(String[] args) {

        Library library = new Library("Public library");

        Book book1 = new Book("A discovery of witches","Deborah Harknes",2011, library.name);
        Book book2 = new Book("From blood and ash","JLA",2020, library.name);
        Book book3 = new Book("Kingdom of ash","SJM",2018, library.name);
        Book book4 = new Book("Killing my darlings","Eric Wilson",1980, library.name);

        library.addBooks(book1);
        library.addBooks(book2);
        library.addBooks(book3);
        library.addBooks(book4);

        for (Book book: library.getAllBooks()){
            System.out.println("Title: "+book.title+'\n'+"Author: "+book.author+'\n'+"Year of Publishing: "+book.pubYear+'\n'+"Library: "+book.library);
        }

        System.out.println("Let us remove book 4");
        library.removeBooks(book4);

        for (Book book: library.getAllBooks()){
            System.out.println("Title: "+book.title+'\n'+"Author: "+ book.author+'\n'+"Year of Publishing: " + book.pubYear+'\n'+"Library: " + book.library);
        }
    }
}
