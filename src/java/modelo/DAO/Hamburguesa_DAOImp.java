/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import modelo.Conexion;
import modelo.Entity.Hamburguesa;

/**
 *
 * @author bash
 */
public class Hamburguesa_DAOImp implements Hamburguesa_DAO{
    
    private Conexion conexion;
    
    public Hamburguesa_DAOImp(){
        conexion = new Conexion();
    }

    @Override
    public void saveHamburguesa(Hamburguesa hamburguesa) {
        String sql = "BEGIN\n"
                + "INSERTAR_HAMBURGUESA(?,?,?);\n"
                + "END;";
        
        try {
            Connection con = conexion.getConnection();
            PreparedStatement pr=null;
            ResultSet rs=null;
            pr = con.prepareStatement(sql);
            pr.setInt(1,hamburguesa.getId_ham());
            pr.setString(2,hamburguesa.getNombre());
            pr.setFloat(3,hamburguesa.getPrecio());
            
            pr.executeUpdate();
            
        } catch(Exception ev) {
            System.out.println(ev.toString());
        }
    }

    @Override
    public List<Hamburguesa> findAllHamburguesas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Hamburguesa findById(int id_ham) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Hamburguesa findByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
