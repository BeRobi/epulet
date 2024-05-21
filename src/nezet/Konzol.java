package nezet;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import modell.Dolgozo;
import modell.Ember;
import modell.Epulet;
import modell.EvekComparator;
import modell.Latogato;

public class Konzol {

    private Epulet epulet;
    private ArrayList<Dolgozo> dolgozok;
    private ArrayList<Latogato> latogatok;

    public Konzol() {
        epulet = new Epulet();
        dolgozok = new ArrayList<>();
        for (Ember ember : epulet.getEmberek()) {
            if (ember instanceof Dolgozo) {

            }
        }
    }

    public void feladatok() {
        epuletbenLevoEmberek();
        epuletbenLevoEmberekFajlban();
    }

    private void epuletbenLevoEmberek() {
        for (Ember ember : epulet.getEmberek()) {
            System.out.println("ember = " + ember);

        }

        /* rendezések */
        Collections.sort(dolgozok);
        kiir(dolgozok);
        //külsõ:
        Collections.sort(dolgozok, new EvekComparator());
        dolgozok.sort(new EvekComparator());

    }

    private void kiir(ArrayList<Dolgozo> dolgozok) {
    }

    private void epuletbenLevoEmberekFajlban() {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("n.bin"));) {
            oos.writeObject(epulet);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Konzol.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Konzol.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
