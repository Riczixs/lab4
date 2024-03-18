package pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory.beskidy;

import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Atrakcja;

public class WychodnieSkalne extends Atrakcja {

    public WychodnieSkalne(){
        super(1.0/6);
    }
    @Override
    public String getNazwa(){
        return"WychodnieSkalne";
    }
}
