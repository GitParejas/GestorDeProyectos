/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos.DAOEntidades;

import conexión.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelos.VOEntidades.VOUsuario;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class DAOUsuario {

    public ArrayList<VOUsuario> getAllUsuarios() {
        Conexion con = new Conexion();

        ArrayList<VOUsuario> usuarios = new ArrayList<>();

        try {

            Statement consulta = con.getConexion().createStatement();
            ResultSet rs = consulta.executeQuery("Select * from usuario;");
            VOUsuario user;

            while (rs.next()) {
                user = new VOUsuario();
                user.setId_usuario(rs.getInt("id_usuario"));
                user.setId_rol_app(rs.getInt("id_rol_app"));
                user.setUsuario(rs.getString("usuario"));
                user.setContraseña(rs.getString("contraseña"));
                user.setId_datos(rs.getInt("id_datos"));

                usuarios.add(user);
            }
            rs.close();
            consulta.close();
            con.desconectar();
        } catch (Exception error) {
            System.out.println("Error al hacer la consulta");
        }
        return usuarios;
    }

    public static VOUsuario getUsuario(String usuario, String password) {
        Conexion con = new Conexion();
        String consulta = "Select * from usuario where contraseña = \"" + password + "\" and usuario = \"" + usuario + "\" ";
        
        VOUsuario user = new VOUsuario();
        try {
            Statement st = con.getConexion().createStatement();
            ResultSet rs = st.executeQuery(consulta);
            
            if(rs != null){
                if(rs.next()){
                    user.setId_usuario(rs.getInt("id_usuario"));
                    user.setId_rol_app(rs.getInt("id_rol_app"));
                    user.setUsuario(rs.getString("usuario"));
                    user.setContraseña(rs.getString("contraseña"));
                    user.setId_datos(rs.getInt("id_datos"));
                }
            }
            rs.close();
            st.close();
            con.desconectar();

        } catch (SQLException error) {
            System.out.println("Error de obtencion de usuario");
        }
        return user;
    }
}
