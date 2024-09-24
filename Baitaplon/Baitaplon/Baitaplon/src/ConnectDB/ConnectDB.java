/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ConnectDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author nmt15
 */
public class ConnectDB {
    public Connection conn = null;
    public Connection getConnection() throws SQLException {
        String path = "jdbc:mysql://localhost:3306/qlkh";
        this.conn = DriverManager.getConnection(path,"root","");
        return this.conn;
    }
    public ResultSet laydl() throws SQLException{
      Connection cn = getConnection();
      Statement st = null; // tạo tình huống
      st = cn.createStatement();
      String sql = "select  * from customers";
      ResultSet kq = st.executeQuery(sql); // lấy kq      
        return kq;
    }
    public ResultSet laydl_order() throws SQLException{
      Connection cn = getConnection();
      Statement st = null; // tạo tình huống
      st = cn.createStatement();
      String sql = "select  * from orders";
      ResultSet kq = st.executeQuery(sql); // lấy kq      
        return kq;
    }
    public ResultSet laydl_user() throws SQLException{
      Connection cn = getConnection();
      Statement st = null; // tạo tình huống
      st = cn.createStatement();
      String sql = "select  * from users";
      ResultSet kq = st.executeQuery(sql); // lấy kq      
        return kq;
    }
    public ResultSet laydlThem() throws SQLException{
      Connection cn = getConnection();
      Statement st = null; // tạo tình huống
      st = cn.createStatement();
      String sql = "SELECT MAX(customer_id) + 1 AS new_id FROM customers";
      ResultSet kq = st.executeQuery(sql); // lấy kq      
        return kq;
    }
    public ResultSet laydlThem_Order() throws SQLException{
      Connection cn = getConnection();
      Statement st = null; // tạo tình huống
      st = cn.createStatement();
      String sql = "SELECT MAX(order_id) + 1 AS new_idorder FROM orders";
      ResultSet kq = st.executeQuery(sql); // lấy kq      
        return kq;
    }
}

