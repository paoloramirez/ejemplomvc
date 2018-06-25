/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.Entity;

/**
 *
 * @author bash
 */
public class Usuario {
    private String nombre;
    private int dni;
    
    public Usuario(){
        
    }
    
    public Usuario(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    /*
     Metodos get y set
    */

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    
}
