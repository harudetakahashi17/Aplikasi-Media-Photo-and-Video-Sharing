/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediashareapps;
import java.util.List;

/**
 *
 * @author Harude
 */
public abstract class Media {
    private List<Akun> tagged;
    
    public abstract void setPath(String path);
    public abstract String getPath();

    public Akun getTagged(int i) {
        return tagged.get(i);
    }

    public void addTag(Akun a) {
        tagged.add(a);
    }
    
}
