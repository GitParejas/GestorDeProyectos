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
public class VOImputacionHoraria {
    private int id_proyecto;
    private int id_usuario;
    private int id_tarea;
    private int id_subtarea;
    private int horas_imputadas;
    private Date fecha_asignacion_trabajador;

    public int getId_proyecto() {
        return id_proyecto;
    }

    public int getId_usuario() {
        return id_usuario;
    }
    
    public int getId_tarea() {
        return id_tarea;
    }

    public int getId_subtarea() {
        return id_subtarea;
    }

    public int getHoras_imputadas() {
        return horas_imputadas;
    }

    public Date getFecha_asignacion_trabajador() {
        return fecha_asignacion_trabajador;
    }

    public void setId_proyecto(int id_proyecto) {
        this.id_proyecto = id_proyecto;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public void setId_tarea(int id_tarea) {
        this.id_tarea = id_tarea;
    }

    public void setId_subtarea(int id_subtarea) {
        this.id_subtarea = id_subtarea;
    }

    public void setHoras_imputadas(int horas_imputadas) {
        this.horas_imputadas = horas_imputadas;
    }

    public void setFecha_asignacion_trabajador(Date fecha_asignacion_trabajador) {
        this.fecha_asignacion_trabajador = fecha_asignacion_trabajador;
    }
    
    
}
