/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package baitaplon;

import ConnectDB.ConnectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author nmt15
 */
public class SignUp extends javax.swing.JFrame {
    ConnectDB cn = new ConnectDB();
    Connection conn;
    
    public SignUp() throws SQLException {
        initComponents();
        this.conn = cn.getConnection();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtFullname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtPassword_Signup = new javax.swing.JPasswordField();
        btnDangky = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtRePassword = new javax.swing.JPasswordField();
        txtUsername_Signup = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(235, 235, 235));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("SIGN UP");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Full name");

        txtFullname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFullnameActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Username");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Password");

        txtPassword_Signup.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPassword_SignupKeyPressed(evt);
            }
        });

        btnDangky.setBackground(new java.awt.Color(0, 102, 102));
        btnDangky.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDangky.setForeground(new java.awt.Color(255, 255, 255));
        btnDangky.setText("Sign Up");
        btnDangky.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangkyActionPerformed(evt);
            }
        });
        btnDangky.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnDangkyKeyPressed(evt);
            }
        });

        jLabel7.setText("Tôi đã có tài khoản ");

        btnLogin.setForeground(new java.awt.Color(255, 51, 51));
        btnLogin.setText("Login ");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Re-Password");

        txtRePassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRePasswordKeyPressed(evt);
            }
        });

        txtUsername_Signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsername_SignupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(txtFullname, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(txtPassword_Signup, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(txtRePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(btnDangky, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtUsername_Signup, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLogin)))
                .addContainerGap(71, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(125, 125, 125))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtFullname, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtUsername_Signup, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword_Signup, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(btnDangky, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogin))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(10, 78, 83));
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/z5454156582257_89dfe48baf936ee6e2c00b57bc2e0555.jpg"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Công ty TNHH Fast Order");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(28, 28, 28))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addContainerGap(201, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtFullnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFullnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFullnameActionPerformed

    private void txtPassword_SignupKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassword_SignupKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassword_SignupKeyPressed
    
    private void Signup_User() throws SQLException{
        String username = txtUsername_Signup.getText().trim();
        String fullname = txtFullname.getText().trim();
        String Password = new String(txtPassword_Signup.getPassword()).trim();
        String RePassword = new String(txtRePassword.getPassword()).trim();
        String sql = "INSERT INTO users (username, fullname, password, quyen) VALUES (?, ?, ?, ?)";
        try (PreparedStatement st = conn.prepareStatement(sql)) {
            if(Password.compareTo(RePassword) == 0){
                st.setString(1, username);
                st.setString(2, fullname);
                st.setString(3, Password);
                st.setInt(4, 1);
                st.executeUpdate();
                JOptionPane.showMessageDialog(null, "Đăng ký thành công!", "Thành công", JOptionPane.INFORMATION_MESSAGE);
            } else{
                JOptionPane.showMessageDialog(null,"Mật khẩu không trùng vui lòng nhập lại"," ",JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Đăng ký thất bại: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private boolean Kiemtra() throws SQLException{
        String sql = "select * from users ";
        String fullname = txtFullname.getText().trim();
        String username_SignUp = txtUsername_Signup.getText().trim();
        String password = new String(txtPassword_Signup.getPassword()).trim();
        String rePassword = new String(txtRePassword.getPassword()).trim();
        if (fullname.isEmpty() || username_SignUp.isEmpty() || password.isEmpty() || rePassword.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Phải nhập đủ thông tin", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        try (PreparedStatement st = conn.prepareStatement(sql)) {
            ResultSet rs = st.executeQuery();
             if (rs.next()) {
                String username = rs.getString("username");
                if(username_SignUp.compareTo(username) == 0 ){
                    JOptionPane.showMessageDialog(null,"Trùng với username đã có vui lòng thử lại"," ",JOptionPane.INFORMATION_MESSAGE);
                    return false;
                }
             }
        } catch (SQLException ex) {
           System.out.println("Loi " +ex.getMessage());
        }
        return true;
    }
    
    
    private void btnDangkyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangkyActionPerformed
        try {
            Kiemtra();
            if(Kiemtra() == true){
                Signup_User();
            }
        } catch (SQLException ex) {
            System.out.println("Loi: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnDangkyActionPerformed

    private void btnDangkyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnDangkyKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDangkyKeyPressed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        Login LoginFrame = new Login();
        LoginFrame .setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtRePasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRePasswordKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRePasswordKeyPressed

    private void txtUsername_SignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsername_SignupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsername_SignupActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangky;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtFullname;
    private javax.swing.JPasswordField txtPassword_Signup;
    private javax.swing.JPasswordField txtRePassword;
    private javax.swing.JTextField txtUsername_Signup;
    // End of variables declaration//GEN-END:variables
}
