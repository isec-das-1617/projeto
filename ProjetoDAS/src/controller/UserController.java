package controller;

import java.util.ArrayList;
import java.util.List;
import model.User;

public class UserController {

    private static List<User> users;
    private User currentUser;

    public UserController() {
        this.users =  new ArrayList<>();
    }
    
    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
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
