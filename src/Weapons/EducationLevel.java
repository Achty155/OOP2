package Weapons;

import java.util.Random;

public class EducationLevel {

    private int EdLevel;

    public EducationLevel(){
            calculateEdLevel();
    }

    protected void calculateEdLevel(){
        Random rand = new Random();
        this.EdLevel = rand.nextInt(2); // 0 or 1
    }

    public int getEdLevel() {
        return EdLevel;
    }
}
