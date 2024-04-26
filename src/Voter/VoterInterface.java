package Voter;

public interface VoterInterface {
    void calculateVotes();
    int getKohoVoli();
    void setKohoVoli(int kohoVoli);

    // Default method to adjust the voting logic based on some internal state
    default void adjustVoteBasedOnInternalState() {
        // Let's assume we flip the vote decision based on some internal state
        if (Math.random() > 0.5) { // Just a random condition for demonstration
            setKohoVoli(1 - getKohoVoli()); // Flips the voting decision
        }
    }
}