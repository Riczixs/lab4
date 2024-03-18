package pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory.beskidy;

import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Atrakcja;

public class ObserwatoriumMeteorologiczne extends Atrakcja {

    public ObserwatoriumMeteorologiczne(){
        super(1.0);
    }
    @Override
    public String getNazwa(){
        return"ObserwatoriumMeteorologiczne";
    }
}
