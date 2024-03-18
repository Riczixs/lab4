package pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.ludzie;

public class PrzewodnikBieszczadzki extends PrzewodnikStudencki{

    public PrzewodnikBieszczadzki(String imie, String nazwisko, Plec plec){
        super(imie, nazwisko, plec, 16);
    }
    @Override
    public int getUmiejetnosciNawigacyjne(){
        return 5;
    }

}