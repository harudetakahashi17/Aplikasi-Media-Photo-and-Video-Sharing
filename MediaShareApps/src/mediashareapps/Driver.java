/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediashareapps;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Harude
 */
public class Driver {
    public static void cls(){
        for (int i=0; i<50; i++){
            System.out.println("");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Akun a = new Akun("Harude","test","Dummy1","Email1","123",'M',17,12,1995); //(String Uname, String Passwd, String IRLName, String email, String phone, char gender, int birthD, int birthM, int birthY)
        Akun b = new Akun("Dummy2","test","Dummy2","Email2","312",'F',17,8,1945);
        Akun c = new Akun("Dummy3","test","Dummy3","Email3","321",'M',17,12,2016);
        //List<Akun> la = new ArrayList<>();
        a.setFriend(a);
        a.setFriend(b);
        a.setFriend(c);
//        
//        for(int i=0; i < a.getUA().size(); i++){
//            System.out.println(a.getUA().get(i).getIRLName() +" "+ a.getUA().get(i).getEmail()
//            +" || "+ a.getUA().get(i).getBirthD() +"/"+ a.getUA().get(i).getBirthM()
//            +"/"+ a.getUA().get(i).getBirthY());
//        }
        Scanner s = new Scanner(System.in);
        String user,passwd;
        
        System.out.println("Login Form");
        System.out.println("Username : ");
        user = s.next();
        System.out.println("Password : ");
        passwd = s.next();
        
        int i = 0;
        
        while (!user.equals(a.getUA().get(i).getUname()) && !passwd.equals(a.getUA().get(i).getPasswd()) && (i < a.getUA().size()-1)){
            i++;
        }
        if((user.equals(a.getUA().get(i).getUname())) && (passwd.equals(a.getUA().get(i).getPasswd())) && a.getUA().size() != i){
            System.out.println(user+" "+passwd);
        } else {
            System.out.println("Username or Password is Invalid!");
        }
        cls();
    }
}
