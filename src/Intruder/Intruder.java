package Intruder;

import java.util.Random;
import Weapons.*;
public class Intruder {
    private int kolkoHlasovZnici;

    private Lighter lighter;

    public Intruder(){
        calculationDestructedVotes();
    }

    public Intruder(Lighter ligher){

        calculationDestructedVotes();
        this.kolkoHlasovZnici = kolkoHlasovZnici * ligher.getPowerMultiplicator();
        this.lighter = lighter;
    }

    protected void calculationDestructedVotes(){
        Random rand = new Random();
        this.kolkoHlasovZnici = rand.nextInt(16); // 0 to 15

    }




    public int getKolkoHlasovZnici() {
        return kolkoHlasovZnici;
    }

    public void setKolkoHlasovZnici(int kolkoHlasovZnici) {
        this.kolkoHlasovZnici = kolkoHlasovZnici;
    }
}
