package Intruder;
import Weapons.*;
public class Harmless_Intruder extends Weak_Intruder{

    @Override
    protected void calculationDestructedVotes(){
        this.setKolkoHlasovZnici(0);
    }
}
