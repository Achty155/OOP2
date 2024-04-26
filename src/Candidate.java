/**
 * The Candidate class represents a candidate running for election.
 */
public class Candidate {
    private String Name; // Candidate's name
    private String Party; // Candidate's political party
    private int Votes; // Number of votes received
    private int ElectoralVotes; // Number of electoral votes received

    /**
     * Constructs a new Candidate object with a specified name and party.
     * @param name The name of the candidate.
     * @param party The political party of the candidate.
     */
    public Candidate(String name, String party) {
        this.Name = name;
        this.Party = party;
    }

    /**
     * Retrieves the name of the candidate.
     * @return The name of the candidate.
     */
    public String getName() {
        return Name;
    }

    /**
     * Retrieves the political party of the candidate.
     * @return The political party of the candidate.
     */
    public String getParty() {
        return Party;
    }

    /**
     * Retrieves the number of votes received by the candidate.
     * @return The number of votes received.
     */
    public int getVotes() {
        return Votes;
    }

    /**
     * Retrieves the number of electoral votes received by the candidate.
     * @return The number of electoral votes received.
     */
    public int getElectoralVotes() {
        return ElectoralVotes;
    }

    /**
     * Sets the name of the candidate.
     * @param name The name of the candidate.
     */
    public void setName(String name) {
        Name = name;
    }

    /**
     * Sets the political party of the candidate.
     * @param party The political party of the candidate.
     */
    public void setParty(String party) {
        Party = party;
    }

    /**
     * Sets the number of votes received by the candidate.
     * @param votes The number of votes received.
     */
    public void setVotes(int votes) {
        Votes = votes;
    }

    /**
     * Sets the number of electoral votes received by the candidate.
     * @param electoralVotes The number of electoral votes received.
     */
    public void setElectoralVotes(int electoralVotes) {
        ElectoralVotes = electoralVotes;
    }
}
