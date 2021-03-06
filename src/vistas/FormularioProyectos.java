/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

/**
 *
 * @author Khanox
 */
public class FormularioProyectos extends javax.swing.JFrame {

    /**
     * Creates new form FormularioProyectos
     */
    public FormularioProyectos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFormularioProyecto = new javax.swing.JPanel();
        jLabelNombreProyecto = new javax.swing.JLabel();
        jLabelJefeProyecto = new javax.swing.JLabel();
        jLabelFechaInicio = new javax.swing.JLabel();
        jLabelFechaFin = new javax.swing.JLabel();
        jTextFieldNombreProyecto = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPaneDescripcionProyecto = new javax.swing.JEditorPane();
        jComboBoxJefesProyecto = new javax.swing.JComboBox();
        jButtonVolver = new javax.swing.JButton();
        jButtonCrearProyecto = new javax.swing.JButton();
        jLabelDesarrolladores = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDesarrolladores = new javax.swing.JTable();
        jComboBoxDesarrolladores = new javax.swing.JComboBox();
        jButtonAñadirAlProyecto = new javax.swing.JButton();
        jButtonQuitarDelProyecto = new javax.swing.JButton();
        jFormattedTextFieldFechaInicio = new javax.swing.JFormattedTextField();
        jFormattedTextFieldFechaFin = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelFormularioProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Formulario de proyecto"));

        jLabelNombreProyecto.setText("Nombre del proyecto:");

        jLabelJefeProyecto.setText("Jefe del proyecto:");

        jLabelFechaInicio.setText("Fecha de inicio:");

        jLabelFechaFin.setText("Fecha de finalización estimada:");

        jEditorPaneDescripcionProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Descripción del proyecto"));
        jScrollPane2.setViewportView(jEditorPaneDescripcionProyecto);

        jComboBoxJefesProyecto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Apellido1 Apellido2, Nombre" }));

        jButtonVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Back.png"))); // NOI18N
        jButtonVolver.setToolTipText("Volver atrás");

        jButtonCrearProyecto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Add.png"))); // NOI18N
        jButtonCrearProyecto.setToolTipText("Crear proyecto");

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

        jComboBoxDesarrolladores.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Apellido1 Apellido2, Nombre" }));

        jButtonAñadirAlProyecto.setText("Añadir al proyecto");

        jButtonQuitarDelProyecto.setText("Quitar del proyecto");

        jFormattedTextFieldFechaInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yy"))));
        jFormattedTextFieldFechaInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldFechaInicioActionPerformed(evt);
            }
        });

        jFormattedTextFieldFechaFin.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yy"))));

        javax.swing.GroupLayout jPanelFormularioProyectoLayout = new javax.swing.GroupLayout(jPanelFormularioProyecto);
        jPanelFormularioProyecto.setLayout(jPanelFormularioProyectoLayout);
        jPanelFormularioProyectoLayout.setHorizontalGroup(
            jPanelFormularioProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormularioProyectoLayout.createSequentialGroup()
                .addGroup(jPanelFormularioProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFormularioProyectoLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanelFormularioProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNombreProyecto)
                            .addComponent(jLabelJefeProyecto, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelFormularioProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxJefesProyecto, 0, 252, Short.MAX_VALUE)
                            .addComponent(jTextFieldNombreProyecto))
                        .addGap(52, 52, 52)
                        .addGroup(jPanelFormularioProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelFechaFin)
                            .addComponent(jLabelFechaInicio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelFormularioProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jFormattedTextFieldFechaInicio)
                            .addComponent(jFormattedTextFieldFechaFin, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)))
                    .addGroup(jPanelFormularioProyectoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelFormularioProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelFormularioProyectoLayout.createSequentialGroup()
                                .addComponent(jComboBoxDesarrolladores, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonAñadirAlProyecto))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 704, Short.MAX_VALUE)
                            .addComponent(jLabelDesarrolladores)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFormularioProyectoLayout.createSequentialGroup()
                                .addComponent(jButtonCrearProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButtonQuitarDelProyecto, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelFormularioProyectoLayout.setVerticalGroup(
            jPanelFormularioProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormularioProyectoLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanelFormularioProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelNombreProyecto)
                    .addGroup(jPanelFormularioProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldNombreProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelFechaInicio)
                        .addComponent(jFormattedTextFieldFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFormularioProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelJefeProyecto)
                    .addComponent(jLabelFechaFin)
                    .addComponent(jComboBoxJefesProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelDesarrolladores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFormularioProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxDesarrolladores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAñadirAlProyecto)
                    .addComponent(jButtonQuitarDelProyecto))
                .addGap(35, 35, 35)
                .addGroup(jPanelFormularioProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonCrearProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanelFormularioProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanelFormularioProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFormattedTextFieldFechaInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldFechaInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldFechaInicioActionPerformed

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
            java.util.logging.Logger.getLogger(FormularioProyectos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioProyectos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioProyectos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioProyectos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioProyectos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAñadirAlProyecto;
    private javax.swing.JButton jButtonCrearProyecto;
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
    private javax.swing.JPanel jPanelFormularioProyecto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableDesarrolladores;
    private javax.swing.JTextField jTextFieldNombreProyecto;
    // End of variables declaration//GEN-END:variables
}
