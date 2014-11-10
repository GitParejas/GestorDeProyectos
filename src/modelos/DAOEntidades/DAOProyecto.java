/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelos.DAOEntidades;

import conexión.Conexion;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import modelos.VOEntidades.VOProyecto;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class DAOProyecto {
    
      public ArrayList<VOProyecto> getAllProyectos() {
        Conexion con = new Conexion();

        ArrayList<VOProyecto> proyectos = new ArrayList<>();
        System.out.println("Antes del try");

        try {
            System.out.println("Inicio del Try");
            Statement consulta = con.getConexion().createStatement();
            ResultSet rs = consulta.executeQuery("Select * from proyecto;");
            VOProyecto proyecto;
            
            System.out.println("Inicializacion de los statement");

            while (rs.next()) {
                proyecto = new VOProyecto();
                proyecto.setId_proyecto(rs.getInt("id_proyecto"));
                
                proyecto.setId_jefe_proyecto(rs.getInt("id_jefe_proyecto"));
                
                proyecto.setId_cliente(rs.getInt("id_cliente"));
                
                proyecto.setNombre_proyecto(rs.getString("nombre_proyecto"));
                
                proyecto.setDescripcion(rs.getString("descripcion"));
                
                proyecto.setFecha_inicio(rs.getDate("fecha_inicio").toString());

                proyecto.setFecha_final_pactada(rs.getDate("fecha_final_pactada").toString());
                
                if(rs.getDate("fecha_final_calculada")==null){
                    proyecto.setFecha_final_calculada("sin calcular");
                }else{
                    proyecto.setFecha_final_calculada(rs.getDate("fecha_final_calculada").toString());
                }

                System.out.println("Despues de las fechas");
                
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
