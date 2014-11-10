
package modelos.VOEntidades;

import java.util.Date;

/**
 *
 * @author Juan José Cánovas Bustamante
 * @author Rafael Iván Linares Molina
 */
public class VOProyecto {
    private int id_proyecto;
    private int id_jefe_proyecto;
    private int id_cliente;
    private String nombre_proyecto;
    private String descripcion;
    private String fecha_inicio;
    private String fecha_final_pactada;
    private String fecha_final_calculada;
    private int id_estado;

    public int getId_proyecto() {
        return id_proyecto;
    }

    public int getId_jefe_proyecto() {
        return id_jefe_proyecto;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public String getNombre_proyecto() {
        return nombre_proyecto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public String getFecha_final_pactada() {
        return fecha_final_pactada;
    }

    public String getFecha_final_calculada() {
        return fecha_final_calculada;
    }

    public int getId_estado() {
        return id_estado;
    }

    public void setId_proyecto(int id_proyecto) {
        this.id_proyecto = id_proyecto;
    }

    public void setId_jefe_proyecto(int id_jefe_proyecto) {
        this.id_jefe_proyecto = id_jefe_proyecto;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public void setNombre_proyecto(String nombre_proyecto) {
        this.nombre_proyecto = nombre_proyecto;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public void setFecha_final_pactada(String fecha_final_pactada) {
        this.fecha_final_pactada = fecha_final_pactada;
    }

    public void setFecha_final_calculada(String fecha_final_calculada) {
        this.fecha_final_calculada = fecha_final_calculada;
    }

    public void setId_estado(int id_estado) {
        this.id_estado = id_estado;
    }
    
    
}
