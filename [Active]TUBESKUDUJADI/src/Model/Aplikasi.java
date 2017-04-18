/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Harude
 */
public class Aplikasi {
    private ArrayList<Akun> listUser;
    private ArrayList<Media> listUserMedia;

    public Aplikasi() {
        listUser = new ArrayList();
        listUserMedia = new ArrayList();
    }
    
    public void addAkun(String username, String password, String rname, String email, String gender, Date birthday){
        Akun a = new Akun(username, password, rname, email, gender, birthday);
        listUser.add(a);
    }
    
    public void addAkun(String username, String password, String rname, String email, String phone, String gender, Date birthday){
        Akun a = new Akun(username, password, rname, email, phone, gender, birthday);
        listUser.add(a);
    }
    
    public void Login(String uname, String passwd){
        
        int i = 0;
        while (!uname.equals(listUser.get(i).getUsername()) &&
                !passwd.equals(listUser.get(i).getPassword()) &&
                i < listUser.size()){
            i++;
        }
        if (i >= listUser.size()){
            throw new IllegalStateException("Username / Password salah");
        } else {
            //Lari ke Menu
        }
    }
    
    public void addFriend(Akun a, Akun b){
        a.setFriends(b);
    }
    
    public void delFriend(int uid, Akun a){
        Akun b = listUser.get(uid);
        b.getFriends().remove(a);
    }
}
