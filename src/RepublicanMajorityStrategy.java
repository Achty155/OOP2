import Intruder.*;
import Voter.*;
import Weapons.*;

import java.util.Random;

public class RepublicanMajorityStrategy implements VotingStrategy {


    public void vote(State state) {

        for (int i = 0; i < state.getNumOfVoters(); i++) {
            Random rand = new Random();
            Voter voter = null;
            int vol = rand.nextInt(101);
            if (vol < 60) {
                voter = new Republican_Voter();
            } else if (vol > 60 && vol < 80) {
                voter = new Democratic_Voter();
            } else if (vol > 80 && vol < 100) {
                voter = new Voter();
            }
            if (voter != null) {
                if (voter.getKohoVoli() == 0) {
                    state.setDemocraticVotes(state.getDemocraticVotes() + 1);
                } else {
                    state.setRepublicanVotes(state.getRepublicanVotes() + 1);
                }
            }
        }

        Random rand = new Random();
        for (int i = 0; i < rand.nextInt(10) + 1; i++) {
            Intruder intruder = null;
            int vol = rand.nextInt(101);
            if (vol < 20) {
                intruder = new Intruder();
            } else if (vol > 20 && vol < 25) {
                intruder = new Strong_Intruder();
            } else if (vol > 25 && vol < 55) {
                intruder = new Weak_Intruder(new Lighter());
            } else if (vol > 55 && vol < 100) {
                intruder = new Harmless_Intruder();
            }
            int WhoToDestroy = rand.nextInt(2);

            if(intruder != null){
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
        }
    }
}