/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.itson.pruebas.view;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.itson.pruebas.controller.AlumnoDTO;
import org.itson.pruebas.controller.AlumnoValidator;
import org.itson.pruebas.controller.CrudAlumnoController;
import org.itson.pruebas.controller.ICrudAlumnoController;
import org.itson.pruebas.controller.controllerExceptions.ControllerException;
import org.itson.pruebas.controller.generarMatricula;

/**
 *
 * @author elimo
 */
public class FrmAgregar extends javax.swing.JFrame {

    ICrudAlumnoController crud;
    AlumnoDTO alumnoDTO;
    generarMatricula matricula;

    /**
     * Creates new form frmInicioElegirRegistro
     */
    public FrmAgregar() {
        alumnoDTO = new AlumnoDTO();
        crud = new CrudAlumnoController();
        matricula = new generarMatricula();
        initComponents();
        txtMatricula.setText(matricula.generarMatricula());
        txtMatricula.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        txtApellidoP = new javax.swing.JTextField();
        txtApellidoM = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtMatricula = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnRegistros1 = new javax.swing.JButton();
        btnBusqueda1 = new javax.swing.JButton();
        btnInicio1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombre.setBackground(new java.awt.Color(164, 196, 220));
        txtNombre.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setBorder(null);
        txtNombre.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 1470, 50));

        txtApellidoP.setBackground(new java.awt.Color(164, 196, 220));
        txtApellidoP.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtApellidoP.setForeground(new java.awt.Color(255, 255, 255));
        txtApellidoP.setBorder(null);
        txtApellidoP.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtApellidoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 430, 1300, 60));

        txtApellidoM.setBackground(new java.awt.Color(164, 196, 220));
        txtApellidoM.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtApellidoM.setForeground(new java.awt.Color(255, 255, 255));
        txtApellidoM.setBorder(null);
        txtApellidoM.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtApellidoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 510, 1300, 50));

        txtDireccion.setBackground(new java.awt.Color(164, 196, 220));
        txtDireccion.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtDireccion.setForeground(new java.awt.Color(255, 255, 255));
        txtDireccion.setBorder(null);
        txtDireccion.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 590, 1450, 50));

        txtCorreo.setBackground(new java.awt.Color(164, 196, 220));
        txtCorreo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(255, 255, 255));
        txtCorreo.setBorder(null);
        txtCorreo.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 660, 1520, 60));

        txtMatricula.setEditable(false);
        txtMatricula.setBackground(new java.awt.Color(164, 196, 220));
        txtMatricula.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtMatricula.setForeground(new java.awt.Color(255, 255, 255));
        txtMatricula.setBorder(null);
        txtMatricula.setCaretColor(new java.awt.Color(255, 255, 255));
        txtMatricula.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 740, 1450, 60));

        btnGuardar.setBorder(null);
        btnGuardar.setBorderPainted(false);
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1650, 920, 160, 50));

        btnRegistros1.setBorder(null);
        btnRegistros1.setBorderPainted(false);
        btnRegistros1.setContentAreaFilled(false);
        btnRegistros1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistros1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistros1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistros1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 50, 320, 100));

        btnBusqueda1.setBorder(null);
        btnBusqueda1.setBorderPainted(false);
        btnBusqueda1.setContentAreaFilled(false);
        btnBusqueda1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBusqueda1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusqueda1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnBusqueda1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1520, 50, 310, 100));

        btnInicio1.setBorder(null);
        btnInicio1.setBorderPainted(false);
        btnInicio1.setContentAreaFilled(false);
        btnInicio1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInicio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicio1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnInicio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 50, 200, 100));

        jLabel2.setForeground(new java.awt.Color(164, 196, 220));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agregar (3).png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, -1, 1930, 1090));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistros1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistros1ActionPerformed
        // TODO add your handling code here:
        FrmInicioElegirRegistro frm = new FrmInicioElegirRegistro();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegistros1ActionPerformed

    private void btnBusqueda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusqueda1ActionPerformed
        // TODO add your handling code here:
        FrmBusqueda frm = new FrmBusqueda();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBusqueda1ActionPerformed

    private void btnInicio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicio1ActionPerformed
        // TODO add your handling code here:
        FrmInicio frm = new FrmInicio();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnInicio1ActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        alumnoDTO.setNombre(txtNombre.getText());
        alumnoDTO.setApellido(txtApellidoP.getText() + " " + txtApellidoM.getText());
        alumnoDTO.setCorreo(txtCorreo.getText());
        alumnoDTO.setDireccion(txtDireccion.getText());
        alumnoDTO.setMatricula(txtMatricula.getText());

        AlumnoValidator validator = new AlumnoValidator();

        try {
            // Verifica que todos los campos estén llenos y que los datos sean válidos
            if (!txtNombre.getText().isEmpty() && !txtApellidoP.getText().isEmpty() && !txtApellidoM.getText().isEmpty()
                    && !txtCorreo.getText().isEmpty() && !txtDireccion.getText().isEmpty() && !txtMatricula.getText().isEmpty()) {

                // Validar los datos
                if (validator.validarAlumno(alumnoDTO)) {
                    crud.registrarAlumno(alumnoDTO);
                    JOptionPane.showMessageDialog(this, "Se ha agregado con éxito");
                    FrmAgregar frm = new FrmAgregar();
                    frm.setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Por favor, ingrese datos válidos.");
                }

            } else {
                JOptionPane.showMessageDialog(this, "Por favor, llene todos los datos.");
            }
        } catch (ControllerException ex) {
            Logger.getLogger(FrmAgregar.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAgregar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBusqueda1;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnInicio1;
    private javax.swing.JButton btnRegistros1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtApellidoM;
    private javax.swing.JTextField txtApellidoP;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
