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
public class VistaTareas extends javax.swing.JFrame {

    /**
     * Creates new form VistaTareas
     */
    public VistaTareas() {
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

        jPanelTareas = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTareas = new javax.swing.JTable();
        jButtonVerTareaEnDetalle = new javax.swing.JButton();
        jButtonEliminarTarea = new javax.swing.JButton();
        jButtonAñadirTarea = new javax.swing.JButton();
        jLabelProyecto = new javax.swing.JLabel();
        jLabelNombreProyecto = new javax.swing.JLabel();
        jPanelSubtareas = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableSubtareas = new javax.swing.JTable();
        jButtonVerSubtareaEnDetalle = new javax.swing.JButton();
        jButtonEliminarSubtarea = new javax.swing.JButton();
        jButtonAñadirSubtarea = new javax.swing.JButton();
        jLabelNombreTarea = new javax.swing.JLabel();
        jLabelNombreTareaAMostrar = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButtonVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelTareas.setBorder(javax.swing.BorderFactory.createTitledBorder("Tareas del proyecto"));

        jTableTareas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Fecha Inicio", "Porcentaje realizado", "Duración estimada", "Estado"
            }
        ));
        jScrollPane1.setViewportView(jTableTareas);

        jButtonVerTareaEnDetalle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Search.png"))); // NOI18N
        jButtonVerTareaEnDetalle.setToolTipText("Ver tarea en detalle");

        jButtonEliminarTarea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Delete.png"))); // NOI18N
        jButtonEliminarTarea.setToolTipText("Eliminar tarea");

        jButtonAñadirTarea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Add.png"))); // NOI18N
        jButtonAñadirTarea.setToolTipText("Añadir tarea");

        jLabelProyecto.setText("Proyecto:");

        jLabelNombreProyecto.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabelNombreProyecto.setText("Nombre del proyecto");

        javax.swing.GroupLayout jPanelTareasLayout = new javax.swing.GroupLayout(jPanelTareas);
        jPanelTareas.setLayout(jPanelTareasLayout);
        jPanelTareasLayout.setHorizontalGroup(
            jPanelTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTareasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTareasLayout.createSequentialGroup()
                        .addGap(0, 486, Short.MAX_VALUE)
                        .addComponent(jButtonAñadirTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEliminarTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonVerTareaEnDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelTareasLayout.createSequentialGroup()
                        .addComponent(jLabelProyecto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelNombreProyecto)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelTareasLayout.setVerticalGroup(
            jPanelTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTareasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelProyecto)
                    .addComponent(jLabelNombreProyecto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAñadirTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEliminarTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonVerTareaEnDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanelSubtareas.setBorder(javax.swing.BorderFactory.createTitledBorder("Subtareas"));

        jTableSubtareas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Fecha Inicio", "Porcentaje realizado", "Duración estimada", "Estado"
            }
        ));
        jScrollPane2.setViewportView(jTableSubtareas);

        jButtonVerSubtareaEnDetalle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Search.png"))); // NOI18N
        jButtonVerSubtareaEnDetalle.setToolTipText("Ver subtarea en detalle");

        jButtonEliminarSubtarea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Delete.png"))); // NOI18N
        jButtonEliminarSubtarea.setToolTipText("Eliminar subtarea");

        jButtonAñadirSubtarea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Add.png"))); // NOI18N
        jButtonAñadirSubtarea.setToolTipText("Añadir subtarea");

        jLabelNombreTarea.setText("Tarea:");

        jLabelNombreTareaAMostrar.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabelNombreTareaAMostrar.setText("Nombre de la tarea");

        javax.swing.GroupLayout jPanelSubtareasLayout = new javax.swing.GroupLayout(jPanelSubtareas);
        jPanelSubtareas.setLayout(jPanelSubtareasLayout);
        jPanelSubtareasLayout.setHorizontalGroup(
            jPanelSubtareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSubtareasLayout.createSequentialGroup()
                .addGroup(jPanelSubtareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSubtareasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelSubtareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(jPanelSubtareasLayout.createSequentialGroup()
                                .addComponent(jLabelNombreTarea)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelNombreTareaAMostrar)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSubtareasLayout.createSequentialGroup()
                        .addGap(0, 496, Short.MAX_VALUE)
                        .addComponent(jButtonAñadirSubtarea, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEliminarSubtarea, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonVerSubtareaEnDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelSubtareasLayout.setVerticalGroup(
            jPanelSubtareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSubtareasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelSubtareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombreTarea)
                    .addComponent(jLabelNombreTareaAMostrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSubtareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAñadirSubtarea, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEliminarSubtarea, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonVerSubtareaEnDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(176, 176, 176))
        );

        jButtonVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Back.png"))); // NOI18N
        jButtonVolver.setToolTipText("Volver atrás");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButtonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelTareas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelSubtareas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jPanelTareas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelSubtareas, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            java.util.logging.Logger.getLogger(VistaTareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaTareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaTareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaTareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaTareas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAñadirSubtarea;
    private javax.swing.JButton jButtonAñadirTarea;
    private javax.swing.JButton jButtonEliminarSubtarea;
    private javax.swing.JButton jButtonEliminarTarea;
    private javax.swing.JButton jButtonVerSubtareaEnDetalle;
    private javax.swing.JButton jButtonVerTareaEnDetalle;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLabelNombreProyecto;
    private javax.swing.JLabel jLabelNombreTarea;
    private javax.swing.JLabel jLabelNombreTareaAMostrar;
    private javax.swing.JLabel jLabelProyecto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelSubtareas;
    private javax.swing.JPanel jPanelTareas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableSubtareas;
    private javax.swing.JTable jTableTareas;
    // End of variables declaration//GEN-END:variables
}
