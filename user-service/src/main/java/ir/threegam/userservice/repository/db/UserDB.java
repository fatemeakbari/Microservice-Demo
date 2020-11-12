package ir.threegam.userservice.repository.db;

import ir.threegam.userservice.repository.model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserDB {


    private static UserDB userDB = null;
    public List<User> users;

    public UserDB() {

        users = Arrays.asList(
                new User(1,"Fateme Akbari","fateme@gmail.com"),
                new User(2,"Maryam Sohrabi","maryam@gmail.com"),
                new User(3,"Sara Amiri","sara@gmail.com")
                );
    }

    public static UserDB getInstance()
    {
        if (userDB == null)
            userDB = new UserDB();

        return userDB;
    }
}
