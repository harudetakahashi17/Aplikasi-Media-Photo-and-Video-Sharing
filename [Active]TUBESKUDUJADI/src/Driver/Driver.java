/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Driver;

import Controller.Controller;
import Model.Aplikasi;

/**
 *
 * @author Harude
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aplikasi app = new Aplikasi();
        
        new Controller(app);
    }
    
}
