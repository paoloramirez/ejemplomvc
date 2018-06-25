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
import modelo.Entity.Postre;

/**
 *
 * @author bash
 */
public class Postre_DAOImp implements Postre_DAO{
    
    private Conexion conexion;
    
    public Postre_DAOImp(){
        conexion = new Conexion();
    }

    @Override
    public void savePostre(Postre postre) {
        String sql = "BEGIN\n"
                + "INSERTAR_POSTRE(?,?,?);\n"
                + "END;";
        
        try {
            Connection con = conexion.getConnection();
            PreparedStatement pr=null;
            ResultSet rs=null;
            pr = con.prepareStatement(sql);
            pr.setInt(1,postre.getId_pos());
            pr.setString(2,postre.getNombre());
            pr.setFloat(3,postre.getPrecio());
            
            pr.executeUpdate();
            
        } catch(Exception ev) {
            System.out.println(ev.toString());
        }
    }

    @Override
    public List<Postre> findAllPostres() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Postre findById(int id_pos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Postre findByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
