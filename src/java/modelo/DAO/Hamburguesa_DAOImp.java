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
        String sql = "select * from hamburguesa";
        List<Hamburguesa> list = new ArrayList<>();
        
        try {
            Connection con = conexion.getConnection();
            PreparedStatement pr;
            ResultSet rs;
            pr = con.prepareStatement(sql);
            
            rs = pr.executeQuery();
            
            while ( rs.next())
            {
                Hamburguesa prod = new Hamburguesa();
                prod.setId_ham(rs.getInt(1));
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
    public Hamburguesa findById(int id_ham) {
        String sql = "select * from bebida where id_ham="+id_ham;
        Hamburguesa prod = new Hamburguesa();
        
        try {
            Connection con = conexion.getConnection();
            PreparedStatement pr;
            ResultSet rs;
            pr = con.prepareStatement(sql);
            
            rs = pr.executeQuery();
            
            while ( rs.next())
            {
                prod.setId_ham(rs.getInt(1));
                prod.setNombre(rs.getString(2));
                prod.setPrecio(rs.getFloat(3));
            }
            
            
        } catch(Exception ev) {
            System.out.println(ev.toString());
        }
        
        return prod;
    }

    @Override
    public Hamburguesa findByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
