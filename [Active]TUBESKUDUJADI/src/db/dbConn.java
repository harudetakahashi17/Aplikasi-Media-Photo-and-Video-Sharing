/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;
import Model.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Harude
 */
public class dbConn {
    private Connection con;

    public void connect() {
        String url = "jdbc:mysql://localhost:3306/tubes";
        String username = "root";
        String password = "";
        try {
            con = DriverManager.getConnection(url, username, password);
            con.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
            con.setAutoCommit(false);
            System.out.println("connected");

        } catch (SQLException ex) {
            System.out.println("gagal konek");
        }
    }
    
    public void addUser(Akun a){
        try {
            Statement stmt = con.createStatement();
            String query = "insert into takun values("+a.getUid()+",'"+a.getUsername()+
                    "','"+a.getPassword()+"','"+a.getRname()+"','"+a.getEmail()+"','"
                    +a.getPhone()+"','"+a.getGender()+"')";
            stmt.execute(query);
            con.commit();
            stmt.close();
        } catch (Exception e) {
            throw new IllegalArgumentException("terjadi kesalahan saat save Akun");
        }
    }
    
    public ArrayList<Akun> loadAkun(){
        try {
            ArrayList<Akun> akun = new ArrayList();
            Statement stmt = con.createStatement();
            String query = "select * from takun";
            ResultSet rs = stmt.executeQuery(query);
            Akun.setUID(0);
                while (rs.next()) {
                    Akun a = new Akun(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
                    akun.add(a);
                }
            return akun;
        } catch (Exception e) {
            throw new IllegalArgumentException("terjadi kesalahan saat load Akun");
        }
    }
    
    public void authUser(String uname, String passwd){
        try {
            Statement stmt = con.createStatement();
            String query = "select * from takun where username='"+uname+"' and password='"+passwd+
                    "'";
            stmt.execute(query);
            con.commit();
            stmt.close();
        } catch (Exception e) {
            throw new IllegalArgumentException("terjadi kesalahan saat save Akun");
        }
    }
    
    public void addFriend(Akun a, Akun b){
        try {
            Statement stmt = con.createStatement();
            String query = "insert into tubes values('')"+a.getUid();
            stmt.execute(query);
            con.commit();
            stmt.close();
        } catch (Exception e) {
            throw new IllegalArgumentException("terjadi kesalahan saat save Akun");
        }
    }
    
    public void addMedia(Media m){
        try {
            Statement stmt = con.createStatement();
            String query = "insert into tubes values('')"+m.getPath();
            stmt.execute(query);
            con.commit();
            stmt.close();
        } catch (Exception e) {
            throw new IllegalArgumentException("terjadi kesalahan saat save Akun");
        }
    }
    
    public void searchFriend(String s){
        try {
            Statement stmt = con.createStatement();
            String query = "insert into tubes values('')";
            stmt.execute(query);
            con.commit();
            stmt.close();
        } catch (Exception e) {
            throw new IllegalArgumentException("terjadi kesalahan saat save Akun");
        }
    }
}
