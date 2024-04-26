package Intruder;

import Weapons.*;
import java.util.Random;

/**
 * The Weak_Intruder class represents a weaker type of intruder, extending the Intruder class.
 */
public class Weak_Intruder extends Intruder implements IntruderInterface {

    /**
     * Constructs a new Weak_Intruder object with default properties.
     */
    public Weak_Intruder(){
        super(); // Call the constructor of the superclass to initialize properties
    }

    /**
     * Constructs a new Weak_Intruder object with a specified lighter.
     * @param lighter The lighter object to be associated with the intruder.
     */
    public Weak_Intruder(Lighter lighter){
        super(lighter); // Call the constructor of the superclass with the specified lighter
    }

    /**
     * Overrides the method to calculate the number of destructed votes with a weaker range.
     */
    @Override
    public void calculationDestructedVotes(){
        Random rand = new Random();
        this.setKolkoHlasovZnici(rand.nextInt(2)); // Calculate destructed votes with a weaker range (0 or 1)
    }
}
