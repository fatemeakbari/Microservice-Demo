package ir.threegam.userservice.repository;

import ir.threegam.userservice.repository.db.UserDB;
import ir.threegam.userservice.repository.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {


    UserDB userDB = UserDB.getInstance();
    public List<User> getUsers(){
        return userDB.users;
    }

    public User findUserById(int id){

        return userDB.users.stream().
                filter(user -> user.getId()==id).findFirst().orElse(null);
    }
}
