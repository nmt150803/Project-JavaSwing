/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package baitaplon;

import ConnectDB.ConnectDB;
import java.awt.event.KeyEvent;
import java.sql.Connection; 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author admin
 */

public class Login extends javax.swing.JFrame {

    ConnectDB cn = new ConnectDB();
    Connection conn;
    
    public Login() {
        initComponents();
        try {
            this.conn = cn.getConnection();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Không thể kết nối đến cơ sở dữ liệu !", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
    
    private void login(){
        String Username = txtUserName.getText().toString().trim();
        String Password = new String(txtPassword.getPassword()).trim();
        
        String user, Fullname, pass ,Sdt;
        int Id, quyen; 
        
        StringBuffer sb = new StringBuffer();
        
        if(Username.equals("")){
            sb.append("Tài khoản không được để trống !\n");
        }
        if(Password.equals("")){
            sb.append("Mật khẩu không được để trống !\n");
        }
        if(sb.length() > 0){
            JOptionPane.showMessageDialog(this, sb.toString());
            return;
        }
        
        
        String sql_Login = "select * from users where username=? and password=?";
        
        try {
            PreparedStatement pst = conn.prepareStatement(sql_Login);
            pst.setString(1, Username);
            pst.setString(2, Password);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                Id = rs.getInt("id");
                Fullname = rs.getString("fullname");
                quyen = rs.getInt("quyen");
                Sdt = rs.getString("sdt");
                new Main(Id, Username, Password, quyen, Fullname, Sdt).setVisible(true);
                this.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(this, "Sai tài khoản hoặc mật khẩu!");
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, "Lỗi đăng nhập!", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Right = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Left = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnDangNhap = new javax.swing.JButton();
        txtUserName = new javax.swing.JTextField();
        btnThoat = new javax.swing.JButton();
        tbxSignup = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        Right.setBackground(new java.awt.Color(10, 78, 83));
        Right.setToolTipText("");
        Right.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel5.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Công ty TNHH Fast Order");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/z5454156582257_89dfe48baf936ee6e2c00b57bc2e0555.jpg"))); // NOI18N

        javax.swing.GroupLayout RightLayout = new javax.swing.GroupLayout(Right);
        Right.setLayout(RightLayout);
        RightLayout.setHorizontalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel5))
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        RightLayout.setVerticalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(29, 29, 29)
                .addComponent(jLabel5)
                .addGap(162, 162, 162))
        );

        jPanel1.add(Right);
        Right.setBounds(0, 0, 410, 500);

        Left.setBackground(new java.awt.Color(235, 235, 235));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("LOGIN");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Tài Khoản");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Mật khẩu");

        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });

        btnDangNhap.setBackground(new java.awt.Color(0, 102, 102));
        btnDangNhap.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDangNhap.setForeground(new java.awt.Color(255, 255, 255));
        btnDangNhap.setText("Đăng nhập ");
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });
        btnDangNhap.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnDangNhapKeyPressed(evt);
            }
        });

        btnThoat.setBackground(new java.awt.Color(0, 102, 102));
        btnThoat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnThoat.setForeground(new java.awt.Color(255, 255, 255));
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });
        btnThoat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnThoatKeyPressed(evt);
            }
        });

        tbxSignup.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbxSignup.setForeground(new java.awt.Color(255, 51, 51));
        tbxSignup.setText("Đăng ký");
        tbxSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbxSignupActionPerformed(evt);
            }
        });
        tbxSignup.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbxSignupKeyPressed(evt);
            }
        });

        jLabel7.setText("Tôi không có tài khoản ");

        javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
        Left.setLayout(LeftLayout);
        LeftLayout.setHorizontalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(92, 92, 92))
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addComponent(btnDangNhap)
                        .addGap(38, 38, 38)
                        .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtPassword)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(txtUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftLayout.createSequentialGroup()
                .addContainerGap(116, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbxSignup)
                .addGap(71, 71, 71))
        );
        LeftLayout.setVerticalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(66, 66, 66)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbxSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        jPanel1.add(Left);
        Left.setBounds(390, 0, 410, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
        login();
    }//GEN-LAST:event_btnDangNhapActionPerformed

    private void btnDangNhapKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnDangNhapKeyPressed

    }//GEN-LAST:event_btnDangNhapKeyPressed

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
        if (evt.getKeyCode()== KeyEvent.VK_ENTER){
            login();
        }
    }//GEN-LAST:event_txtPasswordKeyPressed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        int a = JOptionPane.showConfirmDialog(null,"Bạn có muốn thoát không"," ",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnThoatKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnThoatKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThoatKeyPressed

    private void tbxSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbxSignupActionPerformed
        try {
            SignUp SignupFrame = new SignUp();
            SignupFrame .setVisible(true);
            SignupFrame.pack();
            SignupFrame.setLocationRelativeTo(null);
        this.dispose();
        } catch (SQLException ex) {
            System.out.println("Loi " +ex.getMessage());
        }
    }//GEN-LAST:event_tbxSignupActionPerformed

    private void tbxSignupKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbxSignupKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbxSignupKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Left;
    private javax.swing.JPanel Right;
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JButton btnThoat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton tbxSignup;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
