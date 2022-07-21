/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import java.awt.List;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import programas.ver_conex;

/**
 *
 * @author Eduardo Avila <eduavila25@gmail.com>
 */
public class Equipo extends javax.swing.JFrame {

    javax.swing.table.DefaultTableModel cursor;

    /**
     * Creates new form Liga
     */
    public Equipo() {
        initComponents();

        cursor = (javax.swing.table.DefaultTableModel) grilla.getModel();
        // des_text();
        this.setLocationRelativeTo(null);
        cargar_grilla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lcodigo = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        lcodigo3 = new javax.swing.JLabel();
        descripcion = new javax.swing.JTextField();
        lcodigo2 = new javax.swing.JLabel();
        chkActivo = new javax.swing.JCheckBox();
        lcodigo4 = new javax.swing.JLabel();
        txtLiga = new javax.swing.JTextField();
        txtCodigoLiga = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        bcancelar = new javax.swing.JButton();
        bgrabar = new javax.swing.JButton();
        bsalir = new javax.swing.JButton();
        bagregar = new javax.swing.JButton();
        beditar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        grilla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(173, 216, 230));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel4.setText("Equipo");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        jPanel3.setBackground(new java.awt.Color(173, 216, 230));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lcodigo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lcodigo.setText("Codigo :");

        txtcodigo.setEnabled(false);
        txtcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodigoActionPerformed(evt);
            }
        });
        txtcodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcodigoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcodigoKeyTyped(evt);
            }
        });

        lcodigo3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lcodigo3.setText("Descripcion:");

        descripcion.setEnabled(false);
        descripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descripcionActionPerformed(evt);
            }
        });
        descripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                descripcionKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                descripcionKeyTyped(evt);
            }
        });

        lcodigo2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lcodigo2.setText("Estado:");

        chkActivo.setText("Activo");
        chkActivo.setEnabled(false);
        chkActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkActivoActionPerformed(evt);
            }
        });

        lcodigo4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lcodigo4.setText("Liga:");

        txtLiga.setEditable(false);
        txtLiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLigaActionPerformed(evt);
            }
        });
        txtLiga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLigaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLigaKeyTyped(evt);
            }
        });

        txtCodigoLiga.setEnabled(false);
        txtCodigoLiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoLigaActionPerformed(evt);
            }
        });
        txtCodigoLiga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoLigaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lcodigo4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigoLiga, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLiga, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lcodigo2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkActivo))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lcodigo3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lcodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtcodigo)
                        .addGap(2, 2, 2))
                    .addComponent(lcodigo))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lcodigo3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtLiga)
                        .addComponent(txtCodigoLiga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lcodigo4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lcodigo2)
                    .addComponent(chkActivo))
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        bcancelar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bcancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Cancel_icon-icons.com_73703.png"))); // NOI18N
        bcancelar.setEnabled(false);
        bcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcancelarActionPerformed(evt);
            }
        });

        bgrabar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bgrabar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/savedisk_floppydisk_guardar_1543.png"))); // NOI18N
        bgrabar.setEnabled(false);
        bgrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bgrabarActionPerformed(evt);
            }
        });

        bsalir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logout_90894.png"))); // NOI18N
        bsalir.setToolTipText("");
        bsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsalirActionPerformed(evt);
            }
        });

        bagregar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bagregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/1486485588-add-create-new-math-sign-cross-plus_81186.png"))); // NOI18N
        bagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bagregarActionPerformed(evt);
            }
        });

        beditar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        beditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/documentediting_editdocuments_text_documentedi_2820.png"))); // NOI18N
        beditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bgrabar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bsalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bagregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bcancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(beditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(bagregar)
                .addGap(22, 22, 22)
                .addComponent(beditar)
                .addGap(18, 18, 18)
                .addComponent(bgrabar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bcancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bsalir)
                .addContainerGap())
        );

        grilla.setBackground(new java.awt.Color(153, 255, 255));
        grilla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Descripcion", "Estado", "Liga"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        grilla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grillaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(grilla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigoActionPerformed
        // TODO add your handling code here:
        buscar();
    }//GEN-LAST:event_txtcodigoActionPerformed

    private void txtcodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodigoKeyPressed
        // TODO add your handling code here:
        if (bandera.equals("editar")) {
            if (txtcodigo.getText().equals("") && evt.getKeyChar() == KeyEvent.VK_ENTER)//no trae nada
            {
                JTextField[] tfParam = new JTextField[2];
                tfParam[0] = this.txtcodigo;
                VentanaBuscar buscador = new VentanaBuscar("SELECT ID,UPPER(descripcion)AS descripcion\n"
                        + "FROM equipo where descripcion like  ", new String[]{"CODIGO EQUIPO", "NOMBRE EQUIPO"}, 2, tfParam);
                buscador.setTitle("BUSCAR EQUIPOS");
                buscador.setVisible(true);
            }
        }
    }//GEN-LAST:event_txtcodigoKeyPressed

    private void descripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descripcionActionPerformed
        // TODO add your handling code here:
        txtCodigoLiga.setEnabled(true);
        txtCodigoLiga.requestFocus();
    }//GEN-LAST:event_descripcionActionPerformed

    private void descripcionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descripcionKeyReleased
        // TODO add your handling code here:
        // convertiraMayusculasEnJtextfield(descripcion);
    }//GEN-LAST:event_descripcionKeyReleased

    private void descripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descripcionKeyTyped
        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_descripcionKeyTyped

    private void chkActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkActivoActionPerformed
        // TODO add your handling code here:
        if (chkActivo.isSelected() == true) {
            estado = 1;
            bgrabar.setEnabled(true);
            bgrabar.requestFocus();
        }
        if (chkActivo.isSelected() == false) {
            estado = 0;
            bgrabar.setEnabled(true);
            bgrabar.requestFocus();
        }
    }//GEN-LAST:event_chkActivoActionPerformed

    private void bcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcancelarActionPerformed
        // TODO add your handling code here:
        borrar_text();
        hab_botones();
        des_text();
    }//GEN-LAST:event_bcancelarActionPerformed

    private void bgrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bgrabarActionPerformed
        // TODO add your handling code here:
        grabar();
        borrar_text();
        hab_botones();
        des_text();

    }//GEN-LAST:event_bgrabarActionPerformed

    private void bsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsalirActionPerformed
        // TODO add your handling code here:
        salir();
    }//GEN-LAST:event_bsalirActionPerformed

    private void bagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bagregarActionPerformed
        // TODO add your handling code here:
        bandera = "agregar";
        gencod();
        des_botones();
        txtcodigo.setEnabled(false);
        descripcion.setEnabled(true);
        descripcion.requestFocus();
        
    }//GEN-LAST:event_bagregarActionPerformed

    private void beditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beditarActionPerformed
        // TODO add your handling code here:
        bandera = "editar";
        botonEditar();
    }//GEN-LAST:event_beditarActionPerformed

    private void grillaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grillaMouseClicked
        // TODO add your handling code here:}
    }//GEN-LAST:event_grillaMouseClicked

    private void txtLigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLigaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLigaActionPerformed

    private void txtLigaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLigaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLigaKeyReleased

    private void txtLigaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLigaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLigaKeyTyped

    private void txtCodigoLigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoLigaActionPerformed
        // TODO add your handling code here:
        bucarLiga();
    }//GEN-LAST:event_txtCodigoLigaActionPerformed

    private void txtCodigoLigaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoLigaKeyPressed
        // TODO add your handling code here:
        if (txtCodigoLiga.getText().equals("") && evt.getKeyChar() == KeyEvent.VK_ENTER)//no trae nada
        {
            JTextField[] tfParam = new JTextField[2];
            tfParam[0] = this.txtCodigoLiga;
            VentanaBuscar buscador = new VentanaBuscar("SELECT id,UPPER(descripcion)AS descripcion\n"
                    + "FROM liga where descripcion like  ", new String[]{"CODIGO LIGA", "NOMBRE LIGA"}, 2, tfParam);
            buscador.setTitle("BUSCAR LIGAS");
            buscador.setVisible(true);
        }
    }//GEN-LAST:event_txtCodigoLigaKeyPressed

    private void txtcodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodigoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodigoKeyTyped

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
            java.util.logging.Logger.getLogger(Equipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Equipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Equipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Equipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Equipo().setVisible(true);
            }
        });
    }

    // Declaracion de variables de clase
    public String bandera = "";
    public int estado = 0;
    public int valorBase;


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bagregar;
    private javax.swing.JButton bcancelar;
    private javax.swing.JButton beditar;
    private javax.swing.JButton bgrabar;
    private javax.swing.JButton bsalir;
    private javax.swing.JCheckBox chkActivo;
    private javax.swing.JTextField descripcion;
    private javax.swing.JTable grilla;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lcodigo;
    private javax.swing.JLabel lcodigo2;
    private javax.swing.JLabel lcodigo3;
    private javax.swing.JLabel lcodigo4;
    private javax.swing.JTextField txtCodigoLiga;
    private javax.swing.JTextField txtLiga;
    private javax.swing.JTextField txtcodigo;
    // End of variables declaration//GEN-END:variables

    // metodo gencod() sirve para generar el id para la tabla ligas
    private void gencod() {
        try {
            ver_conex conn = new ver_conex();
            conn.sentencia = conn.conexion.createStatement();
            conn.resultado = conn.sentencia.executeQuery("SELECT IFNULL(MAX(id),0)+ 1 AS xxx FROM equipo");
            conn.resultado.next();
            this.txtcodigo.setText(conn.resultado.getString("xxx"));
        } catch (SQLException ex) {
            Logger.getLogger(Equipo.class.getName()).log(Level.SEVERE, null, ex);
            //   } catch (SQLException ex)
            {
                Logger.getLogger(Equipo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    // Metodo para controlar estado de botones 
    private void des_botones() //metodo para deshabilitar botones
    {
        bagregar.setEnabled(false);
        beditar.setEnabled(false);
        bgrabar.setEnabled(false);
        bsalir.setEnabled(false);
        bcancelar.setEnabled(true);
    }

    private void borrar_text() {
        txtcodigo.setText("");
        descripcion.setText("");
        txtCodigoLiga.setText("");
        txtLiga.setText("");
        chkActivo.setSelected(false);
    }

    private void hab_botones() // metodo para hab botones
    {
        bagregar.setEnabled(true);
        beditar.setEnabled(true);
        bgrabar.setEnabled(false);
        bsalir.setEnabled(true);
        bcancelar.setEnabled(false);
    }

    private void des_text() {
        descripcion.setEnabled(false);
        txtCodigoLiga.setEnabled(false);
        chkActivo.setEnabled(false);
        txtcodigo.setEnabled(false);
    }

    private void grabar() {
        try {
            ver_conex conn = new ver_conex();
            conn.sentencia = conn.conexion.createStatement();
            if (bandera.equals("agregar")) {
                if (chkActivo.isSelected() == true) {
                    estado = 1;
                }
                gencod();
                conn.sentencia.executeUpdate("INSERT INTO equipo(id,descripcion,id_liga,estado)values(" + txtcodigo.getText() + ",'" + descripcion.getText() + "','" + txtCodigoLiga.getText() + "'," + estado + ")");

                cargar_grilla();
            }
            if (bandera.equals("editar")) {
                if (chkActivo.isSelected() == true) {
                    estado = 1;
                }
                conn.sentencia.executeUpdate("UPDATE equipo SET descripcion='" + descripcion.getText() + "', id_liga=" + txtCodigoLiga.getText() + " ,estado=" + estado + " WHERE id=" + txtcodigo.getText());
                cargar_grilla();
            }
            JOptionPane.showMessageDialog(null, "REGISTRO GRABADO", "CONFIRMACION", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(Equipo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void cargar_grilla() {
        try {
            for (int i = grilla.getRowCount() - 1; i >= 0; i--) {
                cursor.removeRow(i);
            }
            ver_conex conn = new ver_conex();
            conn.sentencia = conn.conexion.createStatement();
            conn.resultado = conn.sentencia.executeQuery("SELECT e.id, e.descripcion, "
                    + " case when e.estado = 1 then 'ACTIVO' else  'INACTIVO' end as estado ,"
                    + " l.descripcion as liga"
                    + "  from equipo e inner join liga l on e.id_liga =  l.id ");

            while (conn.resultado.next()) {
                Object[] datos = {
                    conn.resultado.getString("id"),
                    conn.resultado.getString("descripcion"),
                    conn.resultado.getString("estado"),
                    conn.resultado.getString("liga")};
                cursor.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Equipo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void salir() {
        int respuesta = JOptionPane.showConfirmDialog(this, "DESEA SALIR", "CONFIRMAR", JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.YES_OPTION) {
            dispose();
        }
    }

    private void botonEditar() //metodo para deshabilitar botones
    {
        bagregar.setEnabled(false);
        beditar.setEnabled(false);
        bgrabar.setEnabled(true);
        bsalir.setEnabled(false);
        bcancelar.setEnabled(true);
        txtcodigo.setEnabled(true);
        txtcodigo.requestFocus();
    }

    private void buscar() {
        try {

            ver_conex conn = new ver_conex();
            conn.sentencia = conn.conexion.createStatement();
            conn.resultado = conn.sentencia.executeQuery("SELECT e.id, e.descripcion,"
                    + " e.estado as estado,"
                    + " l.id AS id_liga, l.descripcion as descripcionLiga"
                    + " from equipo e inner join liga l on e.id_liga =  l.id "
                    + " WHERE e.id  = " + txtcodigo.getText() + "");
            boolean encontro = conn.resultado.next();

            if (encontro == true && bandera.equals("editar")) // no encontro
            {
                descripcion.setEnabled(true);
                descripcion.requestFocus();
                txtcodigo.setEnabled(false);
                txtcodigo.setText(conn.resultado.getString("id"));
                descripcion.setText(conn.resultado.getString("descripcion"));
                txtCodigoLiga.setText(conn.resultado.getString("id_liga")); 
                txtLiga.setText(conn.resultado.getString("descripcionLiga"));
                this.valorBase = (Integer.parseInt(conn.resultado.getString("estado")));

                if (valorBase == 1) {
                    chkActivo.setSelected(true);
                }
                if (valorBase == 0) {
                    chkActivo.setSelected(false);
                }

            }
            if (encontro == false && bandera.equals("editar")) {

                JOptionPane.showMessageDialog(null, "EL CODIGO INGRESADO NO EXITE");

            }
     
        } catch (SQLException ex) {
            System.out.println( "SQLException" +  ex );
        }
    }

    private void bucarLiga() {

        try {
            ver_conex conn = new ver_conex();
            conn.sentencia = conn.conexion.createStatement();
            conn.resultado = conn.sentencia.executeQuery("SELECT  * "
                    + "                    FROM liga \n"
                    + "                    WHERE  estado = 1 and id = " + this.txtCodigoLiga.getText());

            if (conn.resultado.next())//si encontro
            {
                this.txtLiga.setText(conn.resultado.getString("descripcion"));
                chkActivo.setEnabled(true);
                chkActivo.requestFocus();

            } else//no encontro
            {
                JOptionPane.showMessageDialog(null, "CODIGO DE LIGA NO EXISTE", "MENSAJE", JOptionPane.INFORMATION_MESSAGE);
                this.txtCodigoLiga.setEnabled(true);
                this.txtCodigoLiga.requestFocus();
            }

        } catch (SQLException exceptionSql) {
            System.out.println("exceptionSql" + exceptionSql);
        }
    }
}
