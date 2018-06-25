/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.Entity;

import java.sql.Date;

/**
 *
 * @author bash
 */
public class Recibo {
    
    private int id_recibo;
    private int id_pedido;
    private int dni_usuario;
    private float costo;
    private float igv;
    private Date fecha;
    
    public Recibo(){
        
    }
    
    /**
     * @return the id_recibo
     */
    public int getId_recibo() {
        return id_recibo;
    }

    /**
     * @param id_recibo the id_recibo to set
     */
    public void setId_recibo(int id_recibo) {
        this.id_recibo = id_recibo;
    }

    /**
     * @return the id_pedido
     */
    public int getId_pedido() {
        return id_pedido;
    }

    /**
     * @param id_pedido the id_pedido to set
     */
    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    /**
     * @return the dni_usuario
     */
    public int getDni_usuario() {
        return dni_usuario;
    }

    /**
     * @param dni_usuario the dni_usuario to set
     */
    public void setDni_usuario(int dni_usuario) {
        this.dni_usuario = dni_usuario;
    }

    /**
     * @return the costo
     */
    public float getCosto() {
        return costo;
    }

    /**
     * @param costo the costo to set
     */
    public void setCosto(float costo) {
        this.costo = costo;
    }

    /**
     * @return the igv
     */
    public float getIgv() {
        return igv;
    }

    /**
     * @param igv the igv to set
     */
    public void setIgv(float igv) {
        this.igv = igv;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
}
