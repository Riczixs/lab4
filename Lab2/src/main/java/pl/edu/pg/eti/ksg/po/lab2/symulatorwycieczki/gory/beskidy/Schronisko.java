package pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory.beskidy;

import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Atrakcja;

public class Schronisko extends Atrakcja {

    public Schronisko(){
        super(3.0/4);
    }
    @Override
    public String getNazwa() {
        return "Schronisko: ";
    }

}
