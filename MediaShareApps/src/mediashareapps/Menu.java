/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediashareapps;

import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author Harude
 */
public class Menu {
    
    public static void Menu1(){
        int m = 0;
        Scanner menu = new Scanner(System.in);
        while (m != 5){
            Driver.cls();
            System.out.println("Menu Utama:");
            System.out.println("1. Upload Foto/Video");
            System.out.println("2. Friend List");
            System.out.println("3. Tag Foto/Video");
            System.out.println("4. Add Friend");
            System.out.println("5. Log Out");
            System.out.print("Pilih Menu: ");
            m = menu.nextInt();
            switch (m){
                case 1:
                    System.out.println("Ada Menu Upload video atau foto");
                    break;
                case 2:
                    System.out.println("Tampilkan Friendlist si user");
                    break;
                case 3:
                    System.out.println("Tambah Tag foto / video");
                    break;
                case 4:
                    System.out.println("Menu tambah teman");
                    break;
            }
        }
    }
}
