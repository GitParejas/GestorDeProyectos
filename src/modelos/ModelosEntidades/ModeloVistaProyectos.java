/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos.ModelosEntidades;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.AbstractTableModel;
import modelos.DAOEntidades.DAOCliente;
import modelos.DAOEntidades.DAODatosPersonales;
import modelos.DAOEntidades.DAOProyecto;
import modelos.DAOEntidades.DAOUsuario;
import modelos.DAOEntidades.DAOUsuarioTrabaja;
import modelos.SesionActual;
import modelos.VOEntidades.VOCliente;
import modelos.VOEntidades.VODatosPersonales;
import modelos.VOEntidades.VOProyecto;
import modelos.VOEntidades.VOUsuario;
import modelos.VOEntidades.VOUsuarioTrabaja;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ModeloVistaProyectos extends AbstractTableModel {

    DAOProyecto daoProyecto = new DAOProyecto();
    DAODatosPersonales daoDatosPersonales = new DAODatosPersonales();
    DAOCliente daoCliente = new DAOCliente();
    DAOUsuario daoUsuario = new DAOUsuario();
    DAOUsuarioTrabaja daoUsuarioTrabaja = new DAOUsuarioTrabaja();

    ArrayList<Object[]> listaProyectos;
    String[] cabeceraTablaProyectos = {"ID Proyecto", "Jefe del Proyecto", "Cliente", "Nombre del Proyecto", "Fecha de Inicio", "Fecha final pactada", "Fecha final calculada"};
    private final Class columnTypes[] = {Integer.class, Integer.class, Integer.class, String.class, String.class, String.class, String.class};

    ArrayList<VOProyecto> vop = new ArrayList<>();
    ArrayList<VODatosPersonales> vodp = new ArrayList<>();
    ArrayList<VOCliente> voc = new ArrayList<>();
    ArrayList<VOUsuario> vou = new ArrayList<>();
    ArrayList<VOUsuarioTrabaja> vout = new ArrayList<>();

    public ModeloVistaProyectos() {

        this.listaProyectos = new ArrayList<>();
        vodp = daoDatosPersonales.getAllDatosPersonales();
        voc = daoCliente.getAllClientes();
        vop = daoProyecto.getAllProyectos();
        vou = daoUsuario.getAllUsuarios();
        vout = daoUsuarioTrabaja.getUsuarioTrabaja(SesionActual.getId_usuario());

        if (SesionActual.getId_rol_app() == 1) {
            for (int i = 0; i < vop.size(); i++) {
                Object fila[] = new Object[7];

                fila[0] = vop.get(i).getId_proyecto();
                for (int j = 0; j < vou.size(); j++) {
                    if (vop.get(i).getId_jefe_proyecto() == vou.get(j).getId_usuario()) {
                        for (int k = 0; k < vodp.size(); k++) {
                            if (vou.get(j).getId_datos() == vodp.get(k).getId_datos()) {
                                fila[1] = vodp.get(k).getNombre();
                            }
                        }
                    }
                }
                for (int j = 0; j < voc.size(); j++) {
                    if (voc.get(j).getId_cliente() == vop.get(i).getId_cliente()) {
                        fila[2] = voc.get(j).getNombre();
                    }
                }
                fila[3] = vop.get(i).getNombre_proyecto();
                fila[4] = vop.get(i).getFecha_inicio();
                fila[5] = vop.get(i).getFecha_final_pactada();
                fila[6] = vop.get(i).getFecha_final_calculada();

                this.listaProyectos.add(fila);
            }
        } else {

            for (int i = 0; i < vop.size(); i++) {
                Object fila[] = new Object[7];

                for (int x = 0; x < vout.size(); x++) {
                    if (vout.get(x).getId_usuario() == vou.get(i).getId_usuario()) {
                        fila[0] = vop.get(i).getId_proyecto();
                        for (int j = 0; j < vou.size(); j++) {
                            if (vop.get(i).getId_jefe_proyecto() == vou.get(j).getId_usuario()) {
                                for (int k = 0; k < vodp.size(); k++) {
                                    if (vou.get(j).getId_datos() == vodp.get(k).getId_datos()) {
                                        fila[1] = vodp.get(k).getNombre();
                                    }
                                }
                            }
                        }
                        for (int j = 0; j < voc.size(); j++) {
                            if (voc.get(j).getId_cliente() == vop.get(i).getId_cliente()) {
                                fila[2] = voc.get(j).getNombre();
                            }
                        }
                        fila[3] = vop.get(i).getNombre_proyecto();
                        fila[4] = vop.get(i).getFecha_inicio();
                        fila[5] = vop.get(i).getFecha_final_pactada();
                        fila[6] = vop.get(i).getFecha_final_calculada();
                    }
                }
                this.listaProyectos.add(fila);
            }
        }

    }

    @Override
    public int getRowCount() {
        return this.listaProyectos.size();
    }

    @Override
    public int getColumnCount() {
        return this.cabeceraTablaProyectos.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object fila[] = this.listaProyectos.get(rowIndex);
        return fila[columnIndex];
    }

    @Override
    public String getColumnName(int columnIndex) {
        return this.cabeceraTablaProyectos[columnIndex];
    }

    @Override
    public Class getColumnClass(int columnIndex) {
        return this.columnTypes[columnIndex];
    }

    @Override
    public boolean isCellEditable(int row, int col) {
        return false;
    }

    @Override
    public void setValueAt(Object value, int row, int col) {
        this.listaProyectos.get(row)[col] = value;
    }

}
