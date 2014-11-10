
package modelos.VOEntidades;

/**
 *
 * @author Juan José Cánovas Bustamante
 * @author Rafael Iván Linares Molina
 */
public class VOUsuarioTrabaja {
    private int id_usuario;
    private int id_proyecto;
    private int id_rol;

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
    public int getId_proyecto() {
        return id_proyecto;
    }

    /**
     *
     * @return
     */
    public int getId_rol() {
        return id_rol;
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
     * @param id_proyecto
     */
    public void setId_proyecto(int id_proyecto) {
        this.id_proyecto = id_proyecto;
    }

    /**
     *
     * @param id_rol
     */
    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }
    
    
}
