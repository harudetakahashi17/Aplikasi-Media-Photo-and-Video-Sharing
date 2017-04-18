/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Harude
 */
public abstract class Media {
    private static int MID;
    private ArrayList<Akun> tagged;
    private String path;
    
    public void tagPerson(Akun p){
        tagged.add(p);
    }
    
    public ArrayList<Akun> getTagged(){
        return tagged;
    }
    
    public abstract void setPath(String path);
    
}
