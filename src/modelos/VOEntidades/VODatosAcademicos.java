
package modelos.VOEntidades;

/**
 *
 * @author Juan José Cánovas Bustamante
 * @author Rafael Iván Linares Molina
 */
public class VODatosAcademicos {
    private int id_titulo;
    private String nombre;
    private String descripcion;
    private String competencias;
    private float salario_titulo;

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
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @return
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     *
     * @return
     */
    public String getCompetencias() {
        return competencias;
    }

    /**
     *
     * @return
     */
    public float getSalario_titulo() {
        return salario_titulo;
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
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @param descripcion
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     *
     * @param competencias
     */
    public void setCompetencias(String competencias) {
        this.competencias = competencias;
    }

    /**
     *
     * @param salario_titulo
     */
    public void setSalario_titulo(float salario_titulo) {
        this.salario_titulo = salario_titulo;
    }
    
}
