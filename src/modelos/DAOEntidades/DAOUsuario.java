/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos.DAOEntidades;

/**
 *
 * @author Juan José Cánovas Bustamante
 * @author Rafael Iván Linares Molina
 */
public class DAOUsuario {
    private int id_usuario;
    private int id_rol_app;
    private String usuario;
    private String contraseña;
    private int id_datos;

    public int getId_usuario() {
        return id_usuario;
    }

    public int getId_rol_app() {
        return id_rol_app;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public int getId_datos() {
        return id_datos;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public void setId_rol_app(int id_rol_app) {
        this.id_rol_app = id_rol_app;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setId_datos(int id_datos) {
        this.id_datos = id_datos;
    }
    
}
