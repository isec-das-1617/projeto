
package model;

public class User extends Entidade {
    private int id;
    private String username;
    
    public User(int i,String username) {
        this.id = i;
        this.username = username;
        
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }
    
    
}
