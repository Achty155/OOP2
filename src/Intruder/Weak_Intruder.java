package Intruder;

import Weapons.*;
import java.util.Random;

public class Weak_Intruder extends Intruder implements IntruderInterface {

    public Weak_Intruder(){
        super();
    }

    public Weak_Intruder(Lighter lighter){
        super(lighter);
    }

    @Override
    public void calculationDestructedVotes(){
        Random rand = new Random();
        this.setKolkoHlasovZnici(rand.nextInt(2)); // Weaker range
    }
}
