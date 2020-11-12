package ir.threegam.entrypointservice.graphql.service;

import ir.threegam.entrypointservice.model.Book;
import ir.threegam.entrypointservice.model.BookList;
import ir.threegam.entrypointservice.model.User;
import ir.threegam.entrypointservice.model.UserList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
public class EntryPointService {


    @Autowired
    WebClient.Builder webClientBuilder;

    @Transactional(readOnly = true)
    public User getUserById(int id){

            return webClientBuilder.
                    build().
                    get().
                    uri("http://localhost:8083/users/"+id).retrieve().
                    bodyToMono(User.class).
                    block();

    }
    public List<User> getUsers(){

        UserList userList =  webClientBuilder.
                build().
                get().
                uri("http://localhost:8083/users").retrieve().
                bodyToMono(UserList.class).
                block();

        return userList.getUsers();
    }

    public List<Book> getBooks(){


        BookList bookList = webClientBuilder.
                build().
                get().
                uri("http://localhost:8085/books").retrieve().
                bodyToMono(BookList.class).
                block();

        bookList.getBooks().stream().forEach(book -> book.setCreator(

        webClientBuilder.
                build().
                get().
                uri("http://localhost:8083/users/"+book.getUserId()).retrieve().
                bodyToMono(User.class).
                block()
        ));

        return bookList.getBooks();
    }
}
