package Test;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TribalRope
 */
public class FinsertarProducto extends javax.swing.JFrame {

    static Connection conn = null;

    /**
     * Creates new form FinsertarCliente
     */
    public FinsertarProducto() {
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

        jLabelIdProducto = new javax.swing.JLabel();
        jLabelNombreProducto = new javax.swing.JLabel();
        jLabelDescripcionProducto = new javax.swing.JLabel();
        jLabelUrlImagen = new javax.swing.JLabel();
        jTextIdProducto = new javax.swing.JTextField();
        jTextNombreProducto = new javax.swing.JTextField();
        jTextDescripcionProducto = new javax.swing.JTextField();
        jTextUrlImagen = new javax.swing.JTextField();
        jButtonInsertarProducto = new javax.swing.JButton();
        jButtonMostrarPlanta = new javax.swing.JButton();
        jLabelPrecioProducto = new javax.swing.JLabel();
        jLabelProveedor = new javax.swing.JLabel();
        jTextPrecioProducto = new javax.swing.JTextField();
        jTextProveedor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelIdProducto.setText("ID Producto:");

        jLabelNombreProducto.setText("Nombre:");

        jLabelDescripcionProducto.setText("Descripción:");

        jLabelUrlImagen.setText("URL Imagen:");

        jTextIdProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIdProductoActionPerformed(evt);
            }
        });

        jTextDescripcionProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDescripcionProductoActionPerformed(evt);
            }
        });

        jButtonInsertarProducto.setText("Insertar Producto");
        jButtonInsertarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertarProductoActionPerformed(evt);
            }
        });

        jButtonMostrarPlanta.setText("Mostrar Productos");
        jButtonMostrarPlanta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostrarPlantaActionPerformed(evt);
            }
        });

        jLabelPrecioProducto.setText("Precio:");

        jLabelProveedor.setText("Proveedor:");

        jTextPrecioProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPrecioProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelUrlImagen)
                        .addGap(51, 51, 51)
                        .addComponent(jTextUrlImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelIdProducto)
                            .addComponent(jLabelNombreProducto)
                            .addComponent(jLabelDescripcionProducto)
                            .addComponent(jLabelPrecioProducto)
                            .addComponent(jLabelProveedor))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonInsertarProducto)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonMostrarPlanta))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextProveedor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                                .addComponent(jTextPrecioProducto, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextNombreProducto, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextDescripcionProducto, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextIdProducto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(157, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelIdProducto)
                    .addComponent(jTextIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNombreProducto)
                    .addComponent(jTextNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDescripcionProducto)
                    .addComponent(jTextDescripcionProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPrecioProducto)
                    .addComponent(jTextPrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelProveedor)
                    .addComponent(jTextProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUrlImagen)
                    .addComponent(jTextUrlImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonInsertarProducto)
                    .addComponent(jButtonMostrarPlanta))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonInsertarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertarProductoActionPerformed
        // TODO add your handling code here:
        try {
            // main miconexion = new main();
            conn = main.Enlace(conn);
            String sqlinsertar = "BEGIN\n"
                    + "   inCli(?,?,?,?,?,?);\n"
                    + "END;";
            PreparedStatement psta = conn.prepareStatement(sqlinsertar);
            psta.setString(1, jTextIdProducto.getText());
            psta.setString(2, jTextNombreProducto.getText());
            psta.setString(3, jTextDescripcionProducto.getText());
            psta.setString(4, jTextProveedor.getText());
            psta.setString(5, jTextPrecioProducto.getText());
            psta.setString(6, jTextUrlImagen.getText());
            psta.execute();
            psta.close();
            JOptionPane.showMessageDialog(null, "Registro Guardado Exitosamente");
        } catch (Exception e) {
            System.out.println(e.getCause());
        }
        limpiar();


    }//GEN-LAST:event_jButtonInsertarProductoActionPerformed

    public void limpiar() {
        jTextIdProducto.setText("");
        jTextNombreProducto.setText("");
        jTextDescripcionProducto.setText("");
        jTextUrlImagen.setText("");
        jTextPrecioProducto.setText("");
        jTextProveedor.setText("");
    }

    private void jTextIdProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIdProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextIdProductoActionPerformed

    private void jTextDescripcionProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDescripcionProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDescripcionProductoActionPerformed

    private void jButtonMostrarPlantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostrarPlantaActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        FMostrarProductos Fmostrar = new FMostrarProductos();
        Fmostrar.setVisible(true);
        Fmostrar.pack();

    }//GEN-LAST:event_jButtonMostrarPlantaActionPerformed

    private void jTextPrecioProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPrecioProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPrecioProductoActionPerformed

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
            java.util.logging.Logger.getLogger(FinsertarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FinsertarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FinsertarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FinsertarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new FinsertarProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonInsertarProducto;
    private javax.swing.JButton jButtonMostrarPlanta;
    private javax.swing.JLabel jLabelDescripcionProducto;
    private javax.swing.JLabel jLabelIdProducto;
    private javax.swing.JLabel jLabelNombreProducto;
    private javax.swing.JLabel jLabelPrecioProducto;
    private javax.swing.JLabel jLabelProveedor;
    private javax.swing.JLabel jLabelUrlImagen;
    private javax.swing.JTextField jTextDescripcionProducto;
    private javax.swing.JTextField jTextIdProducto;
    private javax.swing.JTextField jTextNombreProducto;
    private javax.swing.JTextField jTextPrecioProducto;
    private javax.swing.JTextField jTextProveedor;
    private javax.swing.JTextField jTextUrlImagen;
    // End of variables declaration//GEN-END:variables
}
