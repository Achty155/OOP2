package Intruder;
import Weapons.*;

import java.util.Random;

public class Weak_Intruder extends Intruder{

    private int kolkoHlasovZnici;

    public Weak_Intruder(){
        calculationDestructedVotes();
    }

    public Weak_Intruder(Lighter ligher){
        super(ligher);
        calculationDestructedVotes();
        this.kolkoHlasovZnici = kolkoHlasovZnici * ligher.getPowerMultiplicator();
    }


    @Override
    protected void calculationDestructedVotes(){
        Random rand = new Random();
        this.setKolkoHlasovZnici(rand.nextInt(2));
    }
}
