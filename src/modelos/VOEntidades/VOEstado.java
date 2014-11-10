
package modelos.VOEntidades;

/**
 *
 * @author Juan José Cánovas Bustamante
 * @author Rafael Iván Linares Molina
 */
public class VOEstado {
    private int id_estado;
    private String nombre;

    /**
     *
     * @return
     */
    public int getId_estado() {
        return id_estado;
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
     * @param id_estado
     */
    public void setId_estado(int id_estado) {
        this.id_estado = id_estado;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
