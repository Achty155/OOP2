/**
 * The VotingStrategy interface defines methods for different voting strategies.
 */
public interface VotingStrategy {

    /**
     * Executes the voting strategy for a given state.
     * @param state The state for which the voting strategy is applied.
     */
    void vote(State state);
}
