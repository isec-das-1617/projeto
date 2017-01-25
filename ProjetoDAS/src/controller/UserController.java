package controller;

import java.util.ArrayList;
import java.util.List;
import model.User;

public class UserController {

    private static List<User> users;

    public UserController() {
        this.users =  new ArrayList<>();
    }

    public boolean addUser(User u) {
        for (User us : users) {
            if (us.getUsername().equals(u.getUsername())) {
                return false;
            }
        }
        users.add(u);
        return true;
    }

}
