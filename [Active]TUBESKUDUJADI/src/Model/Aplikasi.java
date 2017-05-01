/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import db.dbConn;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Harude
 */
public class Aplikasi {
    
    private dbConn db;
    private ArrayList<Akun> listUser = db.loadAkun();
    private ArrayList<Media> listUserMedia;

    public Aplikasi() {
        listUser = new ArrayList();
        listUserMedia = new ArrayList();
        db = new dbConn();
        db.connect();
    }
    
    public void addAkun(String username, String password, String rname, String email, String gender){
        Akun a = new Akun(username, password, rname, email, gender);
        listUser.add(a);
        db.addUser(a);
    }
    
    public void addAkun(String username, String password, String rname, String email, String phone, String gender){
        Akun a = new Akun(username, password, rname, email, phone, gender);
        listUser.add(a);
        db.addUser(a);
    }
    
    public boolean Login(String uname, String passwd){
        boolean stat = false;
        if (db.authUser(uname, passwd) == true)
        return stat;
    }
    
    public void addFriend(Akun a, Akun b){
        a.setFriends(b);
    }
    
    public void delFriend(int uid, Akun a){
        Akun b = listUser.get(uid);
        b.getFriends().remove(a);
    }
}
