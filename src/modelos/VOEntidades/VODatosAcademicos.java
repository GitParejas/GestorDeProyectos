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
public class VODatosAcademicos {
    private int id_titulo;
    private String nombre;
    private String descripcion;
    private String competencias;
    private float salario_titulo;

    public int getId_titulo() {
        return id_titulo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getCompetencias() {
        return competencias;
    }

    public float getSalario_titulo() {
        return salario_titulo;
    }

    public void setId_titulo(int id_titulo) {
        this.id_titulo = id_titulo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCompetencias(String competencias) {
        this.competencias = competencias;
    }

    public void setSalario_titulo(float salario_titulo) {
        this.salario_titulo = salario_titulo;
    }
    
}
