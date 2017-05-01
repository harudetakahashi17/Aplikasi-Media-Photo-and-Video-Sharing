/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Harude
 */
public class Foto extends Media{
    private static int FID;
    private String path;
    private String caption;
    private int like;
    private String comment;
    private String loc;

    @Override
    public void setPath(String path) {
        path = FID + ".jpg";
        this.path = path;
    }
    
    public Foto(String path) {
        FID++;
        setPath(path);
    }

    public Foto(String path, String caption, String loc) {
        FID++;
        setPath(path);
        this.caption = caption;
        this.loc = loc;
    }

    public Foto(String path, String caption) {
        FID++;
        setPath(path);
        this.caption = caption;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    @Override
    public String getPath() {
        
        return null;
    }
    
    
}
