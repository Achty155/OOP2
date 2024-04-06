package Voter;

import java.util.Random;

public class Voter {
    private int kohoVoli;

    public Voter() {
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
