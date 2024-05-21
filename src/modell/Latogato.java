
package modell;

public class Latogato extends Ember{
    private String terulet;

    public Latogato(String terulet, String nev, Oltozet oltozet) {
        super(nev, oltozet);
        this.terulet = terulet;
    }

    public String getTerulet() {
        return terulet;
    }
    
}
