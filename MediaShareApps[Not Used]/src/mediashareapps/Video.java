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
public class Video extends Media {
    private static long VID;
    private String path;
    private String caption;
    private int like;
    private String comment;
    private String location;

    public long getVID() {
        return VID;
    }

    public void setVID() {
        VID++;
    }

    public void setPath(String path) {
        this.path = path+".mp4";
    }

    @Override
    public String getPath() {
        return path;
    }

    public Video(String path, String caption, String location) {
        this.path = path;
        this.caption = caption;
        this.location = location;
        VID++;
    }

    public Video(String path, String caption) {
        this.path = path;
        this.caption = caption;
        VID++;
    }

    public Video(String path) {
        this.path = path;
        VID++;
    }

    
}
