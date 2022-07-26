/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import programas.ver_conex;

/**
 *
 * @author Eduardo Avila <eduavila25@gmail.com>
 */
public class ListaFechas extends javax.swing.JFrame {

    javax.swing.table.DefaultTableModel cursor;

    /**
     * Creates new form Liga
     */
    public ListaFechas() {
        initComponents();

        cursor = (javax.swing.table.DefaultTableModel) grilla.getModel();
        // des_text();
        this.setLocationRelativeTo(null);
        ListaFechas.lidRegistro.setText(RegistrarTorneo.txtcodigo.getText());
        ListaFechas.lIdTorneo.setText(RegistrarTorneo.txtIdTorneo.getText());
        ListaFechas.lDescripcionTorneo.setText(RegistrarTorneo.txtDenominacion.getText());
        ListaFechas.lPeriodo.setText(RegistrarTorneo.txtPeriodo.getText());
        ListaFechas.lLiga.setText(RegistrarTorneo.txtDescripcionLiga.getText());

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
        jScrollPane1 = new javax.swing.JScrollPane();
        grilla = new javax.swing.JTable();
        bsalir = new javax.swing.JButton();
        lIdTorneo = new javax.swing.JLabel();
        lDescripcionTorneo = new javax.swing.JLabel();
        lPeriodo = new javax.swing.JLabel();
        lPeriodo1 = new javax.swing.JLabel();
        lLiga = new javax.swing.JLabel();
        lPeriodo2 = new javax.swing.JLabel();
        lIdTorneo1 = new javax.swing.JLabel();
        lidRegistro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(173, 216, 230));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel4.setText("Listado de Fechas");

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

        grilla.setBackground(new java.awt.Color(153, 255, 255));
        grilla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "Local", "Visitante"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
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

        bsalir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logout_90894.png"))); // NOI18N
        bsalir.setToolTipText("");
        bsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsalirActionPerformed(evt);
            }
        });

        lIdTorneo.setText("jLabel1");

        lDescripcionTorneo.setText("jLabel1");

        lPeriodo.setText("jLabel1");

        lPeriodo1.setText("Liga:");

        lLiga.setText("Liga:");

        lPeriodo2.setText("Periodo:");

        lIdTorneo1.setText("Torneo:");

        lidRegistro.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lidRegistro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lIdTorneo1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lIdTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lDescripcionTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(lPeriodo2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lPeriodo1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lLiga, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lIdTorneo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lDescripcionTorneo, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(lPeriodo, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(lPeriodo1, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(lLiga, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(lPeriodo2, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(lIdTorneo1)
                    .addComponent(lidRegistro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bsalir)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsalirActionPerformed
        // TODO add your handling code here:
        salir();
    }//GEN-LAST:event_bsalirActionPerformed

    private void grillaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grillaMouseClicked
        // TODO add your handling code here:}
    }//GEN-LAST:event_grillaMouseClicked

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
            java.util.logging.Logger.getLogger(ListaFechas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaFechas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaFechas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaFechas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaFechas().setVisible(true);
            }
        });
    }

    // Declaracion de variables de clase
    public String bandera = "";
    public int estado = 0;
    public int valorBase;


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bsalir;
    private javax.swing.JTable grilla;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel lDescripcionTorneo;
    public static javax.swing.JLabel lIdTorneo;
    private javax.swing.JLabel lIdTorneo1;
    public static javax.swing.JLabel lLiga;
    public static javax.swing.JLabel lPeriodo;
    private javax.swing.JLabel lPeriodo1;
    private javax.swing.JLabel lPeriodo2;
    public static javax.swing.JLabel lidRegistro;
    // End of variables declaration//GEN-END:variables

    private void cargar_grilla() {
        try {
            for (int i = grilla.getRowCount() - 1; i >= 0; i--) {
                cursor.removeRow(i);
            }
            ver_conex conn = new ver_conex();
            conn.sentencia = conn.conexion.createStatement();
            conn.resultado = conn.sentencia.executeQuery(""
                    + "    SELECT dt.fecha AS fecha,\n"
                    + "                    elocal.descripcion AS LOCAL,\n"
                    + "		    evisi.descripcion AS visitante	\n"
                    + "                    FROM cabecera_torneo ct \n"
                    + "                    INNER JOIN detalle_torneo dt ON ct.id = dt.id_cabecera\n"
                    + "                    INNER JOIN equipo elocal ON dt.id_local = elocal.id\n"
                    + "                    INNER JOIN equipo evisi ON dt.id_visitante = evisi.id\n"
                    + "                    ORDER BY dt.fecha");

            while (conn.resultado.next()) {
                Object[] datos = {
                    conn.resultado.getString("fecha"),
                    conn.resultado.getString("local"),
                    conn.resultado.getString("visitante")};
                cursor.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ListaFechas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void salir() {
        int respuesta = JOptionPane.showConfirmDialog(this, "DESEA SALIR", "CONFIRMAR", JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.YES_OPTION) {
            dispose();
        }
    }

}
