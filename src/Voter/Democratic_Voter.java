package Voter;

import Weapons.EducationLevel;

import java.util.Random;

public class Democratic_Voter extends Voter {

    private int kohoVoli;
    public Democratic_Voter() {
            calculateVotes();
    }

    public Democratic_Voter(EducationLevel educationLevel){
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
        // Increase the chance of voting for Democrat (let's say 70% chance)
        // Assuming in your context: 0 - Democrat, 1 - Republican
        this.setKohoVoli(rand.nextInt(10) < 7 ? 0 : 1); // 70% chance to vote for Democrat
    }
}