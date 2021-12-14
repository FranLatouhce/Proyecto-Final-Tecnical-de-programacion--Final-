/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import javax.swing.JOptionPane;

/**
 *
 * @author franc
 */
public class formularioModificarHospital extends javax.swing.JFrame {

    /**
     * Creates new form formularioModificar
     */
    public formularioModificarHospital() {
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

        textoProvincia = new javax.swing.JTextField();
        textoCanton = new javax.swing.JTextField();
        textoDistrito = new javax.swing.JTextField();
        textoUbicacion = new javax.swing.JTextField();
        botonGuardar = new javax.swing.JButton();
        etiquetaNombre = new javax.swing.JLabel();
        botonRegresar = new javax.swing.JButton();
        etiquetaProvincia = new javax.swing.JLabel();
        etiquetaCanton = new javax.swing.JLabel();
        etiquetaDistrito = new javax.swing.JLabel();
        etiquetaUbicacion = new javax.swing.JLabel();
        textoNombre = new javax.swing.JTextField();
        etiquetaBusqueda = new javax.swing.JLabel();
        textoBusqueda = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        imagenDeFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(textoProvincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 172, 145, -1));
        getContentPane().add(textoCanton, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 172, 145, -1));
        getContentPane().add(textoDistrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(565, 172, 145, -1));
        getContentPane().add(textoUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(746, 172, 145, -1));

        botonGuardar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/guardar.png"))); // NOI18N
        botonGuardar.setText("Guardar");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(botonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 293, -1, -1));

        etiquetaNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etiquetaNombre.setText("Nombre del Hospital ");
        getContentPane().add(etiquetaNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 115, -1, -1));

        botonRegresar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/salir.gif"))); // NOI18N
        botonRegresar.setText("Regresar");
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 293, -1, -1));

        etiquetaProvincia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etiquetaProvincia.setText("Provincia");
        getContentPane().add(etiquetaProvincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 115, -1, -1));

        etiquetaCanton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etiquetaCanton.setText("Canton");
        getContentPane().add(etiquetaCanton, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 115, -1, -1));

        etiquetaDistrito.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etiquetaDistrito.setText("Distrito");
        getContentPane().add(etiquetaDistrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(601, 115, -1, -1));

        etiquetaUbicacion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etiquetaUbicacion.setText("Ubicación Exacta");
        getContentPane().add(etiquetaUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 110, -1, -1));

        textoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoNombreActionPerformed(evt);
            }
        });
        getContentPane().add(textoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 172, 145, -1));

        etiquetaBusqueda.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etiquetaBusqueda.setText("Buscar Hospital");
        getContentPane().add(etiquetaBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 44, -1, -1));
        getContentPane().add(textoBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 44, 189, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/buscar.png"))); // NOI18N
        jButton1.setText("Buscar");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 40, -1, -1));

        imagenDeFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes de Fondo/fondo inicio.jpg"))); // NOI18N
        getContentPane().add(imagenDeFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        // Boton para agregar el hospital:
        JOptionPane.showMessageDialog(null, "El hospital se midifico con exito");
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
        // Regresar al menu de hospiales:
        setVisible(false);
        new hospitales().setVisible(true);
    }//GEN-LAST:event_botonRegresarActionPerformed

    private void textoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoNombreActionPerformed

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
            java.util.logging.Logger.getLogger(formularioModificarHospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formularioModificarHospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formularioModificarHospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formularioModificarHospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new formularioModificarHospital().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonRegresar;
    private javax.swing.JLabel etiquetaBusqueda;
    private javax.swing.JLabel etiquetaCanton;
    private javax.swing.JLabel etiquetaDistrito;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JLabel etiquetaProvincia;
    private javax.swing.JLabel etiquetaUbicacion;
    private javax.swing.JLabel imagenDeFondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField textoBusqueda;
    private javax.swing.JTextField textoCanton;
    private javax.swing.JTextField textoDistrito;
    private javax.swing.JTextField textoNombre;
    private javax.swing.JTextField textoProvincia;
    private javax.swing.JTextField textoUbicacion;
    // End of variables declaration//GEN-END:variables
}
