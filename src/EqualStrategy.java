import Intruder.Harmless_Intruder;
import Intruder.Intruder;
import Intruder.Strong_Intruder;
import Intruder.Weak_Intruder;
import Voter.Voter;
import Weapons.Lighter;

import java.util.Random;
import java.util.stream.IntStream;

/**
 * The EqualStrategy class implements a voting strategy where each voter has an equal chance of voting for any party.
 */
public class EqualStrategy implements VotingStrategy {

    /**
     * Executes the voting strategy for the given state.
     * @param state The state for which the voting strategy is applied.
     */
    public void vote(State state) {
        // Loop through the voters in the state
        for(int i = 0; i < state.getNumOfVoters(); i++) {
            // Create a new voter
            Voter voter = new Voter();
            // Increment the vote count based on the voter's choice
            if(voter != null) {
                if (voter.getKohoVoli() == 0) {
                    state.setDemocraticVotes(state.getDemocraticVotes() + 1);
                } else {
                    state.setRepublicanVotes(state.getRepublicanVotes() + 1);
                }
            }
        }

        // Generate intruders and simulate their impact on votes
        Random rand = new Random();
        IntStream.range(0, rand.nextInt(10) + 1).forEach(i -> {
            Intruder intruder = null;
            int vol = rand.nextInt(101);
            // Assign intruder based on the percentage
            if (vol < 20) {
                intruder = new Intruder();
            } else if (vol > 20 && vol < 25) {
                intruder = new Strong_Intruder();
            } else if (vol > 25 && vol < 55) {
                intruder = new Weak_Intruder(new Lighter());
            } else if (vol > 55 && vol < 100) {
                intruder = new Harmless_Intruder();
            }
            // Determine which party's votes to decrease based on the intruder's choice
            int WhoToDestroy = rand.nextInt(2);

            if (intruder != null) {
                if(WhoToDestroy == 0){
                    if((state.getDemocraticVotes() - intruder.getKolkoHlasovZnici()) >= 0){
                        state.setDemocraticVotes(state.getDemocraticVotes() - intruder.getKolkoHlasovZnici());
                    } else {
                        state.setDemocraticVotes(0);
                    }
                } else {
                    if((state.getRepublicanVotes() - intruder.getKolkoHlasovZnici()) >= 0){
                        state.setRepublicanVotes(state.getRepublicanVotes() - intruder.getKolkoHlasovZnici());
                    } else {
                        state.setRepublicanVotes(0);
                    }
                }
            }
        });
    }
}
