package ir.threegam.bookservice.controller;



import ir.threegam.bookservice.repository.BookRepository;
import ir.threegam.bookservice.repository.model.BookList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @RequestMapping
    public BookList getBooks(){

        return new BookList(bookRepository.getBooks());
    }

}
