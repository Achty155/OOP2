public class volby {
    public  Candidate[] candidates = new Candidate[2];
    public VotingStrategy universalVotingStrategy; // This is the universal strategy for all states.

    public String determineWinner() {
        if(candidates[0].getVotes() > candidates[1].getVotes()) {
            return candidates[0].getName();
        } else {
            return candidates[1].getName();
        }
    }

    public void volby(){
        State[] staty = new State[50];
        staty[0] = new State("Alabama", 50, 7, this);// pocet ludi / 100000 (stotisic) je to z wikipedie z roku 2020
        staty[1] = new State("Alaska", 7, 1, this);
        staty[2] = new State("Arizona", 71, 9, this);
        staty[3] = new State("Arkansas", 30, 4, this);
        staty[4] = new State("California", 395, 52, this);
        staty[5] = new State("Colorado", 57, 8, this);
        staty[6] = new State("Connecticut", 36, 5, this);
        staty[7] = new State("Delaware", 9, 1, this);
        staty[8] = new State("Florida", 215, 28, this);
        staty[9] = new State("Georgia", 107, 14, this);

        staty[10] = new State("Hawaii", 14, 2, this);
        staty[11] = new State("Idaho", 18, 2, this);
        staty[12] = new State("Illinois", 128, 17, this);
        staty[13] = new State("Indiana", 67, 9, this);
        staty[14] = new State("Iowa", 31, 4, this);
        staty[15] = new State("Kansas", 29, 4, this);
        staty[16] = new State("Kentucky", 45, 6, this);
        staty[17] = new State("Louisiana", 46, 6, this);
        staty[18] = new State("Maine", 13, 2, this);
        staty[19] = new State("Maryland", 61, 8, this);

        staty[20] = new State("Massachusetts", 70, 9, this);
        staty[21] = new State("Michigan", 100, 13, this);
        staty[22] = new State("Minnesota", 57, 8, this);
        staty[23] = new State("Mississippi", 29, 4, this);
        staty[24] = new State("Missouri", 61, 8, this);
        staty[25] = new State("Montana", 10, 2, this);
        staty[26] = new State("Nebraska", 19, 3, this);
        staty[27] = new State("Nevada", 31, 4, this);
        staty[28] = new State("New Hampshire", 13, 2, this);
        staty[29] = new State("New Jersey", 92, 12, this);

        staty[30] = new State("New Mexico", 21, 3, this);
        staty[31] = new State("New York", 202, 26, this);
        staty[32] = new State("North Carolina", 104, 14, this);
        staty[33] = new State("North Dakota", 7, 1, this);
        staty[34] = new State("Ohio", 117, 15, this);
        staty[35] = new State("Oklahoma", 39, 5, this);
        staty[36] = new State("Oregon", 42, 6, this);
        staty[37] = new State("Pennsylvania", 130, 17, this);
        staty[38] = new State("Rhode Island", 10, 2, this);
        staty[39] = new State("South Carolina", 51, 7, this);

        staty[40] = new State("South Dakota", 8, 1, this);
        staty[41] = new State("Tennessee", 69, 9, this);
        staty[42] = new State("Texas", 291, 38, this);
        staty[43] = new State("Utah", 32, 4, this);
        staty[44] = new State("Vermont", 6, 1, this);
        staty[45] = new State("Virginia", 86, 11, this);
        staty[46] = new State("Washington", 77, 10, this);
        staty[47] = new State("West Virginia", 17, 2, this);
        staty[48] = new State("Wisconsin", 58, 8, this);
        staty[49] = new State("Wyoming", 5, 1, this);

        // Now, setting the universal voting strategy for all states.
        // For example, here we set it to new RepublicanMajorityStrategy();
        // But you can easily switch it to new DemocraticMajorityStrategy() or new EqualStrategy()
        universalVotingStrategy = new RepublicanMajorityStrategy();

        candidates[0] = new Candidate("Demokrat Stefn", "Democratic");
        candidates[1] = new Candidate("Republikan Jozko", "Republican");

        while(true){
            for(int i = 0; i < 50; i++) {
                staty[i].setVotingStrategy(universalVotingStrategy);
                staty[i].vote();
            }
            if(candidates[0].getVotes() == candidates[1].getVotes()) {
                candidates[0].setVotes(0);
                candidates[1].setVotes(0);
            } else {
                break;
            }
        }



//        if(candidates[0].getVotes() > candidates[1].getVotes()) {
//            System.out.println("Vyhral demokrat");
//        } else {
//            System.out.println("Vyhral republikan");
//
//        }
    }
}
