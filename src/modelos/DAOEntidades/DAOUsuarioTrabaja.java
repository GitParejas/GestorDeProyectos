
package modelos.DAOEntidades;

import conexión.Conexion;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import modelos.VOEntidades.VOUsuarioTrabaja;

/**
 *
 * @author Juan José Cánovas Bustamante
 * @author Rafael Iván Linares Molina
 */
public class DAOUsuarioTrabaja {

    /**
     *
     * @return
     */
    public ArrayList<VOUsuarioTrabaja> getAllUsuariosTrabajando() {
        Conexion con = new Conexion();

        ArrayList<VOUsuarioTrabaja> usuariosTrabajando = new ArrayList<>();

        try {

            Statement consulta = con.getConexion().createStatement();
            ResultSet rs = consulta.executeQuery("Select * from usuario_trabaja;");
            VOUsuarioTrabaja usuarioTrabaja;

            while (rs.next()) {
                usuarioTrabaja = new VOUsuarioTrabaja();
                usuarioTrabaja.setId_proyecto(rs.getInt("id_proyecto"));
                usuarioTrabaja.setId_usuario(rs.getInt("id_usuario"));
                usuarioTrabaja.setId_rol(rs.getInt("id_rol"));

                usuariosTrabajando.add(usuarioTrabaja);
            }
            rs.close();
            consulta.close();
            con.desconectar();
        } catch (Exception error) {
            System.out.println("Error al hacer la consulta de Cliente");
        }
        return usuariosTrabajando;
    }

    /**
     *
     * @param id_usuario
     * @return
     */
    public ArrayList<VOUsuarioTrabaja> getUsuarioTrabajaById(int id_usuario) {
        Conexion con = new Conexion();

        ArrayList<VOUsuarioTrabaja> usuariosTrabajando = new ArrayList<>();

        try {
            Statement consulta = con.getConexion().createStatement();
            ResultSet rs = consulta.executeQuery("select p.id_proyecto, ut.id_usuario, ut.id_rol  "
                + "from proyecto p, usuario_trabaja ut, usuario u  "
                + "where u.id_usuario = ut.id_usuario AND p.id_proyecto = ut.id_proyecto "
                + "and u.id_usuario = \""+id_usuario+"\";");
            VOUsuarioTrabaja usuarioTrabaja;

            while (rs.next()) {
                usuarioTrabaja = new VOUsuarioTrabaja();
                usuarioTrabaja.setId_proyecto(rs.getInt("id_proyecto"));
                usuarioTrabaja.setId_usuario(rs.getInt("id_usuario"));
                usuarioTrabaja.setId_rol(rs.getInt("id_rol"));

                usuariosTrabajando.add(usuarioTrabaja);
            }
            rs.close();
            consulta.close();
            con.desconectar();
        } catch (Exception error) {
            error.printStackTrace();
            System.out.println("Error al hacer la consulta de DAOUsuarioTrabaja");
        }
        return usuariosTrabajando;
    }
}
