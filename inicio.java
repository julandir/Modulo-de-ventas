
package vista;

import JAVACLASS.Conexion;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;

public class inicio extends javax.swing.JFrame {

    
    public inicio() {
        
        initComponents();
         this.setLocationRelativeTo(null);     
    }
    
void ingresar(){
      JAVACLASS.Conexion.getConexion();
        
        try{
            Connection con = Conexion.getConexion();
            PreparedStatement ps= con.prepareStatement("select * from usuarios where usuario= ? and contraseña= ?");
            ps.setObject(1,this.txtusuario.getText());
            ps.setObject(2,this.txtcontra.getText());
            ResultSet rs=ps.executeQuery();
            if (rs.next()){
               new sistema().setVisible(true);
            } else {
             JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos");
             new inicio().setVisible(true);
            }
            
    }  catch (SQLException ex) {  
            Logger.getLogger(inicio.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }

 
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblusuario = new javax.swing.JLabel();
        lblcontra = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        txtcontra = new javax.swing.JPasswordField();
        btlogin = new javax.swing.JButton();
        lbl1 = new javax.swing.JLabel();
        lblfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblusuario.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblusuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JPG/usuario.png"))); // NOI18N
        getContentPane().add(lblusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 70, 70));

        lblcontra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JPG/contra.png"))); // NOI18N
        getContentPane().add(lblcontra, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, -1, 70));

        txtusuario.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtusuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 160, 30));

        txtcontra.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtcontra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtcontra, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 160, 30));

        btlogin.setBackground(new java.awt.Color(224, 14, 14));
        btlogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JPG/login.png"))); // NOI18N
        btlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btloginActionPerformed(evt);
            }
        });
        getContentPane().add(btlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 120, 30));

        lbl1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lbl1.setForeground(new java.awt.Color(255, 255, 255));
        lbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl1.setText("INICIAR SESION");
        getContentPane().add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 200, 60));

        lblfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JPG/Fondo.jpg"))); // NOI18N
        lblfondo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(lblfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-720, -310, 1370, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btloginActionPerformed
   
        ingresar();
        this.dispose();
 
    }//GEN-LAST:event_btloginActionPerformed

    
    
    
    
    
    
    
    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btlogin;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lblcontra;
    private javax.swing.JLabel lblfondo;
    private javax.swing.JLabel lblusuario;
    private javax.swing.JPasswordField txtcontra;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables



}
