package Voter;

import Weapons.EducationLevel;
import java.util.Random;

/**
 * Represents a generic voter in an electoral system.
 *
 * <p>The class implements the {@link VoterInterface} which mandates methods to
 * handle the voting calculations and accessors for the voting results.</p>
 *
 */
public class Voter implements VoterInterface {
    private int kohoVoli;  // Stores the voter's choice (0 for one party, 1 for the other)

    /**
     * Constructs a new {@code Voter} with default voting behavior.
     * This constructor initializes the voting behavior to a random choice
     * between two options.
     */
    public Voter() {
        calculateVotes();
    }

    /**
     * Constructs a new {@code Voter} influenced by an education level.
     * This constructor initializes the voting behavior and adjusts it based on
     * the provided education level.
     *
     * @param educationLevel The education level which may influence the voter's decision.
     */
    public Voter(EducationLevel educationLevel) {
        calculateVotes();
        adjustVotingByEducation(educationLevel);
    }

    /**
     * Adjusts the voting choice of this voter based on the provided education level.
     * This method modifies the internal state of {@code kohoVoli} to potentially reverse
     * the initial random choice, simulating the influence of education on voting behavior.
     *
     * @param educationLevel The education level used to potentially adjust the voting behavior.
     */
    public void adjustVotingByEducation(EducationLevel educationLevel) {
        if (educationLevel.getEdLevel() == 0 && this.kohoVoli == 0) {
            this.kohoVoli = 1;
        } else if (educationLevel.getEdLevel() == 1 && this.kohoVoli == 1) {
            this.kohoVoli = 0;
        }
    }

    /**
     * Calculates the initial voting decision for this voter.
     * The method randomly selects between two possible choices (0 or 1).
     */
    @Override
    public void calculateVotes() {
        Random rand = new Random();
        kohoVoli = rand.nextInt(2);  // Randomly set to 0 or 1
    }

    /**
     * Retrieves the current voting choice of this voter.
     *
     * @return the current voting choice (0 or 1).
     */
    @Override
    public int getKohoVoli() {
        return kohoVoli;
    }

    /**
     * Sets the voting choice of this voter.
     *
     * @param kohoVoli the voting choice to set (0 or 1).
     */
    @Override
    public void setKohoVoli(int kohoVoli) {
        this.kohoVoli = kohoVoli;
    }
}
