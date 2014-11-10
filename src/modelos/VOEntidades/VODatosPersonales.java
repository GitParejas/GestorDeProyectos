
package modelos.VOEntidades;

import java.util.Date;

/**
 *
 * @author Juan José Cánovas Bustamante
 * @author Rafael Iván Linares Molina
 */
public class VODatosPersonales {
    private int id_datos;
    private int id_titulo;
    private int id_horario;
    private String dni;
    private String nss;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String telefono;
    private String correo;
    private Date fecha_nacimiento;
    private Date fecha_alta_sistema;
    private int horas_jornada_diaria;

    /**
     *
     * @return
     */
    public int getId_datos() {
        return id_datos;
    }

    /**
     *
     * @return
     */
    public int getId_titulo() {
        return id_titulo;
    }

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
    public String getDni() {
        return dni;
    }

    /**
     *
     * @return
     */
    public String getNss() {
        return nss;
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @return
     */
    public String getApellido1() {
        return apellido1;
    }

    /**
     *
     * @return
     */
    public String getApellido2() {
        return apellido2;
    }

    /**
     *
     * @return
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     *
     * @return
     */
    public String getCorreo() {
        return correo;
    }

    /**
     *
     * @return
     */
    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }
    
    /**
     *
     * @return
     */
    public Date getFecha_alta_sistema() {
        return fecha_alta_sistema;
    }

    /**
     *
     * @return
     */
    public int getHoras_jornada_diaria() {
        return horas_jornada_diaria;
    }

    /**
     *
     * @param id_datos
     */
    public void setId_datos(int id_datos) {
        this.id_datos = id_datos;
    }

    /**
     *
     * @param id_titulo
     */
    public void setId_titulo(int id_titulo) {
        this.id_titulo = id_titulo;
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
     * @param dni
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     *
     * @param nss
     */
    public void setNss(String nss) {
        this.nss = nss;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @param apellido1
     */
    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    /**
     *
     * @param apellido2
     */
    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    /**
     *
     * @param telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     *
     * @param correo
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     *
     * @param fecha_nacimiento
     */
    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    /**
     *
     * @param fecha_alta_sistema
     */
    public void setFecha_alta_sistema(Date fecha_alta_sistema) {
        this.fecha_alta_sistema = fecha_alta_sistema;
    }

    /**
     *
     * @param horas_jornada_diaria
     */
    public void setHoras_jornada_diaria(int horas_jornada_diaria) {
        this.horas_jornada_diaria = horas_jornada_diaria;
    }
    
    
}
