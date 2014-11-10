
package modelos.DAOEntidades;

import conexión.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelos.VOEntidades.VODatosPersonales;

/**
 *
 * @author Juan José Cánovas Bustamante
 * @author Rafael Iván Linares Molina
 */
public class DAODatosPersonales {

    /**
     *
     * @return
     */
    public ArrayList<VODatosPersonales> getAllDatosPersonales() {
        Conexion con = new Conexion();
        ArrayList<VODatosPersonales> datos = new ArrayList<>();
        
        try {
           
            Statement consulta = con.getConexion().createStatement();
            ResultSet rs = consulta.executeQuery("Select * from datos_personales;");
            VODatosPersonales dato;
            
            while(rs.next()){
                dato = new  VODatosPersonales();
                
                dato.setId_datos(rs.getInt("id_datos"));
                dato.setId_titulo(rs.getInt("id_titulo"));
                dato.setId_horario(rs.getInt("id_horario"));
                dato.setDni(rs.getString("DNI"));
                dato.setNss(rs.getString("NSS"));
                dato.setNombre(rs.getString("nombre"));
                dato.setApellido1(rs.getString("apellido1"));
                dato.setApellido2(rs.getString("apellido2"));
                dato.setTelefono(rs.getString("telefono"));
                dato.setCorreo(rs.getString("correo"));
                dato.setFecha_nacimiento(rs.getDate("fecha_nacimiento"));
                dato.setFecha_alta_sistema(rs.getDate("fecha_alta_sistema"));
                dato.setHoras_jornada_diaria(rs.getInt("horas_jornada_diaria"));
                
                datos.add(dato);
            }
            rs.close();
            consulta.close();
            con.desconectar();            
        } catch (SQLException error) {
            System.out.println("Error al hacer la consulta Datos Personales");
        }

        return datos;
    }
}