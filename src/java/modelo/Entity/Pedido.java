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
public class Pedido {

    private int id_pedido;
    private float preciot;
    private int id_ham;
    private int cantidad_h;
    private int id_beb;
    private int cantidad_b;
    private int id_pos;
    private int cantidad_p;
    
    public Pedido(){
        
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
     * @return the preciot
     */
    public float getPreciot() {
        return preciot;
    }

    /**
     * @param preciot the preciot to set
     */
    public void setPreciot(float preciot) {
        this.preciot = preciot;
    }
    
    /**
     * @return the cantidad_h
     */
    public int getCantidad_h() {
        return cantidad_h;
    }

    /**
     * @param cantidad_h the cantidad_h to set
     */
    public void setCantidad_h(int cantidad_h) {
        this.cantidad_h = cantidad_h;
    }

    /**
     * @return the cantidad_b
     */
    public int getCantidad_b() {
        return cantidad_b;
    }

    /**
     * @param cantidad_b the cantidad_b to set
     */
    public void setCantidad_b(int cantidad_b) {
        this.cantidad_b = cantidad_b;
    }

    /**
     * @return the cantidad_p
     */
    public int getCantidad_p() {
        return cantidad_p;
    }

    /**
     * @param cantidad_p the cantidad_p to set
     */
    public void setCantidad_p(int cantidad_p) {
        this.cantidad_p = cantidad_p;
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
     * @return the id_beb
     */
    public int getId_beb() {
        return id_beb;
    }

    /**
     * @param id_beb the id_beb to set
     */
    public void setId_beb(int id_beb) {
        this.id_beb = id_beb;
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
    
}
