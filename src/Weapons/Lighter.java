package Weapons;

import java.util.Random;

public class Lighter {

    private int powerMultiplicator;

    public Lighter() {
        power();
    }

    public void power(){
        Random rand = new Random();
        this.powerMultiplicator = rand.nextInt(5) + 1; // 1 to 5
    }


    public int getPowerMultiplicator() {
        return powerMultiplicator;
    }

    public void setPowerMultiplicator(int powerMultiplicator) {
        this.powerMultiplicator = powerMultiplicator;
    }
}
