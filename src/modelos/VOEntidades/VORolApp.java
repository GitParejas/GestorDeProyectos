
package modelos.VOEntidades;

/**
 *
 * @author Juan José Cánovas Bustamante
 * @author Rafael Iván Linares Molina
 */
public class VORolApp {
    private int id_rol_app;
    private String rol_descripcion;

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
    public String getRol_descripcion() {
        return rol_descripcion;
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
     * @param rol_descripcion
     */
    public void setRol_descripcion(String rol_descripcion) {
        this.rol_descripcion = rol_descripcion;
    }
    
    
}
