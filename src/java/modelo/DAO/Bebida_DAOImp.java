/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Conexion;
import modelo.Entity.Bebida;

/**
 *
 * @author bash
 */
public class Bebida_DAOImp implements Bebida_DAO {
    
    private Conexion conexion;
    
    public Bebida_DAOImp(){
        conexion = new Conexion();
    }

    @Override
    public void saveBebida(Bebida bebida) {
        String sql = "BEGIN\n"
                + "INSERTAR_BEBIDA(?,?,?);\n"
                + "END;";
        
        try {
            Connection con = conexion.getConnection();
            PreparedStatement pr=null;
            ResultSet rs=null;
            pr = con.prepareStatement(sql);
            pr.setInt(1,bebida.getIdBeb());
            pr.setString(2,bebida.getNombre());
            pr.setFloat(3,bebida.getPrecio());
            
            pr.executeUpdate();
            
        } catch(Exception ev) {
            System.out.println(ev.toString());
        }
    }

    @Override
    public List<Bebida> findAllBebidas() {
        String sql = "select * from bebida";
        List<Bebida> list = new ArrayList<>();
        
        try {
            Connection con = conexion.getConnection();
            PreparedStatement pr;
            ResultSet rs;
            pr = con.prepareStatement(sql);
            
            rs = pr.executeQuery();
            
            while ( rs.next())
            {
                Bebida bebida = new Bebida();
                bebida.setIdBeb(rs.getInt(1));
                bebida.setNombre(rs.getString(2));
                bebida.setPrecio(rs.getFloat(3));
                
                list.add(bebida);
            }
            
            
        } catch(Exception ev) {
            System.out.println(ev.toString());
        }
        
        return list;
    }

    @Override
    public Bebida findById(int idBeb) {
        String sql = "select * from bebida where idBeb="+idBeb;
        Bebida bebida = new Bebida();
        
        try {
            Connection con = conexion.getConnection();
            PreparedStatement pr;
            ResultSet rs;
            pr = con.prepareStatement(sql);
            
            rs = pr.executeQuery();
            
            while ( rs.next())
            {
                bebida.setIdBeb(rs.getInt(1));
                bebida.setNombre(rs.getString(2));
                bebida.setPrecio(rs.getFloat(3));
            }
            
            
        } catch(Exception ev) {
            System.out.println(ev.toString());
        }
        
        return bebida;
    }

    @Override
    public Bebida findByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
