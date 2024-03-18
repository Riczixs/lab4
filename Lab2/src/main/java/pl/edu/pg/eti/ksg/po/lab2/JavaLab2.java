package pl.edu.pg.eti.ksg.po.lab2;

import java.util.HashSet;
import java.util.Set;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Grupa;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.SymulatorWycieczki;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Uczestnik;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Wycieczka;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory.BlotnistaDroga;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory.Droga;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory.Las;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory.ZalanyLas;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory.beskidy.*;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.ludzie.*;


/**
 *
 * @author TB
 */
public class JavaLab2 {
    public static void main(String[] args) {
        Wycieczka w = zad2();
        
        PrzewodnikStudencki przewodnik = new PrzewodnikStudencki("Stefan", "Długonogi", Czlowiek.Plec.MEZCZYZNA);
        Set<Uczestnik> uczestnicy = new HashSet<>();
        uczestnicy.add(new Student("Alojzy", "Mechanik", Czlowiek.Plec.MEZCZYZNA));
        uczestnicy.add(new BeskidzkiPiechur("Ada", "Lovelace", Czlowiek.Plec.KOBIETA));
        uczestnicy.add(new MistrzPanoram("Mikolaj", "Zalewski", Czlowiek.Plec.MEZCZYZNA));
        uczestnicy.add(new Hydrolog("Mikolaj", "Zalewski", Czlowiek.Plec.MEZCZYZNA));
        uczestnicy.add(new CzlowiekZKontuzja("Mikolaj", "Zalewski", Czlowiek.Plec.MEZCZYZNA));
        uczestnicy.add(new LesnyBiegacz("Matty", "Cash", Czlowiek.Plec.MEZCZYZNA));
        uczestnicy.add(new Student("Jan", "Elektronik", Czlowiek.Plec.MEZCZYZNA));
        uczestnicy.add(new StudentKSG("Piotr","Teledetekcyjny", Czlowiek.Plec.MEZCZYZNA));
        
        Grupa g = new Grupa(przewodnik, uczestnicy);
        
        SymulatorWycieczki symulator = new SymulatorWycieczki(g, w);
        
        symulator.symuluj();
    }
    public static Wycieczka doDydiowki() {
        Wycieczka ret = new Wycieczka("Do Dydiówki");
        ret.dodajElementWycieczki(new Droga(1.0));
        ret.dodajElementWycieczki(new DrewnianaCerkiew("Smolnik"));
        ret.dodajElementWycieczki(new Droga(4.0));
        //ret.dodajElementWycieczki(new PrzeprawaPrzezRzeke(1.0));
        //ret.dodajElementWycieczki(new GestyLas(2.0));
        ret.dodajElementWycieczki(new Las(2.0));
        ret.dodajElementWycieczki(new Droga(5.0));
        
        return ret;
    }
    public static Wycieczka zad2(){
        Wycieczka wyc = new Wycieczka("zad 2");
        wyc.dodajElementWycieczki(new Droga(4.0));
        wyc.dodajElementWycieczki(new ZalanyLas(3.0));
        wyc.dodajElementWycieczki(new ChatkaStudencka("KlubR"));
        wyc.dodajElementWycieczki(new BlotnistaDroga(2.0));
        wyc.dodajElementWycieczki(new Las(4.0));
        wyc.dodajElementWycieczki(new CmentarzZIWojny("Żurawin"));
        wyc.dodajElementWycieczki(new WychodnieSkalne());
        wyc.dodajElementWycieczki(new Droga(4.0));
        wyc.dodajElementWycieczki(new ObserwatoriumMeteorologiczne());
        return wyc;
    }
   
}
