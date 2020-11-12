package ir.threegam.bookservice.repository;


import ir.threegam.bookservice.repository.db.BookDB;
import ir.threegam.bookservice.repository.model.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookRepository {


    BookDB bookDB = BookDB.getInstance();


    public List<Book> getBooks(){
        return bookDB.books;
    }

}
