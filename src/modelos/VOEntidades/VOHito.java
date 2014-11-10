
package modelos.VOEntidades;

import java.util.Date;

/**
 *
 * @author Juan José Cánovas Bustamante
 * @author Rafael Iván Linares Molina
 */
public class VOHito {
    private int id_hito;
    private int id_proyecto;
    private Date fecha_reunion;
    private boolean urgente;
    private String nombre;
    private String descripcion;

    public int getId_hito() {
        return id_hito;
    }

    public int getId_proyecto() {
        return id_proyecto;
    }

    public Date getFecha_reunion() {
        return fecha_reunion;
    }

    public boolean isUrgente() {
        return urgente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setId_hito(int id_hito) {
        this.id_hito = id_hito;
    }

    public void setId_proyecto(int id_proyecto) {
        this.id_proyecto = id_proyecto;
    }

    public void setFecha_reunion(Date fecha_reunion) {
        this.fecha_reunion = fecha_reunion;
    }

    public void setUrgente(boolean urgente) {
        this.urgente = urgente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
