/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediashareapps;

/**
 *
 * @author Harude
 */
public class Akun {
    private long uid;
    private long totUid;
    private String Uname;
    private String Passwd;
    private String IRLName;
    private String email;
    private String phone;
    private char gender;
    private int birthD;
    private int birthM;
    private int birthY;

    public Akun(String Uname, String Passwd, String IRLName, String email, String phone, char gender, int birthD, int birthM, int birthY) {
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

    public void setUid(long uid) {
        this.uid = uid;
    }

    public long getTotUid() {
        return totUid;
    }

    public void setTotUid(long totUid) {
        this.totUid = totUid;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
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
