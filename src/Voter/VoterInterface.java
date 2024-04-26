package Voter;

/**
 * Defines the behavior of a Voter in an electoral system. This interface
 * requires implementing methods to handle vote calculations and to get and set
 * the voter's choice. Additionally, it provides a default method for adjusting
 * the voting logic based on some internal state.
 *
 */
public interface VoterInterface {

    /**
     * Calculates the voting decision for a voter. Implementing classes must
     * define the specific logic to determine the voter's choice.
     */
    void calculateVotes();

    /**
     * Retrieves the current choice of the voter.
     *
     * @return the current voting choice as an integer.
     */
    int getKohoVoli();

    /**
     * Sets the voter's choice.
     *
     * @param kohoVoli the voting choice to set, represented as an integer.
     */
    void setKohoVoli(int kohoVoli);

    /**
     * Default method to adjust the voting logic based on some internal state.
     * This method flips the current vote decision based on a random condition
     * for demonstration purposes.
     */
    default void adjustVoteBasedOnInternalState() {
        // Flips the vote if a random condition (greater than 0.5) is met
        if (Math.random() > 0.5) {
            setKohoVoli(1 - getKohoVoli());
        }
    }
}
