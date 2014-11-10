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
import modelos.VOEntidades.VOCliente;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class DAOCliente {

    public ArrayList<VOCliente> getAllClientes() {
        Conexion con = new Conexion();

        ArrayList<VOCliente> clientes = new ArrayList<>();

        try {

            Statement consulta = con.getConexion().createStatement();
            ResultSet rs = consulta.executeQuery("Select * from cliente;");
            VOCliente cliente;

            while (rs.next()) {
                cliente = new VOCliente();
                cliente.setId_cliente(rs.getInt("id_cliente"));
                cliente.setNombre(rs.getString("nombre"));

                clientes.add(cliente);
            }
            rs.close();
            consulta.close();
            con.desconectar();
        } catch (SQLException error) {
            error.printStackTrace();
            System.out.println("Error al hacer la consulta de Cliente");
        }
        return clientes;
    }

    public VOCliente getClienteById(int id_cliente) {
        Conexion con = new Conexion();
        VOCliente cliente = null;

        try {

            Statement consulta = con.getConexion().createStatement();
            ResultSet rs = consulta.executeQuery("Select * from cliente;");
            cliente = new VOCliente();

            if (rs.next()) {

                cliente.setId_cliente(rs.getInt("id_cliente"));
                cliente.setNombre(rs.getString("nombre"));

            }
            rs.close();
            consulta.close();
            con.desconectar();
        } catch (SQLException error) {
            error.printStackTrace();
            System.out.println("Error al hacer la consulta de Cliente");
        }
        return cliente;
    }
}
