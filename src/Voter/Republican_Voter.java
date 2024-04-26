package Voter;

import Weapons.EducationLevel;
import java.util.Random;

/**
 * The {@code Republican_Voter} class extends {@code Voter} to model the voting behavior
 * of a voter who predominantly supports the Republican party. This class overrides
 * the voting calculation to increase the likelihood of a Republican vote.
 *
 * <p>This class demonstrates customized voting logic that is skewed towards
 * Republican candidates, based on the inherent bias implemented in the
 * {@link #calculateVotes()} method.</p>
 *
 */
public class Republican_Voter extends Voter {

    /**
     * Constructs a new {@code Republican_Voter} with default settings.
     * This constructor initializes the voting behavior with a base likelihood setup.
     */
    public Republican_Voter() {
        super();
    }

    /**
     * Constructs a new {@code Republican_Voter} influenced by a specific education level.
     * The education level can modify the voting preference, as implemented in the
     * base {@code Voter} class.
     *
     * @param educationLevel the education level influencing this voter's behavior
     */
    public Republican_Voter(EducationLevel educationLevel) {
        super(educationLevel);
    }

    /**
     * Calculates the probability of this voter voting for a Republican candidate.
     * The method uses a random number generator to determine the vote, with a
     * configured 70% chance to favor Republican candidates.
     */
    @Override
    public void calculateVotes() {
        Random rand = new Random();
        this.setKohoVoli(rand.nextInt(10) < 7 ? 1 : 0);  // 70% chance for Republican
    }

    /**
     * Optionally overrides the default vote adjustment method to include any
     * Republican-specific internal state adjustments.
     * The method calls the superclass's implementation and can be further customized.
     */
    @Override
    public void adjustVoteBasedOnInternalState() {
        super.adjustVoteBasedOnInternalState();  // Apply default logic, then add modifications
    }
}
