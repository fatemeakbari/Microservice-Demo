package ir.threegam.bookservice.repository.db;

import ir.threegam.bookservice.repository.model.Book;

import java.util.Arrays;
import java.util.List;

public class BookDB {


    private static BookDB bookDB = null;
    public List<Book> books;

    public BookDB() {

        books = Arrays.asList(
                new Book(1,1,"Operating System","001"),
                new Book(1,1,"Python For Beginner","002"),
                new Book(1,2,"Cloud","003"),
                new Book(1,2,"Network","004"),
                new Book(1,2,"Algorithm","005"),
                new Book(1,3,"Database Management","006")
                );
    }

    public static BookDB getInstance()
    {
        if (bookDB == null)
            bookDB = new BookDB();

        return bookDB;
    }
}
