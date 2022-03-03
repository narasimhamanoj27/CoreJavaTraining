package com.demo.freshertraining.composition;

import java.util.ArrayList;
import java.util.List;

public class LibraryExample {
    public static void main(String[] args) {
        Book b1 = new Book("Angels and Demons", "Dan Brown");
        Book b2 = new Book("The Book of Boba Fett", "Jon Favroe");
        Book b3 = new Book("Game of thrones", "RR Martin");

        List<Book> books = new ArrayList<>();
        books.add(b1);
        books.add(b2);
        books.add(b3);

        Library library = new Library(books);
        List<Book> booksList = library.getBooks();
        for (Book book : booksList) {
            System.out.println("Title : "+book.title+", written by : "+book.author);
        }
    }
}
