
package vista;

import JAVACLASS.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class sistema extends javax.swing.JFrame {

   
    public sistema() {
        initComponents();
       this.setLocationRelativeTo(null);
        
    }

    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Midate = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        JTBE = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        txtdesc = new javax.swing.JTextField();
        txtcant = new javax.swing.JTextField();
        txtprecio = new javax.swing.JTextField();
        lbl5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tventa = new javax.swing.JTable();
        lbltotal = new javax.swing.JLabel();
        btnborrar = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        txtid2 = new javax.swing.JTextField();
        btnbuscarpro1 = new javax.swing.JButton();
        btnlistapro1 = new javax.swing.JButton();
        btnactualizar3 = new javax.swing.JButton();
        btntotal = new javax.swing.JButton();
        btnlimpiar = new javax.swing.JButton();
        lbltotal1 = new javax.swing.JLabel();
        txtfecha = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtiva = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtdescuentos1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        lblregistro = new javax.swing.JLabel();
        lblnit = new javax.swing.JLabel();
        lblid = new javax.swing.JLabel();
        lblnombre = new javax.swing.JLabel();
        lbltel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tcliente = new javax.swing.JTable();
        txtnombre = new javax.swing.JTextField();
        txtnum = new javax.swing.JTextField();
        txtnit = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        txtid1 = new javax.swing.JTextField();
        lblid2 = new javax.swing.JLabel();
        btnguardar2 = new javax.swing.JButton();
        btnactualizar2 = new javax.swing.JButton();
        btnlista2 = new javax.swing.JButton();
        btnborrar4 = new javax.swing.JButton();
        btnewclient2 = new javax.swing.JButton();
        btnbuscar2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lblproducto = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tproduc = new javax.swing.JTable();
        lblcodigopro = new javax.swing.JLabel();
        txtcodpro = new javax.swing.JTextField();
        lbldesc = new javax.swing.JLabel();
        txtdesc2 = new javax.swing.JTextField();
        lblcant = new javax.swing.JLabel();
        txtcant2 = new javax.swing.JTextField();
        lblprecio2 = new javax.swing.JLabel();
        txtprecio2 = new javax.swing.JTextField();
        lblid3 = new javax.swing.JLabel();
        txtbuscarprov = new javax.swing.JTextField();
        btnguardarpro = new javax.swing.JButton();
        btnborrarpro = new javax.swing.JButton();
        btnactualizarpro = new javax.swing.JButton();
        btnlistapro = new javax.swing.JButton();
        btnnuevopro = new javax.swing.JButton();
        btnbuscarpro = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        lblproveedor = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        Tproveedor = new javax.swing.JTable();
        lblcodigoprovee = new javax.swing.JLabel();
        txtnombreprovee = new javax.swing.JTextField();
        lbLnombreprovee = new javax.swing.JLabel();
        txtcdproveedor1 = new javax.swing.JTextField();
        lbltelefonoprovee = new javax.swing.JLabel();
        txttelprovee = new javax.swing.JTextField();
        lbldireccion = new javax.swing.JLabel();
        txtdireccion = new javax.swing.JTextField();
        lblbuscarprovee = new javax.swing.JLabel();
        txtbuscarprovee = new javax.swing.JTextField();
        btnguardarprovee = new javax.swing.JButton();
        btnborrarprovee = new javax.swing.JButton();
        btnactualizarprovee = new javax.swing.JButton();
        btnlistaprovee = new javax.swing.JButton();
        btnnuevoprovee = new javax.swing.JButton();
        btnbuscarprovee = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        Tusuario = new javax.swing.JTable();
        lblusuarios = new javax.swing.JLabel();
        lblusuario = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        lblcontra = new javax.swing.JLabel();
        txtcontra = new javax.swing.JPasswordField();
        lblcorreo = new javax.swing.JLabel();
        txtcorreo = new javax.swing.JTextField();
        lbltelefono = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        btnguardarusu = new javax.swing.JButton();
        btnborrarusu = new javax.swing.JButton();
        btnactualizarusu = new javax.swing.JButton();
        btnlistaprovee1 = new javax.swing.JButton();
        btnnuevoprovee1 = new javax.swing.JButton();
        btnbuscarusu = new javax.swing.JButton();
        txtbuscarprovee1 = new javax.swing.JTextField();
        btnregresar = new javax.swing.JButton();
        btnproveedor = new javax.swing.JButton();
        btncliente = new javax.swing.JButton();
        btnproducto = new javax.swing.JButton();
        btnewventa = new javax.swing.JButton();
        btnusuarios = new javax.swing.JButton();
        lblfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JPG/Fondo.jpg"))); // NOI18N
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1050, 40));

        JTBE.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbl1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lbl1.setText("CODIGO");

        lbl2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lbl2.setText("DESCRIPCION");

        lbl3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lbl3.setText("CANTIDAD");

        lbl4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lbl4.setText("PRECIO");

        lbl5.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lbl5.setText("FECHA");

        Tventa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "DESCRIPCIÓN", "CANTIDAD", "PRECIO", "FECHA", "TOTAL"
            }
        ));
        Tventa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TventaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tventa);

        lbltotal.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lbltotal.setText("0.00");

        btnborrar.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        btnborrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JPG/eliminar.png"))); // NOI18N
        btnborrar.setText("BORRAR");
        btnborrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnborrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnborrarActionPerformed(evt);
            }
        });

        btnguardar.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        btnguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JPG/GUARDAR.png"))); // NOI18N
        btnguardar.setText("GUARDAR");
        btnguardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnguardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        txtid2.setBackground(new java.awt.Color(255, 255, 204));
        txtid2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        btnbuscarpro1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnbuscarpro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JPG/buscar.png"))); // NOI18N
        btnbuscarpro1.setText("BUSCAR");
        btnbuscarpro1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnbuscarpro1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnbuscarpro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarpro1ActionPerformed(evt);
            }
        });

        btnlistapro1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnlistapro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JPG/lista.png"))); // NOI18N
        btnlistapro1.setText("LISTA");
        btnlistapro1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnlistapro1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnlistapro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlistapro1ActionPerformed(evt);
            }
        });

        btnactualizar3.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        btnactualizar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JPG/actualizar.png"))); // NOI18N
        btnactualizar3.setText("ACTUALIZAR");
        btnactualizar3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnactualizar3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnactualizar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizar3ActionPerformed(evt);
            }
        });

        btntotal.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btntotal.setText("TOTAL");
        btntotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntotalActionPerformed(evt);
            }
        });

        btnlimpiar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnlimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JPG/nueva venta.png"))); // NOI18N
        btnlimpiar.setText("NUEVO");
        btnlimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnlimpiar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });

        lbltotal1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lbltotal1.setText("Q");

        txtfecha.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtfecha.setText("GUA, ");

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel1.setText("DESCUENTOS");

        txtiva.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel3.setText("IVA");

        txtdescuentos1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnborrar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnactualizar3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtdescuentos1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtcant, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtdesc, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl1)
                                .addGap(61, 61, 61)
                                .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl5)
                                .addGap(40, 40, 40)
                                .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnlimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnlistapro1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnbuscarpro1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtid2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btntotal))
                            .addComponent(txtiva, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(32, 32, 32)))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbltotal1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbltotal))
                            .addComponent(jLabel1))))
                .addGap(0, 33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl1)
                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl5)
                    .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(txtid2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtiva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdescuentos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btntotal)
                            .addComponent(lbltotal1)
                            .addComponent(lbltotal)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbl2)
                                .addComponent(txtdesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbl3)
                                .addComponent(txtcant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbl4)))
                        .addComponent(btnlistapro1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnbuscarpro1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnlimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnguardar)
                        .addGap(8, 8, 8)
                        .addComponent(btnborrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnactualizar3))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        JTBE.addTab("1", jPanel1);

        lblregistro.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblregistro.setText("REGISTRO DE CLIENTES");

        lblnit.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblnit.setText("NIT");

        lblid.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblid.setText("ID");

        lblnombre.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblnombre.setText("NOMBRE");

        lbltel.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lbltel.setText("TELEFONO");

        Tcliente.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        Tcliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NIT", "TELÉFONO", "NOMBRE"
            }
        ));
        Tcliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TclienteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Tcliente);

        txtnombre.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        txtnum.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        txtnit.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        txtid.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        txtid1.setBackground(new java.awt.Color(255, 255, 204));
        txtid1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        lblid2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblid2.setText("BUSCAR");

        btnguardar2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnguardar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JPG/GUARDAR.png"))); // NOI18N
        btnguardar2.setText("GUARDAR");
        btnguardar2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnguardar2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnguardar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardar2ActionPerformed(evt);
            }
        });

        btnactualizar2.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        btnactualizar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JPG/actualizar.png"))); // NOI18N
        btnactualizar2.setText("ACTUALIZAR");
        btnactualizar2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnactualizar2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnactualizar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizar2ActionPerformed(evt);
            }
        });

        btnlista2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnlista2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JPG/lista.png"))); // NOI18N
        btnlista2.setText("LISTA");
        btnlista2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnlista2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnlista2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlista2ActionPerformed(evt);
            }
        });

        btnborrar4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnborrar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JPG/eliminar.png"))); // NOI18N
        btnborrar4.setText("BORRAR");
        btnborrar4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnborrar4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnborrar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnborrar4ActionPerformed(evt);
            }
        });

        btnewclient2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnewclient2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JPG/nueva venta.png"))); // NOI18N
        btnewclient2.setText("NUEVO");
        btnewclient2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnewclient2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnewclient2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnewclient2ActionPerformed(evt);
            }
        });

        btnbuscar2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnbuscar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JPG/buscar.png"))); // NOI18N
        btnbuscar2.setText("BUSCAR");
        btnbuscar2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnbuscar2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnbuscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnewclient2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnguardar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnactualizar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnborrar4)
                    .addComponent(btnlista2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuscar2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 751, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblid2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtid1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblid)
                        .addGap(18, 18, 18)
                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblnit)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtnit, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(lbltel)
                .addGap(18, 18, 18)
                .addComponent(txtnum, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblnombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtnombre)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(379, 379, 379)
                .addComponent(lblregistro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblregistro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblid)
                    .addComponent(lblnit)
                    .addComponent(lbltel)
                    .addComponent(lblnombre)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtid1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblid2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnborrar4)
                            .addComponent(btnguardar2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnlista2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnactualizar2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnewclient2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnbuscar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 72, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        JTBE.addTab("3", jPanel2);

        lblproducto.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblproducto.setText("PRODUCTOS");

        Tproduc.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        Tproduc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "DESCRIPCION", "CANTIDAD", "PRECIO"
            }
        ));
        Tproduc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TproducMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(Tproduc);

        lblcodigopro.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblcodigopro.setText("CODIGO");

        txtcodpro.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        lbldesc.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lbldesc.setText("DESCRIPCION");

        txtdesc2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        lblcant.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblcant.setText("CANTIDAD");

        txtcant2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        lblprecio2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblprecio2.setText("PRECIO");

        txtprecio2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        lblid3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblid3.setText("BUSCAR");

        txtbuscarprov.setBackground(new java.awt.Color(255, 255, 204));
        txtbuscarprov.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        btnguardarpro.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnguardarpro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JPG/GUARDAR.png"))); // NOI18N
        btnguardarpro.setText("GUARDAR");
        btnguardarpro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnguardarpro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnguardarpro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarproActionPerformed(evt);
            }
        });

        btnborrarpro.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnborrarpro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JPG/eliminar.png"))); // NOI18N
        btnborrarpro.setText("BORRAR");
        btnborrarpro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnborrarpro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnborrarpro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnborrarproActionPerformed(evt);
            }
        });

        btnactualizarpro.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        btnactualizarpro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JPG/actualizar.png"))); // NOI18N
        btnactualizarpro.setText("ACTUALIZAR");
        btnactualizarpro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnactualizarpro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnactualizarpro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarproActionPerformed(evt);
            }
        });

        btnlistapro.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnlistapro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JPG/lista.png"))); // NOI18N
        btnlistapro.setText("LISTA");
        btnlistapro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnlistapro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnlistapro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlistaproActionPerformed(evt);
            }
        });

        btnnuevopro.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnnuevopro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JPG/nueva venta.png"))); // NOI18N
        btnnuevopro.setText("NUEVO");
        btnnuevopro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnnuevopro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnnuevopro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoproActionPerformed(evt);
            }
        });

        btnbuscarpro.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnbuscarpro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JPG/buscar.png"))); // NOI18N
        btnbuscarpro.setText("BUSCAR");
        btnbuscarpro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnbuscarpro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnguardarpro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnactualizarpro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnnuevopro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnbuscarpro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnlistapro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnborrarpro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 763, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblcodigopro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcodpro, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblproducto)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lbldesc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtdesc2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblcant)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtcant2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblprecio2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtprecio2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblid3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtbuscarprov, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(374, 374, 374))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblproducto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcodigopro)
                    .addComponent(txtcodpro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbldesc)
                    .addComponent(txtdesc2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcant)
                    .addComponent(txtcant2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblprecio2)
                    .addComponent(txtprecio2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblid3)
                    .addComponent(txtbuscarprov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnguardarpro)
                            .addComponent(btnborrarpro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnactualizarpro)
                            .addComponent(btnlistapro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnnuevopro)
                            .addComponent(btnbuscarpro))
                        .addGap(0, 63, Short.MAX_VALUE)))
                .addContainerGap())
        );

        JTBE.addTab("4", jPanel3);

        lblproveedor.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblproveedor.setText("PROVEEDOR");

        Tproveedor.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        Tproveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "NOMBRE", "TELEFONO", "DIRECCION"
            }
        ));
        Tproveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TproveedorMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(Tproveedor);

        lblcodigoprovee.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblcodigoprovee.setText("CODIGO ");

        txtnombreprovee.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        lbLnombreprovee.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lbLnombreprovee.setText("NOMBRE");

        txtcdproveedor1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        lbltelefonoprovee.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lbltelefonoprovee.setText("TELEFONO");

        txttelprovee.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        lbldireccion.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lbldireccion.setText("DIRECCION");

        txtdireccion.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        lblbuscarprovee.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblbuscarprovee.setText("BUSCAR");

        txtbuscarprovee.setBackground(new java.awt.Color(255, 255, 204));
        txtbuscarprovee.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        btnguardarprovee.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnguardarprovee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JPG/GUARDAR.png"))); // NOI18N
        btnguardarprovee.setText("GUARDAR");
        btnguardarprovee.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnguardarprovee.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnguardarprovee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarproveeActionPerformed(evt);
            }
        });

        btnborrarprovee.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnborrarprovee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JPG/eliminar.png"))); // NOI18N
        btnborrarprovee.setText("BORRAR");
        btnborrarprovee.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnborrarprovee.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnborrarprovee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnborrarproveeActionPerformed(evt);
            }
        });

        btnactualizarprovee.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnactualizarprovee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JPG/actualizar.png"))); // NOI18N
        btnactualizarprovee.setText("ACTUALIZAR");
        btnactualizarprovee.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnactualizarprovee.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnactualizarprovee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarproveeActionPerformed(evt);
            }
        });

        btnlistaprovee.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnlistaprovee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JPG/lista.png"))); // NOI18N
        btnlistaprovee.setText("LISTA");
        btnlistaprovee.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnlistaprovee.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnlistaprovee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlistaproveeActionPerformed(evt);
            }
        });

        btnnuevoprovee.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnnuevoprovee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JPG/nueva venta.png"))); // NOI18N
        btnnuevoprovee.setText("NUEVO");
        btnnuevoprovee.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnnuevoprovee.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnnuevoprovee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoproveeActionPerformed(evt);
            }
        });

        btnbuscarprovee.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnbuscarprovee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JPG/buscar.png"))); // NOI18N
        btnbuscarprovee.setText("BUSCAR");
        btnbuscarprovee.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnbuscarprovee.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(lbltelefonoprovee)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txttelprovee, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(lblcodigoprovee)
                            .addGap(18, 18, 18)
                            .addComponent(txtcdproveedor1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnactualizarprovee, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnnuevoprovee, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnguardarprovee, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnbuscarprovee, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnlistaprovee, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnborrarprovee, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbLnombreprovee)
                            .addComponent(lbldireccion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtdireccion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                            .addComponent(txtnombreprovee, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(46, 46, 46)
                        .addComponent(lblbuscarprovee, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtbuscarprovee, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblproveedor)
                .addGap(441, 441, 441))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblproveedor)
                .addGap(8, 8, 8)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcodigoprovee)
                    .addComponent(txtcdproveedor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbLnombreprovee)
                    .addComponent(txtnombreprovee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttelprovee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltelefonoprovee)
                    .addComponent(lbldireccion)
                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblbuscarprovee)
                    .addComponent(txtbuscarprovee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnguardarprovee)
                            .addComponent(btnborrarprovee))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnactualizarprovee)
                            .addComponent(btnlistaprovee))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnnuevoprovee)
                            .addComponent(btnbuscarprovee)))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 79, Short.MAX_VALUE))
        );

        JTBE.addTab("5", jPanel4);

        Tusuario.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        Tusuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "USUARIO", "CONTRASEÑA", "CORREO", "TELEFONO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Tusuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TusuarioMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(Tusuario);

        lblusuarios.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblusuarios.setText("USUARIOS");

        lblusuario.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblusuario.setText("USUARIO");

        txtusuario.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        lblcontra.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblcontra.setText("CONTRASEÑA");

        txtcontra.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        lblcorreo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblcorreo.setText("CORREO");

        txtcorreo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        lbltelefono.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lbltelefono.setText("TELEFONO");

        txttelefono.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        btnguardarusu.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnguardarusu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JPG/GUARDAR.png"))); // NOI18N
        btnguardarusu.setText("GUARDAR");
        btnguardarusu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnguardarusu.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnguardarusu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarusuActionPerformed(evt);
            }
        });

        btnborrarusu.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnborrarusu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JPG/eliminar.png"))); // NOI18N
        btnborrarusu.setText("BORRAR");
        btnborrarusu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnborrarusu.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnborrarusu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnborrarusuActionPerformed(evt);
            }
        });

        btnactualizarusu.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnactualizarusu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JPG/actualizar.png"))); // NOI18N
        btnactualizarusu.setText("ACTUALIZAR");
        btnactualizarusu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnactualizarusu.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnactualizarusu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarusuActionPerformed(evt);
            }
        });

        btnlistaprovee1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnlistaprovee1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JPG/lista.png"))); // NOI18N
        btnlistaprovee1.setText("LISTA");
        btnlistaprovee1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnlistaprovee1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnlistaprovee1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlistaprovee1ActionPerformed(evt);
            }
        });

        btnnuevoprovee1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnnuevoprovee1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JPG/nueva venta.png"))); // NOI18N
        btnnuevoprovee1.setText("NUEVO");
        btnnuevoprovee1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnnuevoprovee1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnnuevoprovee1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoprovee1ActionPerformed(evt);
            }
        });

        btnbuscarusu.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnbuscarusu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JPG/buscar.png"))); // NOI18N
        btnbuscarusu.setText("BUSCAR");
        btnbuscarusu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnbuscarusu.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        txtbuscarprovee1.setBackground(new java.awt.Color(255, 255, 204));
        txtbuscarprovee1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(417, 417, 417)
                        .addComponent(lblusuarios))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnguardarusu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnbuscarusu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtbuscarprovee1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnactualizarusu, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnborrarusu, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnlistaprovee1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnnuevoprovee1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(lblusuario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(lblcontra)
                                .addGap(18, 18, 18)
                                .addComponent(txtcontra, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(lblcorreo)
                                .addGap(28, 28, 28)
                                .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(lbltelefono)
                                .addGap(18, 18, 18)
                                .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane6))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblusuarios)
                .addGap(12, 12, 12)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblusuario)
                    .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcontra)
                    .addComponent(txtcontra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcorreo)
                    .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltelefono)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnborrarusu)
                            .addComponent(btnguardarusu))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnactualizarusu)
                            .addComponent(btnlistaprovee1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnnuevoprovee1)
                            .addComponent(btnbuscarusu))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtbuscarprovee1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(66, 66, 66))
        );

        JTBE.addTab("6", jPanel5);

        getContentPane().add(JTBE, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 990, 510));

        btnregresar.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        btnregresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JPG/regreso.png"))); // NOI18N
        btnregresar.setText("REGRESAR");
        btnregresar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnregresar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnregresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 100, 90));

        btnproveedor.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnproveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JPG/proveedor.png"))); // NOI18N
        btnproveedor.setText("PROVEEDOR");
        btnproveedor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnproveedor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnproveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnproveedorActionPerformed(evt);
            }
        });
        getContentPane().add(btnproveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, 110, 90));

        btncliente.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btncliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JPG/cliente.png"))); // NOI18N
        btncliente.setText("CLIENTES");
        btncliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btncliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btncliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclienteActionPerformed(evt);
            }
        });
        getContentPane().add(btncliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 110, 90));

        btnproducto.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnproducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JPG/PRODUCTO.png"))); // NOI18N
        btnproducto.setText("PRODUCTOS");
        btnproducto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnproducto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnproductoActionPerformed(evt);
            }
        });
        getContentPane().add(btnproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, -1, 90));

        btnewventa.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        btnewventa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JPG/venta.png"))); // NOI18N
        btnewventa.setText("NUEVA VENTA");
        btnewventa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnewventa.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnewventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnewventaActionPerformed(evt);
            }
        });
        getContentPane().add(btnewventa, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, 90));

        btnusuarios.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        btnusuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JPG/usuario2.png"))); // NOI18N
        btnusuarios.setText("USUARIOS");
        btnusuarios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnusuarios.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnusuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnusuariosActionPerformed(evt);
            }
        });
        getContentPane().add(btnusuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, 110, 90));

        lblfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JPG/Fondo.jpg"))); // NOI18N
        getContentPane().add(lblfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregresarActionPerformed
        inicio R = new inicio ();
        R.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnregresarActionPerformed

    private void btnewventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnewventaActionPerformed
         JTBE.setSelectedIndex(0);
    }//GEN-LAST:event_btnewventaActionPerformed

    private void btnclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclienteActionPerformed
        JTBE.setSelectedIndex(1);
    }//GEN-LAST:event_btnclienteActionPerformed

    private void btnproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnproductoActionPerformed
        JTBE.setSelectedIndex(2);
    }//GEN-LAST:event_btnproductoActionPerformed

    private void btnproveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnproveedorActionPerformed
        JTBE.setSelectedIndex(3);
    }//GEN-LAST:event_btnproveedorActionPerformed

    private void btnusuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnusuariosActionPerformed
        JTBE.setSelectedIndex(4);
    }//GEN-LAST:event_btnusuariosActionPerformed

    private void btnnuevoprovee1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoprovee1ActionPerformed
        txtusuario.setText("");
        txtcontra.setText("");
        txtcorreo.setText("");
        txttelefono.setText("");
    }//GEN-LAST:event_btnnuevoprovee1ActionPerformed

    private void btnlistaprovee1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlistaprovee1ActionPerformed
        lista();
    }//GEN-LAST:event_btnlistaprovee1ActionPerformed

    private void btnactualizarusuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarusuActionPerformed
        String usuario = txtusuario.getText();
        int contraseña = Integer.parseInt(txtcontra.getText());
        String correo = txtcorreo.getText();
        int telusu = Integer.parseInt(txttelefono.getText());
        try{
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("UPDATE usuarios SET contraseña=?, correo=?, telefono=? WHERE usuario=?");
            ps.setInt(1, contraseña);
            ps.setString(2, correo);
            ps.setInt(3, telusu);
            ps.setString(4, usuario);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Modificado");
            limpiar ();

        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_btnactualizarusuActionPerformed

    private void btnborrarusuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnborrarusuActionPerformed

        String usu = txtusuario.getText();

        try{
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("DELETE FROM usuarios WHERE usuario=?");

            ps.setString(1, usu);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Se Elimino");
            limpiar ();

        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());

        }
    }//GEN-LAST:event_btnborrarusuActionPerformed

    private void btnguardarusuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarusuActionPerformed
        String usuario = txtusuario.getText();
        int contraseña = Integer.parseInt(txtcontra.getText());
        String correo = txtcorreo.getText();
        int telusu = Integer.parseInt(txttelefono.getText());
        try{
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("INSERT INTO usuarios (usuario , contraseña , correo , telefono) VALUES (?,?,?,?)");
            ps.setString(1, usuario);
            ps.setInt(2, contraseña);
            ps.setString(3, correo);
            ps.setInt(4, telusu);

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Guardado");
            limpiar5 ();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());

        }
    }//GEN-LAST:event_btnguardarusuActionPerformed

    private void TusuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TusuarioMouseClicked

        try{
            int fila = Tusuario.getSelectedRow();
            String usu = (Tusuario.getValueAt(fila,0).toString());

            PreparedStatement ps;
            ResultSet rs;
            Connection con = Conexion.getConexion();
            ps= con.prepareStatement("SELECT contraseña, correo, telefono FROM usuarios WHERE usuario=?");
            ps.setString(1, usu);
            rs = ps.executeQuery();

            while(rs.next()){
                txtusuario.setText(String.valueOf(usu));
                txtcontra.setText(rs.getString("contraseña"));
                txtcorreo.setText(rs.getString("correo"));
                txttelefono.setText(rs.getString("telefono"));
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_TusuarioMouseClicked

    private void btnnuevoproveeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoproveeActionPerformed
        txtcdproveedor1.setText("");
        txtnombreprovee.setText("");
        txttelprovee.setText("");
        txtdireccion.setText("");
    }//GEN-LAST:event_btnnuevoproveeActionPerformed

    private void btnlistaproveeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlistaproveeActionPerformed

        lista2();
    }//GEN-LAST:event_btnlistaproveeActionPerformed

    private void btnactualizarproveeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarproveeActionPerformed

        int codigoprovee = Integer.parseInt(txtcdproveedor1.getText());
        String nombreprovee = txtnombreprovee.getText();
        int telefonoprovee = Integer.parseInt(txttelprovee.getText());
        String direccionprovee = txtdireccion.getText();
        try{
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("UPDATE proveedor SET nombreprovee=?, telefonoprovee=?, correoprovee=? WHERE codigoprovee=?");
            ps.setString(1, nombreprovee);
            ps.setInt(2, telefonoprovee);
            ps.setString(3, direccionprovee);
            ps.setInt(4, codigoprovee);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Modificado");
            limpiar ();

        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_btnactualizarproveeActionPerformed

    private void btnborrarproveeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnborrarproveeActionPerformed

        int codigoprovee = Integer.parseInt(txtcdproveedor1.getText());

        try{
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("DELETE FROM proveedor WHERE codigoprovee=?");

            ps.setInt(1, codigoprovee);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Se Elimino");
            limpiar ();

        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());

        }
    }//GEN-LAST:event_btnborrarproveeActionPerformed

    private void btnguardarproveeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarproveeActionPerformed
        int codigoprovee = Integer.parseInt(txtcdproveedor1.getText());
        String nombreprovee = txtnombreprovee.getText();
        int telefonoprovee = Integer.parseInt(txttelprovee.getText());
        String direccionprovee = txtdireccion.getText();
        try{
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("INSERT INTO proveedor (codigoprovee , nombreprovee, telefonoprovee , correoprovee) VALUES (?,?,?,?)");
            ps.setInt(1, codigoprovee);
            ps.setString(2, nombreprovee);
            ps.setInt(3, telefonoprovee);
            ps.setString(4, direccionprovee);

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Guardado");
            limpiar4 ();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());

        }
    }//GEN-LAST:event_btnguardarproveeActionPerformed

    private void TproveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TproveedorMouseClicked

        try{
            int fila = Tproveedor.getSelectedRow();
            int codigoprov = Integer.parseInt(Tproveedor.getValueAt(fila, 0).toString());

            PreparedStatement ps;
            ResultSet rs;
            Connection con = Conexion.getConexion();
            ps= con.prepareStatement("SELECT nombreprovee, telefonoprovee, correoprovee FROM proveedor WHERE codigoprovee=?");
            ps.setInt(1, codigoprov);
            rs = ps.executeQuery();

            while(rs.next()){
                txtcdproveedor1.setText(String.valueOf(codigoprov));
                txtnombreprovee.setText(rs.getString("nombreprovee"));
                txttelprovee.setText(rs.getString("telefonoprovee"));
                txtdireccion.setText(rs.getString("correoprovee"));
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_TproveedorMouseClicked

    private void btnnuevoproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoproActionPerformed
        txtcodpro.setText("");
        txtdesc2.setText("");
        txtcant2.setText("");
        txtprecio2.setText("");
    }//GEN-LAST:event_btnnuevoproActionPerformed

    private void btnlistaproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlistaproActionPerformed

        lista3();
    }//GEN-LAST:event_btnlistaproActionPerformed

    private void btnactualizarproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarproActionPerformed

        int codigopro = Integer.parseInt(txtcodpro.getText());
        String desc2 = txtdesc2.getText();
        int cantidadpro = Integer.parseInt(txtcant2.getText());
        int preciopro = Integer.parseInt(txtprecio2.getText());
        try{
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("UPDATE productos SET descripcionprod=?, cantidadprod=?,  precioprod=? WHERE codigoprod=?");
            ps.setString(1, desc2);
            ps.setInt(2, cantidadpro);
            ps.setInt(3, preciopro);
            ps.setInt(4, codigopro);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Modificado");
            limpiar ();

        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_btnactualizarproActionPerformed

    private void btnborrarproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnborrarproActionPerformed

        int codigopro = Integer.parseInt(txtcodpro.getText());

        try{
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("DELETE FROM productos WHERE codigoprod=?");

            ps.setInt(1, codigopro);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Se Elimino");
            limpiar ();

        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());

        }
    }//GEN-LAST:event_btnborrarproActionPerformed

    private void btnguardarproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarproActionPerformed
        int codigopro = Integer.parseInt(txtcodpro.getText());
        String desc2 = txtdesc2.getText();
        int cantidadpro = Integer.parseInt(txtcant2.getText());
        int preciopro = Integer.parseInt(txtprecio2.getText());

        try{
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("INSERT INTO productos (codigoprod , descripcionprod, cantidadprod, precioprod) VALUES (?,?,?,?)");
            ps.setInt(1, codigopro);
            ps.setString(2, desc2);
            ps.setInt(3, cantidadpro);
            ps.setInt(4, preciopro);

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Guardado");
            limpiar3 ();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());

        }
    }//GEN-LAST:event_btnguardarproActionPerformed

    private void TproducMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TproducMouseClicked
        try{
            int fila = Tproduc.getSelectedRow();
            int codigopro = Integer.parseInt(Tproduc.getValueAt(fila, 0).toString());

            PreparedStatement ps;
            ResultSet rs;
            Connection con = Conexion.getConexion();
            ps= con.prepareStatement("SELECT descripcionprod, cantidadprod, precioprod FROM productos WHERE codigoprod=?");
            ps.setInt(1, codigopro);
            rs = ps.executeQuery();

            while(rs.next()){
                txtcodpro.setText(String.valueOf(codigopro));
                txtdesc2.setText(rs.getString("descripcionprod"));
                txtcant2.setText(rs.getString("cantidadprod"));
                txtprecio2.setText(rs.getString("precioprod"));
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_TproducMouseClicked

    private void btnewclient2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnewclient2ActionPerformed
        txtid.setText("");
        txtnit.setText("");
        txtnum.setText("");
        txtnombre.setText("");
    }//GEN-LAST:event_btnewclient2ActionPerformed

    private void btnborrar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnborrar4ActionPerformed

        int id = Integer.parseInt(txtid.getText());

        try{
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("DELETE FROM clientes WHERE idclie=?");

            ps.setInt(1, id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Se Elimino");
            limpiar ();

        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_btnborrar4ActionPerformed

    private void btnlista2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlista2ActionPerformed

        lista4();
    }//GEN-LAST:event_btnlista2ActionPerformed

    private void btnactualizar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizar2ActionPerformed

        int id = Integer.parseInt(txtid.getText());
        int nit = Integer.parseInt(txtnit.getText());
        int tel = Integer.parseInt(txtnum.getText());
        String nombre = txtnombre.getText();
        try{
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("UPDATE clientes SET nitclie=?, telefonoclie=?, nombreclie=? WHERE idclie=?");
            ps.setInt(1, nit);
            ps.setInt(2, tel);
            ps.setString(3, nombre);
            ps.setInt(4, id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Modificado");
            limpiar ();

        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_btnactualizar2ActionPerformed

    private void btnguardar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardar2ActionPerformed

        int id = Integer.parseInt(txtid.getText());
        int nit = Integer.parseInt(txtnit.getText());
        int tel = Integer.parseInt(txtnum.getText());
        String nombre = txtnombre.getText();

        try{
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("INSERT INTO clientes (idclie , nitclie, telefonoclie, nombreclie) VALUES (?,?,?,?)");
            ps.setInt(1, id);
            ps.setInt(2, nit);
            ps.setInt(3, tel);
            ps.setString(4, nombre);

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Guardado");
            limpiar2 ();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());

        }
    }//GEN-LAST:event_btnguardar2ActionPerformed

    private void TclienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TclienteMouseClicked

        try{
            int fila = Tcliente.getSelectedRow();
            int client = Integer.parseInt(Tcliente.getValueAt(fila, 0).toString());

            PreparedStatement ps;
            ResultSet rs;
            Connection con = Conexion.getConexion();
            ps= con.prepareStatement("SELECT nitclie, telefonoclie, nombreclie FROM clientes WHERE idclie=?");
            ps.setInt(1, client);
            rs = ps.executeQuery();

            while(rs.next()){
                txtid.setText(String.valueOf(client));
                txtnit.setText(rs.getString("nitclie"));
                txtnum.setText(rs.getString("telefonoclie"));
                txtnombre.setText(rs.getString("nombreclie"));
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_TclienteMouseClicked

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        txtcodigo.setText("");
        txtdesc.setText("");
        txtdescuentos1.setText("");
        txtiva.setText("");
        txtcant.setText("");
        txtprecio.setText("");
        lbltotal.setText("0.00");
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void btntotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntotalActionPerformed
        double v1, v2;
        double v3, v4, R, R2;  
        int T;
        
    
        v1 = Double.parseDouble(txtcant.getText());
        v2 = Double.parseDouble(txtprecio.getText());
        v3 = Double.parseDouble(txtdescuentos1.getText());
        v4 = Double.parseDouble(txtiva.getText());
        R = v1 * v2;
        R2 = R - (R * v3/100 )+ (R * v4/100);

        T = (int) Math.round(R2); 
        
        lbltotal.setText("" + T);
      
    }//GEN-LAST:event_btntotalActionPerformed

    private void btnlistapro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlistapro1ActionPerformed
        lista5();
    }//GEN-LAST:event_btnlistapro1ActionPerformed

    private void btnbuscarpro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarpro1ActionPerformed

    }//GEN-LAST:event_btnbuscarpro1ActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        int codigo = Integer.parseInt(txtcodigo.getText());
        String desc = txtdesc.getText();
        int cant = Integer.parseInt(txtcant.getText());
        int precio = Integer.parseInt(txtprecio.getText());
        String fecha = txtfecha.getText();
        int total = Integer.parseInt(lbltotal.getText());

        try{
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("INSERT INTO ventas (codigovent , descripcionvent, cantidadvent, preciovent, fecha, total) VALUES (?,?,?,?,?,?)");
            ps.setInt(1, codigo);
            ps.setString(2, desc);
            ps.setInt(3, cant);
            ps.setInt(4, precio);
            ps.setString(5, fecha);
            ps.setInt(6, total);

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Guardado");
            limpiar ();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());

        }

    }//GEN-LAST:event_btnguardarActionPerformed

    private void TventaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TventaMouseClicked

        try{
            int fila = Tventa.getSelectedRow();
            int codigoven = Integer.parseInt(Tventa.getValueAt(fila, 0).toString());

            PreparedStatement ps;
            ResultSet rs;
            Connection con = Conexion.getConexion();
            ps= con.prepareStatement("SELECT descripcionvent, cantidadvent, preciovent, fecha, total FROM ventas WHERE codigovent=?");
            ps.setInt(1, codigoven);
            rs = ps.executeQuery();

            while(rs.next()){
                txtcodigo.setText(String.valueOf(codigoven));
                txtdesc.setText(rs.getString("descripcionvent"));
                txtcant.setText(rs.getString("cantidadvent"));
                txtprecio.setText(rs.getString("preciovent"));
                txtfecha.setText(rs.getString("fecha"));
                lbltotal.setText(rs.getString("total"));
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_TventaMouseClicked

    private void btnactualizar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizar3ActionPerformed
       
        int codigo = Integer.parseInt(txtcodigo.getText());
        String desc = txtdesc.getText();
        int cant = Integer.parseInt(txtcant.getText());
        int precio = Integer.parseInt(txtprecio.getText());
        String fecha = txtfecha.getText();
        int total = Integer.parseInt(lbltotal.getText());
        try{
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("UPDATE ventas SET descripcionvent=?, cantidadvent=?, preciovent=?, fecha=?, total=? WHERE codigovent=?");
            ps.setString(1, desc);
            ps.setInt(2, cant);
            ps.setInt(3, precio);
            ps.setString(4, fecha);
            ps.setInt(5, total);
             ps.setInt(6, codigo);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Modificado");
            limpiar ();

        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        } 
    }//GEN-LAST:event_btnactualizar3ActionPerformed

    private void btnborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnborrarActionPerformed
       
        int id = Integer.parseInt(txtcodigo.getText());

        try{
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("DELETE FROM ventas WHERE codigovent=?");

            ps.setInt(1, id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Se Elimino");
            limpiar ();

        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
       
    }    
    }//GEN-LAST:event_btnborrarActionPerformed

    private void btnbuscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnbuscar2ActionPerformed
private void limpiar (){
        txtcodigo.setText("");
        txtdesc.setText("");
        txtcant.setText("");
        txtprecio.setText("");
        lbltotal.setText("0.00");   
}
    

    
    public void lista(){
        DefaultTableModel modelo = (DefaultTableModel) Tusuario.getModel();
        modelo.setRowCount(0);
       
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;
        
        try{
            
            Connection con = Conexion.getConexion();
            ps= con.prepareStatement("SELECT usuario, contraseña, correo, telefono FROM usuarios");
            
           rs = ps.executeQuery();
           rsmd = rs.getMetaData();
           columnas = rsmd.getColumnCount();
           
           while (rs.next()){
               Object[] fila= new Object[columnas];
               for(int i=0; i<columnas; i++){
                   fila[i]= rs.getObject(i +1);                  
               } 
               modelo.addRow(fila);
           }
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
  
    public void lista2(){
        DefaultTableModel modelo = (DefaultTableModel) Tproveedor.getModel();
        modelo.setRowCount(0);
       
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;
        
        try{
            
            Connection con = Conexion.getConexion();
            ps= con.prepareStatement("SELECT codigoprovee, nombreprovee, telefonoprovee, correoprovee FROM proveedor");
            
           rs = ps.executeQuery();
           rsmd = rs.getMetaData();
           columnas = rsmd.getColumnCount();
           
           while (rs.next()){
               Object[] fila= new Object[columnas];
               for(int i=0; i<columnas; i++){
                   fila[i]= rs.getObject(i +1);                  
               } 
               modelo.addRow(fila);
           }
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    public void lista3(){
        DefaultTableModel modelo = (DefaultTableModel) Tproduc.getModel();
        modelo.setRowCount(0);
       
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;
        
        try{
            
            Connection con = Conexion.getConexion();
            ps= con.prepareStatement("SELECT codigoprod, descripcionprod, cantidadprod, precioprod FROM productos");
            
           rs = ps.executeQuery();
           rsmd = rs.getMetaData();
           columnas = rsmd.getColumnCount();
           
           while (rs.next()){
               Object[] fila= new Object[columnas];
               for(int i=0; i<columnas; i++){
                   fila[i]= rs.getObject(i +1);                  
               } 
               modelo.addRow(fila);
           }
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
        public void lista4(){
        DefaultTableModel modelo = (DefaultTableModel) Tcliente.getModel();
        modelo.setRowCount(0);
       
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;
        
        try{
            
            Connection con = Conexion.getConexion();
            ps= con.prepareStatement("SELECT idclie, nitclie, telefonoclie, nombreclie FROM clientes");  
            rs = ps.executeQuery();
            rsmd = rs.getMetaData();
            columnas = rsmd.getColumnCount();
           
            while (rs.next()){
               Object[] fila= new Object[columnas];
               for(int i=0; i<columnas; i++){
                   fila[i]= rs.getObject(i +1);                  
               } 
               modelo.addRow(fila);
           }
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
            public void lista5(){
        DefaultTableModel modelo = (DefaultTableModel) Tventa.getModel();
        modelo.setRowCount(0);
       
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;
        
        try{
            
            Connection con = Conexion.getConexion();
            ps= con.prepareStatement("SELECT codigovent, descripcionvent, cantidadvent, preciovent, fecha, total FROM ventas");
            
           rs = ps.executeQuery();
           rsmd = rs.getMetaData();
           columnas = rsmd.getColumnCount();
           
           while (rs.next()){
               Object[] fila= new Object[columnas];
               for(int i=0; i<columnas; i++){
                   fila[i]= rs.getObject(i +1);                  
               } 
               modelo.addRow(fila);
           }
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }  
 private void limpiar2 (){
        txtid.setText("");
        txtnit.setText("");
        txtnum.setText("");
        txtnombre.setText("");   
}
    
   private void limpiar3 (){
        txtcodpro.setText("");
        txtdesc2.setText("");
        txtcant2.setText("");
        txtprecio2.setText("");   
} 
   private void limpiar4 (){
        txtcdproveedor1.setText("");
        txtnombreprovee.setText("");
        txttelprovee.setText("");
        txtdireccion.setText("");   
}     
    
     private void limpiar5 (){
        txtusuario.setText("");
        txtcontra.setText("");
        txtcorreo.setText("");
        txttelefono.setText("");   
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
            java.util.logging.Logger.getLogger(sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane JTBE;
    private com.toedter.calendar.JDateChooser Midate;
    private javax.swing.JTable Tcliente;
    private javax.swing.JTable Tproduc;
    private javax.swing.JTable Tproveedor;
    private javax.swing.JTable Tusuario;
    private javax.swing.JTable Tventa;
    private javax.swing.JButton btnactualizar2;
    private javax.swing.JButton btnactualizar3;
    private javax.swing.JButton btnactualizarpro;
    private javax.swing.JButton btnactualizarprovee;
    private javax.swing.JButton btnactualizarusu;
    private javax.swing.JButton btnborrar;
    private javax.swing.JButton btnborrar4;
    private javax.swing.JButton btnborrarpro;
    private javax.swing.JButton btnborrarprovee;
    private javax.swing.JButton btnborrarusu;
    private javax.swing.JButton btnbuscar2;
    private javax.swing.JButton btnbuscarpro;
    private javax.swing.JButton btnbuscarpro1;
    private javax.swing.JButton btnbuscarprovee;
    private javax.swing.JButton btnbuscarusu;
    private javax.swing.JButton btncliente;
    private javax.swing.JButton btnewclient2;
    private javax.swing.JButton btnewventa;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnguardar2;
    private javax.swing.JButton btnguardarpro;
    private javax.swing.JButton btnguardarprovee;
    private javax.swing.JButton btnguardarusu;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnlista2;
    private javax.swing.JButton btnlistapro;
    private javax.swing.JButton btnlistapro1;
    private javax.swing.JButton btnlistaprovee;
    private javax.swing.JButton btnlistaprovee1;
    private javax.swing.JButton btnnuevopro;
    private javax.swing.JButton btnnuevoprovee;
    private javax.swing.JButton btnnuevoprovee1;
    private javax.swing.JButton btnproducto;
    private javax.swing.JButton btnproveedor;
    private javax.swing.JButton btnregresar;
    private javax.swing.JButton btntotal;
    private javax.swing.JButton btnusuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel lbLnombreprovee;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lblbuscarprovee;
    private javax.swing.JLabel lblcant;
    private javax.swing.JLabel lblcodigopro;
    private javax.swing.JLabel lblcodigoprovee;
    private javax.swing.JLabel lblcontra;
    private javax.swing.JLabel lblcorreo;
    private javax.swing.JLabel lbldesc;
    private javax.swing.JLabel lbldireccion;
    private javax.swing.JLabel lblfondo;
    private javax.swing.JLabel lblid;
    private javax.swing.JLabel lblid2;
    private javax.swing.JLabel lblid3;
    private javax.swing.JLabel lblnit;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lblprecio2;
    private javax.swing.JLabel lblproducto;
    private javax.swing.JLabel lblproveedor;
    private javax.swing.JLabel lblregistro;
    private javax.swing.JLabel lbltel;
    private javax.swing.JLabel lbltelefono;
    private javax.swing.JLabel lbltelefonoprovee;
    private javax.swing.JLabel lbltotal;
    private javax.swing.JLabel lbltotal1;
    private javax.swing.JLabel lblusuario;
    private javax.swing.JLabel lblusuarios;
    private javax.swing.JTextField txtbuscarprov;
    private javax.swing.JTextField txtbuscarprovee;
    private javax.swing.JTextField txtbuscarprovee1;
    private javax.swing.JTextField txtcant;
    private javax.swing.JTextField txtcant2;
    private javax.swing.JTextField txtcdproveedor1;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtcodpro;
    private javax.swing.JPasswordField txtcontra;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtdesc;
    private javax.swing.JTextField txtdesc2;
    private javax.swing.JTextField txtdescuentos1;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtfecha;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtid1;
    private javax.swing.JTextField txtid2;
    private javax.swing.JTextField txtiva;
    private javax.swing.JTextField txtnit;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtnombreprovee;
    private javax.swing.JTextField txtnum;
    private javax.swing.JTextField txtprecio;
    private javax.swing.JTextField txtprecio2;
    private javax.swing.JTextField txttelefono;
    private javax.swing.JTextField txttelprovee;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
