package Intruder;
import Weapons.*;
import java.util.Random;

public class Strong_Intruder extends Intruder{

    private int kolkoHlasovZnici;
    public Strong_Intruder(){
        calculationDestructedVotes();
    }

    public Strong_Intruder(Lighter ligher){
        super(ligher);
        calculationDestructedVotes();
        this.kolkoHlasovZnici = kolkoHlasovZnici * ligher.getPowerMultiplicator();
    }
    @Override
    protected void calculationDestructedVotes(){
        Random rand = new Random();
        this.setKolkoHlasovZnici(rand.nextInt(31));
    }
}