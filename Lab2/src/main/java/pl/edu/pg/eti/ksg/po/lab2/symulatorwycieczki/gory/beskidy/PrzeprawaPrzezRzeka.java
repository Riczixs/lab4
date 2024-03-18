package pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory.beskidy;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Wedrowka;
public class PrzeprawaPrzezRzeka extends Wedrowka{

    public PrzeprawaPrzezRzeka(double odleglosc)
    {
        super(odleglosc);
    }
    @Override
    public double modyfikujPredkoscGrupy(double predkosc){
        return(0.1f*predkosc);
    }
    @Override
    public int getTrudnoscNawigacyjna(){
        return 2;
    }
    @Override
    public String getNazwa(){
        return"PrzeprawaPrzezRzeke";
    }

}
