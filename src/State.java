/**
 * The State class represents a state in the election process.
 */
public class State {

    private String Name; // Name of the state
    private int NumOfVoters; // Number of voters in the state
    private int NumOfElVOters; // Number of electoral voters in the state
    private int democraticVotes = 0; // Number of votes for the Democratic party (initially 0)
    private int republicanVotes = 0; // Number of votes for the Republican party (initially 0)
    private String winnerInState; // Name of the winning party in the state
    private VotingStrategy votingStrategy; // Strategy for voting
    private volby volby; // Instance of the volby class

    /**
     * Constructs a new State object with the specified parameters.
     * @param name The name of the state.
     * @param numOfVoters The number of voters in the state.
     * @param numOfElVOters The number of electoral voters in the state.
     * @param volby An instance of the volby class.
     */
    public State(String name, int numOfVoters, int numOfElVOters, volby volby) {
        this.Name = name;
        this.NumOfVoters = numOfVoters;
        this.NumOfElVOters = numOfElVOters;
        this.votingStrategy = new EqualStrategy(); // Default strategy
        this.volby = volby;
    }

    /**
     * Retrieves the name of the state.
     * @return The name of the state.
     */
    public String getName() {
        return Name;
    }

    /**
     * Retrieves the number of voters in the state.
     * @return The number of voters in the state.
     */
    public int getNumOfVoters() {
        return NumOfVoters;
    }

    /**
     * Retrieves the number of electoral voters in the state.
     * @return The number of electoral voters in the state.
     */
    public int getNumOfElVOters() {
        return NumOfElVOters;
    }

    /**
     * Retrieves the name of the winning party in the state.
     * @return The name of the winning party in the state.
     */
    public String getWinnerInState() {
        return winnerInState;
    }

    /**
     * Sets the name of the state.
     * @param name The name of the state.
     */
    public void setName(String name) {
        Name = name;
    }

    /**
     * Sets the number of voters in the state.
     * @param numOfVoters The number of voters in the state.
     */
    public void setNumOfVoters(int numOfVoters) {
        NumOfVoters = numOfVoters;
    }

    /**
     * Sets the number of electoral voters in the state.
     * @param numOfElVOters The number of electoral voters in the state.
     */
    public void setNumOfElVOters(int numOfElVOters) {
        NumOfElVOters = numOfElVOters;
    }

    /**
     * Performs the voting process in the state.
     */
    public void vote() {
        // Check if voting strategy is set
        if(votingStrategy == null) {
            System.out.println("Voting strategy is not set.");
            return;
        } else {
            // Execute voting process until a winner is determined
            while(true){
                votingStrategy.vote(this);
                if(democraticVotes == republicanVotes){
                    democraticVotes = 0;
                    republicanVotes = 0;
                } else {
                    break;
                }
            }
        }

        System.out.println("Demo: " + democraticVotes);
        System.out.println("Rep: " + republicanVotes);

        // Determine the winner based on the number of votes
        if (democraticVotes > republicanVotes) {
            winnerInState = volby.candidates[0].getName();
            volby.candidates[0].setVotes(volby.candidates[0].getVotes() + NumOfElVOters);
            System.out.println("Democratic party won " + Name);
        } else {
            winnerInState = volby.candidates[1].getName();
            volby.candidates[1].setVotes(volby.candidates[1].getVotes() + NumOfElVOters);
            System.out.println("Republican party won " + Name);
        }
    }

    /**
     * Sets the voting strategy for the state.
     * @param votingStrategy The voting strategy to set.
     */
    public void setVotingStrategy(VotingStrategy votingStrategy) {
        this.votingStrategy = votingStrategy;
    }

    /**
     * Retrieves number of Democratic voters in the state.
     * @return  The number of voters in the state.
     */
    public int getDemocraticVotes() {
        return democraticVotes;
    }

    /**
     * Sets the number of Democratic votes for the state.
     * @param democraticVotes The voting strategy to set.
     */
    public void setDemocraticVotes(int democraticVotes) {
        this.democraticVotes = democraticVotes;
    }

    /**
     * Retrieves number of Republican voters in the state.
     * @return  The number of voters in the state.
     */
    public int getRepublicanVotes() {
        return republicanVotes;
    }

    /**
     * Sets the number of Republican votes for the state.
     * @param republicanVotes The voting strategy to set.
     */
    public void setRepublicanVotes(int republicanVotes) {
        this.republicanVotes = republicanVotes;
    }
}
