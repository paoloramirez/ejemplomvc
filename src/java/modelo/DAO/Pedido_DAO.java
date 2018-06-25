/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.DAO;

import java.util.List;
import modelo.Entity.Pedido;

/**
 *
 * @author bash
 */
public interface Pedido_DAO {
    
    void savePedido(Pedido pedido);
    //void deleteById(int id_objeto);
    //void update(Objeto objeto);
    List<Pedido> findAllPedidos();
    Pedido findById(int id_pedido);
    Pedido findByName(String name);
}
