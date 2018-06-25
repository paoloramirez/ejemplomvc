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
public class Hamburguesa {
    
    private int id_ham;
    private String nombre;
    private float precio;
    
    public Hamburguesa(){
        
    }

    /**
     * @return the id_ham
     */
    public int getId_ham() {
        return id_ham;
    }

    /**
     * @param id_ham the id_ham to set
     */
    public void setId_ham(int id_ham) {
        this.id_ham = id_ham;
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
