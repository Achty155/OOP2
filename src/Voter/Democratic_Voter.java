package Voter;

import Weapons.EducationLevel;
import java.util.Random;

/**
 * Represents a voter that predominantly supports the Democratic party. This class
 * extends {@link Voter} and customizes the voting behavior to increase the likelihood
 * of voting for Democratic candidates.
 *
 * <p>The {@code calculateVotes} method is overridden to manipulate the voting odds
 * in favor of Democrats.</p>
 *
 */
public class Democratic_Voter extends Voter {

    /**
     * Constructs a new {@code Democratic_Voter} with default settings.
     * This constructor initializes the voter with a predefined likelihood of voting
     * for a Democrat, which is set in the {@code calculateVotes} method.
     */
    public Democratic_Voter() {
        super();
    }

    /**
     * Constructs a new {@code Democratic_Voter} influenced by an education level.
     *
     * @param educationLevel the education level influencing this voter's decision-making.
     */
    public Democratic_Voter(EducationLevel educationLevel) {
        super(educationLevel);
    }

    /**
     * Overrides the voting calculation to increase the probability of selecting
     * a Democratic candidate. Implements a 70% chance of voting for a Democrat,
     * enhancing the base random choice provided in the superclass.
     */
    @Override
    public void calculateVotes() {
        Random rand = new Random();
        // 70% chance to vote for Democrat
        this.setKohoVoli(rand.nextInt(10) < 7 ? 0 : 1);
    }

    /**
     * Optionally overrides the default method to adjust internal voting state based
     * on specific logic applicable to Democratic voters. This implementation calls
     * the superclass's method and can be further customized to address specific conditions
     * or state relevant to Democratic voters.
     */
    @Override
    public void adjustVoteBasedOnInternalState() {
        super.adjustVoteBasedOnInternalState(); // Use the default or add modifications
    }
}
