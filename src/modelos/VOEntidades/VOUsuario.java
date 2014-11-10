
package modelos.VOEntidades;

/**
 *
 * @author Juan José Cánovas Bustamante
 * @author Rafael Iván Linares Molina
 */
public class VOUsuario {
    private int id_usuario;
    private int id_rol_app;
    private String usuario;
    private String contraseña;
    private int id_datos;

    /**
     *
     * @return
     */
    public int getId_usuario() {
        return id_usuario;
    }

    /**
     *
     * @return
     */
    public int getId_rol_app() {
        return id_rol_app;
    }

    /**
     *
     * @return
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     *
     * @return
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     *
     * @return
     */
    public int getId_datos() {
        return id_datos;
    }

    /**
     *
     * @param id_usuario
     */
    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    /**
     *
     * @param id_rol_app
     */
    public void setId_rol_app(int id_rol_app) {
        this.id_rol_app = id_rol_app;
    }

    /**
     *
     * @param usuario
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     *
     * @param contraseña
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    /**
     *
     * @param id_datos
     */
    public void setId_datos(int id_datos) {
        this.id_datos = id_datos;
    }
    
}
