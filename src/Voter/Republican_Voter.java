package Voter;

import Weapons.EducationLevel;
import java.util.Random;

public class Republican_Voter extends Voter {
    public Republican_Voter() {
        super();
    }

    public Republican_Voter(EducationLevel educationLevel) {
        super(educationLevel);
    }

    @Override
    public void calculateVotes() {
        Random rand = new Random();
        // Increase the chance of voting for Republican (70% chance)
        this.setKohoVoli(rand.nextInt(10) < 7 ? 1 : 0);
    }

    // Optionally override the default method
    @Override
    public void adjustVoteBasedOnInternalState() {
        // Custom logic for Republican_Voter could go here if needed
        super.adjustVoteBasedOnInternalState(); // Use the default or add modifications
    }
}
