/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package baitaplon;

import ConnectDB.ConnectDB;
import Data.Customer;
import java.awt.Checkbox;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nmt15
 */
public class Main extends javax.swing.JFrame {

    ConnectDB cn = new ConnectDB();
    Connection conn;
    
    private int currentPos = -1;
    String Username, Password, Fullname, Sdt;
    int quyen, Id;
    
    public Main() {
        initComponents();
    }

    public Main(int Id, String Username, String Password, int quyen, String Fullname , String Sdt) throws SQLException {
        initComponents();
        
        this.Id = Id;
        this.Username = Username;
        this.Fullname = Fullname;
        this.Password = Password;
        this.quyen = quyen;
        this.Sdt = Sdt;
        
        this.conn = cn.getConnection();
        
        hide_Text();
        
        addTableSelectionListener();
        addTableSelectionListener_Order();
        addTableSelectionListener_Info();
        try{
            Load_NameCustomer();
            Load_Hang();
            Load_Totalamount();
            Load_Phanhang();
            Load_ChucVu();
            Load_BaocaoThongke();
            showInfo(Username, Fullname, quyen);
            showData();
            showData_Order();
            showData_Phanloai();  
            showData_User();
            showData_Nhanvien(Username,Password, Fullname, Sdt);
        }catch (SQLException ex) {
            System.out.println("Loi xuat" +ex.getMessage());
        }
        if(quyen == 1){
            TabbedPaneCustomer.removeTabAt(3);
            
        } else TabbedPaneCustomer.removeTabAt(4);
        
    }
    
    private void hide_Text(){
        customer_idTxt.setEditable(false);
        order_idTxt.setEditable(false);
        idInfoTxt.setEditable(false);
        totalCustomerTxt.setEditable(false);
        totalOrderTxt.setEditable(false);
        totalTV_Txt.setEditable(false);
        totalTVB_Txt.setEditable(false);
        totalTVV_Txt.setEditable(false);
        totalTVKC_Txt.setEditable(false);
        TongdoanhthuTxt.setEditable(false);
        doanhthuTV_Txt.setEditable(false);
        doanhthuTVB_Txt.setEditable(false);
        doanhthuTVV_Txt.setEditable(false);
        doanhthuTVKC_Txt.setEditable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        TabbedPaneCustomer = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        PanelCustomer = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        customerTable = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        fullNameTxt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        emailTxt = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        addressTxt = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        radioBtnMale = new javax.swing.JRadioButton();
        radioBtnFemale = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        phoneNoTxt = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        customer_idTxt = new javax.swing.JTextField();
        btnRenew = new javax.swing.JButton();
        btnDisplay = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        findTxt = new javax.swing.JTextField();
        btnFind = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        order_idTxt = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        orderNameTxt = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        orderQuantityTxt = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        orderPriceTxt = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        customerNameCbb = new javax.swing.JComboBox();
        jLabel23 = new javax.swing.JLabel();
        orderDateTxt = new javax.swing.JTextField();
        btnSave_Order = new javax.swing.JButton();
        btnRenew_Order = new javax.swing.JButton();
        btnDisplay_Order = new javax.swing.JButton();
        btnRemove_Order = new javax.swing.JButton();
        btnEdit_Order = new javax.swing.JButton();
        btnFind_Order = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        Panel_Phanloai = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        customerHangCbb = new javax.swing.JComboBox();
        btnFind_Name = new javax.swing.JButton();
        btnDisplay_Phanloai = new javax.swing.JButton();
        customerName_FindCbb = new javax.swing.JComboBox();
        btnFind_Hang = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        PhanloaiTable = new javax.swing.JTable();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        fullnameInfoTxt = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        usernameInfoTxt = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        passwordInfoTxt = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        hangInfoCbb = new javax.swing.JComboBox();
        btnEdit_Info = new javax.swing.JButton();
        btnSave_Info = new javax.swing.JButton();
        btnRemove_Info = new javax.swing.JButton();
        btnDisplay_Info = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        fullnameInfo_FindTxt = new javax.swing.JTextField();
        btnFind_Info = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        idInfoTxt = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        infoUserTable = new javax.swing.JTable();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        fullname_NVTxt = new javax.swing.JTextField();
        username_NVTxt = new javax.swing.JTextField();
        password_NVTxt = new javax.swing.JTextField();
        sdt_NVTxt = new javax.swing.JTextField();
        btnSaveInfo_Nhanvien = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        totalCustomerTxt = new javax.swing.JTextField();
        totalOrderTxt = new javax.swing.JTextField();
        totalTV_Txt = new javax.swing.JTextField();
        totalTVB_Txt = new javax.swing.JTextField();
        totalTVV_Txt = new javax.swing.JTextField();
        totalTVKC_Txt = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        TongdoanhthuTxt = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        doanhthuTV_Txt = new javax.swing.JTextField();
        doanhthuTVB_Txt = new javax.swing.JTextField();
        doanhthuTVV_Txt = new javax.swing.JTextField();
        doanhthuTVKC_Txt = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        btnRenew_BaocaoThongke = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        fullnameUserTxt = new javax.swing.JLabel();
        NameHangTxt = new javax.swing.JLabel();
        usernameUserTxt = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        btnSignOut = new java.awt.Button();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(380, 380, 380)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(444, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(471, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("tab1", jPanel3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        customerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã", "Họ và tên", "Giới tính", "Email", "Số điện thoại", "Địa chỉ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(customerTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel11.setText("Họ và tên:");

        fullNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullNameTxtActionPerformed(evt);
            }
        });

        jLabel12.setText("Email:");

        emailTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTxtActionPerformed(evt);
            }
        });

        jLabel13.setText("Địa chỉ:");

        addressTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressTxtActionPerformed(evt);
            }
        });

        jLabel14.setText("Giới tính:");

        radioBtnMale.setBackground(new java.awt.Color(255, 255, 204));
        radioBtnMale.setText("Nam");
        radioBtnMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnMaleActionPerformed(evt);
            }
        });

        radioBtnFemale.setBackground(new java.awt.Color(255, 255, 204));
        radioBtnFemale.setText("Nữ");
        radioBtnFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnFemaleActionPerformed(evt);
            }
        });

        jLabel15.setText("SĐT:");

        phoneNoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNoTxtActionPerformed(evt);
            }
        });

        btnSave.setText("Lưu");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel16.setText("Mã KH :");

        customer_idTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customer_idTxtActionPerformed(evt);
            }
        });

        btnRenew.setText("Tạo mới");
        btnRenew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRenewActionPerformed(evt);
            }
        });

        btnDisplay.setText("Hiển thị");
        btnDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayActionPerformed(evt);
            }
        });

        btnEdit.setText("Sửa");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnRemove.setText("Xóa");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        jLabel17.setText("Tìm :");

        findTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findTxtActionPerformed(evt);
            }
        });

        btnFind.setText("Tìm");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(btnDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(205, 205, 205))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnRenew, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(605, 605, 605))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addGap(100, 100, 100)
                            .addComponent(radioBtnMale)
                            .addGap(44, 44, 44)
                            .addComponent(radioBtnFemale))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fullNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(customer_idTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel15)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(phoneNoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(addressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(findTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnFind, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(71, 71, 71))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(customer_idTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(fullNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(phoneNoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel17)
                    .addComponent(findTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFind))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(radioBtnMale)
                    .addComponent(radioBtnFemale))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRenew, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout PanelCustomerLayout = new javax.swing.GroupLayout(PanelCustomer);
        PanelCustomer.setLayout(PanelCustomerLayout);
        PanelCustomerLayout.setHorizontalGroup(
            PanelCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCustomerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PanelCustomerLayout.setVerticalGroup(
            PanelCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCustomerLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelCustomer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        TabbedPaneCustomer.addTab("Quản lý khách hàng", jPanel1);

        jPanel7.setBackground(new java.awt.Color(255, 255, 204));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.setPreferredSize(new java.awt.Dimension(1000, 213));

        jLabel18.setText("Mã Hàng :");

        order_idTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                order_idTxtActionPerformed(evt);
            }
        });

        jLabel19.setText("Tên hàng");

        orderNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderNameTxtActionPerformed(evt);
            }
        });

        jLabel20.setText("Số lượng");

        orderQuantityTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderQuantityTxtActionPerformed(evt);
            }
        });

        jLabel21.setText("Giá");

        orderPriceTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderPriceTxtActionPerformed(evt);
            }
        });

        jLabel22.setText("Tên khách hàng");

        customerNameCbb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel23.setText("Ngày đặt hàng");

        orderDateTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderDateTxtActionPerformed(evt);
            }
        });

        btnSave_Order.setText("Lưu");
        btnSave_Order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSave_OrderActionPerformed(evt);
            }
        });

        btnRenew_Order.setText("Tạo mới");
        btnRenew_Order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRenew_OrderActionPerformed(evt);
            }
        });

        btnDisplay_Order.setText("Hiển thị");
        btnDisplay_Order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplay_OrderActionPerformed(evt);
            }
        });

        btnRemove_Order.setText("Xóa");
        btnRemove_Order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemove_OrderActionPerformed(evt);
            }
        });

        btnEdit_Order.setText("Sửa");
        btnEdit_Order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEdit_OrderActionPerformed(evt);
            }
        });

        btnFind_Order.setText("Tìm Kiếm");
        btnFind_Order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFind_OrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(orderQuantityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(orderNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(order_idTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel23))))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(orderPriceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orderDateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerNameCbb, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(93, 93, 93))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(btnSave_Order, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRenew_Order, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDisplay_Order, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEdit_Order, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRemove_Order, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(btnFind_Order, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(order_idTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(orderNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(orderQuantityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel20))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(orderPriceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(orderDateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(customerNameCbb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave_Order, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRenew_Order, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDisplay_Order, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit_Order, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemove_Order, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFind_Order, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã", "Tên hàng", "Số lượng", "Giá", "Ngày đặt hàng", "Tên khách hàng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(orderTable);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1109, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1109, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 451, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 1111, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        TabbedPaneCustomer.addTab("Quản lý đơn hàng", jPanel6);

        jPanel10.setBackground(new java.awt.Color(255, 255, 204));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Tên khách hàng");

        jLabel2.setText("Hạng");

        customerHangCbb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        customerHangCbb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerHangCbbActionPerformed(evt);
            }
        });

        btnFind_Name.setText("Tìm ");
        btnFind_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFind_NameActionPerformed(evt);
            }
        });

        btnDisplay_Phanloai.setText("Hiển thị");
        btnDisplay_Phanloai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplay_PhanloaiActionPerformed(evt);
            }
        });

        customerName_FindCbb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        customerName_FindCbb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerName_FindCbbActionPerformed(evt);
            }
        });

        btnFind_Hang.setText("Tìm ");
        btnFind_Hang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFind_HangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(customerName_FindCbb, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(customerHangCbb, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnFind_Hang, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFind_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(btnDisplay_Phanloai, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFind_Hang)
                    .addComponent(customerHangCbb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerName_FindCbb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFind_Name))
                .addGap(18, 18, 18)
                .addComponent(btnDisplay_Phanloai, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        PhanloaiTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã", "Họ và tên", "Tổng tiền", "Phân loại"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(PhanloaiTable);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1109, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout Panel_PhanloaiLayout = new javax.swing.GroupLayout(Panel_Phanloai);
        Panel_Phanloai.setLayout(Panel_PhanloaiLayout);
        Panel_PhanloaiLayout.setHorizontalGroup(
            Panel_PhanloaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_PhanloaiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_PhanloaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        Panel_PhanloaiLayout.setVerticalGroup(
            Panel_PhanloaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_PhanloaiLayout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        TabbedPaneCustomer.addTab("Phân loại khách hàng", Panel_Phanloai);

        jPanel13.setBackground(new java.awt.Color(255, 255, 204));
        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        fullnameInfoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullnameInfoTxtActionPerformed(evt);
            }
        });

        jLabel24.setText("Chức vụ");

        jLabel25.setText("Họ và tên");

        usernameInfoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameInfoTxtActionPerformed(evt);
            }
        });

        jLabel26.setText("Password");

        passwordInfoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordInfoTxtActionPerformed(evt);
            }
        });

        jLabel27.setText("Username");

        hangInfoCbb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnEdit_Info.setText("Sửa");
        btnEdit_Info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEdit_InfoActionPerformed(evt);
            }
        });

        btnSave_Info.setText("Lưu");
        btnSave_Info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSave_InfoActionPerformed(evt);
            }
        });

        btnRemove_Info.setText("Xóa");
        btnRemove_Info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemove_InfoActionPerformed(evt);
            }
        });

        btnDisplay_Info.setText("Hiển thị");
        btnDisplay_Info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplay_InfoActionPerformed(evt);
            }
        });

        jLabel4.setText("Tìm ");

        fullnameInfo_FindTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullnameInfo_FindTxtActionPerformed(evt);
            }
        });

        btnFind_Info.setText("Tìm");
        btnFind_Info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFind_InfoActionPerformed(evt);
            }
        });

        jLabel5.setText("Mã :");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSave_Info, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(idInfoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addComponent(btnEdit_Info, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btnRemove_Info, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btnDisplay_Info, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fullnameInfoTxt)
                            .addComponent(hangInfoCbb, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(passwordInfoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(usernameInfoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(74, 74, 74))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fullnameInfo_FindTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btnFind_Info, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(fullnameInfoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(hangInfoCbb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel27)
                                .addComponent(usernameInfoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(idInfoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordInfoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEdit_Info, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSave_Info, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRemove_Info, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDisplay_Info, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(fullnameInfo_FindTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFind_Info, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        infoUserTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã", "Họ và tên", "Username", "Password", "Chức vụ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(infoUserTable);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        TabbedPaneCustomer.addTab("Quản lý tài khoản", jPanel12);

        jPanel16.setBackground(new java.awt.Color(255, 255, 204));
        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Họ và tên");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Username");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Password");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Số điện thoại");

        btnSaveInfo_Nhanvien.setText("Lưu");
        btnSaveInfo_Nhanvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveInfo_NhanvienActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setText("Thông tin tài khoản nhân viên");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(372, 372, 372)
                        .addComponent(jLabel10))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fullname_NVTxt)
                            .addComponent(username_NVTxt)
                            .addComponent(password_NVTxt)
                            .addComponent(sdt_NVTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(493, 493, 493)
                        .addComponent(btnSaveInfo_Nhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(162, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel10)
                .addGap(167, 167, 167)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(fullname_NVTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(username_NVTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(password_NVTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(sdt_NVTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(btnSaveInfo_Nhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(206, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        TabbedPaneCustomer.addTab("Thông tin tài khoản", jPanel15);

        jPanel18.setBackground(new java.awt.Color(255, 255, 204));
        jPanel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel28.setText("Tổng số khách hàng");

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel29.setText("Tổng số sản phẩm");

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Thành viên");

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Thành viên Bạc");

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("Thành viên Vàng");

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("Thành viên Kim Cương");

        totalCustomerTxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        totalOrderTxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        totalTV_Txt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        totalTVB_Txt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        totalTVV_Txt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        totalTVKC_Txt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel35.setText("Số lượng Khách hàng & Sản phẩm");

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("Số lượng khách hàng của từng hạng");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalCustomerTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalOrderTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalTV_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalTVB_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalTVV_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalTVKC_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(205, 205, 205))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(159, 159, 159))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jLabel43)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totalTV_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32)
                            .addComponent(totalTVB_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totalTVV_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel33))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totalTVKC_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34)))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(totalCustomerTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(totalOrderTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(35, 35, 35))
        );

        jPanel19.setBackground(new java.awt.Color(255, 255, 204));
        jPanel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel36.setText("Doanh thu");

        TongdoanhthuTxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("Thành viên Kim Cương");

        doanhthuTV_Txt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        doanhthuTVB_Txt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        doanhthuTVV_Txt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        doanhthuTVKC_Txt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("Thành viên");

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("Thành viên Bạc");

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("Thành viên Vàng");

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("Doanh thu của từng hạng");

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("Tổng doanh thu");

        btnRenew_BaocaoThongke.setText("Làm mới");
        btnRenew_BaocaoThongke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRenew_BaocaoThongkeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel19Layout.createSequentialGroup()
                                        .addGap(72, 72, 72)
                                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(65, 65, 65))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                                        .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnRenew_BaocaoThongke, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(TongdoanhthuTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(doanhthuTV_Txt)
                                            .addComponent(doanhthuTVB_Txt)
                                            .addComponent(doanhthuTVV_Txt)
                                            .addComponent(doanhthuTVKC_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(339, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel36)
                .addGap(47, 47, 47)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TongdoanhthuTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45))
                .addGap(18, 18, 18)
                .addComponent(jLabel44)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doanhthuTV_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doanhthuTVB_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doanhthuTVV_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doanhthuTVKC_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(btnRenew_BaocaoThongke, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TabbedPaneCustomer.addTab("Báo cáo & Thống kê", jPanel17);

        jPanel9.setBackground(new java.awt.Color(10, 78, 83));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Users.png"))); // NOI18N

        fullnameUserTxt.setBackground(new java.awt.Color(255, 255, 255));
        fullnameUserTxt.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        fullnameUserTxt.setForeground(new java.awt.Color(255, 255, 255));
        fullnameUserTxt.setText("Name");

        NameHangTxt.setBackground(new java.awt.Color(255, 255, 255));
        NameHangTxt.setForeground(new java.awt.Color(255, 255, 255));
        NameHangTxt.setText("Chức vụ :");

        usernameUserTxt.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        usernameUserTxt.setForeground(new java.awt.Color(255, 255, 255));
        usernameUserTxt.setText("Username");

        user.setForeground(new java.awt.Color(255, 255, 255));
        user.setText("Username :");

        btnSignOut.setBackground(new java.awt.Color(235, 235, 235));
        btnSignOut.setLabel("Đăng xuất");
        btnSignOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(NameHangTxt)
                .addGap(18, 18, 18)
                .addComponent(fullnameUserTxt)
                .addGap(285, 285, 285)
                .addComponent(user)
                .addGap(18, 18, 18)
                .addComponent(usernameUserTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSignOut, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fullnameUserTxt)
                            .addComponent(NameHangTxt)
                            .addComponent(usernameUserTxt)
                            .addComponent(user))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnSignOut, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
                        .addGap(8, 8, 8))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TabbedPaneCustomer)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TabbedPaneCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fullNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fullNameTxtActionPerformed

    private void emailTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTxtActionPerformed

    private void addressTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressTxtActionPerformed

    private void radioBtnMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioBtnMaleActionPerformed

    private void radioBtnFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioBtnFemaleActionPerformed

    private void phoneNoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNoTxtActionPerformed

//Thông tin đăng nhập    
    private void showInfo(String Username, String Fullname, int quyen) {
        if(quyen == 0){
            NameHangTxt.setText("Admin :");
        } else NameHangTxt.setText("Nhân viên :");
        fullnameUserTxt.setText(Fullname);
        usernameUserTxt.setText(Username);
    }
    
 //Quản lý khách hàng
    
    private void addTableSelectionListener() {
        customerTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                if (!event.getValueIsAdjusting()) {
                    // Handle the selection change
                    int selectedRow = customerTable.getSelectedRow();
                    if (selectedRow != -1) {
                        customer_idTxt.setText(customerTable.getValueAt(selectedRow, 0).toString());
                        fullNameTxt.setText(customerTable.getValueAt(selectedRow, 1).toString());
                        String gender = customerTable.getValueAt(selectedRow, 2).toString();
                        if("Nam".equals(gender)){
                            radioBtnMale.setSelected(true);
                            radioBtnFemale.setSelected(false);
                        } else{
                            radioBtnMale.setSelected(false);
                            radioBtnFemale.setSelected(true);
                        }
                        emailTxt.setText(customerTable.getValueAt(selectedRow, 3).toString());
                        phoneNoTxt.setText(customerTable.getValueAt(selectedRow, 4).toString());
                        addressTxt.setText(customerTable.getValueAt(selectedRow, 5).toString());
                        // Perform actions based on selected data
                    }
                }
            }
        });
    }
    
    private void showData() throws SQLException {
        DefaultTableModel bang = (DefaultTableModel) customerTable.getModel();
        bang.setRowCount(0);
        try {
            ResultSet rs = cn.laydl();
                while (rs.next()) {
                    Object[] list= {
                        rs.getInt("customer_id"),
                        rs.getString("fullname"),
                        rs.getString("gender"),
                        rs.getString("email"),
                        rs.getString("phone"),
                        rs.getString("address")                      
                    };
                    bang.addRow(list);
                }
        } catch (SQLException ex) {
            System.out.println("Loi " +ex.getMessage());
        }
    }
    
    private void showId()throws SQLException{
        try {
            ResultSet rs = cn.laydlThem();
            if (rs.next()) {
                int id = rs.getInt("new_id");
                customer_idTxt.setText(String.valueOf(id));
            }
        } catch (SQLException ex) {
            System.out.println("Loi: " + ex.getMessage());
        }
    }
    
    private void Insert_Customer() throws SQLException{
        String sql = "INSERT INTO customers (fullname, gender, email, phone, address) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, fullNameTxt.getText());
        st.setString(2,radioBtnMale.isSelected() ? "Nam" : "Nữ");
        String email = emailTxt.getText();
        if (email.contains("@")) {
            st.setString(3,emailTxt.getText());
        } else JOptionPane.showMessageDialog(null,"Sai định dạng email !"," ",JOptionPane.INFORMATION_MESSAGE);
        String phone = phoneNoTxt.getText();
        if (phone.matches("\\d{10}")) {
            st.setString(4,phoneNoTxt.getText());
        } else JOptionPane.showMessageDialog(null,"Sai định dạng số điện thoại !"," ",JOptionPane.INFORMATION_MESSAGE);
        st.setString(5,addressTxt.getText());
        st.executeUpdate();
    }
    
    private void Edit_Customer() throws SQLException{
        String sql = "update customers set fullname = ?,gender = ?, email = ?, phone = ?, address = ? where customer_id = ?";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, fullNameTxt.getText());
        st.setString(2,radioBtnMale.isSelected() ? "Nam" : "Nữ");
        String email = emailTxt.getText();
        if (email.contains("@")) {
            st.setString(3,emailTxt.getText());
        } else JOptionPane.showMessageDialog(null,"Sai định dạng email !"," ",JOptionPane.INFORMATION_MESSAGE);
        String phone = phoneNoTxt.getText();
        if (phone.matches("\\d{10}")) {
            st.setString(4,phoneNoTxt.getText());
        } else JOptionPane.showMessageDialog(null,"Sai định dạng số điện thoại !"," ",JOptionPane.INFORMATION_MESSAGE);
        st.setString(5,addressTxt.getText());
        st.setString(6,customer_idTxt.getText());
        st.executeUpdate();
    }
    
    private void Remove_Customer() throws SQLException{
        String sql = "DELETE FROM customers WHERE customer_id = ?";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1,customer_idTxt.getText());
        st.executeUpdate();
    }
    
    private void Find_Customer() throws SQLException{
        DefaultTableModel bang = (DefaultTableModel) customerTable.getModel();
        bang.setRowCount(0);
        try{
            String HoTen = findTxt.getText();
            String sql = "SELECT * FROM customers WHERE fullname LIKE ?";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1,HoTen); 
            ResultSet rs = st.executeQuery();
             while (rs.next()) {
                    Object[] list= {
                        rs.getInt("customer_id"),
                        rs.getString("fullname"),
                        rs.getString("gender"),
                        rs.getString("email"),
                        rs.getString("phone"),
                        rs.getString("address")                      
                    };
                    bang.addRow(list);
            }
        } catch (SQLException ex) {
            System.out.println("Loi" +ex.getMessage());
        }
        
    }
    
    private void resetInput() {
        customer_idTxt.setText("");
        fullNameTxt.setText("");
        emailTxt.setText("");
        phoneNoTxt.setText("");
        addressTxt.setText("");
        radioBtnMale.setSelected(false);
        radioBtnFemale.setSelected(false);
    }
    
//Quản lý đơn hàng

    private void addTableSelectionListener_Order() {
        orderTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                if (!event.getValueIsAdjusting()) {
                    // Handle the selection change
                    int selectedRow = orderTable.getSelectedRow();
                    if (selectedRow != -1) {
                        order_idTxt.setText(orderTable.getValueAt(selectedRow, 0).toString());
                        orderNameTxt.setText(orderTable.getValueAt(selectedRow, 1).toString());
                        orderQuantityTxt.setText(orderTable.getValueAt(selectedRow, 2).toString());
                        orderPriceTxt.setText(orderTable.getValueAt(selectedRow, 3).toString());
                        orderDateTxt.setText(orderTable.getValueAt(selectedRow, 4).toString());
                        String customerName = orderTable.getValueAt(selectedRow, 5).toString();
                        selectCustomerInComboBox(customerName);
                    }
                }
            }
        });
    }
    
    private void selectCustomerInComboBox(String customerName) {
        for (int i = 0; i < customerNameCbb.getItemCount(); i++) {
            Customer customer = (Customer) customerNameCbb.getItemAt(i);
            if (customer.getName().equals(customerName)) {
                customerNameCbb.setSelectedItem(customer);
                break;
            }
        }
    }
    
    private void showData_Order() throws SQLException {
        DefaultTableModel bang = (DefaultTableModel) orderTable.getModel();
        bang.setRowCount(0);
        try {
            ResultSet rs = cn.laydl_order();
                while (rs.next()) {
                    Object[] list= {
                        rs.getInt("order_id"),
                        rs.getString("order_name"),
                        rs.getInt("order_quantity"),
                        rs.getString("order_price"),
                        rs.getString("order_date"),
                        rs.getString("customer_name")                      
                    };
                    bang.addRow(list);
                }
        } catch (SQLException ex) {
            System.out.println("Loi " +ex.getMessage());
        }
    }
    
    private void Load_NameCustomer() throws SQLException{
        try {
            ResultSet rs = cn.laydl();
            customerNameCbb.removeAllItems();
            customerName_FindCbb.removeAllItems();
            while (rs.next()) {
                int id = rs.getInt("customer_id");
                String name = rs.getString("fullname");
                Customer customer = new Customer(id, name);
                customerNameCbb.addItem(customer);
                customerName_FindCbb.addItem(customer);
            }
            customerNameCbb.setSelectedIndex(-1);
            customerName_FindCbb.setSelectedIndex(-1);
        } catch (SQLException ex) {
            System.out.println("Loi" +ex.getMessage());
        }
    }
    
    private void showId_Order()throws SQLException{
        try {
            ResultSet rs = cn.laydlThem_Order();
            if (rs.next()) {
                int id_Order = rs.getInt("new_idorder");
                order_idTxt.setText(String.valueOf(id_Order));
            }
        } catch (SQLException ex) {
            System.out.println("Loi: " + ex.getMessage());
        }
    }
    
    private void Insert_Order() throws SQLException{
        String sql = "INSERT INTO orders (order_name, order_quantity, order_date, order_price, customer_name) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, orderNameTxt.getText());
        try {
            int quantity = Integer.parseInt(orderQuantityTxt.getText());
            st.setInt(2, quantity);
        } catch (NumberFormatException e) {
            throw new SQLException("Định dạng số lượng không hợp lệ", e);
        }
        st.setString(3, orderDateTxt.getText());
        try {
            double totalAmount = Double.parseDouble(orderPriceTxt.getText());
            st.setDouble(4, totalAmount);
        } catch (NumberFormatException e) {
            throw new SQLException("Định dạng tổng số tiền không hợp lệ", e);
        }
        Customer selectedCustomer = (Customer) customerNameCbb.getSelectedItem();
        if (selectedCustomer != null) {
            st.setString(5, selectedCustomer.getName());
        } else {
            throw new SQLException("Chưa chọn khách hàng");
        }
        st.executeUpdate();
    }
    
    private void Edit_Order() throws SQLException {
        String sql = "UPDATE orders SET order_name = ?, order_quantity = ?, order_date = ?, order_price = ?, customer_name = ? WHERE order_id = ?";
        try (PreparedStatement st = conn.prepareStatement(sql)) {
            st.setString(1, orderNameTxt.getText());
            int quantity = Integer.parseInt(orderQuantityTxt.getText());
            st.setInt(2, quantity);
            st.setString(3, orderDateTxt.getText());
            double totalAmount = Double.parseDouble(orderPriceTxt.getText());
            st.setDouble(4, totalAmount);
            Customer selectedCustomer = (Customer) customerNameCbb.getSelectedItem();
            if (selectedCustomer != null) {
                st.setString(5, selectedCustomer.getName());
                int orderId = Integer.parseInt(order_idTxt.getText());
                st.setInt(6, orderId);
                st.executeUpdate();
            } else {
                throw new SQLException("Chưa chọn khách hàng");
            }
        }
    }
    
    private void Remove_Order() throws SQLException{
        String sql = "DELETE FROM orders WHERE order_id = ?";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1,order_idTxt.getText());
        st.executeUpdate();
    }
    
    private void Find_Order() throws SQLException{
        DefaultTableModel bang = (DefaultTableModel) orderTable.getModel();
        bang.setRowCount(0);
        try{
            Customer Name = (Customer) customerNameCbb.getSelectedItem();
            String sql = "SELECT * FROM orders WHERE customer_name LIKE ?";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1,Name.getName()); 
            ResultSet rs = st.executeQuery();
             while (rs.next()) {
                    Object[] list= {
                        rs.getInt("order_id"),
                        rs.getString("order_name"),
                        rs.getInt("order_quantity"),
                        rs.getString("order_price"),
                        rs.getString("order_date"),
                        rs.getString("customer_name")                      
                    };
                    bang.addRow(list);
            }
        } catch (SQLException ex) {
            System.out.println("Loi" +ex.getMessage());
        }
        
    }
    
    private void Find_Customer_Name()throws SQLException{
        DefaultTableModel bang = (DefaultTableModel) PhanloaiTable.getModel();
        bang.setRowCount(0);
        try{
            String sql = "SELECT * FROM customers WHERE fullname LIKE ?";
            PreparedStatement st = conn.prepareStatement(sql);
            Customer selectedCustomer = (Customer) customerName_FindCbb.getSelectedItem();
            st.setString(1, selectedCustomer.getName()); 
            ResultSet rs = st.executeQuery();
             while (rs.next()) {
                    Object[] list= {
                        rs.getInt("customer_id"),
                        rs.getString("fullname"),
                        rs.getString("total_amount"),
                        rs.getString("phanhang"),                     
                    };
                    bang.addRow(list);
            }
        customerName_FindCbb.setSelectedIndex(-1);
        } catch (SQLException ex) {
            System.out.println("Loi" +ex.getMessage());
        }
    }
    
    private void resetInput_Order() {
        order_idTxt.setText("");
        orderNameTxt.setText("");
        orderQuantityTxt.setText("");
        orderPriceTxt.setText("");
        orderDateTxt.setText("");
        customerNameCbb.setSelectedIndex(-1);
    }
    
//Phân loại khách hàng
    
    private void Load_Totalamount() throws SQLException {
        String sql = "SELECT c.customer_id, c.fullname, SUM(o.order_price * o.order_quantity) AS total_amount " +
                     "FROM customers c " +
                     "JOIN orders o ON c.fullname = o.customer_name " +
                     "GROUP BY c.customer_id, c.fullname";

        try (PreparedStatement st = conn.prepareStatement(sql);
             ResultSet rs = st.executeQuery()) {

            String sqlUpdate = "UPDATE customers SET total_amount = ? WHERE customer_id = ?";
            try (PreparedStatement st1 = conn.prepareStatement(sqlUpdate)) {
                while (rs.next()) {
                    long totalAmount = rs.getLong("total_amount");
                    int customerId = rs.getInt("customer_id");
                    st1.setLong(1, totalAmount);
                    st1.setInt(2, customerId);
                    st1.executeUpdate();
                }
            }
        } catch (SQLException ex) {
            System.out.println("Loi " + ex.getMessage());
            throw ex; 
        }
    }
    
     private void Load_Phanhang() throws SQLException {
        String sql = "SELECT customer_id, total_amount FROM customers";

        try (PreparedStatement st = conn.prepareStatement(sql);
             ResultSet rs = st.executeQuery()) {

            String sqlUpdate = "UPDATE customers SET phanhang = ? WHERE customer_id = ?";
            try (PreparedStatement st1 = conn.prepareStatement(sqlUpdate)) {
                while (rs.next()) {
                    double totalAmount = rs.getDouble("total_amount");
                    int customerId = rs.getInt("customer_id");
                    String membershipLevel;

                    if (totalAmount >= 20000000) {
                        membershipLevel = "Thành viên Kim cương";
                    } else if (totalAmount >= 5000000) {
                        membershipLevel = "Thành viên Vàng";
                    } else if (totalAmount >= 3000000) {
                        membershipLevel = "Thành viên Bạc";
                    } else {
                        membershipLevel = "Thành viên";
                    }

                    st1.setString(1, membershipLevel);
                    st1.setInt(2, customerId);
                    st1.executeUpdate();
                }
            }
        } catch (SQLException ex) {
            System.out.println("Loi " + ex.getMessage());
            throw ex; 
        }
    }
     
     private void showData_Phanloai() throws SQLException {
        DefaultTableModel bang = (DefaultTableModel) PhanloaiTable.getModel();
        bang.setRowCount(0);
        try {
            ResultSet rs = cn.laydl();
                while (rs.next()) {
                    Object[] list= {
                        rs.getInt("customer_id"),
                        rs.getString("fullname"),
                        rs.getString("total_amount"),
                        rs.getString("phanhang")                      
                    };
                    bang.addRow(list);
                }
        } catch (SQLException ex) {
            System.out.println("Loi" +ex.getMessage());
        }
    }
     
    private void Load_Hang(){
        customerHangCbb.removeAllItems();
        customerHangCbb.addItem("Thành viên");
        customerHangCbb.addItem("Thành viên Bạc");
        customerHangCbb.addItem("Thành viên Vàng");
        customerHangCbb.addItem("Thành viên Kim Cương");
        customerHangCbb.setSelectedIndex(-1);
    }
    
    private void Find_Customer_Hang() throws SQLException {
        DefaultTableModel bang = (DefaultTableModel) PhanloaiTable.getModel();
        bang.setRowCount(0);
        try{
            String sql = "SELECT * FROM customers WHERE phanhang LIKE ?";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, customerHangCbb.getSelectedItem().toString()); 
            ResultSet rs = st.executeQuery();
             while (rs.next()) {
                    Object[] list= {
                        rs.getInt("customer_id"),
                        rs.getString("fullname"),
                        rs.getString("total_amount"),
                        rs.getString("phanhang"),                     
                    };
                    bang.addRow(list);
            }
            customerHangCbb.setSelectedIndex(-1);
        } catch (SQLException ex) {
            System.out.println("Loi" +ex.getMessage());
        }
    }
    
//Quản lý tài khoản
    
    private void addTableSelectionListener_Info() {
        infoUserTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                if (!event.getValueIsAdjusting()) {
                    int selectedRow = infoUserTable.getSelectedRow();
                    if (selectedRow != -1) {
                        idInfoTxt.setText(infoUserTable.getValueAt(selectedRow, 0).toString());
                        fullnameInfoTxt.setText(infoUserTable.getValueAt(selectedRow, 1).toString());
                        usernameInfoTxt.setText(infoUserTable.getValueAt(selectedRow, 2).toString());
                        passwordInfoTxt.setText(infoUserTable.getValueAt(selectedRow, 3).toString());
                        String hangInfoValue = infoUserTable.getValueAt(selectedRow, 4).toString();
                        if ("Admin".equals(hangInfoValue)) {
                            hangInfoCbb.setSelectedIndex(0);
                        } else if ("Nhân viên".equals(hangInfoValue)) {
                            hangInfoCbb.setSelectedIndex(1);
                        } else {
                            hangInfoCbb.setSelectedIndex(-1); 
                        }
                    }
                }
            }
        });
    }
    
    private void showData_User() throws SQLException {
        DefaultTableModel bang = (DefaultTableModel) infoUserTable.getModel();
        bang.setRowCount(0);
        try {
           ResultSet rs = cn.laydl_user();
                while (rs.next()) {
                    int quyen = rs.getInt("quyen");
                    String phanquyen;
                    if(quyen == 0){
                        phanquyen = "Admin";
                    } else phanquyen = "Nhân viên";
                    Object[] list= {
                        rs.getString("id"),
                        rs.getString("fullname"),
                        rs.getString("username"),
                        rs.getString("password"),
                        phanquyen,                   
                    };
                    bang.addRow(list);
                }
        } catch (SQLException ex) {
            System.out.println("Loi " +ex.getMessage());
        }
    }
    
    private void Load_ChucVu(){
        hangInfoCbb.removeAllItems();
        hangInfoCbb.addItem("Admin");
        hangInfoCbb.addItem("Nhân viên");
    }
    
    private void Insert_InfoUser() throws SQLException {
        String sqlInsert = "INSERT INTO users (username, fullname, password, quyen) VALUES (?, ?, ?, ?)";
        String sqlCheck = "SELECT * FROM users WHERE username = ?";
        
        String username = usernameInfoTxt.getText();
        String fullname = fullnameInfoTxt.getText();
        String password = passwordInfoTxt.getText();
        String selectedValue = hangInfoCbb.getSelectedItem().toString();
        
        PreparedStatement stCheck = null;
        PreparedStatement stInsert = null;
        ResultSet rs = null;
        if (fullname.isEmpty() || username.isEmpty() || password.isEmpty() || selectedValue.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Phải nhập đủ thông tin", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        } else {
            try {
                String usernameToCheck = usernameInfoTxt.getText().trim();
                stCheck = conn.prepareStatement(sqlCheck);
                stCheck.setString(1, usernameToCheck);
                rs = stCheck.executeQuery();

                if (rs.next()) {
                    JOptionPane.showMessageDialog(null, "Trùng với username đã có vui lòng thử lại", " ", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    stInsert = conn.prepareStatement(sqlInsert);
                    stInsert.setString(1, username);
                    stInsert.setString(2, fullname);
                    stInsert.setString(3, password);

                    stInsert.setInt(4, "Admin".equals(selectedValue) ? 0 : 1);
                    stInsert.executeUpdate();
                }
            } catch(SQLException ex){
                System.out.println("Loi" +ex.getMessage());
            }
        }
    }
    
    private void Edit_Info() throws SQLException {
        String sqlEdit = "update users set username = ?, fullname = ?, password = ?, quyen = ? where id = ?";
        String sqlCheck = "SELECT * FROM users WHERE username = ? AND id <> ?";

        String username = usernameInfoTxt.getText();
        String fullname = fullnameInfoTxt.getText();
        String password = passwordInfoTxt.getText();
        String selectedValue = hangInfoCbb.getSelectedItem().toString();
        
        PreparedStatement stCheck = null;
        PreparedStatement stEdit = null;
        ResultSet rs = null;

        if (fullname.isEmpty() || username.isEmpty() || password.isEmpty() || selectedValue.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Phải nhập đủ thông tin", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        } else {
            try {
                String usernameToCheck = usernameInfoTxt.getText().trim();
                stCheck = conn.prepareStatement(sqlCheck);
                int id= Integer.parseInt(idInfoTxt.getText().trim());
                stCheck.setString(1, usernameToCheck);
                stCheck.setInt(2, id);
                rs = stCheck.executeQuery();

                if (rs.next()) {
                    JOptionPane.showMessageDialog(null, "Trùng với username đã có vui lòng thử lại", " ", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    stEdit = conn.prepareStatement(sqlEdit);
                    stEdit.setString(1, usernameInfoTxt.getText());
                    stEdit.setString(2, fullnameInfoTxt.getText());
                    stEdit.setString(3, passwordInfoTxt.getText());
                    stEdit.setInt(4, "Admin".equals(selectedValue) ? 0 : 1);
                    stEdit.setInt(5, id);
                    stEdit.executeUpdate();
                }
            } catch(SQLException ex){
                System.out.println("Loi" +ex.getMessage());
            }
        }
    }
    
        private void Remove_Info() throws SQLException{
        String sql = "DELETE FROM users WHERE id = ?";
        PreparedStatement st = conn.prepareStatement(sql);
        int id = Integer.parseInt(idInfoTxt.getText());
        st.setInt(1, id);
        st.executeUpdate();
    }
    
    private void Find_Info() throws SQLException {
        DefaultTableModel bang = (DefaultTableModel) infoUserTable.getModel();
        bang.setRowCount(0);
        try{
            String sql = "SELECT * FROM users WHERE fullname LIKE ?";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, fullnameInfo_FindTxt.getText()); 
            ResultSet rs = st.executeQuery();
             while (rs.next()) {
                    int quyen = rs.getInt("quyen");
                    String phanquyen;
                    if(quyen == 0){
                        phanquyen = "Admin";
                    } else phanquyen = "Nhân viên";
                    Object[] list= {
                        rs.getString("id"),
                        rs.getString("fullname"),
                        rs.getString("username"),
                        rs.getString("password"),
                        phanquyen,                   
                    };
                    bang.addRow(list);
            }
        } catch (SQLException ex) {
            System.out.println("Loi" +ex.getMessage());
        }
    }
    
    private void resetInput_Info() {
        idInfoTxt.setText("");
        fullnameInfoTxt.setText("");
        usernameInfoTxt.setText("");
        passwordInfoTxt.setText("");
    }
    
//Thông tin tài khoản nhân viên    
    
    private void showData_Nhanvien(String Username, String Password,String Fullname , String Sdt) {
        fullname_NVTxt.setText(Fullname);
        username_NVTxt.setText(Username);
        password_NVTxt.setText(Password);
        sdt_NVTxt.setText(Sdt);    
    }

    private void Edit_Nhanvien(int Id) throws SQLException{
        String sql = "update users set username = ?, fullname = ?, password = ?, sdt = ? where id = ?";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, username_NVTxt.getText());
        st.setString(2, fullname_NVTxt.getText());
        st.setString(3, password_NVTxt.getText());
        String sdt = sdt_NVTxt.getText();
        if (sdt.matches("\\d{10}")) {
            st.setString(4, sdt_NVTxt.getText());
        } else JOptionPane.showMessageDialog(null,"Sai định dạng số điện thoại !"," ",JOptionPane.INFORMATION_MESSAGE);
        st.setInt(5, Id);
        st.executeUpdate();
    }
    
//Báo cáo & Thống kê    
    
    private void Load_BaocaoThongke() throws SQLException {
        String sql = "SELECT COUNT(*) AS total_customers, " +
                     "SUM(total_amount) AS total_revenue, " +
                     "SUM(CASE WHEN phanhang = 'Thành viên' THEN 1 ELSE 0 END) AS member_count, " +
                     "SUM(CASE WHEN phanhang = 'Thành viên Bạc' THEN 1 ELSE 0 END) AS silver_member_count, " +
                     "SUM(CASE WHEN phanhang = 'Thành viên Vàng' THEN 1 ELSE 0 END) AS gold_member_count, " +
                     "SUM(CASE WHEN phanhang = 'Thành viên Kim Cương' THEN 1 ELSE 0 END) AS diamond_member_count, " +
                     "SUM(CASE WHEN phanhang = 'Thành viên' THEN total_amount ELSE 0 END) AS total_revenue_member, " +
                     "SUM(CASE WHEN phanhang = 'Thành viên Bạc' THEN total_amount ELSE 0 END) AS total_revenue_silver, " +
                     "SUM(CASE WHEN phanhang = 'Thành viên Vàng' THEN total_amount ELSE 0 END) AS total_revenue_gold, " +
                     "SUM(CASE WHEN phanhang = 'Thành viên Kim Cương' THEN total_amount ELSE 0 END) AS total_revenue_diamond " +
                     "FROM customers";

        try (PreparedStatement st = conn.prepareStatement(sql)) {
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                totalCustomerTxt.setText(rs.getString("total_customers"));
                TongdoanhthuTxt.setText(rs.getString("total_revenue")); 
                totalTV_Txt.setText(rs.getString("member_count"));
                totalTVB_Txt.setText(rs.getString("silver_member_count"));
                totalTVV_Txt.setText(rs.getString("gold_member_count"));
                totalTVKC_Txt.setText(rs.getString("diamond_member_count"));
                doanhthuTV_Txt.setText(rs.getString("total_revenue_member"));
                doanhthuTVB_Txt.setText(rs.getString("total_revenue_silver"));
                doanhthuTVV_Txt.setText(rs.getString("total_revenue_gold"));
                doanhthuTVKC_Txt.setText(rs.getString("total_revenue_diamond"));
            }
        } catch (SQLException ex) {
            System.out.println("Loi: " + ex.getMessage());
        }

        String sql1 = "SELECT COUNT(*) AS total_orders FROM orders";
        try (PreparedStatement st1 = conn.prepareStatement(sql1)) {
            ResultSet rs1 = st1.executeQuery();
            if (rs1.next()) {
                totalOrderTxt.setText(rs1.getString("total_orders"));
            }
        } catch (SQLException ex) {
            System.out.println("Loi: " + ex.getMessage());
        }
    }
    
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try{
            Insert_Customer();
            showData();
        }catch (SQLException ex) {
            System.out.println("Loi " +ex.getMessage());
        }
        resetInput();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void customer_idTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customer_idTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customer_idTxtActionPerformed

    private void btnRenewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRenewActionPerformed
        try{
            showId();
            showId_Order();
        }catch (SQLException ex) {
            System.out.println("Loi " +ex.getMessage());
        }
    }//GEN-LAST:event_btnRenewActionPerformed

    private void btnDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayActionPerformed
        try{
            Load_NameCustomer();
            showData();
        }catch (SQLException ex) {
            System.out.println("Loi " +ex.getMessage());
        }
        resetInput();
    }//GEN-LAST:event_btnDisplayActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        try{
            Edit_Customer();
            Load_NameCustomer();
            showData();
        }catch (SQLException ex) {
            System.out.println("Loi " +ex.getMessage());
        }
        resetInput();
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        try{
            Remove_Customer();
            showData();
        }catch (SQLException ex) {
            System.out.println("Loi " +ex.getMessage());
        }
        resetInput();
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void findTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_findTxtActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        try{
            Find_Customer();
            fullnameInfo_FindTxt.setText("");
        }catch (SQLException ex) {
            System.out.println("Loi " +ex.getMessage());
        }
        resetInput();
    }//GEN-LAST:event_btnFindActionPerformed

    private void order_idTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_order_idTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_order_idTxtActionPerformed

    private void orderNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orderNameTxtActionPerformed

    private void orderQuantityTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderQuantityTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orderQuantityTxtActionPerformed

    private void orderPriceTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderPriceTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orderPriceTxtActionPerformed

    private void orderDateTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderDateTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orderDateTxtActionPerformed

    private void btnSave_OrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave_OrderActionPerformed
        try{
            Insert_Order();
            showData_Order();
        }catch (SQLException ex) {
            System.out.println("Loi " +ex.getMessage());
        }
        resetInput_Order();
    }//GEN-LAST:event_btnSave_OrderActionPerformed

    private void btnRenew_OrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRenew_OrderActionPerformed
        try{
            showId_Order();
        }catch (SQLException ex) {
            System.out.println("Loi " +ex.getMessage());
        }
    }//GEN-LAST:event_btnRenew_OrderActionPerformed

    private void btnDisplay_OrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplay_OrderActionPerformed
        try{
            showData_Order();
            Load_NameCustomer();
        }catch (SQLException ex) {
            System.out.println("Loi " +ex.getMessage());
        }
        resetInput_Order();
    }//GEN-LAST:event_btnDisplay_OrderActionPerformed

    private void btnRemove_OrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemove_OrderActionPerformed
        try{
            Remove_Order();
            showData_Order();
        }catch (SQLException ex) {
            System.out.println("Loi " +ex.getMessage());
        }
        resetInput_Order();
    }//GEN-LAST:event_btnRemove_OrderActionPerformed

    private void btnEdit_OrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEdit_OrderActionPerformed
        try{
            Edit_Order();
            showData_Order();
        }catch (SQLException ex) {
            System.out.println("Loi " +ex.getMessage());
        }
        resetInput_Order();
    }//GEN-LAST:event_btnEdit_OrderActionPerformed

    private void btnFind_OrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFind_OrderActionPerformed
       try{
            Find_Order();
        }catch (SQLException ex) {
            System.out.println("Loi " +ex.getMessage());
        }
        resetInput_Order();
    }//GEN-LAST:event_btnFind_OrderActionPerformed

    private void customerHangCbbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerHangCbbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerHangCbbActionPerformed

    private void btnDisplay_PhanloaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplay_PhanloaiActionPerformed
        try{
            Load_Totalamount();
            Load_Phanhang();
            showData_Phanloai();
        }catch (SQLException ex) {
            System.out.println("Loi " +ex.getMessage());
        }
    }//GEN-LAST:event_btnDisplay_PhanloaiActionPerformed

    private void customerName_FindCbbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerName_FindCbbActionPerformed
 
    }//GEN-LAST:event_customerName_FindCbbActionPerformed

    
    
    private void btnFind_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFind_NameActionPerformed
        try{
            Find_Customer_Name();
        }catch (SQLException ex) {
            System.out.println("Loi " +ex.getMessage());
        }
    }//GEN-LAST:event_btnFind_NameActionPerformed

    private void btnFind_HangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFind_HangActionPerformed
        try{
            Find_Customer_Hang();
        }catch (SQLException ex) {
            System.out.println("Loi " +ex.getMessage());
        }
    }//GEN-LAST:event_btnFind_HangActionPerformed

    private void btnSignOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignOutActionPerformed
        int a = JOptionPane.showConfirmDialog(null,"Bạn có chắc muốn đăng xuất không"," ",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
            new Login().setVisible(true);
            this.setVisible(false);
        } 
    }//GEN-LAST:event_btnSignOutActionPerformed

    private void fullnameInfoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullnameInfoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fullnameInfoTxtActionPerformed

    private void usernameInfoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameInfoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameInfoTxtActionPerformed

    private void passwordInfoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordInfoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordInfoTxtActionPerformed

    private void btnEdit_InfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEdit_InfoActionPerformed
        try{
            Edit_Info();
            resetInput_Info();
            showData_User();
        }catch (SQLException ex) {
            System.out.println("Loi " +ex.getMessage());
        }
    }//GEN-LAST:event_btnEdit_InfoActionPerformed

    private void btnSave_InfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave_InfoActionPerformed
        try{
            Insert_InfoUser();
            resetInput_Info();
            showData_User();
        }catch (SQLException ex) {
            System.out.println("Loi " +ex.getMessage());
        }
    }//GEN-LAST:event_btnSave_InfoActionPerformed

    private void btnRemove_InfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemove_InfoActionPerformed
        try{
            Remove_Info();
            resetInput_Info();
            showData_User();
        }catch (SQLException ex) {
            System.out.println("Loi " +ex.getMessage());
        }
    }//GEN-LAST:event_btnRemove_InfoActionPerformed

    private void btnDisplay_InfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplay_InfoActionPerformed
        try{
            showData_User();
        }catch (SQLException ex) {
            System.out.println("Loi " +ex.getMessage());
        }
    }//GEN-LAST:event_btnDisplay_InfoActionPerformed

    private void fullnameInfo_FindTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullnameInfo_FindTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fullnameInfo_FindTxtActionPerformed

    private void btnFind_InfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFind_InfoActionPerformed
        try{
            Find_Info();
            fullnameInfo_FindTxt.setText("");
        }catch (SQLException ex) {
            System.out.println("Loi " +ex.getMessage());
        }
    }//GEN-LAST:event_btnFind_InfoActionPerformed

    private void btnSaveInfo_NhanvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveInfo_NhanvienActionPerformed
        try{
            Edit_Nhanvien(Id);
        }catch (SQLException ex) {
            System.out.println("Loi " +ex.getMessage());
        }
        
    }//GEN-LAST:event_btnSaveInfo_NhanvienActionPerformed

    private void btnRenew_BaocaoThongkeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRenew_BaocaoThongkeActionPerformed
        try{
            Load_BaocaoThongke();
        }catch (SQLException ex) {
            System.out.println("Loi " +ex.getMessage());
        }
    }//GEN-LAST:event_btnRenew_BaocaoThongkeActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NameHangTxt;
    private javax.swing.JPanel PanelCustomer;
    private javax.swing.JPanel Panel_Phanloai;
    private javax.swing.JTable PhanloaiTable;
    private javax.swing.JTabbedPane TabbedPaneCustomer;
    private javax.swing.JTextField TongdoanhthuTxt;
    private javax.swing.JTextField addressTxt;
    private javax.swing.JButton btnDisplay;
    private javax.swing.JButton btnDisplay_Info;
    private javax.swing.JButton btnDisplay_Order;
    private javax.swing.JButton btnDisplay_Phanloai;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnEdit_Info;
    private javax.swing.JButton btnEdit_Order;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnFind_Hang;
    private javax.swing.JButton btnFind_Info;
    private javax.swing.JButton btnFind_Name;
    private javax.swing.JButton btnFind_Order;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnRemove_Info;
    private javax.swing.JButton btnRemove_Order;
    private javax.swing.JButton btnRenew;
    private javax.swing.JButton btnRenew_BaocaoThongke;
    private javax.swing.JButton btnRenew_Order;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSaveInfo_Nhanvien;
    private javax.swing.JButton btnSave_Info;
    private javax.swing.JButton btnSave_Order;
    private java.awt.Button btnSignOut;
    private javax.swing.JComboBox customerHangCbb;
    private javax.swing.JComboBox customerNameCbb;
    private javax.swing.JComboBox customerName_FindCbb;
    private javax.swing.JTable customerTable;
    private javax.swing.JTextField customer_idTxt;
    private javax.swing.JTextField doanhthuTVB_Txt;
    private javax.swing.JTextField doanhthuTVKC_Txt;
    private javax.swing.JTextField doanhthuTVV_Txt;
    private javax.swing.JTextField doanhthuTV_Txt;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JTextField findTxt;
    private javax.swing.JTextField fullNameTxt;
    private javax.swing.JTextField fullnameInfoTxt;
    private javax.swing.JTextField fullnameInfo_FindTxt;
    private javax.swing.JLabel fullnameUserTxt;
    private javax.swing.JTextField fullname_NVTxt;
    private javax.swing.JComboBox hangInfoCbb;
    private javax.swing.JTextField idInfoTxt;
    private javax.swing.JTable infoUserTable;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTextField orderDateTxt;
    private javax.swing.JTextField orderNameTxt;
    private javax.swing.JTextField orderPriceTxt;
    private javax.swing.JTextField orderQuantityTxt;
    private javax.swing.JTable orderTable;
    private javax.swing.JTextField order_idTxt;
    private javax.swing.JTextField passwordInfoTxt;
    private javax.swing.JTextField password_NVTxt;
    private javax.swing.JTextField phoneNoTxt;
    private javax.swing.JRadioButton radioBtnFemale;
    private javax.swing.JRadioButton radioBtnMale;
    private javax.swing.JTextField sdt_NVTxt;
    private javax.swing.JTextField totalCustomerTxt;
    private javax.swing.JTextField totalOrderTxt;
    private javax.swing.JTextField totalTVB_Txt;
    private javax.swing.JTextField totalTVKC_Txt;
    private javax.swing.JTextField totalTVV_Txt;
    private javax.swing.JTextField totalTV_Txt;
    private javax.swing.JLabel user;
    private javax.swing.JTextField usernameInfoTxt;
    private javax.swing.JLabel usernameUserTxt;
    private javax.swing.JTextField username_NVTxt;
    // End of variables declaration//GEN-END:variables
}
