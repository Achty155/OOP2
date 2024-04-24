package Voter;

import Weapons.EducationLevel;
import java.util.Random;

public class Voter implements VoterInterface {
    private int kohoVoli;

    public Voter() {
        calculateVotes();
    }

    public Voter(EducationLevel educationLevel){
        calculateVotes();
        adjustVotingByEducation(educationLevel);
    }

    public void adjustVotingByEducation(EducationLevel educationLevel) {
        if (educationLevel.getEdLevel() == 0 && this.kohoVoli == 0) {
            this.kohoVoli = 1;
        } else if (educationLevel.getEdLevel() == 1 && this.kohoVoli == 1) {
            this.kohoVoli = 0;
        }
    }

    @Override
    public void calculateVotes() {
        Random rand = new Random();
        kohoVoli = rand.nextInt(2);
    }

    @Override
    public int getKohoVoli() {
        return kohoVoli;
    }

    @Override
    public void setKohoVoli(int kohoVoli) {
        this.kohoVoli = kohoVoli;
    }
}
