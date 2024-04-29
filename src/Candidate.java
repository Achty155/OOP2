public class Candidate{
    private String Name;
    private String Party;
    private int Votes;
    private int ElectoralVotes;

    public Candidate(String name, String party) {
        this.Name = name;
        this.Party = party;
    }

    public String getName() {
        return Name;
    }

    public String getParty() {
        return Party;
    }

    public int getVotes() {
        return Votes;
    }

    public int getElectoralVotes() {
        return ElectoralVotes;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setParty(String party) {
        Party = party;
    }

    public void setVotes(int votes) {
        Votes = votes;
    }

    public void setElectoralVotes(int electoralVotes) {
        ElectoralVotes = electoralVotes;
    }
}