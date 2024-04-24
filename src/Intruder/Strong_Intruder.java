package Intruder;

import Weapons.*;
import java.util.Random;

public class Strong_Intruder extends Intruder implements IntruderInterface {

    public Strong_Intruder(){
        super();
    }

    public Strong_Intruder(Lighter lighter){
        super(lighter);
    }

    @Override
    public void calculationDestructedVotes(){
        Random rand = new Random();
        this.setKolkoHlasovZnici(rand.nextInt(31)); // Stronger range
    }
}
