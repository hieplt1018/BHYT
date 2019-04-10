/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import connectdb.ConnectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Admin;
import helper.MD5;
/**
 *
 * @author asus
 */
public class AdminDaoImpl implements AdminDao{
    private Connection conn = null;
    private PreparedStatement stmt = null;
    private ResultSet rs = null;
    private ConnectDB connectdb;

    public AdminDaoImpl() {
        this.connectdb = new ConnectDB();
    }
    
    @Override
    public boolean register(Admin admin) {
        String sql = "INSERT INTO admin (Username, Password)  VALUES(?,?)";
        try {
            stmt = connectdb.openConnect().prepareStatement(sql);
            stmt.setString(1, admin.getUsername());
            stmt.setString(2, MD5.encryption(admin.getPassword()));
            stmt.executeUpdate();
            System.out.println("Insert successful!");
            return true;
        } catch (SQLException ex) {
            System.out.println("Loi insert admin!");
        } finally{
            connectdb.closeConnect();
        }
        return false;
    }

    @Override
    public Admin login(String username, String password) {
        String sql = "select * from admin where Username='" + username + "' and password='" + password + "'";
        System.out.println(sql);
        try {
            rs = connectdb.getStatement().executeQuery(sql);
            if(rs.next()){
                Admin ad = new Admin();
                ad.setUsername(rs.getString("username"));
                ad.setPassword(rs.getString("password"));
                System.out.println("Login successful!");
                return ad;
            } else {
                System.out.println("Sai username hoac password");
            }
        } catch (SQLException ex) {
            System.out.println("Catch Login function");
        } finally{
            connectdb.closeConnect();
        }
        return null;
    }
    
    public static void main(String[] args) {
        AdminDaoImpl adminDaoImpl= new AdminDaoImpl();
        Admin admin = new Admin("hongduyen", "ate1202");
        adminDaoImpl.register(admin);
        
        
    }
}
