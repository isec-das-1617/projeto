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
public class FacadeBD {

    private static CRUDUser users;

    public FacadeBD() throws ClassNotFoundException, SQLException {
        this.users = new CRUDUser();
    }

    public static CRUDUser getUsers() {
        return users;
    }
}
