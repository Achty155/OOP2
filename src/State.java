public class State {

    private String Name;
    private int NumOfVoters;
    private int NumOfElVOters;
    private int democraticVotes = 0; //test
    private int republicanVotes = 0;
    private String winnerInState;
    private VotingStrategy votingStrategy;
    private volby volby;

    public State(String name, int numOfVoters, int numOfElVOters, volby volby) {
        this.Name = name;
        this.NumOfVoters = numOfVoters;
        this.NumOfElVOters = numOfElVOters;
        this.votingStrategy = new EqualStrategy(); // Default strategy
        this.volby = volby;
    }

    public String getName() {
        return Name;
    }

    public int getNumOfVoters() {
        return NumOfVoters;
    }

    public int getNumOfElVOters() {
        return NumOfElVOters;
    }

    public String getWinnerInState() {
        return winnerInState;
    }

    public void setName(String name) {
        Name = name;
    }
    public void setNumOfVoters(int numOfVoters) {
        NumOfVoters = numOfVoters;
    }
    public void setNumOfElVOters(int numOfElVOters) {
        NumOfElVOters = numOfElVOters;
    }


    public void vote() {

        if(votingStrategy == null) {
            System.out.println("Voting strategy is not set.");
            return;
        }else {
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

    public void setVotingStrategy(VotingStrategy votingStrategy) {
        this.votingStrategy = votingStrategy;
    }

    // Getter and setter methods for democraticVotes and republicanVotes
    public int getDemocraticVotes() {
        return democraticVotes;
    }

    public void setDemocraticVotes(int democraticVotes) {
        this.democraticVotes = democraticVotes;
    }

    public int getRepublicanVotes() {
        return republicanVotes;
    }

    public void setRepublicanVotes(int republicanVotes) {
        this.republicanVotes = republicanVotes;
    }

}



