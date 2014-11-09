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
public class VOSubtarea {
    private int id_subtarea;
    private int id_tarea;
    private int id_proyecto;
    private Date fecha_inicio;
    private String nombre_subtarea;
    private String descripcion_subtarea;
    private int porcentaje_realizado;
    private int duracion_estimada;
    private int id_estado;

    public int getId_subtarea() {
        return id_subtarea;
    }
    
    
}
