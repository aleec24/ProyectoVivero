package Test;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author TribalRope
 */
public class FinsertarPlanta extends javax.swing.JFrame {

    static Connection conn = null;

    /**
     * Creates new form FinsertarCliente
     */
    public FinsertarPlanta() {
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

        jLabelIdPlanta = new javax.swing.JLabel();
        jLabelNombrePlanta = new javax.swing.JLabel();
        jLabelNombreCientifico = new javax.swing.JLabel();
        jLabelPrecioPlanta = new javax.swing.JLabel();
        jTextIdPlanta = new javax.swing.JTextField();
        jTextNombrePlanta = new javax.swing.JTextField();
        jTextNombreCientifico = new javax.swing.JTextField();
        jTextPrecioPlanta = new javax.swing.JTextField();
        jButtonInsertarPlanta = new javax.swing.JButton();
        jButtonMostrarPlanta = new javax.swing.JButton();
        jLabelDescripcionPlanta = new javax.swing.JLabel();
        jLabelToxicidadPlanta = new javax.swing.JLabel();
        jTextDescripcionPlanta = new javax.swing.JTextField();
        jTextToxicidad = new javax.swing.JTextField();
        jLabelIdClima = new javax.swing.JLabel();
        jTextIdClima = new javax.swing.JTextField();
        jLabeIdSuelo = new javax.swing.JLabel();
        jTextIdSuelo = new javax.swing.JTextField();
        jLabeIdExposicionSolar = new javax.swing.JLabel();
        jTextIdExposicionSolar = new javax.swing.JTextField();
        jLabeIdRiego = new javax.swing.JLabel();
        jTextIdRiego = new javax.swing.JTextField();
        jLabelIdTipoPlanta = new javax.swing.JLabel();
        jLabelIdEstacionFlorecimiento = new javax.swing.JLabel();
        jTextIdEstacionFlorecimiento = new javax.swing.JTextField();
        jTextIdTipoPlanta = new javax.swing.JTextField();
        jLabeIdRegion = new javax.swing.JLabel();
        jTextIdRegion = new javax.swing.JTextField();
        jLabeIdPeste = new javax.swing.JLabel();
        jTextIdPeste = new javax.swing.JTextField();
        jLabeIdEnfermedad = new javax.swing.JLabel();
        jTextIdEnfermedad = new javax.swing.JTextField();
        jLabelIdPropagacion = new javax.swing.JLabel();
        jTextPrecioPlanta1 = new javax.swing.JTextField();
        jLabelImagenPlanta = new javax.swing.JLabel();
        jTextImagenPlanta = new javax.swing.JTextField();
        jLabelIdProveedor = new javax.swing.JLabel();
        jTextIdProveedor = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelIdPlanta.setText("ID Planta:");

        jLabelNombrePlanta.setText("Nombre Común:");

        jLabelNombreCientifico.setText("Nombre Científico :");

        jLabelPrecioPlanta.setText("Precio:");

        jTextIdPlanta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIdPlantaActionPerformed(evt);
            }
        });

        jTextNombreCientifico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNombreCientificoActionPerformed(evt);
            }
        });

        jButtonInsertarPlanta.setText("Insertar Planta");
        jButtonInsertarPlanta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertarPlantaActionPerformed(evt);
            }
        });

        jButtonMostrarPlanta.setText("Mostrar Cliente");
        jButtonMostrarPlanta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostrarPlantaActionPerformed(evt);
            }
        });

        jLabelDescripcionPlanta.setText("Descripción:");

        jLabelToxicidadPlanta.setText("Toxicidad:");

        jTextDescripcionPlanta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDescripcionPlantaActionPerformed(evt);
            }
        });

        jLabelIdClima.setText("ID Clima:");

        jTextIdClima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIdClimaActionPerformed(evt);
            }
        });

        jLabeIdSuelo.setText("ID Suelo:");

        jTextIdSuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIdSueloActionPerformed(evt);
            }
        });

        jLabeIdExposicionSolar.setText("ID Exposición Solar:");

        jTextIdExposicionSolar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIdExposicionSolarActionPerformed(evt);
            }
        });

        jLabeIdRiego.setText("ID Riego:");

        jTextIdRiego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIdRiegoActionPerformed(evt);
            }
        });

        jLabelIdTipoPlanta.setText("Id Tipo Planta:");

        jLabelIdEstacionFlorecimiento.setText("Id Estacion Florecimiento:");

        jLabeIdRegion.setText("ID Región:");

        jTextIdRegion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIdRegionActionPerformed(evt);
            }
        });

        jLabeIdPeste.setText("ID Peste:");

        jTextIdPeste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIdPesteActionPerformed(evt);
            }
        });

        jLabeIdEnfermedad.setText("ID Enfermedad:");

        jTextIdEnfermedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIdEnfermedadActionPerformed(evt);
            }
        });

        jLabelIdPropagacion.setText("Id Propagacion:");

        jLabelImagenPlanta.setText("URL Imagen:");

        jLabelIdProveedor.setText("Id Proveedor:");

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
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelImagenPlanta)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabelIdPropagacion)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextPrecioPlanta1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabeIdPeste)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(149, 149, 149)
                                            .addComponent(jTextIdPeste, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabeIdRegion)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(149, 149, 149)
                                                .addComponent(jTextIdRegion, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelIdEstacionFlorecimiento)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(149, 149, 149)
                                                .addComponent(jTextIdEstacionFlorecimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabelToxicidadPlanta)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jTextToxicidad, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabeIdEnfermedad)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(149, 149, 149)
                                            .addComponent(jTextIdEnfermedad, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelDescripcionPlanta)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(149, 149, 149)
                                            .addComponent(jTextDescripcionPlanta, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jTextPrecioPlanta, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(149, 149, 149)
                                .addComponent(jTextIdProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelIdProveedor)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelIdTipoPlanta)
                                .addGap(79, 79, 79)
                                .addComponent(jTextIdTipoPlanta, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabeIdRiego)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelIdPlanta)
                                    .addComponent(jLabelNombrePlanta)
                                    .addComponent(jLabelNombreCientifico)
                                    .addComponent(jLabelIdClima)
                                    .addComponent(jLabeIdSuelo)
                                    .addComponent(jLabeIdExposicionSolar))
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jTextIdRiego, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jTextIdExposicionSolar, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextIdSuelo, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextIdClima, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextNombrePlanta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                                            .addComponent(jTextNombreCientifico, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextIdPlanta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jTextImagenPlanta, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabelPrecioPlanta)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(143, 143, 143)
                                .addComponent(jButtonInsertarPlanta)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonMostrarPlanta)))
                        .addContainerGap(206, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelIdPlanta)
                    .addComponent(jTextIdPlanta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNombrePlanta)
                    .addComponent(jTextNombrePlanta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNombreCientifico)
                    .addComponent(jTextNombreCientifico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelIdClima)
                    .addComponent(jTextIdClima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabeIdSuelo)
                    .addComponent(jTextIdSuelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabeIdExposicionSolar)
                    .addComponent(jTextIdExposicionSolar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabeIdRiego)
                    .addComponent(jTextIdRiego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextIdTipoPlanta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelIdTipoPlanta))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelIdEstacionFlorecimiento)
                    .addComponent(jTextIdEstacionFlorecimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabeIdRegion)
                    .addComponent(jTextIdRegion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelToxicidadPlanta)
                    .addComponent(jTextToxicidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabeIdPeste)
                    .addComponent(jTextIdPeste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabeIdEnfermedad)
                    .addComponent(jTextIdEnfermedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDescripcionPlanta)
                    .addComponent(jTextDescripcionPlanta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPrecioPlanta)
                    .addComponent(jTextPrecioPlanta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIdPropagacion)
                    .addComponent(jTextPrecioPlanta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelImagenPlanta)
                    .addComponent(jTextImagenPlanta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelIdProveedor)
                    .addComponent(jTextIdProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonInsertarPlanta)
                    .addComponent(jButtonMostrarPlanta)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonInsertarPlantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertarPlantaActionPerformed
        // TODO add your handling code here:
        try {
            // main miconexion = new main();
            conn = DatabaseUtils.Enlace(conn);
            String sqlinsertar = "BEGIN\n"
                    + "   inCli(?,?,?,?,?,?);\n"
                    + "END;";
            PreparedStatement psta = conn.prepareStatement(sqlinsertar);
            psta.setString(1, jTextIdPlanta.getText());
            psta.setString(2, jTextNombrePlanta.getText());
            psta.setString(3, jTextNombreCientifico.getText());
            psta.setString(4, jTextToxicidad.getText());
            psta.setString(5, jTextDescripcionPlanta.getText());
            psta.setString(6, jTextPrecioPlanta.getText());
            psta.execute();
            psta.close();
            JOptionPane.showMessageDialog(null, "Registro Guardado Exitosamente");
        } catch (Exception e) {
            System.out.println(e.getCause());
        }
        limpiar();


    }//GEN-LAST:event_jButtonInsertarPlantaActionPerformed

    public void limpiar() {
        jTextIdPlanta.setText("");
        jTextNombrePlanta.setText("");
        jTextNombreCientifico.setText("");
        jTextPrecioPlanta.setText("");
        jTextDescripcionPlanta.setText("");
        jTextToxicidad.setText("");
    }

    private void jTextIdPlantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIdPlantaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextIdPlantaActionPerformed

    private void jTextNombreCientificoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNombreCientificoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNombreCientificoActionPerformed

    private void jButtonMostrarPlantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostrarPlantaActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        FMostrarPlanta Fmostrar = new FMostrarPlanta();
        Fmostrar.setVisible(true);
        Fmostrar.pack();

    }//GEN-LAST:event_jButtonMostrarPlantaActionPerformed

    private void jTextDescripcionPlantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDescripcionPlantaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDescripcionPlantaActionPerformed

    private void jTextIdClimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIdClimaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextIdClimaActionPerformed

    private void jTextIdSueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIdSueloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextIdSueloActionPerformed

    private void jTextIdExposicionSolarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIdExposicionSolarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextIdExposicionSolarActionPerformed

    private void jTextIdRiegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIdRiegoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextIdRiegoActionPerformed

    private void jTextIdRegionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIdRegionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextIdRegionActionPerformed

    private void jTextIdPesteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIdPesteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextIdPesteActionPerformed

    private void jTextIdEnfermedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIdEnfermedadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextIdEnfermedadActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      Menu menu=new Menu();
menu.setVisible(true);
this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(FinsertarPlanta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FinsertarPlanta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FinsertarPlanta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FinsertarPlanta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FinsertarPlanta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonInsertarPlanta;
    private javax.swing.JButton jButtonMostrarPlanta;
    private javax.swing.JLabel jLabeIdEnfermedad;
    private javax.swing.JLabel jLabeIdExposicionSolar;
    private javax.swing.JLabel jLabeIdPeste;
    private javax.swing.JLabel jLabeIdRegion;
    private javax.swing.JLabel jLabeIdRiego;
    private javax.swing.JLabel jLabeIdSuelo;
    private javax.swing.JLabel jLabelDescripcionPlanta;
    private javax.swing.JLabel jLabelIdClima;
    private javax.swing.JLabel jLabelIdEstacionFlorecimiento;
    private javax.swing.JLabel jLabelIdPlanta;
    private javax.swing.JLabel jLabelIdPropagacion;
    private javax.swing.JLabel jLabelIdProveedor;
    private javax.swing.JLabel jLabelIdTipoPlanta;
    private javax.swing.JLabel jLabelImagenPlanta;
    private javax.swing.JLabel jLabelNombreCientifico;
    private javax.swing.JLabel jLabelNombrePlanta;
    private javax.swing.JLabel jLabelPrecioPlanta;
    private javax.swing.JLabel jLabelToxicidadPlanta;
    private javax.swing.JTextField jTextDescripcionPlanta;
    private javax.swing.JTextField jTextIdClima;
    private javax.swing.JTextField jTextIdEnfermedad;
    private javax.swing.JTextField jTextIdEstacionFlorecimiento;
    private javax.swing.JTextField jTextIdExposicionSolar;
    private javax.swing.JTextField jTextIdPeste;
    private javax.swing.JTextField jTextIdPlanta;
    private javax.swing.JTextField jTextIdProveedor;
    private javax.swing.JTextField jTextIdRegion;
    private javax.swing.JTextField jTextIdRiego;
    private javax.swing.JTextField jTextIdSuelo;
    private javax.swing.JTextField jTextIdTipoPlanta;
    private javax.swing.JTextField jTextImagenPlanta;
    private javax.swing.JTextField jTextNombreCientifico;
    private javax.swing.JTextField jTextNombrePlanta;
    private javax.swing.JTextField jTextPrecioPlanta;
    private javax.swing.JTextField jTextPrecioPlanta1;
    private javax.swing.JTextField jTextToxicidad;
    // End of variables declaration//GEN-END:variables
}
