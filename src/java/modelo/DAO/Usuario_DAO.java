/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.DAO;

import java.util.List;
import modelo.Entity.Usuario;

/**
 *
 * @author bash
 */
public interface Usuario_DAO {
    
    void saveUsuario(Usuario usuario);
    //void deleteById(int id_objeto);
    //void update(Objeto objeto);
    List<Usuario> findAllUsuarios();
    Usuario findById(int dni);
    Usuario findByName(String name);
    
}
