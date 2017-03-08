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
    private long FID;
    private String path;
    private String caption;
    private int like;
    private String comment;

    public long getFID() {
        return FID;
    }

    public void setFID(long FID) {
        this.FID = FID;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
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
    
    
}
