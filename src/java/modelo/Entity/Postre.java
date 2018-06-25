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
public class Postre {
    
    private int id_pos;
    private String nombre;
    private float precio;
    
    public Postre(){
        
    }

    /**
     * @return the id_pos
     */
    public int getId_pos() {
        return id_pos;
    }

    /**
     * @param id_pos the id_pos to set
     */
    public void setId_pos(int id_pos) {
        this.id_pos = id_pos;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the precio
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
}
