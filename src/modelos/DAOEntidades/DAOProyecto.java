
package modelos.DAOEntidades;

import conexión.Conexion;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import modelos.VOEntidades.VOProyecto;

/**
 *
 * @author Juan José Cánovas Bustamante
 * @author Rafael Iván Linares Molina
 */
public class DAOProyecto {

    /**
     *
     * @return
     */
    public ArrayList<VOProyecto> getAllProyectos() {
        Conexion con = new Conexion();

        ArrayList<VOProyecto> proyectos = new ArrayList<>();

        try {

            Statement consulta = con.getConexion().createStatement();
            ResultSet rs = consulta.executeQuery("SELECT * FROM proyecto;");
            VOProyecto proyecto;

            while (rs.next()) {
                proyecto = new VOProyecto();
                proyecto.setId_proyecto(rs.getInt("id_proyecto"));
                proyecto.setId_jefe_proyecto(rs.getInt("id_jefe_proyecto"));
                proyecto.setId_cliente(rs.getInt("id_cliente"));
                proyecto.setNombre_proyecto(rs.getString("nombre_proyecto"));
                proyecto.setDescripcion(rs.getString("descripcion"));
                proyecto.setFecha_inicio(rs.getDate("fecha_inicio").toString());
                proyecto.setFecha_final_pactada(rs.getDate("fecha_final_pactada").toString());

                if (rs.getDate("fecha_final_calculada") == null) {
                    proyecto.setFecha_final_calculada("sin calcular");
                } else {
                    proyecto.setFecha_final_calculada(rs.getDate("fecha_final_calculada").toString());
                }

                proyecto.setId_estado(rs.getInt("id_estado"));

                proyectos.add(proyecto);
            }
            rs.close();
            consulta.close();
            con.desconectar();
        } catch (Exception error) {
            error.printStackTrace();
            System.out.println("Error al hacer la consulta Proyecto");
        }

        return proyectos;
    }

    /**
     *
     * @param id_proyecto
     * @return
     */
    public VOProyecto getProyecto(int id_proyecto) {
        Conexion con = new Conexion();
        VOProyecto proyecto = null;
        try {

            Statement consulta = con.getConexion().createStatement();
            ResultSet rs = consulta.executeQuery("SELECT * "
                + "FROM proyecto "
                + "WHERE id_proyecto = \"" + id_proyecto + "\";");
            
            if (rs.next()) {
                proyecto = new VOProyecto();
                proyecto.setId_proyecto(rs.getInt("id_proyecto"));
                proyecto.setId_jefe_proyecto(rs.getInt("id_jefe_proyecto"));
                proyecto.setId_cliente(rs.getInt("id_cliente"));
                proyecto.setNombre_proyecto(rs.getString("nombre_proyecto"));
                proyecto.setDescripcion(rs.getString("descripcion"));
                proyecto.setFecha_inicio(rs.getDate("fecha_inicio").toString());
                proyecto.setFecha_final_pactada(rs.getDate("fecha_final_pactada").toString());

                if (rs.getDate("fecha_final_calculada") == null) {
                    proyecto.setFecha_final_calculada("sin calcular");
                } else {
                    proyecto.setFecha_final_calculada(rs.getDate("fecha_final_calculada").toString());
                }

                proyecto.setId_estado(rs.getInt("id_estado"));

            } else {
                return proyecto;
            }
            rs.close();
            consulta.close();
            con.desconectar();
        } catch (Exception error) {
            error.printStackTrace();
            System.out.println("Error al hacer la consulta Proyecto");
        }
        return proyecto;
    }
    
    /**
     *
     * @param id_usuario
     * @return
     */
    public ArrayList<VOProyecto> getProyectoNoAdmin(int id_usuario) {
        Conexion con = new Conexion();
        VOProyecto proyecto = null;
        ArrayList<VOProyecto> proyectos = null;
        try {
            proyectos = new ArrayList<>();
            Statement consulta = con.getConexion().createStatement();
            ResultSet rs = consulta.executeQuery("SELECT * "
                + "FROM proyecto "
                + "WHERE id_proyecto "
                + "in (Select id_proyecto from usuario_trabaja where id_usuario = \""+id_usuario+"\" );");
            
            while (rs.next()) {
                proyecto = new VOProyecto();
                
                proyecto.setId_proyecto(rs.getInt("id_proyecto"));
                proyecto.setId_jefe_proyecto(rs.getInt("id_jefe_proyecto"));
                proyecto.setId_cliente(rs.getInt("id_cliente"));
                proyecto.setNombre_proyecto(rs.getString("nombre_proyecto"));
                proyecto.setDescripcion(rs.getString("descripcion"));
                proyecto.setFecha_inicio(rs.getDate("fecha_inicio").toString());
                proyecto.setFecha_final_pactada(rs.getDate("fecha_final_pactada").toString());

                if (rs.getDate("fecha_final_calculada") == null) {
                    proyecto.setFecha_final_calculada("sin calcular");
                } else {
                    proyecto.setFecha_final_calculada(rs.getDate("fecha_final_calculada").toString());
                }

                proyecto.setId_estado(rs.getInt("id_estado"));
                
                proyectos.add(proyecto);

            } 
            rs.close();
            consulta.close();
            con.desconectar();
        } catch (Exception error) {
            error.printStackTrace();
            System.out.println("Error al hacer la consulta Proyecto");
        }
        return proyectos;
    }
}
