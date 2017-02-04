/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.SQLException;

/**
 *
 * @author diogo
 */
public class FacadeController {
    private final UserController uc;

    public FacadeController() throws ClassNotFoundException, SQLException {
        this.uc = new UserController();
    }

    public UserController getUc() {
        return uc;
    }
    
    
}
