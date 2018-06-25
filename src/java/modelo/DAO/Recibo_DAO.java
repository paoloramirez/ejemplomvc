/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.DAO;

import java.util.List;
import modelo.Entity.Recibo;

/**
 *
 * @author bash
 */
public interface Recibo_DAO {
    
    void saveRecibo(Recibo recibo);
    //void deleteById(int id_objeto);
    //void update(Objeto objeto);
    List<Recibo> findAllRecibos();
    Recibo findById(int id_recibo);
    Recibo findByName(String name);
}
