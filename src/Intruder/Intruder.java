package Intruder;

import Weapons.*;
import java.util.Random;

public class Intruder implements IntruderInterface {
    private int kolkoHlasovZnici;
    private Lighter lighter;

    public Intruder(){
        calculationDestructedVotes();
    }

    public Intruder(Lighter lighter){
        this.lighter = lighter;
        calculationDestructedVotes();
        this.kolkoHlasovZnici = this.kolkoHlasovZnici * lighter.getPowerMultiplicator();
    }

    @Override
    public void calculationDestructedVotes(){
        Random rand = new Random();
        this.kolkoHlasovZnici = rand.nextInt(16); // 0 to 15
    }

    @Override
    public int getKolkoHlasovZnici() {
        return kolkoHlasovZnici;
    }

    @Override
    public void setKolkoHlasovZnici(int kolkoHlasovZnici) {
        this.kolkoHlasovZnici = kolkoHlasovZnici;
    }
}
