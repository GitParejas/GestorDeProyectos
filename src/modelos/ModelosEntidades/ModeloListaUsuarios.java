
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
public class ModeloListaUsuarios extends AbstractTableModel {

    DAOUsuario daoUsuario = new DAOUsuario();
    DAODatosPersonales daoDatosPersonales = new DAODatosPersonales();

    ArrayList<Object[]> listaUsuarios;
    String[] cabeceraTablaUsuarios = {"ID Usuario", "Permisos", "Usuario", "Contraseña", "Nombre", "Apellido1", "Apellido2"};
    private Class columnTypes[] = {Integer.class, Integer.class, String.class, String.class, String.class, String.class, String.class};

    ArrayList<VOUsuario> vou = new ArrayList<>();
    ArrayList<VODatosPersonales> vodp = new ArrayList<>();

    /**
     *
     */
    public ModeloListaUsuarios() {
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

    /**
     *
     * @return
     */
    @Override
    public int getRowCount() {
        return this.listaUsuarios.size();
    }

    /**
     *
     * @return
     */
    @Override
    public int getColumnCount() {
        return this.cabeceraTablaUsuarios.length;
    }

    /**
     *
     * @param rowIndex
     * @param columnIndex
     * @return
     */
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object fila[] = this.listaUsuarios.get(rowIndex);
        return fila[columnIndex];
    }

    /**
     *
     * @param columnIndex
     * @return
     */
    @Override
    public String getColumnName(int columnIndex) {
        return this.cabeceraTablaUsuarios[columnIndex];
    }

    /**
     *
     * @param columnIndex
     * @return
     */
    @Override
    public Class getColumnClass(int columnIndex) {
        return this.columnTypes[columnIndex];
    }

    /**
     *
     * @param row
     * @param col
     * @return
     */
    @Override
    public boolean isCellEditable(int row, int col) {
        return false;
    }

    /**
     *
     * @param value
     * @param row
     * @param col
     */
    @Override
    public void setValueAt(Object value, int row, int col) {
        this.listaUsuarios.get(row)[col] = value;
    }
}
