package Test;

import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class FMostrarProductos extends javax.swing.JFrame {

    //creando variables
    static Connection conn = null;
    static Statement s = null;
    static ResultSet rs = null;
    //Para establecer el modelo al JTable
    DefaultTableModel modelo = new DefaultTableModel();

    public FMostrarProductos() {
        initComponents();
        this.jProductos.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbMostrarProductos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jProductos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbMostrarProductos.setText("Mostrar Productos");
        jbMostrarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMostrarProductosActionPerformed(evt);
            }
        });

        jProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jProductos);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbMostrarProductos)
                .addGap(144, 144, 144))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 827, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jButton1)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jbMostrarProductos)
                .addGap(57, 57, 57)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbMostrarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMostrarProductosActionPerformed
        // TODO add your handling code here:
        try {
            //ejecuta la conexion   
            conn = DatabaseUtils.Enlace(conn);
            //ejecuta la consulta
            rs = DatabaseUtils.EnlEst(rs);
            //volcamos los resultados de rs a rsmetadata
            ResultSetMetaData rsMd = rs.getMetaData();
            //La cantidad de columnas que tiene la consulta
            int cantidadColumnas = rsMd.getColumnCount();
            //Establecer como cabezeras el nombre de las columnas
            for (int i = 1; i <= cantidadColumnas; i++) {
                modelo.addColumn(rsMd.getColumnLabel(i));
            }
            //Creando las filas para el JTable
            while (rs.next()) {
                Object[] fila = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                modelo.addRow(fila);
            }
            rs.close();
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }


    }//GEN-LAST:event_jbMostrarProductosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    Menu menu=new Menu();
menu.setVisible(true);
this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FMostrarProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JTable jProductos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbMostrarProductos;
    // End of variables declaration//GEN-END:variables
}//fin
