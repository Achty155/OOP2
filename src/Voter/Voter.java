package Voter;

import Weapons.EducationLevel;

import java.util.Random;

public class Voter {
    private int kohoVoli;

    public Voter() {
        calculateVotes();
    }

    public Voter(EducationLevel educationLevel){
        calculateVotes();

        if(educationLevel.getEdLevel() == 0 && this.kohoVoli == 0){
            this.kohoVoli = 1;
        }
        else if(educationLevel.getEdLevel() == 1 && this.kohoVoli == 1){
            this.kohoVoli = kohoVoli = 0;
        }
    }

    protected void calculateVotes() {
        Random rand = new Random();
        kohoVoli = rand.nextInt(2);
    }

    public int getKohoVoli() {
        return kohoVoli;
    }

    public void setKohoVoli(int kohoVoli) {
        this.kohoVoli = kohoVoli;
    }
}
