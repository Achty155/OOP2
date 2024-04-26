package Intruder;

import Weapons.*;
import java.util.Random;

/**
 * The Intruder class represents an intruder and implements the IntruderInterface.
 */
public class Intruder implements IntruderInterface {

    private int kolkoHlasovZnici; // Number of destructed votes
    private Lighter lighter; // Lighter object associated with the intruder

    /**
     * Constructs a new Intruder object and initializes the number of destructed votes.
     */
    public Intruder(){
        calculationDestructedVotes();
    }

    /**
     * Constructs a new Intruder object with a specified lighter and adjusts the number of destructed votes accordingly.
     * @param lighter The lighter object to be associated with the intruder.
     */
    public Intruder(Lighter lighter){
        this.lighter = lighter; // Associate the lighter object with the intruder
        calculationDestructedVotes(); // Calculate the number of destructed votes
        this.kolkoHlasovZnici = this.kolkoHlasovZnici * lighter.getPowerMultiplicator(); // Adjust destructed votes based on lighter power
    }

    /**
     * Calculates the number of destructed votes randomly.
     */
    @Override
    public void calculationDestructedVotes(){
        Random rand = new Random();
        this.kolkoHlasovZnici = rand.nextInt(16); // Randomly generate a number of destructed votes between 0 and 15
    }

    /**
     * Retrieves the number of destructed votes.
     * @return The number of destructed votes.
     */
    @Override
    public int getKolkoHlasovZnici() {
        return kolkoHlasovZnici;
    }

    /**
     * Sets the number of destructed votes.
     * @param kolkoHlasovZnici The number of destructed votes to set.
     */
    @Override
    public void setKolkoHlasovZnici(int kolkoHlasovZnici) {
        this.kolkoHlasovZnici = kolkoHlasovZnici;
    }
}
