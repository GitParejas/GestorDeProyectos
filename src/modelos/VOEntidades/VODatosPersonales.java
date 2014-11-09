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

    public int getId_datos() {
        return id_datos;
    }

    public int getId_titulo() {
        return id_titulo;
    }

    public int getId_horario() {
        return id_horario;
    }

    public String getDni() {
        return dni;
    }

    public String getNss() {
        return nss;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }
    
    public Date getFecha_alta_sistema() {
        return fecha_alta_sistema;
    }

    public int getHoras_jornada_diaria() {
        return horas_jornada_diaria;
    }

    public void setId_datos(int id_datos) {
        this.id_datos = id_datos;
    }

    public void setId_titulo(int id_titulo) {
        this.id_titulo = id_titulo;
    }
    
    public void setId_horario(int id_horario) {
        this.id_horario = id_horario;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNss(String nss) {
        this.nss = nss;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public void setFecha_alta_sistema(Date fecha_alta_sistema) {
        this.fecha_alta_sistema = fecha_alta_sistema;
    }

    public void setHoras_jornada_diaria(int horas_jornada_diaria) {
        this.horas_jornada_diaria = horas_jornada_diaria;
    }
    
    
}
