package formularios;

import static formularios.RegistrarTorneo.txtIdLiga;
import static formularios.RegistrarTorneo.txtIdTorneo;
import static formularios.RegistrarTorneo.txtPeriodo;
import static formularios.RegistrarTorneo.txtcodigo;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import programas.ver_conex;

/**
 *
 * @author Eduardo Avila
 */
public class RegistrarPartido extends javax.swing.JFrame {

    ver_conex conn = new ver_conex();
    javax.swing.table.DefaultTableModel cursor;
    javax.swing.table.DefaultTableModel cursor2;
    String operacion = "";
    int c;
    private int band = 0;
    int id_detalle;
    int id_detalle_corner;

    /**
     * Creates new form cobros
     *
     * @throws java.lang.ClassNotFoundException
     */
    public RegistrarPartido() throws ClassNotFoundException {

        initComponents();
        this.setLocationRelativeTo(null);
        cursor = (javax.swing.table.DefaultTableModel) grilla1.getModel();
        cursor2 = (javax.swing.table.DefaultTableModel) grilla2.getModel();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        turno = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        facturanum = new javax.swing.JTextField();
        timbrado_num = new javax.swing.JTextField();
        jLcod14 = new javax.swing.JLabel();
        jLcod13 = new javax.swing.JLabel();
        txtIdPartido = new javax.swing.JTextField();
        jLcod15 = new javax.swing.JLabel();
        txt_id_liga = new javax.swing.JTextField();
        txtDescripcionLiga = new javax.swing.JTextField();
        jLcod16 = new javax.swing.JLabel();
        txtPeriodo = new javax.swing.JTextField();
        jLcod17 = new javax.swing.JLabel();
        txtFechaTorneo = new javax.swing.JTextField();
        jLcod21 = new javax.swing.JLabel();
        txtIdLocal = new javax.swing.JTextField();
        txtLocal = new javax.swing.JTextField();
        txtVisitante = new javax.swing.JTextField();
        jLcod22 = new javax.swing.JLabel();
        txtIdVisitante = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtIdArbitro = new javax.swing.JTextField();
        txtNombreArbitro = new javax.swing.JTextField();
        txtIdTorneo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNombreTorneo = new javax.swing.JTextField();
        txtFechaJuego = new com.toedter.calendar.JDateChooser();
        jPanel6 = new javax.swing.JPanel();
        txtJugador = new javax.swing.JTextField();
        txtIdJugador = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtMitad = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtAccionId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCornerLocal1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtAccionDescripcion = new javax.swing.JTextField();
        bAgregarItem = new javax.swing.JButton();
        bBorrarItem1 = new javax.swing.JButton();
        bBorrarItem2 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        grilla2 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtMinuto = new javax.swing.JTextField();
        jCheckBoxLocal = new javax.swing.JCheckBox();
        jCheckBoxVisitante = new javax.swing.JCheckBox();
        txtCornerVisitante1 = new javax.swing.JTextField();
        txtCornerLocal2 = new javax.swing.JTextField();
        txtCornerVisitante2 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        grilla1 = new javax.swing.JTable();
        bagregar = new javax.swing.JButton();
        bgrabar = new javax.swing.JButton();
        bcancelar = new javax.swing.JButton();
        bsalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 255));
        setResizable(false);

        turno.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        turno.setText("Registro detalle de Partidos");

        jPanel5.setBackground(new java.awt.Color(173, 216, 230));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.setForeground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Nro.");

        txtcodigo.setEditable(false);
        txtcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodigoActionPerformed(evt);
            }
        });

        facturanum.setEditable(false);
        facturanum.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        facturanum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facturanumActionPerformed(evt);
            }
        });
        facturanum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                facturanumKeyPressed(evt);
            }
        });

        timbrado_num.setEditable(false);
        timbrado_num.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLcod14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLcod13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLcod13.setText("ID Partido:");

        txtIdPartido.setEnabled(false);
        txtIdPartido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdPartidoActionPerformed(evt);
            }
        });
        txtIdPartido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdPartidoKeyPressed(evt);
            }
        });

        jLcod15.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLcod15.setText("Liga:");

        txt_id_liga.setEditable(false);

        txtDescripcionLiga.setEditable(false);

        jLcod16.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLcod16.setText("Periodo:");

        txtPeriodo.setEditable(false);

        jLcod17.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLcod17.setText("Fecha:");

        txtFechaTorneo.setEditable(false);

        jLcod21.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLcod21.setText("Local:");

        txtIdLocal.setEditable(false);

        txtLocal.setEditable(false);

        txtVisitante.setEditable(false);

        jLcod22.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLcod22.setText("Visitante:");

        txtIdVisitante.setEditable(false);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Fecha de Juego:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Arbitro");

        txtIdArbitro.setEnabled(false);
        txtIdArbitro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdArbitroActionPerformed(evt);
            }
        });
        txtIdArbitro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdArbitroKeyPressed(evt);
            }
        });

        txtNombreArbitro.setEditable(false);
        txtNombreArbitro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreArbitroActionPerformed(evt);
            }
        });

        txtIdTorneo.setEditable(false);
        txtIdTorneo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdTorneoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Torneo:");

        txtNombreTorneo.setEditable(false);
        txtNombreTorneo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreTorneoActionPerformed(evt);
            }
        });

        txtFechaJuego.setDateFormatString("dd-MM-yyyy");
        txtFechaJuego.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                txtFechaJuegoAncestorMoved(evt);
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                txtFechaJuegoAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        txtFechaJuego.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFechaJuegoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFechaJuegoFocusLost(evt);
            }
        });
        txtFechaJuego.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFechaJuegoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtFechaJuegoMouseExited(evt);
            }
        });
        txtFechaJuego.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtFechaJuegoPropertyChange(evt);
            }
        });
        txtFechaJuego.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFechaJuegoKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(facturanum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLcod14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(timbrado_num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(690, 690, 690))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFechaJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIdArbitro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombreArbitro, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIdTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombreTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(124, 124, 124))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLcod13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIdPartido, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLcod15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_id_liga, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDescripcionLiga, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLcod16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLcod17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFechaTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLcod21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtIdLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLcod22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtIdVisitante, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtVisitante, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(14, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtIdArbitro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNombreArbitro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtIdTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNombreTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtFechaJuego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLcod22)
                        .addComponent(txtIdVisitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtVisitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLcod21)
                        .addComponent(txtIdLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLcod13)
                        .addComponent(txtIdPartido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLcod15)
                        .addComponent(txt_id_liga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDescripcionLiga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLcod16)
                        .addComponent(txtPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLcod17)
                        .addComponent(txtFechaTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(facturanum, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timbrado_num, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLcod14))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(173, 216, 230));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtJugador.setEditable(false);

        txtIdJugador.setEnabled(false);
        txtIdJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdJugadorActionPerformed(evt);
            }
        });
        txtIdJugador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdJugadorKeyPressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("Periodo:");

        txtMitad.setEnabled(false);
        txtMitad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMitadActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel16.setText("Accion:");

        txtAccionId.setEnabled(false);
        txtAccionId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAccionIdActionPerformed(evt);
            }
        });
        txtAccionId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAccionIdKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Agregar Detalle");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setText("Corneres:");

        txtCornerLocal1.setEnabled(false);
        txtCornerLocal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCornerLocal1ActionPerformed(evt);
            }
        });
        txtCornerLocal1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCornerLocal1KeyPressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setText("Corneres:");

        jLabel17.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel17.setText("Jugador:");

        txtAccionDescripcion.setEditable(false);

        bAgregarItem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bAgregarItem.setText("Agregar");
        bAgregarItem.setEnabled(false);
        bAgregarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAgregarItemActionPerformed(evt);
            }
        });

        bBorrarItem1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bBorrarItem1.setText("Borrar item");
        bBorrarItem1.setEnabled(false);
        bBorrarItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBorrarItem1ActionPerformed(evt);
            }
        });

        bBorrarItem2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bBorrarItem2.setText("Borrar item");
        bBorrarItem2.setEnabled(false);
        bBorrarItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBorrarItem2ActionPerformed(evt);
            }
        });

        grilla2.setBackground(new java.awt.Color(153, 255, 255));
        grilla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Equipo", "Equipo", "Id Jugador", "Jugador", "Id Accion", "Accion", "Minuto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        grilla2.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(grilla2);
        grilla2.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (grilla2.getColumnModel().getColumnCount() > 0) {
            grilla2.getColumnModel().getColumn(0).setMinWidth(15);
            grilla2.getColumnModel().getColumn(1).setMinWidth(150);
            grilla2.getColumnModel().getColumn(2).setMinWidth(15);
            grilla2.getColumnModel().getColumn(3).setMinWidth(150);
            grilla2.getColumnModel().getColumn(4).setMinWidth(15);
            grilla2.getColumnModel().getColumn(5).setMinWidth(150);
            grilla2.getColumnModel().getColumn(6).setMinWidth(20);
        }

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setText("Primer Tiempo");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setText("Segundo Tiempo");

        jLabel18.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel18.setText("Minuto:");

        txtMinuto.setEnabled(false);
        txtMinuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMinutoActionPerformed(evt);
            }
        });

        jCheckBoxLocal.setText("Equipo1");
        jCheckBoxLocal.setEnabled(false);
        jCheckBoxLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxLocalActionPerformed(evt);
            }
        });

        jCheckBoxVisitante.setText("Equipo2");
        jCheckBoxVisitante.setEnabled(false);
        jCheckBoxVisitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxVisitanteActionPerformed(evt);
            }
        });

        txtCornerVisitante1.setEnabled(false);
        txtCornerVisitante1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCornerVisitante1ActionPerformed(evt);
            }
        });
        txtCornerVisitante1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCornerVisitante1KeyPressed(evt);
            }
        });

        txtCornerLocal2.setEnabled(false);
        txtCornerLocal2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCornerLocal2ActionPerformed(evt);
            }
        });
        txtCornerLocal2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCornerLocal2KeyPressed(evt);
            }
        });

        txtCornerVisitante2.setEnabled(false);
        txtCornerVisitante2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCornerVisitante2ActionPerformed(evt);
            }
        });
        txtCornerVisitante2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCornerVisitante2KeyPressed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel12.setText("Local:");

        jLabel13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel13.setText("Local:");

        jLabel14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel14.setText("Visitante:");

        jLabel15.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel15.setText("Visitante:");

        grilla1.setBackground(new java.awt.Color(153, 255, 255));
        grilla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Equipo", "Equipo", "Id Jugador", "Jugador", "Id Accion", "Accion", "Minuto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        grilla1.setColumnSelectionAllowed(true);
        grilla1.getTableHeader().setReorderingAllowed(false);
        jScrollPane6.setViewportView(grilla1);
        grilla1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (grilla1.getColumnModel().getColumnCount() > 0) {
            grilla1.getColumnModel().getColumn(0).setMinWidth(15);
            grilla1.getColumnModel().getColumn(1).setMinWidth(150);
            grilla1.getColumnModel().getColumn(2).setMinWidth(15);
            grilla1.getColumnModel().getColumn(3).setMinWidth(150);
            grilla1.getColumnModel().getColumn(4).setMinWidth(15);
            grilla1.getColumnModel().getColumn(5).setMinWidth(150);
            grilla1.getColumnModel().getColumn(6).setMinWidth(20);
        }

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMitad, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBoxLocal)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBoxVisitante)
                        .addGap(8, 8, 8)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIdJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAccionId, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAccionDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(499, 499, 499)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(bAgregarItem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel8)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCornerLocal1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCornerVisitante1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115)
                        .addComponent(bBorrarItem1)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel9)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCornerLocal2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCornerVisitante2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120)
                        .addComponent(bBorrarItem2))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18)
                        .addComponent(txtMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bAgregarItem, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtAccionDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtAccionId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16)
                        .addComponent(txtJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtIdJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtMitad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBoxLocal)
                        .addComponent(jCheckBoxVisitante)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCornerLocal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bBorrarItem2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bBorrarItem1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCornerVisitante1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCornerLocal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCornerVisitante2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        bagregar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bagregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/1486485588-add-create-new-math-sign-cross-plus_81186.png"))); // NOI18N
        bagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bagregarActionPerformed(evt);
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

        bcancelar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bcancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Cancel_icon-icons.com_73703.png"))); // NOI18N
        bcancelar.setEnabled(false);
        bcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcancelarActionPerformed(evt);
            }
        });

        bsalir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logout_90894.png"))); // NOI18N
        bsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bagregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bgrabar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bcancelar)
                        .addGap(18, 18, 18)
                        .addComponent(bsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(turno, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(464, 464, 464))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(turno, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bsalir)
                    .addComponent(bcancelar)
                    .addComponent(bgrabar)
                    .addComponent(bagregar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setBounds(0, 0, 1241, 619);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {

        if (!Character.isDigit(evt.getKeyChar()) && !Character.isISOControl(evt.getKeyChar())) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
        // TODO add your handling code here:
    }

    private void txtcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodigoActionPerformed

    private void facturanumKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_facturanumKeyPressed

    }//GEN-LAST:event_facturanumKeyPressed

    private void facturanumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facturanumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_facturanumActionPerformed

    private void bagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bagregarActionPerformed
        operacion = "agregar";
        gencod();
        txtFechaJuego.setEnabled(true);
        txtFechaJuego.requestFocus();
        bagregar.setEnabled(false);
    }//GEN-LAST:event_bagregarActionPerformed

    private void bgrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bgrabarActionPerformed
        // TODO add your handling code here:
        //  grabar();
        validarCorner();
        grabar();
        //gencodDetalle();
    }//GEN-LAST:event_bgrabarActionPerformed

    private void bcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcancelarActionPerformed
        // TODO add your handling code here:
        limpiargrilla1();
        limpiargrilla2();
        //    limpiarTextos();

        bgrabar.setEnabled(false);
        bagregar.setEnabled(true);
        bcancelar.setEnabled(false);
    }//GEN-LAST:event_bcancelarActionPerformed

    private void bsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsalirActionPerformed
        // TODO add your handling code here:
        salir();
    }//GEN-LAST:event_bsalirActionPerformed

    private void txtIdPartidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdPartidoActionPerformed
        // TODO add your handling code here:
        buscarPartido();
    }//GEN-LAST:event_txtIdPartidoActionPerformed

    private void bBorrarItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBorrarItem2ActionPerformed
        // TODO add your handling code here:
        cursor2.removeRow(grilla2.getSelectedRow());
    }//GEN-LAST:event_bBorrarItem2ActionPerformed

    private void bBorrarItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBorrarItem1ActionPerformed
        // TODO add your handling code here:
        cursor.removeRow(grilla1.getSelectedRow());
    }//GEN-LAST:event_bBorrarItem1ActionPerformed

    private void bAgregarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAgregarItemActionPerformed
        // TODO add your handling code here:
        tirar_grillas();
        bBorrarItem1.setEnabled(true);
        bBorrarItem2.setEnabled(true);

        txtCornerLocal1.setEnabled(true);
        txtCornerVisitante1.setEnabled(true);
        txtCornerLocal2.setEnabled(true);
        txtCornerVisitante2.setEnabled(true);
    }//GEN-LAST:event_bAgregarItemActionPerformed

    private void txtIdJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdJugadorActionPerformed

        buscarJugador();

    }//GEN-LAST:event_txtIdJugadorActionPerformed

    private void txtIdArbitroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdArbitroActionPerformed
        // TODO add your handling code here:
        buscarArbitro();
    }//GEN-LAST:event_txtIdArbitroActionPerformed

    private void txtNombreArbitroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreArbitroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreArbitroActionPerformed

    private void txtIdTorneoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdTorneoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdTorneoActionPerformed

    private void txtNombreTorneoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreTorneoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreTorneoActionPerformed

    private void jCheckBoxLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxLocalActionPerformed
        // TODO add your handling code here:
        if (jCheckBoxLocal.isSelected()) {
            tiempo = Integer.parseInt(this.txtMitad.getText());
            jCheckBoxVisitante.setSelected(false);
            txtIdJugador.setText("");
            txtJugador.setText("");
            txtIdJugador.setEnabled(true);
            txtIdJugador.requestFocus();
        }

    }//GEN-LAST:event_jCheckBoxLocalActionPerformed

    private void jCheckBoxVisitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxVisitanteActionPerformed
        // TODO add your handling code here:

        if (jCheckBoxVisitante.isSelected()) {
            tiempo = Integer.parseInt(this.txtMitad.getText());
            jCheckBoxLocal.setSelected(false);
            txtIdJugador.setText("");
            txtJugador.setText("");
            txtIdJugador.setEnabled(true);
            txtIdJugador.requestFocus();
        }

    }//GEN-LAST:event_jCheckBoxVisitanteActionPerformed

    private void txtMitadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMitadActionPerformed
        // TODO add your handling code here:
        validacionTiempo();
    }//GEN-LAST:event_txtMitadActionPerformed

    private void txtIdJugadorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdJugadorKeyPressed
        // TODO add your handling code here:

        if (txtIdJugador.getText().equals("") && evt.getKeyChar() == KeyEvent.VK_ENTER)//no trae nada
        {
            if (jCheckBoxLocal.isSelected() == true) {
                JTextField[] tfParam = new JTextField[2];
                tfParam[0] = this.txtIdJugador;
                VentanaBuscar buscador = new VentanaBuscar("SELECT ID , CONCAT(NOMBRE , ' ', APELLIDO) AS jugador\n"
                        + " FROM plantilla where id_equipo = " + txtIdLocal.getText() + "  and CONCAT(NOMBRE , ' ', APELLIDO) like  ", new String[]{"CODIGO JUGADOR", "NOMBRE JUGADOR"}, 2, tfParam);
                buscador.setTitle("BUSCAR JUGADOR");
                buscador.setVisible(true);
            } else {
                JTextField[] tfParam = new JTextField[2];
                tfParam[0] = this.txtIdJugador;
                VentanaBuscar buscador = new VentanaBuscar("SELECT  ID , CONCAT(NOMBRE , ' ', APELLIDO) AS jugador\n"
                        + " FROM plantilla where id_equipo = " + txtIdVisitante.getText() + "  and CONCAT(NOMBRE , ' ', APELLIDO) like  ", new String[]{"CODIGO JUGADOR", "NOMBRE JUGADOR"}, 2, tfParam);
                buscador.setTitle("BUSCAR JUGADOR");
                buscador.setVisible(true);
            }
        }
    }//GEN-LAST:event_txtIdJugadorKeyPressed

    private void txtAccionIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAccionIdActionPerformed
        // TODO add your handling code here:
        buscarAccionPartido();
    }//GEN-LAST:event_txtAccionIdActionPerformed

    private void txtAccionIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAccionIdKeyPressed
        // TODO add your handling code here:
        if (txtAccionId.getText().equals("") && evt.getKeyChar() == KeyEvent.VK_ENTER)//no trae nada
        {
            JTextField[] tfParam = new JTextField[2];
            tfParam[0] = this.txtAccionId;
            VentanaBuscar buscador = new VentanaBuscar("SELECT id,UPPER(descripcion)AS descripcion\n"
                    + "FROM acciones where descripcion like  ", new String[]{"CODIGO ACCION", "NOMBRE ACCION"}, 2, tfParam);
            buscador.setTitle("BUSCAR ACCIONES");
            buscador.setVisible(true);
        }
    }//GEN-LAST:event_txtAccionIdKeyPressed

    private void txtMinutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMinutoActionPerformed
        // TODO add your handling code here:
        validarMinuto();
    }//GEN-LAST:event_txtMinutoActionPerformed

    private void txtCornerVisitante2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCornerVisitante2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCornerVisitante2KeyPressed

    private void txtCornerVisitante2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCornerVisitante2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCornerVisitante2ActionPerformed

    private void txtCornerLocal2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCornerLocal2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCornerLocal2KeyPressed

    private void txtCornerLocal2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCornerLocal2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCornerLocal2ActionPerformed

    private void txtCornerVisitante1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCornerVisitante1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCornerVisitante1KeyPressed

    private void txtCornerVisitante1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCornerVisitante1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCornerVisitante1ActionPerformed

    private void txtCornerLocal1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCornerLocal1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCornerLocal1KeyPressed

    private void txtCornerLocal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCornerLocal1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCornerLocal1ActionPerformed

    private void txtIdPartidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdPartidoKeyPressed
        // TODO add your handling code here:
        if (txtIdPartido.getText().equals("") && evt.getKeyChar() == KeyEvent.VK_ENTER) {
            JTextField[] tfParam = new JTextField[2];
            tfParam[0] = this.txtIdPartido;
            VentanaBuscar buscador = new VentanaBuscar(" SELECT dt.id AS ID,\n"
                    + "		      CONCAT( 'Liga: ' , l.descripcion,' torneo: ',t.denominacion,' ',ct.periodo ,' fecha: ', dt.fecha,' ', \n"
                    + "		       el.descripcion , ' vs ', ev.descripcion ) AS resumen \n"
                    + "		      FROM cabecera_torneo ct\n"
                    + "		      INNER JOIN liga l ON ct.id_liga = l.id                   \n"
                    + "                      INNER JOIN detalle_torneo dt ON ct.id = dt.id_cabecera \n"
                    + "                      INNER JOIN equipo el ON dt.id_local = el.id\n"
                    + "                      INNER JOIN equipo ev ON dt.id_visitante = ev.id\n"
                    + "                      INNER JOIN torneos t ON ct.id_torneo = t.id\n"
                    + "                      WHERE CONCAT( 'Liga: ' , l.descripcion,' torneo: ',t.denominacion,' ',ct.periodo ,' fecha: ', dt.fecha,' ', \n"
                    + "		       el.descripcion , ' vs ', ev.descripcion )  like  ", new String[]{"CODIGO PARTIDO", "DETALLE PARTIDO"}, 2, tfParam);
            buscador.setTitle("BUSCAR PARTIDO");
            buscador.setVisible(true);

        }

    }//GEN-LAST:event_txtIdPartidoKeyPressed

    private void txtIdArbitroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdArbitroKeyPressed
        // TODO add your handling code here:
        if (txtIdArbitro.getText().equals("") && evt.getKeyChar() == KeyEvent.VK_ENTER) {
            JTextField[] tfParam = new JTextField[2];
            tfParam[0] = this.txtIdArbitro;
            VentanaBuscar buscador = new VentanaBuscar("SELECT  ID , CONCAT(NOMBRE , ' ', APELLIDO) AS arbitro\n"
                    + " FROM arbitros where CONCAT(NOMBRE , ' ', APELLIDO) like  ", new String[]{"CODIGO ARBITRO", "NOMBRE ARBITRO"}, 2, tfParam);
            buscador.setTitle("BUSCAR JUGADOR");
            buscador.setVisible(true);

        }
    }//GEN-LAST:event_txtIdArbitroKeyPressed

    private void txtFechaJuegoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFechaJuegoMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_txtFechaJuegoMouseClicked

    private void txtFechaJuegoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_txtFechaJuegoAncestorAdded
        // TODO add your handling code here:

    }//GEN-LAST:event_txtFechaJuegoAncestorAdded

    private void txtFechaJuegoAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_txtFechaJuegoAncestorMoved
        // TODO add your handling code here:

    }//GEN-LAST:event_txtFechaJuegoAncestorMoved

    private void txtFechaJuegoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFechaJuegoFocusLost
        // TODO add your handling code here:

    }//GEN-LAST:event_txtFechaJuegoFocusLost

    private void txtFechaJuegoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFechaJuegoFocusGained
        // TODO add your handling code here:

    }//GEN-LAST:event_txtFechaJuegoFocusGained

    private void txtFechaJuegoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtFechaJuegoPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaJuegoPropertyChange

    private void txtFechaJuegoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFechaJuegoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaJuegoMouseExited

    private void txtFechaJuegoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaJuegoKeyPressed
        // TODO add your handling code here:
        txtIdArbitro.setEnabled(true);
        txtIdArbitro.requestFocus();
    }//GEN-LAST:event_txtFechaJuegoKeyPressed

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
            java.util.logging.Logger.getLogger(RegistrarPartido.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarPartido.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarPartido.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarPartido.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {

                try {
                    new RegistrarPartido().setVisible(false);
                } catch (ClassNotFoundException ex) {

                }

            }
        });
    }

    private void gencod() {
        try {

            bandera = "agregar";
            conn.sentencia = conn.conexion.createStatement();
            conn.resultado = conn.sentencia.executeQuery("SELECT IFNULL(MAX(id),0)+1 AS newcod FROM cabecera_reg_partido");
            conn.resultado.next();

            txtcodigo.setText(conn.resultado.getString("newcod"));

        } //fin generar
        catch (SQLException ex) {
            Logger.getLogger(RegistrarPartido.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void gencodDetalle() {
        try {

            conn.sentencia = conn.conexion.createStatement();
            conn.resultado = conn.sentencia.executeQuery("SELECT IFNULL(MAX(id),0)+1 AS newcod FROM detalle_reg_partido");
            conn.resultado.next();
            id_detalle = Integer.parseInt(conn.resultado.getString("newcod"));
        } //fin generar
        catch (SQLException ex) {
            //   Logger.getLogger(facturacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String bandera = "";

    public int tiempo = 0;
    public int minutoIngresado = 0;
    public int cornerLocal1 = 0;
    public int cornerVisitante1 = 0;
    public int cornerLocal2 = 0;
    public int cornerVisitante2 = 0;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAgregarItem;
    private javax.swing.JButton bBorrarItem1;
    private javax.swing.JButton bBorrarItem2;
    private javax.swing.JButton bagregar;
    private javax.swing.JButton bcancelar;
    private javax.swing.JButton bgrabar;
    private javax.swing.JButton bsalir;
    private javax.swing.JTextField facturanum;
    private javax.swing.JTable grilla1;
    private javax.swing.JTable grilla2;
    private javax.swing.JCheckBox jCheckBoxLocal;
    private javax.swing.JCheckBox jCheckBoxVisitante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLcod13;
    private javax.swing.JLabel jLcod14;
    private javax.swing.JLabel jLcod15;
    private javax.swing.JLabel jLcod16;
    private javax.swing.JLabel jLcod17;
    private javax.swing.JLabel jLcod21;
    private javax.swing.JLabel jLcod22;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextField timbrado_num;
    private javax.swing.JLabel turno;
    private javax.swing.JTextField txtAccionDescripcion;
    private javax.swing.JTextField txtAccionId;
    private javax.swing.JTextField txtCornerLocal1;
    private javax.swing.JTextField txtCornerLocal2;
    private javax.swing.JTextField txtCornerVisitante1;
    private javax.swing.JTextField txtCornerVisitante2;
    private javax.swing.JTextField txtDescripcionLiga;
    private com.toedter.calendar.JDateChooser txtFechaJuego;
    private javax.swing.JTextField txtFechaTorneo;
    private javax.swing.JTextField txtIdArbitro;
    private javax.swing.JTextField txtIdJugador;
    private javax.swing.JTextField txtIdLocal;
    private javax.swing.JTextField txtIdPartido;
    private javax.swing.JTextField txtIdTorneo;
    private javax.swing.JTextField txtIdVisitante;
    private javax.swing.JTextField txtJugador;
    private javax.swing.JTextField txtLocal;
    private javax.swing.JTextField txtMinuto;
    private javax.swing.JTextField txtMitad;
    private javax.swing.JTextField txtNombreArbitro;
    private javax.swing.JTextField txtNombreTorneo;
    private javax.swing.JTextField txtPeriodo;
    private javax.swing.JTextField txtVisitante;
    private javax.swing.JTextField txt_id_liga;
    private javax.swing.JTextField txtcodigo;
    // End of variables declaration//GEN-END:variables

    private void limpiar() {

        txtIdJugador.setText("");
        txtMitad.setText("");
        txtJugador.setText("");
        txtAccionId.setText("");

    }

    private void limpiargrilla1() {
        DefaultTableModel tb = (DefaultTableModel) grilla1.getModel();
        int a = grilla1.getRowCount() - 1;
        for (int i = a; i >= 0; i--) {
            tb.removeRow(tb.getRowCount() - 1);
        }
    }

    private void limpiargrilla2() {
        DefaultTableModel tb = (DefaultTableModel) grilla2.getModel();
        int a = grilla2.getRowCount() - 1;
        for (int i = a; i >= 0; i--) {
            tb.removeRow(tb.getRowCount() - 1);
        }
    }

    private void limpiarTexto() {
        txtIdJugador.setText("");
        txtAccionId.setText("");
        txtAccionId.setText("");

    }

    private void salir() {
        int respuesta = JOptionPane.showConfirmDialog(this, "DESEA SALIR", "CONFIRMAR", JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.YES_OPTION) {
            dispose();
        }
    }

    //// nuevos metodos 
    private void buscarArbitro() {
        try {
            ver_conex conn = new ver_conex();
            conn.sentencia = conn.conexion.createStatement();
            conn.resultado = conn.sentencia.executeQuery("SELECT CONCAT(nombre, ' ' , apellido) AS arbitro\n"
                    + "			FROM arbitros\n"
                    + "			WHERE id = " + txtIdArbitro.getText());

            if (conn.resultado.next()) {
                this.txtNombreArbitro.setText(conn.resultado.getString("arbitro"));
                txtIdPartido.setEnabled(true);
                txtIdPartido.requestFocus();

            } else {
                JOptionPane.showMessageDialog(null, "No existe el arbitro con el codigo ingresado!");
                txtIdArbitro.setEnabled(true);
                txtIdArbitro.requestFocus();
            }

        } catch (Exception e) {
            System.out.println("error " + e);
        }
    }

    private void buscarPartido() {

        if (!txtIdPartido.getText().isEmpty()) {
            try {
                ver_conex conn = new ver_conex();
                conn.sentencia = conn.conexion.createStatement();
                conn.resultado = conn.sentencia.executeQuery("    SELECT dt.id AS id_partido,\n"
                        + "		      ct.id_torneo AS id_torneo,\n"
                        + "		      ct.id_liga AS id_liga,\n"
                        + "		      l.descripcion AS liga,\n"
                        + "		      ct.periodo , \n"
                        + "		      dt.fecha,\n"
                        + "		      dt.id_local,\n"
                        + "		      el.descripcion AS equipoLocal,\n"
                        + "		      dt.id_visitante,\n"
                        + "		      ev.descripcion AS equipoVisitante,\n"
                        + "		      t.denominacion AS torneo\n"
                        + "		      FROM cabecera_torneo ct\n"
                        + "		      INNER JOIN liga l ON ct.id_liga = l.id                   \n"
                        + "                      INNER JOIN detalle_torneo dt ON ct.id = dt.id_cabecera \n"
                        + "                      INNER JOIN equipo el ON dt.id_local = el.id\n"
                        + "                      INNER JOIN equipo ev ON dt.id_visitante = ev.id\n"
                        + "                      INNER JOIN torneos t ON ct.id_torneo = t.id\n"
                        + "                      WHERE dt.id =  " + txtIdPartido.getText() + "");

                if (conn.resultado.next())//si encontro
                {
                    this.txtIdTorneo.setText(conn.resultado.getString("id_torneo"));
                    this.txtNombreTorneo.setText(conn.resultado.getString("torneo"));
                    this.txt_id_liga.setText(conn.resultado.getString("id_liga"));
                    this.txtDescripcionLiga.setText(conn.resultado.getString("liga"));
                    this.txtPeriodo.setText(conn.resultado.getString("periodo"));
                    this.txtFechaTorneo.setText(conn.resultado.getString("fecha"));
                    this.txtIdLocal.setText(conn.resultado.getString("id_local"));
                    this.txtLocal.setText(conn.resultado.getString("equipoLocal"));
                    this.txtIdVisitante.setText(conn.resultado.getString("id_visitante"));
                    this.txtVisitante.setText(conn.resultado.getString("equipoVisitante"));
                    this.jCheckBoxLocal.setText(conn.resultado.getString("equipoLocal"));
                    this.jCheckBoxVisitante.setText(conn.resultado.getString("equipoVisitante"));

                    txtIdPartido.setEnabled(false);
                    txtMitad.setEnabled(true);
                    txtMitad.requestFocus();

                } else//no encontro
                {
                    JOptionPane.showMessageDialog(null, "CODIGO INGRESADO NO EXISTE", "MENSAJE", JOptionPane.INFORMATION_MESSAGE);
                }

            } catch (SQLException exceptionSql) {
                //      JOptionPane.showMessageDialog(null, exceptionSql.getMessage(), "Error de Conexion con la Base de Datos", JOptionPane.ERROR_MESSAGE);
                //System.exit(0);
            }
        }
    }

    private void buscarJugador() {

        if (jCheckBoxLocal.isSelected() == true) {
            try {
                ver_conex conn = new ver_conex();
                conn.sentencia = conn.conexion.createStatement();
                conn.resultado = conn.sentencia.executeQuery(" SELECT ID , CONCAT(NOMBRE , ' ', APELLIDO) AS JUGADOR\n"
                        + "			FROM PLANTILLA\n"
                        + "			WHERE ID_EQUIPO = " + txtIdLocal.getText() + ""
                        + "                     AND ID = " + txtIdJugador.getText() + "");

                if (conn.resultado.next())//si encontro
                {
                    this.txtIdJugador.setText(conn.resultado.getString("ID"));
                    this.txtJugador.setText(conn.resultado.getString("JUGADOR"));

                    txtIdJugador.setEnabled(false);
                    txtAccionId.setEnabled(true);
                    txtAccionId.requestFocus();

                } else//no encontro
                {
                    JOptionPane.showMessageDialog(null, "CODIGO INGRESADO NO EXISTE O NO PERTENECE AL EQUIPO SELECCIONADO", "MENSAJE", JOptionPane.INFORMATION_MESSAGE);
                }

            } catch (SQLException exceptionSql) {
                // JOptionPane.showMessageDialog(null, exceptionSql.getMessage(), "Error de Conexion con la Base de Datos", JOptionPane.ERROR_MESSAGE);
                //System.exit(0);
            }

        } else {

            try {
                ver_conex conn = new ver_conex();
                conn.sentencia = conn.conexion.createStatement();
                conn.resultado = conn.sentencia.executeQuery(" SELECT ID , CONCAT(NOMBRE , ' ', APELLIDO) AS JUGADOR\n"
                        + "			FROM PLANTILLA\n"
                        + "			WHERE ID_EQUIPO = " + txtIdVisitante.getText() + ""
                        + "                     AND ID = " + txtIdJugador.getText() + "");

                if (conn.resultado.next())//si encontro
                {
                    this.txtIdJugador.setText(conn.resultado.getString("ID"));
                    this.txtJugador.setText(conn.resultado.getString("JUGADOR"));
                    txtIdJugador.setEnabled(false);
                    txtAccionId.setEnabled(true);
                    txtAccionId.requestFocus();

                } else//no encontro
                {
                    JOptionPane.showMessageDialog(null, "CODIGO INGRESADO NO EXISTE O NO PERTENECE AL EQUIPO SELECCIONADO", "MENSAJE", JOptionPane.INFORMATION_MESSAGE);
                }

            } catch (SQLException exceptionSql) {
                // JOptionPane.showMessageDialog(null, exceptionSql.getMessage(), "Error de Conexion con la Base de Datos", JOptionPane.ERROR_MESSAGE);
                //System.exit(0);
            }
        }
    }

    public void buscarAccionPartido() {

        try {
            ver_conex conn = new ver_conex();
            conn.sentencia = conn.conexion.createStatement();
            conn.resultado = conn.sentencia.executeQuery("SELECT ID ,DESCRIPCION AS ACCION\n"
                    + "			FROM ACCIONES\n"
                    + "			WHERE ID = " + txtAccionId.getText() + "");

            if (conn.resultado.next())//si encontro
            {
                this.txtAccionId.setText(conn.resultado.getString("ID"));
                this.txtAccionDescripcion.setText(conn.resultado.getString("ACCION"));

                txtAccionId.setEnabled(false);
                txtMinuto.setEnabled(true);
                txtMinuto.requestFocus();

            } else//no encontro
            {
                JOptionPane.showMessageDialog(null, "CODIGO INGRESADO NO EXISTE! ", "MENSAJE", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (SQLException exceptionSql) {
            // JOptionPane.showMessageDialog(null, exceptionSql.getMessage(), "Error de Conexion con la Base de Datos", JOptionPane.ERROR_MESSAGE);
            //System.exit(0);
        }
    }

    public void validarMinuto() {

        minutoIngresado = Integer.parseInt(this.txtMinuto.getText());

        if (tiempo == 1) {
            if (minutoIngresado >= 0 && minutoIngresado <= 60) {
                txtMinuto.setEnabled(false);
                bAgregarItem.setEnabled(true);
                bAgregarItem.requestFocus();

            } else {
                JOptionPane.showMessageDialog(null, "El minuto ingresado no es valido para el primer tiempo");
                txtMinuto.setText("");
                txtMinuto.requestFocus();
            }

        } else if (tiempo == 2) {
            if (minutoIngresado > 45 && minutoIngresado <= 110) {
                txtMinuto.setEnabled(true);
                bAgregarItem.setEnabled(true);
                bAgregarItem.requestFocus();
            } else {
                JOptionPane.showMessageDialog(null, "El minuto ingresado no es valido para el segundo tiempo");
                txtMinuto.setText("");
                txtMinuto.requestFocus();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Es obligatorio ingresar en que mitad del partido se esta jugando");
            txtMitad.setEnabled(true);
            txtMitad.requestFocus();
        }
    }

    private void tirar_grillas() {
        if (tiempo == 1) {
            Object[] o = new Object[7];

            if (jCheckBoxLocal.isSelected()) {
                o[0] = txtIdLocal.getText();
            } else {
                o[0] = txtIdVisitante.getText();
            }
            if (jCheckBoxLocal.isSelected()) {
                o[1] = txtLocal.getText();
            } else {
                o[1] = txtVisitante.getText();
            }
            o[2] = txtIdJugador.getText();
            o[3] = txtJugador.getText();
            o[4] = txtAccionId.getText();
            o[5] = txtAccionDescripcion.getText();
            o[6] = txtMinuto.getText();
            cursor.addRow(o);

            posTirarGrilla();
            bgrabar.setEnabled(true);
            bcancelar.setEnabled(true);
        } else {
            Object[] o = new Object[7];
            if (jCheckBoxLocal.isSelected()) {
                o[0] = txtIdLocal.getText();
            } else {
                o[0] = txtIdVisitante.getText();
            }
            if (jCheckBoxLocal.isSelected()) {
                o[1] = txtLocal.getText();
            } else {
                o[1] = txtVisitante.getText();
            }
            o[2] = txtIdJugador.getText();
            o[3] = txtJugador.getText();
            o[4] = txtAccionId.getText();
            o[5] = txtAccionDescripcion.getText();
            o[6] = txtMinuto.getText();
            cursor2.addRow(o);

            posTirarGrilla();
            bgrabar.setEnabled(true);
            bcancelar.setEnabled(true);
        }
    }

    private void posTirarGrilla() {
        txtMinuto.setText("");
        txtMinuto.setEnabled(false);
        txtAccionId.setText("");
        txtAccionId.setEnabled(false);
        txtAccionDescripcion.setText("");
        txtJugador.setText("");
        txtIdJugador.setText("");
        txtIdJugador.setEnabled(false);
        jCheckBoxVisitante.setSelected(false);
        jCheckBoxVisitante.setEnabled(false);
        jCheckBoxLocal.setSelected(false);
        jCheckBoxLocal.setEnabled(false);
        bAgregarItem.setEnabled(false);
        txtMitad.setText("");
        txtMitad.setEnabled(true);
        txtMitad.requestFocus();
    }

    private void validarCorner() {
        if (txtCornerLocal1.getText().equals("") || txtCornerLocal1.getText().equals("")
                || txtCornerLocal2.getText().equals("") || txtCornerVisitante2.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debe cargar la cantidad de corners en caso de que no haya poner 0");
            txtCornerLocal1.requestFocus();
        }
    }

    private void validacionTiempo() {
        if (txtMitad.getText().equals("1") || txtMitad.getText().equals("2")) {
            jCheckBoxLocal.setEnabled(true);
            jCheckBoxVisitante.setEnabled(true);
            txtMitad.setEnabled(false);

        } else {
            JOptionPane.showMessageDialog(null, "Numero de pediodo ingresado no valido!");
            txtMitad.setText("");
            txtMitad.setEnabled(true);
            txtMitad.requestFocus();

        }
    }

    private void grabar() {

        int res = javax.swing.JOptionPane.showOptionDialog(this,
                "Desea grabar la el Registro del Partido?", "PronosticosDeportivosPY", javax.swing.JOptionPane.OK_CANCEL_OPTION,
                javax.swing.JOptionPane.QUESTION_MESSAGE, null,
                new Object[]{"Si", "No"}, "Si");

        if (res == javax.swing.JOptionPane.OK_OPTION) {

            try {

                ver_conex conn = new ver_conex();
                conn.sentencia = conn.conexion.createStatement();
                gencod();
                Date fecha = txtFechaJuego.getDate();
                long d = fecha.getTime();
                java.sql.Date fechaConvertida = new java.sql.Date(d);

                conn.sentencia.executeUpdate("INSERT INTO cabecera_reg_partido(id,id_arbitro,fecha_juego,id_liga,id_partido,periodo,fecha_nro)values(" + txtcodigo.getText() + "," + txtIdArbitro.getText() + ",'" + fechaConvertida + "'," + txt_id_liga.getText() + "," + txtIdPartido.getText() + "," + txtPeriodo.getText() + "," + txtFechaTorneo.getText() + ")");

                //graba en el detalle detalle_reg_partido 
                gencodDetalle();// para evitar que se dupliquen los ids
                for (int fila = 0; fila < grilla1.getRowCount(); fila++) {
                    gencodDetalle();
                    conn.sentencia.executeUpdate("insert into detalle_reg_partido(id,id_cabecera,id_accion,id_equipo,id_jugador,tiempo,minuto)values(" + id_detalle + "," + txtcodigo.getText() + "," + grilla1.getValueAt(fila, 4) + "," + grilla1.getValueAt(fila, 0) + "," + grilla1.getValueAt(fila, 2) + "," + 1 + "," + grilla1.getValueAt(fila, 6) + ")");
                }
                for (int fila = 0; fila < grilla2.getRowCount(); fila++) {
                    gencodDetalle();
                    conn.sentencia.executeUpdate("insert into detalle_reg_partido(id,id_cabecera,id_accion,id_equipo,id_jugador,tiempo,minuto)values(" + id_detalle + "," + txtcodigo.getText() + "," + grilla2.getValueAt(fila, 4) + "," + grilla2.getValueAt(fila, 0) + "," + grilla2.getValueAt(fila, 2) + "," + 2 + "," + grilla2.getValueAt(fila, 6) + ")");
                }

                //graba detalle de corners del partido
                gencodDetalleCorner();// para evitar que se dupliquen los ids
                conn.sentencia = conn.conexion.createStatement();
                conn.sentencia.executeUpdate("INSERT INTO DETALLE_CORNER(id,id_cabecera,id_equipo,mitad,cantidad) values (" + id_detalle_corner + " , " + txtcodigo.getText() + ", " + txtIdLocal.getText() + " , " + 1 + " , " + txtCornerLocal1.getText() + ")");

                gencodDetalleCorner();// para evitar que se dupliquen los ids
                conn.sentencia = conn.conexion.createStatement();
                conn.sentencia.executeUpdate("INSERT INTO DETALLE_CORNER(id,id_cabecera,id_equipo,mitad,cantidad) values (" + id_detalle_corner + " , " + txtcodigo.getText() + ", " + txtIdLocal.getText() + " , " + 2 + " , " + txtCornerLocal2.getText() + ")");

                gencodDetalleCorner();// para evitar que se dupliquen los ids
                conn.sentencia = conn.conexion.createStatement();
                conn.sentencia.executeUpdate("INSERT INTO DETALLE_CORNER(id,id_cabecera,id_equipo,mitad,cantidad) values (" + id_detalle_corner + " , " + txtcodigo.getText() + ", " + txtIdVisitante.getText() + " , " + 1 + " , " + txtCornerVisitante1.getText() + ")");

                gencodDetalleCorner();// para evitar que se dupliquen los ids
                conn.sentencia = conn.conexion.createStatement();
                conn.sentencia.executeUpdate("INSERT INTO DETALLE_CORNER(id,id_cabecera,id_equipo,mitad,cantidad) values (" + id_detalle_corner + " , " + txtcodigo.getText() + ", " + txtIdVisitante.getText() + " , " + 2 + " , " + txtCornerVisitante2.getText() + ")");

                JOptionPane.showMessageDialog(null, "El registro fue grabado Satisfactoriamente", "Aviso", JOptionPane.INFORMATION_MESSAGE);

                bgrabar.setEnabled(false);
                bagregar.setEnabled(true);
                bcancelar.setEnabled(false);

            } catch (Exception ex) {
                Logger.getLogger(RegistrarTorneo.class.getName()).log(Level.SEVERE, null, ex);

            }
        } else {
            JOptionPane.showMessageDialog(null, "Operacion Cancelada", "Atencion", JOptionPane.ERROR_MESSAGE);
        }

    }

    private void gencodDetalleCorner() {
        try {
            conn.sentencia = conn.conexion.createStatement();
            conn.resultado = conn.sentencia.executeQuery("SELECT IFNULL(MAX(id),0)+1 AS newcod FROM detalle_corner");
            conn.resultado.next();
            id_detalle_corner = Integer.parseInt(conn.resultado.getString("newcod"));

        } //fin generar
        catch (SQLException ex) {
            Logger.getLogger(RegistrarPartido.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
