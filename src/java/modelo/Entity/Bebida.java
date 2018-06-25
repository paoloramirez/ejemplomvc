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
public class Bebida {
    
    private int idBeb;
    private String nombre;
    private Float precio;
    
    public Bebida(){
        
    }

    public int getIdBeb() {
    return idBeb;
    }

    public void setIdBeb(int idBeb) {
    this.idBeb = idBeb;
    }

    public String getNombre() {
    return nombre;
    }

    public void setNombre(String nombre) {
    this.nombre = nombre;
    }

    public Float getPrecio() {
    return precio;
    }

    public void setPrecio(Float precio) {
    this.precio = precio;
    }
}
