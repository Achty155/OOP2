package Voter;

import Weapons.EducationLevel;

import java.util.Random;

public class Republican_Voter extends Voter {

    private int kohoVoli;
    public Republican_Voter() {
          calculateVotes();
    }

    public Republican_Voter(EducationLevel educationLevel){
        calculateVotes();

        if(educationLevel.getEdLevel() == 0 && this.kohoVoli == 0){
            this.kohoVoli = 1;
        }
        else if(educationLevel.getEdLevel() == 1 && this.kohoVoli == 1){
            this.kohoVoli = kohoVoli = 0;
        }
    }

    @Override
    protected void calculateVotes() {
        Random rand = new Random();
        // Increase the chance of voting for Republican (let's say 70% chance)
        // Assuming in your context: 0 - Democrat, 1 - Republican
        this.setKohoVoli(rand.nextInt(10) < 7 ? 1 : 0); // 70% chance to vote for Republican
    }
}