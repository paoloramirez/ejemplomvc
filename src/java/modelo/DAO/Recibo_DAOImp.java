/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.DAO;

import java.util.List;
import modelo.Conexion;
import modelo.Entity.Recibo;

/**
 *
 * @author bash
 */
public class Recibo_DAOImp implements Recibo_DAO{
    
    private Conexion con;
    
    public Recibo_DAOImp(){
        con = new Conexion();
    }

    @Override
    public void saveRecibo(Recibo recibo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Recibo> findAllRecibos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Recibo findById(int id_recibo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Recibo findByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
