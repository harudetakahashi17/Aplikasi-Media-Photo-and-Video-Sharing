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
        Akun.UA = new ArrayList<>();
//        for(int i=0; i < a.getUA().size(); i++){
//            System.out.println(a.getUA().get(i).getIRLName() +" "+ a.getUA().get(i).getEmail()
//            +" || "+ a.getUA().get(i).getBirthD() +"/"+ a.getUA().get(i).getBirthM()
//            +"/"+ a.getUA().get(i).getBirthY());
//        }
        Menu.Opening();
        cls();
    }
}
