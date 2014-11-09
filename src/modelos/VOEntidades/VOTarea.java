/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos.VOEntidades;

import java.util.Date;

/**
 *
 * @author Juan José Cánovas Bustamante
 * @author Rafael Iván Linares Molina
 */
public class VOTarea {
    private int id_tarea;
    private int id_proyecto;
    private Date fecha_inicio;
    private String nombre_tarea;
    private String descripcion_tarea;
    private int porcentaje_realizado;
    private int duracion_estimada;
    private int id_estado;

    public int getId_tarea() {
        return id_tarea;
    }

    public int getId_proyecto() {
        return id_proyecto;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public String getNombre_tarea() {
        return nombre_tarea;
    }

    public String getDescripcion_tarea() {
        return descripcion_tarea;
    }

    public int getPorcentaje_realizado() {
        return porcentaje_realizado;
    }

    public int getDuracion_estimada() {
        return duracion_estimada;
    }

    public int getId_estado() {
        return id_estado;
    }

    public void setId_tarea(int id_tarea) {
        this.id_tarea = id_tarea;
    }

    public void setId_proyecto(int id_proyecto) {
        this.id_proyecto = id_proyecto;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public void setNombre_tarea(String nombre_tarea) {
        this.nombre_tarea = nombre_tarea;
    }

    public void setDescripcion_tarea(String descripcion_tarea) {
        this.descripcion_tarea = descripcion_tarea;
    }

    public void setPorcentaje_realizado(int porcentaje_realizado) {
        this.porcentaje_realizado = porcentaje_realizado;
    }

    public void setDuracion_estimada(int duracion_estimada) {
        this.duracion_estimada = duracion_estimada;
    }

    public void setId_estado(int id_estado) {
        this.id_estado = id_estado;
    }
    
    
}
