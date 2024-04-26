package Intruder;

import Weapons.*;
import java.util.Random;

/**
 * The Strong_Intruder class represents a stronger type of intruder, extending the Intruder class.
 */
public class Strong_Intruder extends Intruder implements IntruderInterface {

    /**
     * Constructs a new Strong_Intruder object with default properties.
     */
    public Strong_Intruder(){
        super(); // Call the constructor of the superclass to initialize properties
    }

    /**
     * Constructs a new Strong_Intruder object with a specified lighter.
     * @param lighter The lighter object to be associated with the intruder.
     */
    public Strong_Intruder(Lighter lighter){
        super(lighter); // Call the constructor of the superclass with the specified lighter
    }

    /**
     * Overrides the method to calculate the number of destructed votes with a stronger range.
     */
    @Override
    public void calculationDestructedVotes(){
        Random rand = new Random();
        this.setKolkoHlasovZnici(rand.nextInt(31)); // Calculate destructed votes with a stronger range (0 to 30)
    }
}
