package Voter;

import java.util.Random;

public class Democratic_Voter extends Voter {

    public Democratic_Voter() {
        Random rand = new Random();
        // Increase the chance of voting for Democratic (let's say 70% chance)
        // Assuming in your context: 0 - Democrat, 1 - Republican
        this.setKohoVoli(rand.nextInt(10) < 7 ? 0 : 1); // 70% chance to vote for Republica
    }
}