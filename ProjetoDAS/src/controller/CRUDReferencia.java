/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import model.Entidade;
import model.User;

/**
 *
 * @author diogo
 */
public class CRUDReferencia extends LigacaoBD implements ICRUD {

    private static int id;

    public CRUDReferencia() throws ClassNotFoundException, SQLException {
        super();
        //statement.executeUpdate("drop table if exists users");
        //statement.executeUpdate("create table users (id integer, name string)");
        ResultSet rs = statement.executeQuery("select max (id) as id from referencias");
        while (rs.next()) {
            // read the result set
            this.id = rs.getInt("id");
        }

    }

    @Override
    public void create(String dado) {
        try {
            this.id++;
            statement.executeUpdate("insert into users referencias(" + this.id + ", '" + dado + "')");

        } catch (SQLException ex) {
            // Logger.getLogger(CRUDChamadas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public User read(String u) {
        User ru = null;
        try {
            ResultSet rs = statement.executeQuery("select * from users where name ='" + u + "'");
            while (rs.next()) {
                String name = rs.getString("name");
                ru = new User(199, name);
            }
        } catch (SQLException ex) {
            // Logger.getLogger(CRUDChamadas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ru;
    }

    @Override
    public void update(int id, String dado) {
        try {
            statement.executeUpdate("update users set nome='" + dado + "' where id=" + id);
        } catch (SQLException ex) {
            //Logger.getLogger(CRUDClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(int id) {
        try {
            statement.executeUpdate("delete users where id=" + id);
        } catch (SQLException ex) {
            // Logger.getLogger(CRUDClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Entidade> getAll() {
        List<Entidade> lista = new ArrayList<>();
        try {
            ResultSet rs = statement.executeQuery("select * from users");
            while (rs.next()) {
                int i = rs.getInt("id");
                String str = rs.getString("nome");
                User user = new User(i, str);
                lista.add(user);
            }

        } catch (SQLException ex) {
            // Logger.getLogger(CRUDClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

}
