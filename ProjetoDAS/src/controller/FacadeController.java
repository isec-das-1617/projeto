/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author diogo
 */
public class FacadeController {
    UserController uc;

    public FacadeController() {
        this.uc = new UserController();
    }

    public UserController getUc() {
        return uc;
    }
    
    
}
