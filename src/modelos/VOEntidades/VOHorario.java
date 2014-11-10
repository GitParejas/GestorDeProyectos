
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

    /**
     *
     * @return
     */
    public int getId_horario() {
        return id_horario;
    }

    /**
     *
     * @return
     */
    public Date getFecha_inicio_vacaciones() {
        return fecha_inicio_vacaciones;
    }

    /**
     *
     * @return
     */
    public Date getFecha_fin_vacaciones() {
        return fecha_fin_vacaciones;
    }

    /**
     *
     * @param id_horario
     */
    public void setId_horario(int id_horario) {
        this.id_horario = id_horario;
    }

    /**
     *
     * @param fecha_inicio_vacaciones
     */
    public void setFecha_inicio_vacaciones(Date fecha_inicio_vacaciones) {
        this.fecha_inicio_vacaciones = fecha_inicio_vacaciones;
    }

    /**
     *
     * @param fecha_fin_vacaciones
     */
    public void setFecha_fin_vacaciones(Date fecha_fin_vacaciones) {
        this.fecha_fin_vacaciones = fecha_fin_vacaciones;
    }
    
    
}
