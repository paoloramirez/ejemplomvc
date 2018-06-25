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
import modelo.Entity.Pedido;

/**
 *
 * @author bash
 */
public class Pedido_DAOImp implements Pedido_DAO{
    
    private Conexion conexion;
    
    public Pedido_DAOImp(){
        conexion = new Conexion();
    }

    @Override
    public void savePedido(Pedido pedido) {
        String sql = "BEGIN\n"
                + "INSERTAR_PEDIDO(?,?,?,?,?,?,?);\n"
                + "END;";
        
        try {
            Connection con = conexion.getConnection();
            PreparedStatement pr=null;
            ResultSet rs=null;
            pr = con.prepareStatement(sql);
            pr.setInt(1,pedido.getId_ham());
            pr.setInt(2,pedido.getCantidad_h());
            pr.setInt(3,pedido.getId_beb());
            pr.setInt(4,pedido.getCantidad_b());
            pr.setInt(5,pedido.getId_pos());
            pr.setInt(6,pedido.getCantidad_p());
            pr.setFloat(7,pedido.getPreciot());
            
            pr.executeUpdate();
            
        } catch(Exception ev) {
            System.out.println(ev.toString());
        }
    }

    @Override
    public List<Pedido> findAllPedidos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pedido findById(int id_pedido) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pedido findByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
