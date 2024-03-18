package pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.ludzie;

public class Hydrolog extends Czlowiek{

    public Hydrolog(String imie, String nazwisko, Plec plec)
    {
        super(imie,nazwisko,plec,5.0,18,18);
    }
    @Override
    public int getUmiejetnosciNawigacyjne(){
        return 5;
    }
}
