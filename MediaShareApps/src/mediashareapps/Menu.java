/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediashareapps;

import java.util.Scanner;
import static mediashareapps.Driver.cls;

/**
 *
 * @author Harude
 */
public class Menu {
    public static void Opening() {
        int m = 0;
        Scanner menu = new Scanner(System.in);
        while (m != 3){
            //Driver.cls();
            System.out.println("Menu Opening:");
            System.out.println("1. Login");
            System.out.println("2. Sign Up");
            System.out.println("3. Exit");
            System.out.print("Pilih Menu: ");
            m = menu.nextInt();
            switch (m){
                case 1:
                    Login();
                    break;
                case 2:
                    Menu2();
                    break;
            }
        }
    }
    
    public static void Login() {
        Scanner s = new Scanner(System.in);
        String user,passwd;
        
        System.out.println("Login Form");
        System.out.println("Username : ");
        user = s.next();
        System.out.println("Password : ");
        passwd = s.next();
        
        int i = 0;
        if (Akun.UA.isEmpty()){
            System.out.println("NO ACCOUNT YET");
        } else {
            while (!user.equals(Akun.UA.get(i).getUname()) && !passwd.equals(Akun.UA.get(i).getPasswd()) && (i < Akun.UA.size()-1)){
                i++;
            }
            if((user.equals(Akun.UA.get(i).getUname())) && (passwd.equals(Akun.UA.get(i).getPasswd())) && Akun.UA.size() != i ){
                cls();
                Menu.Menu1();
            } else {
                System.out.println("Username or Password is Invalid!");
            }
        }
    }
    
    public static void Menu2() {
        String user,passwd, IRL, email, phone;
        String gender;
        int dd,mm,yy;
        Scanner menu = new Scanner(System.in);
        
            Driver.cls();
            System.out.println("Menu Sign Up:");
            System.out.print("Username : ");
            user = menu.nextLine();
            System.out.print("Password : ");
            passwd = menu.nextLine();
            System.out.print("Real Name : ");
            IRL = menu.nextLine();
            System.out.print("Email : ");
            email = menu.nextLine();
            System.out.print("Phone : ");
            phone = menu.nextLine();
            System.out.print("Gender (Male/Female): ");
            gender = menu.nextLine();
            System.out.print("Birth Day (DD): ");
            dd = menu.nextInt();
            System.out.print("Birth Month (MM): ");
            mm = menu.nextInt();
            System.out.print("Birth Year (YYYY): ");
            yy = menu.nextInt();
            Akun a = new Akun(user,passwd,IRL,email,phone,gender,dd,mm,yy);
            Akun.UA.add(a);
            
        
    }
    
    public static void Menu1(){
        int m = 0;
        Scanner menu = new Scanner(System.in);
        while (m != 4){
            Driver.cls();
            System.out.println("Menu Utama:");
            System.out.println("1. Upload Foto/Video");
            System.out.println("2. Friend List");
            System.out.println("3. Tag Foto/Video");
            System.out.println("4. Log Out");
            System.out.print("Pilih Menu: ");
            m = menu.nextInt();
            switch (m){
                case 1:
                    Sub1Menu1();
                    break;
                case 2:
                    Sub2Menu1();
                    break;
                case 3:
                    Sub3Menu1();
                    break;
            }
        }
    }
    
    public static void Sub1Menu1(){
        int m = 0;
        Scanner menu = new Scanner(System.in);
        while (m != 3){
            System.out.println("");
            System.out.println("Menu Upload:");
            System.out.println("1. Foto");
            System.out.println("2. Video");
            System.out.println("3. Back");
            System.out.print("Pilih Menu: ");
            m = menu.nextInt();
            switch (m){
                case 1:
                    System.out.println("Upload Foto!!");
                    break;
                case 2:
                    System.out.println("Upload Video!!");
                    break;
            }
        }
    }
    
    public static void Sub2Menu1(){
        int m = 0;
        Scanner menu = new Scanner(System.in);
        while (m != 4){
            System.out.println("");
            System.out.println("Menu Friend:");
            System.out.println("1. Add Friend");
            System.out.println("2. Delete Friend");
            System.out.println("3. Back");
            System.out.print("Pilih Menu: ");
            m = menu.nextInt();
            switch (m){
                case 1:
                    System.out.println("Search Name :");
                    break;
                case 2:
                    System.out.println("Delete Friend from list :");
                    break;
            }
        }
    }
    
    public static void Sub3Menu1(){
        int m = 0;
        Scanner menu = new Scanner(System.in);
        while (m != 3){
            System.out.println("");
            System.out.println("Menu Tag:");
            System.out.println("1. Foto");
            System.out.println("2. Video");
            System.out.println("3. Back");
            System.out.print("Pilih Menu: ");
            m = menu.nextInt();
            switch (m){
                case 1:
                    System.out.println("Foto Tagged!");
                    break;
                case 2:
                    System.out.println("Video Tagged!");
                    break;
            }
        }
    }
}
