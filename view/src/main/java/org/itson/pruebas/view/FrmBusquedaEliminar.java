/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.itson.pruebas.view;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.itson.pruebas.controller.AlumnoDTO;
import org.itson.pruebas.controller.ConsultaAlumnoController;
import org.itson.pruebas.controller.CrudAlumnoController;
import org.itson.pruebas.controller.IConsultaAlumnoController;
import org.itson.pruebas.controller.ICrudAlumnoController;
import org.itson.pruebas.controller.controllerExceptions.ControllerException;

/**
 *
 * @author elimo
 */
public class FrmBusquedaEliminar extends javax.swing.JFrame {

    IConsultaAlumnoController consultas;
    ICrudAlumnoController crud;

    /**
     * Creates new form frmInicioElegirRegistro
     */
    public FrmBusquedaEliminar() {
        initComponents();
        consultas = new ConsultaAlumnoController();
        crud = new CrudAlumnoController();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAlumnos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtDatos = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnRegistros1 = new javax.swing.JButton();
        btnBusqueda1 = new javax.swing.JButton();
        btnInicio1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellidos", "Matricula", "Correo", "Direccion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaAlumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaAlumnosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaAlumnos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 1650, 510));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BuscarEliminar.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, -1, 1930, 1090));

        txtDatos.setText("jTextField1");
        txtDatos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDatosKeyTyped(evt);
            }
        });
        jPanel1.add(txtDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 1610, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IniciaSesión1.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, -4, 1920, 1090));

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

    private void tablaAlumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaAlumnosMouseClicked
        // TODO add your handling code here:
        int selectedRow = tablaAlumnos.getSelectedRow();
        if (selectedRow != -1) {
            // Obtener los datos de la fila seleccionada
            String matricula = tablaAlumnos.getValueAt(selectedRow, 0).toString();
            String nombre = tablaAlumnos.getValueAt(selectedRow, 1).toString();
            String apellido = tablaAlumnos.getValueAt(selectedRow, 2).toString();
            String correo = tablaAlumnos.getValueAt(selectedRow, 3).toString();
            String direccion = tablaAlumnos.getValueAt(selectedRow, 4).toString();

            // Crear el DTO con los datos seleccionados
            AlumnoDTO alumnoDTO = new AlumnoDTO(matricula, nombre, apellido, correo, direccion);
            try {
                String mensaje = """
                                 \u00bfEst\u00e1s seguro de que deseas eliminar al siguiente alumno?
                                 Matr\u00edcula: """ + alumnoDTO.getMatricula() + "\n"
                        + "Nombre: " + alumnoDTO.getNombre() + " " + alumnoDTO.getApellido() + "\n"
                        + "Correo: " + alumnoDTO.getCorreo() + "\n"
                        + "Dirección: " + alumnoDTO.getDireccion();

// Mostrar el JOptionPane con opciones "Sí" y "No"
                int respuesta = JOptionPane.showConfirmDialog(
                        this,
                        mensaje,
                        "Confirmar Eliminación",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.WARNING_MESSAGE
                );
                if(respuesta==JOptionPane.YES_OPTION){
                crud.eliminarAlumno(alumnoDTO);
                }

            } catch (ControllerException ex) {
                Logger.getLogger(FrmBusquedaEliminar.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }//GEN-LAST:event_tablaAlumnosMouseClicked

    private void txtDatosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDatosKeyTyped
        // TODO add your handling code here:
        try {
            actualizarTablaAlumnos(consultas.consultarPorMatricula(txtDatos.getText()));
            if (consultas.consultarPorMatricula(txtDatos.getText()).size() < 1) {
                actualizarTablaAlumnos(consultas.consultarPorNombre(txtDatos.getText()));
            }
        } catch (ControllerException e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_txtDatosKeyTyped

    public void actualizarTablaAlumnos(List<AlumnoDTO> alumnos) {

        DefaultTableModel modelo = (DefaultTableModel) tablaAlumnos.getModel();

        modelo.setRowCount(0);

        for (AlumnoDTO alumno : alumnos) {
            Object[] fila = { // ID
                alumno.getNombre(),
                alumno.getApellido(),
                alumno.getMatricula(),
                alumno.getCorreo(),
                alumno.getDireccion()
            };
            modelo.addRow(fila);

        }

    }

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
            java.util.logging.Logger.getLogger(FrmBusquedaEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmBusquedaEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmBusquedaEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmBusquedaEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmBusquedaEliminar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBusqueda1;
    private javax.swing.JButton btnInicio1;
    private javax.swing.JButton btnRegistros1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaAlumnos;
    private javax.swing.JTextField txtDatos;
    // End of variables declaration//GEN-END:variables
}
