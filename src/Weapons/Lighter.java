package Weapons;

import java.util.Random;

/**
 * The Lighter class represents a lighter object that can generate a random power multiplicator.
 */
public class Lighter {

    private int powerMultiplicator;

    /**
     * Constructs a new Lighter object and initializes its power.
     */
    public Lighter() {
        power();
    }

    /**
     * Generates a random power multiplicator for the lighter object.
     */
    public void power(){
        Random rand = new Random();
        this.powerMultiplicator = rand.nextInt(5) + 1; // 1 to 5
    }

    /**
     * Retrieves the power multiplicator of the lighter.
     * @return The power multiplicator.
     */
    public int getPowerMultiplicator() {
        return powerMultiplicator;
    }

    /**
     * Sets the power multiplicator of the lighter.
     * @param powerMultiplicator The power multiplicator to set.
     */
    public void setPowerMultiplicator(int powerMultiplicator) {
        this.powerMultiplicator = powerMultiplicator;
    }
}
