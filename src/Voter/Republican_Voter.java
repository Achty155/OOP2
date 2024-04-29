package Voter;

import java.util.Random;

public class Republican_Voter extends Voter {

    public Republican_Voter() {
        Random rand = new Random();
        // Increase the chance of voting for Republican (let's say 70% chance)
        // Assuming in your context: 0 - Democrat, 1 - Republican
        this.setKohoVoli(rand.nextInt(10) < 7 ? 1 : 0); // 70% chance to vote for Republican
    }
}