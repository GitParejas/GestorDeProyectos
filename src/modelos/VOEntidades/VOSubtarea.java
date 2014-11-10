
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

    /**
     *
     * @return
     */
    public int getId_subtarea() {
        return id_subtarea;
    }

    /**
     *
     * @return
     */
    public int getId_tarea() {
        return id_tarea;
    }

    /**
     *
     * @return
     */
    public int getId_proyecto() {
        return id_proyecto;
    }

    /**
     *
     * @return
     */
    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    /**
     *
     * @return
     */
    public String getNombre_subtarea() {
        return nombre_subtarea;
    }

    /**
     *
     * @return
     */
    public String getDescripcion_subtarea() {
        return descripcion_subtarea;
    }

    /**
     *
     * @return
     */
    public int getPorcentaje_realizado() {
        return porcentaje_realizado;
    }

    /**
     *
     * @return
     */
    public int getDuracion_estimada() {
        return duracion_estimada;
    }

    /**
     *
     * @return
     */
    public int getId_estado() {
        return id_estado;
    }

    /**
     *
     * @param id_subtarea
     */
    public void setId_subtarea(int id_subtarea) {
        this.id_subtarea = id_subtarea;
    }

    /**
     *
     * @param id_tarea
     */
    public void setId_tarea(int id_tarea) {
        this.id_tarea = id_tarea;
    }

    /**
     *
     * @param id_proyecto
     */
    public void setId_proyecto(int id_proyecto) {
        this.id_proyecto = id_proyecto;
    }

    /**
     *
     * @param fecha_inicio
     */
    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    /**
     *
     * @param nombre_subtarea
     */
    public void setNombre_subtarea(String nombre_subtarea) {
        this.nombre_subtarea = nombre_subtarea;
    }

    /**
     *
     * @param descripcion_subtarea
     */
    public void setDescripcion_subtarea(String descripcion_subtarea) {
        this.descripcion_subtarea = descripcion_subtarea;
    }

    /**
     *
     * @param porcentaje_realizado
     */
    public void setPorcentaje_realizado(int porcentaje_realizado) {
        this.porcentaje_realizado = porcentaje_realizado;
    }

    /**
     *
     * @param duracion_estimada
     */
    public void setDuracion_estimada(int duracion_estimada) {
        this.duracion_estimada = duracion_estimada;
    }

    /**
     *
     * @param id_estado
     */
    public void setId_estado(int id_estado) {
        this.id_estado = id_estado;
    }
    
    
}
