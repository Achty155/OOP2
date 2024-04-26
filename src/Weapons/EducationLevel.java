package Weapons;

import java.util.Random;

/**
 * The EducationLevel class represents an object indicating the education level, which is randomly generated.
 */
public class EducationLevel {

    private int EdLevel;

    /**
     * Constructs a new EducationLevel object and calculates its education level.
     */
    public EducationLevel(){
        calculateEdLevel();
    }

    /**
     * Calculates the education level randomly.
     */
    protected void calculateEdLevel(){
        Random rand = new Random();
        this.EdLevel = rand.nextInt(2); // 0 or 1
    }

    /**
     * Retrieves the education level.
     * @return The education level.
     */
    public int getEdLevel() {
        return EdLevel;
    }
}
