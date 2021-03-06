/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelos.SesionActual;

/**
 *
 * @author Khanox
 */
public class VistaProyectoEnDetalle extends javax.swing.JFrame {

    /**
     * Creates new form Proyecto
     */
    public VistaProyectoEnDetalle() {
        initComponents();
        setTitle("Detalles del Proyecto");
        setLocationRelativeTo(null);
        setResizable(false); 
        
        if (SesionActual.getId_rol_app() != 1){
            jTextFieldNombreProyecto.setEditable(false);
            jButtonGuardar.setEnabled(false);
            jButtonQuitarDelProyecto.setEnabled(false);
            jEditorPaneDescripcionProyecto.setEditable(false);
            jComboBoxDesarrolladores.setEnabled(false);
            jButtonAñadirAlProyecto.setEnabled(false);
            jFormattedTextFieldFechaFin.setEditable(false);
            jFormattedTextFieldFechaInicio.setEditable(false);
            jComboBoxJefesProyecto.setEnabled(false);
            jRadioButtonVerHitos.setEnabled(false);
            jRadioButtonVerTareas.setEnabled(false);
            jButtonConsultar.setEnabled(false);
        }
        
        jButtonVolver.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                
                VistaProyectos obj = new VistaProyectos();
                obj.setVisible(true);
                dispose();
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupTareasHitos = new javax.swing.ButtonGroup();
        jPanelDetallesProyecto = new javax.swing.JPanel();
        jLabelNombreProyecto = new javax.swing.JLabel();
        jLabelJefeProyecto = new javax.swing.JLabel();
        jLabelFechaInicio = new javax.swing.JLabel();
        jLabelFechaFin = new javax.swing.JLabel();
        jLabelDesarrolladores = new javax.swing.JLabel();
        jTextFieldNombreProyecto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDesarrolladores = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPaneDescripcionProyecto = new javax.swing.JEditorPane();
        jComboBoxJefesProyecto = new javax.swing.JComboBox();
        jComboBoxDesarrolladores = new javax.swing.JComboBox();
        jButtonAñadirAlProyecto = new javax.swing.JButton();
        jButtonQuitarDelProyecto = new javax.swing.JButton();
        jPanelTareasHitos = new javax.swing.JPanel();
        jRadioButtonVerTareas = new javax.swing.JRadioButton();
        jRadioButtonVerHitos = new javax.swing.JRadioButton();
        jButtonConsultar = new javax.swing.JButton();
        jButtonVolver = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();
        jFormattedTextFieldFechaInicio = new javax.swing.JFormattedTextField();
        jFormattedTextFieldFechaFin = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelDetallesProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalles del proyecto"));

        jLabelNombreProyecto.setText("Nombre del proyecto:");

        jLabelJefeProyecto.setText("Jefe del proyecto:");

        jLabelFechaInicio.setText("Fecha de inicio:");

        jLabelFechaFin.setText("Fecha de finalización estimada:");

        jLabelDesarrolladores.setText("Desarrolladores que participan en el proyecto:");

        jTableDesarrolladores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido1", "Apellido2", "Titulación", "Sueldo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableDesarrolladores);

        jEditorPaneDescripcionProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Descripción del proyecto"));
        jScrollPane2.setViewportView(jEditorPaneDescripcionProyecto);

        jComboBoxJefesProyecto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Apellido1 Apellido2, Nombre" }));

        jComboBoxDesarrolladores.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Apellido1 Apellido2, Nombre" }));

        jButtonAñadirAlProyecto.setText("Añadir al proyecto");

        jButtonQuitarDelProyecto.setText("Quitar del proyecto");

        jPanelTareasHitos.setBorder(javax.swing.BorderFactory.createTitledBorder("Tareas / Hitos"));

        buttonGroupTareasHitos.add(jRadioButtonVerTareas);
        jRadioButtonVerTareas.setText("Ver Tareas");

        buttonGroupTareasHitos.add(jRadioButtonVerHitos);
        jRadioButtonVerHitos.setText("Ver Hitos");

        jButtonConsultar.setText("Consultar");

        javax.swing.GroupLayout jPanelTareasHitosLayout = new javax.swing.GroupLayout(jPanelTareasHitos);
        jPanelTareasHitos.setLayout(jPanelTareasHitosLayout);
        jPanelTareasHitosLayout.setHorizontalGroup(
            jPanelTareasHitosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTareasHitosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTareasHitosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonVerTareas)
                    .addComponent(jRadioButtonVerHitos))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTareasHitosLayout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(jButtonConsultar)
                .addGap(43, 43, 43))
        );
        jPanelTareasHitosLayout.setVerticalGroup(
            jPanelTareasHitosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTareasHitosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButtonVerTareas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButtonVerHitos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonConsultar))
        );

        jButtonVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Back.png"))); // NOI18N
        jButtonVolver.setToolTipText("Volver atrás");

        jButtonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Save.png"))); // NOI18N
        jButtonGuardar.setToolTipText("Guardar cambios");

        jFormattedTextFieldFechaInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yy"))));

        jFormattedTextFieldFechaFin.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yy"))));

        javax.swing.GroupLayout jPanelDetallesProyectoLayout = new javax.swing.GroupLayout(jPanelDetallesProyecto);
        jPanelDetallesProyecto.setLayout(jPanelDetallesProyectoLayout);
        jPanelDetallesProyectoLayout.setHorizontalGroup(
            jPanelDetallesProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDetallesProyectoLayout.createSequentialGroup()
                .addGroup(jPanelDetallesProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDetallesProyectoLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanelDetallesProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanelTareasHitos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelDetallesProyectoLayout.createSequentialGroup()
                                .addGroup(jPanelDetallesProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelNombreProyecto)
                                    .addComponent(jLabelJefeProyecto, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelDetallesProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBoxJefesProyecto, 0, 252, Short.MAX_VALUE)
                                    .addComponent(jTextFieldNombreProyecto))
                                .addGap(52, 52, 52)
                                .addGroup(jPanelDetallesProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelFechaFin)
                                    .addComponent(jLabelFechaInicio))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelDetallesProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jFormattedTextFieldFechaInicio)
                                    .addComponent(jFormattedTextFieldFechaFin, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)))))
                    .addGroup(jPanelDetallesProyectoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelDetallesProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDetallesProyectoLayout.createSequentialGroup()
                                .addComponent(jComboBoxDesarrolladores, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonAñadirAlProyecto))
                            .addGroup(jPanelDetallesProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButtonQuitarDelProyecto)
                                .addGroup(jPanelDetallesProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelDesarrolladores)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanelDetallesProyectoLayout.createSequentialGroup()
                                    .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButtonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelDetallesProyectoLayout.setVerticalGroup(
            jPanelDetallesProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDetallesProyectoLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanelDetallesProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelNombreProyecto)
                    .addGroup(jPanelDetallesProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldNombreProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelFechaInicio)
                        .addComponent(jFormattedTextFieldFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDetallesProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelJefeProyecto)
                    .addComponent(jLabelFechaFin)
                    .addComponent(jComboBoxJefesProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanelDetallesProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDetallesProyectoLayout.createSequentialGroup()
                        .addComponent(jPanelTareasHitos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(57, 57, 57))
                    .addGroup(jPanelDetallesProyectoLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jLabelDesarrolladores)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDetallesProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxDesarrolladores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAñadirAlProyecto)
                    .addComponent(jButtonQuitarDelProyecto))
                .addGap(24, 24, 24)
                .addGroup(jPanelDetallesProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanelDetallesProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanelDetallesProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaProyectoEnDetalle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaProyectoEnDetalle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaProyectoEnDetalle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaProyectoEnDetalle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaProyectoEnDetalle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupTareasHitos;
    private javax.swing.JButton jButtonAñadirAlProyecto;
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonQuitarDelProyecto;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JComboBox jComboBoxDesarrolladores;
    private javax.swing.JComboBox jComboBoxJefesProyecto;
    private javax.swing.JEditorPane jEditorPaneDescripcionProyecto;
    private javax.swing.JFormattedTextField jFormattedTextFieldFechaFin;
    private javax.swing.JFormattedTextField jFormattedTextFieldFechaInicio;
    private javax.swing.JLabel jLabelDesarrolladores;
    private javax.swing.JLabel jLabelFechaFin;
    private javax.swing.JLabel jLabelFechaInicio;
    private javax.swing.JLabel jLabelJefeProyecto;
    private javax.swing.JLabel jLabelNombreProyecto;
    private javax.swing.JPanel jPanelDetallesProyecto;
    private javax.swing.JPanel jPanelTareasHitos;
    private javax.swing.JRadioButton jRadioButtonVerHitos;
    private javax.swing.JRadioButton jRadioButtonVerTareas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableDesarrolladores;
    private javax.swing.JTextField jTextFieldNombreProyecto;
    // End of variables declaration//GEN-END:variables
}
