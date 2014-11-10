/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.JOptionPane;
import modelos.DAOEntidades.DAOUsuario;
import modelos.SesionActual;
import modelos.VOEntidades.VOUsuario;

/**
 *
 * @author Khanox
 */
public class VistaLogin extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public VistaLogin() {
        initComponents();
        setTitle("Login!");
        setLocationRelativeTo(null);
        setResizable(false);

        jButtonOk.addActionListener(new ActionListener() {
            int cont = 0;
            int cont1 = 0;

            @Override
            public void actionPerformed(ActionEvent ae) {
                VOUsuario usuario = null;
                if (jTextFieldUsuario.getText().trim().equals("") || jPasswordField.getPassword().length == 0) {
                    cont++;
                    JOptionPane.showMessageDialog(null, "Debe rellenar los campos", "Error de login", JOptionPane.ERROR_MESSAGE);
                    if (cont == 3) {
                        JOptionPane.showMessageDialog(null, "Ha fallado demasiadas veces, saliendo...", "Largo de aqui... Usuario!", JOptionPane.ERROR_MESSAGE);
                        System.exit(0);
                    }
                } else {
                    String user = jTextFieldUsuario.getText();
                    char[] p = jPasswordField.getPassword();
                    String password = "";

                    for (int i = 0; i < p.length; i++) {
                        password += p[i];
                    }

                    usuario = DAOUsuario.getUsuario(user, password);
                    if (usuario.getId_usuario() != 0) {
                        
                        SesionActual.setId_usuario(usuario.getId_usuario());
                        SesionActual.setId_rol_app(usuario.getId_rol_app());
                        SesionActual.setUsuario(usuario.getUsuario());
                        SesionActual.setContraseña(usuario.getContraseña());
                        SesionActual.setId_datos(usuario.getId_datos());
                        JOptionPane.showMessageDialog(null, "Acceso concedido", "Bienvenido: "+SesionActual.getUsuario()+"", JOptionPane.INFORMATION_MESSAGE);
                        
                        VistaProyectos obj = new VistaProyectos();
                        obj.setVisible(true);
                        dispose();
                    } else {
                        cont1++;
                        JOptionPane.showMessageDialog(null, "Usuario erroneo, revise sus credenciales", "Error de login", JOptionPane.ERROR_MESSAGE);
                        if (cont1 == 3) {
                            JOptionPane.showMessageDialog(null, "Esta claro que usted no existe en la aplicación.", "Largo de aqui... Usuario!", JOptionPane.ERROR_MESSAGE);
                            System.exit(0);
                        }
                    }
                    
                }
            }
        });

        jButtonSalir.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING:
     * Do NOT modify this code. The content of this method is always regenerated by the
     * Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelLogin = new javax.swing.JPanel();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelPassword = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        jButtonOk = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jTextFieldUsuario = new javax.swing.JTextField();
        jPanelNombreSoftware = new javax.swing.JPanel();
        jLabelNombreSoftware = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio de sesión");

        jPanelLogin.setBorder(javax.swing.BorderFactory.createTitledBorder("Inicio de sesión"));

        jLabelUsuario.setText("Usuario:");

        jLabelPassword.setText("Contraseña:");

        jButtonOk.setText("Ok");

        jButtonSalir.setText("Salir");

        javax.swing.GroupLayout jPanelLoginLayout = new javax.swing.GroupLayout(jPanelLogin);
        jPanelLogin.setLayout(jPanelLoginLayout);
        jPanelLoginLayout.setHorizontalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addComponent(jButtonOk)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSalir))
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelPassword)
                            .addComponent(jLabelUsuario))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(jTextFieldUsuario))))
                .addGap(63, 63, 63))
        );
        jPanelLoginLayout.setVerticalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUsuario)
                    .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPassword))
                .addGap(28, 28, 28)
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonOk)
                    .addComponent(jButtonSalir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabelNombreSoftware.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelNombreSoftware.setText("SOFTWARE DE GESTIÓN DE PROYECTOS");

        javax.swing.GroupLayout jPanelNombreSoftwareLayout = new javax.swing.GroupLayout(jPanelNombreSoftware);
        jPanelNombreSoftware.setLayout(jPanelNombreSoftwareLayout);
        jPanelNombreSoftwareLayout.setHorizontalGroup(
            jPanelNombreSoftwareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelNombreSoftwareLayout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(jLabelNombreSoftware)
                .addGap(160, 160, 160))
        );
        jPanelNombreSoftwareLayout.setVerticalGroup(
            jPanelNombreSoftwareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNombreSoftwareLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabelNombreSoftware)
                .addGap(25, 25, 25))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/project-time.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jPanelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanelNombreSoftware, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelNombreSoftware, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jPanelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(VistaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonOk;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelNombreSoftware;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanelLogin;
    private javax.swing.JPanel jPanelNombreSoftware;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
