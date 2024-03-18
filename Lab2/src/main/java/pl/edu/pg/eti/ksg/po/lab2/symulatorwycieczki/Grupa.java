package pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author TB
 */
public class Grupa {
    private Set<Uczestnik> uczestnicy;//UTWORZENIE NOWEJ KOLEKCJI TYPU UCZESTNIK
    private Uczestnik przewodnik;

    //KONSTRUKTOR TWORZACY NOWA KOLEKCJĘ UCZESTNICY, WRAZ Z PRZEWODNIKIEM
    public Grupa(Uczestnik przewodnik, Collection<Uczestnik> uczestnicy) {
        this.uczestnicy = new HashSet<>(uczestnicy);
        this.przewodnik = przewodnik;
        
        this.uczestnicy.add(this.przewodnik);
    }
    
    //USTALENIE PREDKOSCI GRUPY, ZALEZNE OD NAJWOLNIEJSEGO UCZESTNIKA
    public double getPredkosc() {
        return uczestnicy.stream().map(Uczestnik::getBazowaPredkosc).min(Double::compare).orElse(0.0);
    }
    
    public int getUmiejetnosciNawigacyjne() {
        return przewodnik.getUmiejetnosciNawigacyjne();
    }

    public Set<Uczestnik> getUczestnicy() {
            return uczestnicy;
        }

    public Uczestnik getPrzewodnik() {
        return przewodnik;
    }
    
    
}
