package modell;

import java.util.UUID;

public class Dolgozo extends Ember implements Comparable<Dolgozo>{

    private UUID id;
    private int evek;

    public Dolgozo(String nev, Oltozet oltozet) {
        this((int)(Math.random()*10) ,nev, oltozet);
    }

    public Dolgozo(int evek, String nev, Oltozet oltozet) {
        super(nev, oltozet);
        this.evek = evek;
    }

    @Override
    public int compareTo(Dolgozo dolgozo) {
       String nev = super.getNev();
        return 0;
    }

    public UUID getId() {
        return id;
    }

    public int getEvek() {
        return evek;
    }
}
