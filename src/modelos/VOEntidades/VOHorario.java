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
public class VOHorario {
    private int id_horario;
    private Date fecha_inicio_vacaciones;
    private Date fecha_fin_vacaciones;

    public int getId_horario() {
        return id_horario;
    }

    public Date getFecha_inicio_vacaciones() {
        return fecha_inicio_vacaciones;
    }

    public Date getFecha_fin_vacaciones() {
        return fecha_fin_vacaciones;
    }

    public void setId_horario(int id_horario) {
        this.id_horario = id_horario;
    }

    public void setFecha_inicio_vacaciones(Date fecha_inicio_vacaciones) {
        this.fecha_inicio_vacaciones = fecha_inicio_vacaciones;
    }

    public void setFecha_fin_vacaciones(Date fecha_fin_vacaciones) {
        this.fecha_fin_vacaciones = fecha_fin_vacaciones;
    }
    
    
}
