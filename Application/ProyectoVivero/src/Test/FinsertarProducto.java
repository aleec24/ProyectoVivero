package Test;

import Test.models.Proveedor;
import java.awt.HeadlessException;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author TribalRope
 */
public class FinsertarProducto extends javax.swing.JFrame {

    private Connection conn = null;
    private ArrayList<Proveedor> proveedores = new ArrayList<>();

    /**
     * Creates new form FinsertarCliente
     */
    public FinsertarProducto() {
        initComponents();
        initCombobox();
    }

    private void initCombobox() {

        try {
            // ejecuta la conexion
            conn = DatabaseUtils.Enlace(conn);
            // ejecuta la consulta
            ResultSet rs = null;
            rs = DatabaseUtils.Proveedores(rs);

            while (rs.next()) {
                var proveedorId = rs.getObject(1);
                var proveedorNombre = rs.getObject(2);

                proveedores.add(new Proveedor(proveedorId.toString(), proveedorNombre.toString()));

                jComboBoxProveedor.addItem(proveedorNombre.toString());
            }

            rs.close();
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
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
        jComboBoxProveedor = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

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

        jComboBoxProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxProveedorActionPerformed(evt);
            }
        });

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(8, 8, 8)
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
                                .addComponent(jComboBoxProveedor, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextPrecioProducto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                                .addComponent(jTextNombreProducto, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextDescripcionProducto, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextIdProducto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(160, Short.MAX_VALUE))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelProveedor)
                    .addComponent(jComboBoxProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUrlImagen)
                    .addComponent(jTextUrlImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonInsertarProducto)
                    .addComponent(jButtonMostrarPlanta))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonInsertarProductoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonInsertarProductoActionPerformed

        try {
            // main miconexion = new main();
            conn = DatabaseUtils.Enlace(conn);
            String sqlinsertar = "BEGIN\n"
                    + "   inProductoVivero(?,?,?,?,?,?);\n"
                    + "END;";
            PreparedStatement psta = conn.prepareStatement(sqlinsertar);

            psta.setString(1, jTextIdProducto.getText());
            psta.setString(2, jTextNombreProducto.getText());
            psta.setString(3, jTextDescripcionProducto.getText());
            psta.setString(4, jTextPrecioProducto.getText());

            String indexProveedor = "";
            for (Proveedor proveedor : proveedores) {
                if (proveedor.getName().equals(jComboBoxProveedor.getSelectedItem().toString())) {
                    indexProveedor = proveedor.getId();
                }
            }
            psta.setString(5, indexProveedor);
            psta.setString(6, jTextUrlImagen.getText());

            psta.execute();
            psta.close();
            JOptionPane.showMessageDialog(null, "Registro Guardado Exitosamente");
        } catch (HeadlessException | NumberFormatException | SQLException e) {
            System.out.println(e.getCause());
        }
        limpiar();

    }// GEN-LAST:event_jButtonInsertarProductoActionPerformed

    public void limpiar() {
        jTextIdProducto.setText("");
        jTextNombreProducto.setText("");
        jTextDescripcionProducto.setText("");
        jTextUrlImagen.setText("");
        jTextPrecioProducto.setText("");
        jComboBoxProveedor.setSelectedIndex(0);
    }

    private void jTextIdProductoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextIdProductoActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jTextIdProductoActionPerformed

    private void jTextDescripcionProductoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextDescripcionProductoActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jTextDescripcionProductoActionPerformed

    private void jButtonMostrarPlantaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonMostrarPlantaActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        FMostrarProductos Fmostrar = new FMostrarProductos();
        Fmostrar.setVisible(true);
        Fmostrar.pack();

    }// GEN-LAST:event_jButtonMostrarPlantaActionPerformed

    private void jTextPrecioProductoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextPrecioProductoActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jTextPrecioProductoActionPerformed

    private void jComboBoxProveedorActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jComboBoxProveedorActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jComboBoxProveedorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        this.dispose();
    }// GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FinsertarProducto.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FinsertarProducto.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FinsertarProducto.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FinsertarProducto.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FinsertarProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonInsertarProducto;
    private javax.swing.JButton jButtonMostrarPlanta;
    private javax.swing.JComboBox<String> jComboBoxProveedor;
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
    private javax.swing.JTextField jTextUrlImagen;
    // End of variables declaration//GEN-END:variables
}
