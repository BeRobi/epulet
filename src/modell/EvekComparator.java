
package modell;

import java.util.Comparator;


public class EvekComparator implements Comparator<Dolgozo>{

    @Override
    public int compare(Dolgozo o1, Dolgozo o2) {
        return o1.getEvek() - o2.getEvek();
    }
    
}
