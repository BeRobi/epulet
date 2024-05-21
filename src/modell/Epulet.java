
package modell;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Epulet implements Serializable{
    
    private ArrayList<Ember> emberek;

    public Epulet() {
        emberek = new ArrayList<>();
        emberek.add(new Latogato("fehér", "L-1", Ember.Oltozet.SPORTOS));
        emberek.add(new Latogato("kék", "L-2", Ember.Oltozet.SPORTOS));
        emberek.add(new Dolgozo("D-1", Ember.Oltozet.ELEGANS));
        emberek.add(new Dolgozo("D-2", Ember.Oltozet.ELEGANS));
    }
    
    public List<Ember> getEmberek() {
    return Collections.unmodifiableList(emberek);
    }
    
}
