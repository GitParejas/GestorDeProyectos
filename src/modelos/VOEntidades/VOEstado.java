/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos.VOEntidades;

/**
 *
 * @author Juan José Cánovas Bustamante
 * @author Rafael Iván Linares Molina
 */
public class VOEstado {
    private int id_estado;
    private String nombre;

    public int getId_estado() {
        return id_estado;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setId_estado(int id_estado) {
        this.id_estado = id_estado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
