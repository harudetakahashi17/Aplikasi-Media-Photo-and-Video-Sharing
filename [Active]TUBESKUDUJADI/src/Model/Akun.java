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
public class Akun {

    public static int getUID() {
        return UID;
    }

    public static void setUID(int aUID) {
        UID = aUID;
    }
    private ArrayList<Media> listMedia;
    private ArrayList<Akun> friends;
    private static int UID;
    private String username;
    private String password;
    private String rname;
    private String email;
    private String phone;
    private String gender;
    private Date birthday;

    public Akun(String username, String password, String rname, String email, String phone, String gender, Date birthday) {
        UID++;
        listMedia = new ArrayList();
        friends = new ArrayList();
        this.username = username;
        this.password = password;
        this.rname = rname;
        this.email = email;
        this.phone = phone;
        this.gender = gender;
        this.birthday = birthday;
    }

    public Akun(String username, String password, String rname, String email, String gender, Date birthday) {
        UID++;
        listMedia = new ArrayList();
        friends = new ArrayList();
        this.username = username;
        this.password = password;
        this.rname = rname;
        this.email = email;
        this.gender = gender;
        this.birthday = birthday;
    }

    public ArrayList<Media> getListMedia() {
        return listMedia;
    }

    public void setListMedia(ArrayList<Media> listMedia) {
        this.listMedia = listMedia;
    }

    public ArrayList<Akun> getFriends() {
        return friends;
    }

    public void setFriends(Akun f) {
        friends.add(f);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    
    
}
