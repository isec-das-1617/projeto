package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.User;

public class UserController {

    private final CRUDUser users;
    private User currentUser;
    
    private final FacadeBD fbd;
       

    public UserController() throws ClassNotFoundException, SQLException { 
        this.fbd =  new FacadeBD();
        users =  FacadeBD.getUsers();
    }
    
    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(String u) {
        User us = FacadeBD.getUsers().read(u);
        if (us==null){
           us = new User(1,"ERRO");
        }
        this.currentUser = us;
    }
    
    public boolean addUser(String u) {
        User us = FacadeBD.getUsers().read(u);
        if (us==null){
                FacadeBD.getUsers().create(u);
               return false;
        }
        return true;
    }

}
