/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import model.Entidade;

/**
 *
 * @author diogo
 */
public interface ICRUD {
    void create(String dado);
    Entidade read(String dado);
    void update(int id,String dado);
    void delete(int id);
    List<Entidade> getAll();
}
