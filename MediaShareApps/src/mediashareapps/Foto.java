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
public class Foto extends Media {
    private static long FID;
    private String path;
    private String caption;
    private int like;
    private String comment;
    private String location;

    public long getFID() {
        return FID;
    }

    public void setFID() {
        FID++;
    }

    public void setPath(String path) {
        this.path = path+".jpg";
    }

    @Override
    public String getPath() {
        return path;
    }

    public Foto(String path) {
        this.path = path;
        FID++;
    }

    public Foto(String path, String caption, String location) {
        this.path = path;
        this.caption = caption;
        this.location = location;
        FID++;
    }

    public Foto(String path, String caption) {
        this.path = path;
        this.caption = caption;
        FID++;
    }

    
}
