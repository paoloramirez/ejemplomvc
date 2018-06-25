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
import modelo.Entity.Usuario;

/**
 *
 * @author bash
 */
public class Usuario_DAOImp implements Usuario_DAO{

    private Conexion conexion;
    
    public Usuario_DAOImp() {
        conexion = new Conexion();
    }
    
    @Override
    public void saveUsuario(Usuario usuario) {
        String sql = "BEGIN\n"
                + "INSERTAR_USUARIO(?,?);\n"
                + "END;";
        
        try {
            Connection con = conexion.getConnection();
            PreparedStatement pr=null;
            ResultSet rs=null;
            pr = con.prepareStatement(sql);
            pr.setInt(1,usuario.getDni());
            pr.setString(2,usuario.getNombre());
            
            
            pr.executeUpdate();
            
        } catch(Exception ev) {
            System.out.println(ev.toString());
        }
    }

    @Override
    public List<Usuario> findAllUsuarios() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario findById(int dni) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario findByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
