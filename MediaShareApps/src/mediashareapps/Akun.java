/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediashareapps;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Harude
 */
public class Akun {

    public static List<Akun> UA;
    private List<Akun> PA;
    private List<Media> UM;
    private static long uid;
    private String Uname;
    private String Passwd;
    private String IRLName;
    private String email;
    private String phone;
    private String gender;
    private int birthD;
    private int birthM;
    private int birthY;

    public Akun(String Uname, String Passwd, String IRLName, String email, String phone, String gender, int birthD, int birthM, int birthY) {
        PA = new ArrayList<>();
        UM = new ArrayList<>();
        uid++;
        this.Uname = Uname;
        this.Passwd = Passwd;
        this.IRLName = IRLName;
        this.email = email;
        this.phone = phone;
        this.gender = gender;
        this.birthD = birthD;
        this.birthM = birthM;
        this.birthY = birthY;
    }

    public long getUid() {
        return uid;
    }
    
    public List<Akun> getUA() {
        return UA;
    }

    public void setFriend(Akun a) {
        UA.add(a);
    }

    public List<Media> getUM() {
        return UM;
    }

    public void setUM(List<Media> UM) {
        this.UM = UM;
    }

    public String getUname() {
        return Uname;
    }

    public void setUname(String Uname) {
        this.Uname = Uname;
    }

    public String getPasswd() {
        return Passwd;
    }

    public void setPasswd(String Passwd) {
        this.Passwd = Passwd;
    }

    public String getIRLName() {
        return IRLName;
    }

    public void setIRLName(String IRLName) {
        this.IRLName = IRLName;
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

    public int getBirthD() {
        return birthD;
    }

    public void setBirthD(int birthD) {
        this.birthD = birthD;
    }

    public int getBirthM() {
        return birthM;
    }

    public void setBirthM(int birthM) {
        this.birthM = birthM;
    }

    public int getBirthY() {
        return birthY;
    }

    public void setBirthY(int birthY) {
        this.birthY = birthY;
    }

}
