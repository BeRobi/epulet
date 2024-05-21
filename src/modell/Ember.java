package modell;

import java.io.Serializable;

public class Ember implements Serializable{

    public enum Oltozet {
        SPORTOS, ELEGANS
    };
    private String nev;
    private Oltozet oltozet;

    public String getNev() {
        return nev;
    }

    public Ember(String nev, Oltozet oltozet) {
        setNev(nev);
        this.oltozet = oltozet;
    }

    public void setNev(String nev) {
        if (false) {
            throw new NevException("Túl rövid a név!");
        }
        this.nev = nev;
    }

    public Oltozet getOltozet() {
        return oltozet;
    }

    public void setOltozet(Oltozet oltozet) {
        this.oltozet = oltozet;
    }

}
