/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.itson.pruebas.view;

/**
 *
 * @author elimo
 */
public class FrmAgregar extends javax.swing.JFrame {

    /**
     * Creates new form frmInicioElegirRegistro
     */
    public FrmAgregar() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        brnBuscar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        txtApellidoP = new javax.swing.JTextField();
        txtApellidoM = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtMatricula = new javax.swing.JTextField();
        txtFechaNacimiento = new javax.swing.JTextField();
        btnRegistros1 = new javax.swing.JButton();
        btnBusqueda1 = new javax.swing.JButton();
        btnInicio1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agregar (2).png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, -1, 1930, 1090));

        txtNombre.setText("jTextField1");
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 1470, 50));

        brnBuscar.setText("jButton1");
        jPanel1.add(brnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, -1, 60));

        btnGuardar.setText("jButton1");
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1650, 920, 160, 50));

        txtApellidoP.setText("jTextField1");
        jPanel1.add(txtApellidoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 430, 1300, 60));

        txtApellidoM.setText("jTextField1");
        jPanel1.add(txtApellidoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 510, 1300, 60));

        txtDireccion.setText("jTextField1");
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 590, 1450, 50));

        txtCorreo.setText("jTextField1");
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 660, 1520, 60));

        txtMatricula.setText("jTextField1");
        jPanel1.add(txtMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 740, 1450, 60));

        txtFechaNacimiento.setText("jTextField1");
        jPanel1.add(txtFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 820, 650, 50));

        btnRegistros1.setText("jButton1");
        btnRegistros1.setBorder(null);
        btnRegistros1.setBorderPainted(false);
        btnRegistros1.setContentAreaFilled(false);
        btnRegistros1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistros1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistros1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 50, 320, 100));

        btnBusqueda1.setText("jButton1");
        btnBusqueda1.setBorder(null);
        btnBusqueda1.setBorderPainted(false);
        btnBusqueda1.setContentAreaFilled(false);
        btnBusqueda1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusqueda1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnBusqueda1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1520, 50, 310, 100));

        btnInicio1.setText("jButton1");
        btnInicio1.setBorder(null);
        btnInicio1.setBorderPainted(false);
        btnInicio1.setContentAreaFilled(false);
        btnInicio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicio1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnInicio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 50, 200, 100));

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
    private javax.swing.JButton brnBuscar;
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
    private javax.swing.JTextField txtFechaNacimiento;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
