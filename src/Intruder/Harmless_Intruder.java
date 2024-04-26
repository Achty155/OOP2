package Intruder;

import Weapons.*;

/**
 * The Harmless_Intruder class represents a harmless type of intruder, extending the Weak_Intruder class.
 */
public class Harmless_Intruder extends Weak_Intruder implements IntruderInterface {

    /**
     * Overrides the method to set the number of destructed votes to 0, indicating no harm.
     */
    @Override
    public void calculationDestructedVotes(){
        this.setKolkoHlasovZnici(0); // Set destructed votes to 0, indicating no harm
    }
}
