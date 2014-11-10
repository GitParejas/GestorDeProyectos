
package modelos;

/**
 *
 * @author Juan José Cánovas Bustamante
 * @author Rafael Iván Linares Molina
 */
public class SesionActual {

    private static int id_usuario;
    private static int id_rol_app;
    private static String usuario;
    private static String contraseña;
    private static int id_datos;

    /**
     *
     * @return
     */
    public static int getId_usuario() {
        return SesionActual.id_usuario;
    }

    public static int getId_rol_app() {
        return SesionActual.id_rol_app;
    }

    public static String getUsuario() {
        return SesionActual.usuario;
    }

    public static String getContraseña() {
        return SesionActual.contraseña;
    }

    public static int getId_datos() {
        return SesionActual.id_datos;
    }

    public static void setId_usuario(int id_usuario) {
        SesionActual.id_usuario = id_usuario;
    }

    public static void setId_rol_app(int id_rol_app) {
        SesionActual.id_rol_app = id_rol_app;
    }

    public static void setUsuario(String usuario) {
        SesionActual.usuario = usuario;
    }

    public static void setContraseña(String contraseña) {
        SesionActual.contraseña = contraseña;
    }

    public static void setId_datos(int id_datos) {
        SesionActual.id_datos = id_datos;
    }

}
