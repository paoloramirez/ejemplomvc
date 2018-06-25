/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.DAO;

import java.util.List;
import modelo.Entity.Postre;

/**
 *
 * @author bash
 */
public interface Postre_DAO {
    
    void savePostre(Postre postre);
    //void deleteById(int id_objeto);
    //void update(Objeto objeto);
    List<Postre> findAllPostres();
    Postre findById(int id_pos);
    Postre findByName(String name);
}
