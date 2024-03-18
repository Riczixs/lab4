package pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Wedrowka;

public class ZalanyLas extends Wedrowka {
    public ZalanyLas(double odleglosc){
        super(odleglosc);
    }
    @Override
    public double modyfikujPredkoscGrupy(double predkosc){
        return(0.25*predkosc);
    }
    @Override
    public int getTrudnoscNawigacyjna(){
        return 4;
    }
    @Override
    public String getNazwa(){
        return"ZalanyLas";
    }
}
