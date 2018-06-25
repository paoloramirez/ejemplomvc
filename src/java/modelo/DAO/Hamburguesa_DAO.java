/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.DAO;

import java.util.List;
import modelo.Entity.Hamburguesa;

/**
 *
 * @author bash
 */
public interface Hamburguesa_DAO {
    
    void saveHamburguesa(Hamburguesa hamburguesa);
    //void deleteById(int id_objeto);
    //void update(Objeto objeto);
    List<Hamburguesa> findAllHamburguesas();
    Hamburguesa findById(int id_ham);
    Hamburguesa findByName(String name);
    
}
