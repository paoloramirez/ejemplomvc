/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.DAO;
import java.util.List;
import modelo.Entity.Bebida;

/**
 *
 * @author bash
 */
public interface Bebida_DAO {
    
    void saveBebida(Bebida bebida);
    //void deleteBebidaById(int idBeb);
    //void updateBebida(Bebida bebida);
    List<Bebida> findAllBebidas();
    Bebida findById(int idBeb);
    Bebida findByName(String name);
    
}
