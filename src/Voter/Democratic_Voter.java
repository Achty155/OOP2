package Voter;

import Weapons.EducationLevel;
import java.util.Random;

public class Democratic_Voter extends Voter {
    public Democratic_Voter() {
        super();
    }

    public Democratic_Voter(EducationLevel educationLevel) {
        super(educationLevel);
    }

    @Override
    public void calculateVotes() {
        Random rand = new Random();
        // Increase the chance of voting for Democrat (70% chance)
        this.setKohoVoli(rand.nextInt(10) < 7 ? 0 : 1);
    }
}
