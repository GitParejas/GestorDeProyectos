
package modelos.ModelosEntidades;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import modelos.DAOEntidades.DAODatosPersonales;
import modelos.DAOEntidades.DAOUsuario;
import modelos.VOEntidades.VODatosPersonales;
import modelos.VOEntidades.VOUsuario;

/**
 *
 * @author Juan José Cánovas Bustamante
 * @author Rafael Iván Linares Molina
 */
public class ModeloVistaUsuario extends AbstractTableModel {

    DAOUsuario daoUsuario = new DAOUsuario();
    DAODatosPersonales daoDatosPersonales = new DAODatosPersonales();

    ArrayList<Object[]> listaUsuarios;
    String[] cabeceraTablaUsuarios = {"ID Usuario", "Permisos", "Usuario", "Contraseña", "Nombre", "Apellido1", "Apellido2"};
    private Class columnTypes[] = {Integer.class, Integer.class, String.class, String.class, String.class, String.class, String.class};

    ArrayList<VOUsuario> vou = new ArrayList<>();
    ArrayList<VODatosPersonales> vodp = new ArrayList<>();

    public ModeloVistaUsuario() {
        this.listaUsuarios = new ArrayList<>();
        vou = daoUsuario.getAllUsuarios();
        vodp = daoDatosPersonales.getAllDatosPersonales();

        for (int i = 0; i < vou.size(); i++) {
            Object fila[] = new Object[7];
            
            fila[0] = vou.get(i).getId_usuario();
            fila[1] = vou.get(i).getId_rol_app();
            fila[2] = vou.get(i).getUsuario();
            fila[3] = "******";

            for (int j = 0; j < vodp.size(); j++) {
                if (vou.get(i).getId_datos() == vodp.get(j).getId_datos()) {
                    fila[4] = vodp.get(j).getNombre();
                    fila[5] = vodp.get(j).getApellido1();
                    fila[6] = vodp.get(j).getApellido2();
                }
            }

            this.listaUsuarios.add(fila);
        }

    }

    @Override
    public int getRowCount() {
        return this.listaUsuarios.size();
    }

    @Override
    public int getColumnCount() {
        return this.cabeceraTablaUsuarios.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object fila[] = this.listaUsuarios.get(rowIndex);
        return fila[columnIndex];
    }

    @Override
    public String getColumnName(int columnIndex) {
        return this.cabeceraTablaUsuarios[columnIndex];
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
        this.listaUsuarios.get(row)[col] = value;
    }
}
