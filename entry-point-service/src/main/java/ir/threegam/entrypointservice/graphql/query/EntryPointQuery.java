package ir.threegam.entrypointservice.graphql.query;


import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import ir.threegam.entrypointservice.model.Book;
import ir.threegam.entrypointservice.model.User;
import ir.threegam.entrypointservice.graphql.service.EntryPointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EntryPointQuery implements GraphQLQueryResolver {

    @Autowired
    private EntryPointService entryPointService;


    public List<Book> getBooks() {
        return this.entryPointService.getBooks();
    }

    public List<User> getUsers() {
        return this.entryPointService.getUsers();
    }

    public User getUserById(final int id)  {
        return this.entryPointService.getUserById(id);
    }

}
