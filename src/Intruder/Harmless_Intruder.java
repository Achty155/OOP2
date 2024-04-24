package Intruder;

import Weapons.*;

public class Harmless_Intruder extends Weak_Intruder implements IntruderInterface {

    @Override
    public void calculationDestructedVotes(){
        this.setKolkoHlasovZnici(0);
    }
}
