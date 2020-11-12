package ir.threegam.userservice.controller;


import ir.threegam.userservice.repository.UserRepository;
import ir.threegam.userservice.repository.model.User;
import ir.threegam.userservice.repository.model.UserList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {


    @Autowired
    private UserRepository userRepository;

    @RequestMapping
    public UserList getUsers(){
        return new UserList(userRepository.getUsers());
    }

    @RequestMapping("/{userId}")
    public User findUserById(@PathVariable int userId){
            return userRepository.findUserById(userId);
    }



}
