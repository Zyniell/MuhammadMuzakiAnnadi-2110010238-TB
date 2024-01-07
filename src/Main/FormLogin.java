/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main;

import java.sql.*;
//import Koneksi.KoneksiD;
import javax.swing.JOptionPane;
/**
 *
 * @author mmuzaki.a
 */
public class FormLogin extends javax.swing.JFrame {
    
    /**
     * Creates new form FormLogin
     */
    
    public Statement stmt;
    public ResultSet rs;
    //private Connection con = new KoneksiD().BukaKoneksi();
    Connection con = Koneksi.KoneksiD.BukaKoneksi();
    public FormLogin() {
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

        jPanel1 = new javax.swing.JPanel();
        Judul = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        TextUsername = new javax.swing.JTextField();
        TextPassword = new javax.swing.JPasswordField();
        BtnLogin = new javax.swing.JButton();
        BtnReset = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Exit = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Judul.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        Judul.setText("BEAM COMPUTER");

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/User.png"))); // NOI18N

        TextUsername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextUsername.setText("Username");
        TextUsername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TextUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextUsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextUsernameFocusLost(evt);
            }
        });

        TextPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextPassword.setText("Password");
        TextPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TextPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextPasswordFocusLost(evt);
            }
        });

        BtnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Enter_2.png"))); // NOI18N
        BtnLogin.setText("LOGIN");
        BtnLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BtnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLoginActionPerformed(evt);
            }
        });

        BtnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Reset.png"))); // NOI18N
        BtnReset.setText("RESET");
        BtnReset.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnResetActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        Exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Shutdown.png"))); // NOI18N
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Exit)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Exit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 418, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(Logo))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(BtnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(BtnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Judul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TextUsername)
                            .addComponent(TextPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(Judul)
                .addGap(18, 18, 18)
                .addComponent(Logo)
                .addGap(18, 18, 18)
                .addComponent(TextUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TextPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TextUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextUsernameFocusGained
        String user = TextUsername.getText();
        if (user.equals("Username")){
            TextUsername.setText("");
        }
    }//GEN-LAST:event_TextUsernameFocusGained

    private void TextUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextUsernameFocusLost
        String user = TextUsername.getText();
        if (user.equals("")||user.equals("Username")){
            TextUsername.setText("Username");
        }
    }//GEN-LAST:event_TextUsernameFocusLost

    private void TextPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextPasswordFocusGained
        String pass = TextPassword.getText();
        if (pass.equals("Password")){
            TextPassword.setText("");
        }
    }//GEN-LAST:event_TextPasswordFocusGained

    private void TextPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextPasswordFocusLost
        String pass = TextPassword.getText();
        if (pass.equals("")||pass.equals("Password")){
            TextPassword.setText("Password");
        }
    }//GEN-LAST:event_TextPasswordFocusLost

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        int a=JOptionPane.showConfirmDialog(null,"Apakah yakin ingin keluar", "Message", JOptionPane.YES_NO_OPTION);
            if (a==0) {
                dispose(); // Jika pengguna memilih "Yes" (0), keluar dari aplikasi
            }
    }//GEN-LAST:event_ExitMouseClicked

    private void BtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnResetActionPerformed
        TextUsername.setText("Username");
        TextPassword.setText("Password");
        TextUsername.requestFocus();
    }//GEN-LAST:event_BtnResetActionPerformed

    private void BtnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLoginActionPerformed
        try {
    //TextUsername.requestFocus();
    stmt = con.createStatement();
    rs = stmt.executeQuery("select * from user where username='" + TextUsername.getText() + "'");
    
    if (rs.next()) {
            
        if (TextPassword.getText().equals(rs.getString("password"))) {
            String nama = rs.getString("nm_user");
            String level = rs.getString("lvl_user");
            
            if (level.equals("Admin")) {
                new FormMenuAdmin(nama, level).setVisible(true);
            } else if (level.equals("Staff")) {
                new FormMenuStaff().setVisible(true);
            }
            
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Username atau Password Salah");
            TextUsername.setText("Username");
            TextPassword.setText("Password");
            TextUsername.requestFocus();
        }
    } else {
        JOptionPane.showMessageDialog(rootPane, "Username atau Password Salah");
        TextUsername.setText("Username");
        TextPassword.setText("Password");
        TextUsername.requestFocus();
    }
} catch (Exception e) {
    System.err.println("Error : " + e.getMessage());
}

    }//GEN-LAST:event_BtnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnLogin;
    private javax.swing.JButton BtnReset;
    private javax.swing.JLabel Exit;
    private javax.swing.JLabel Judul;
    private javax.swing.JLabel Logo;
    private javax.swing.JPasswordField TextPassword;
    private javax.swing.JTextField TextUsername;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
