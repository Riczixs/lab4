package pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory.beskidy;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Atrakcja;
public class ChatkaStudencka extends Atrakcja{

    private final String nazwaKlubu;
    public ChatkaStudencka(String nazwaKlubu){
        super(0.5);
        this.nazwaKlubu=nazwaKlubu;
    }
    public String getNazwaKlubu(){
        return nazwaKlubu;
    }

    @Override
    public String getNazwa(){
        return"ChatkaStudencka pod patronatem klubu: "+nazwaKlubu;
    }

}
