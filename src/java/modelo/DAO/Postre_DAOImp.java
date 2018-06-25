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
        String sql = "select * from postre";
        List<Postre> list = new ArrayList<>();
        
        try {
            Connection con = conexion.getConnection();
            PreparedStatement pr;
            ResultSet rs;
            pr = con.prepareStatement(sql);
            
            rs = pr.executeQuery();
            
            while ( rs.next())
            {
                Postre prod = new Postre();
                prod.setId_pos(rs.getInt(1));
                prod.setNombre(rs.getString(2));
                prod.setPrecio(rs.getFloat(3));
                
                list.add(prod);
            }
            
            
        } catch(Exception ev) {
            System.out.println(ev.toString());
        }
        
        return list;
    }

    @Override
    public Postre findById(int id_pos) {
         String sql = "select * from bebida where id_pos="+id_pos;
        Postre prod = new Postre();
        
        try {
            Connection con = conexion.getConnection();
            PreparedStatement pr;
            ResultSet rs;
            pr = con.prepareStatement(sql);
            
            rs = pr.executeQuery();
            
            while ( rs.next())
            {
                prod.setId_pos(rs.getInt(1));
                prod.setNombre(rs.getString(2));
                prod.setPrecio(rs.getFloat(3));
            }
            
            
        } catch(Exception ev) {
            System.out.println(ev.toString());
        }
        
        return prod;
    }

    @Override
    public Postre findByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
