/**
 * The Elections class manages the election process.
 */
public class Elections {

    volby volby; // Instance of the volby class

    /**
     * Determines the main outcome of the election based on a specified strategy.
     * @param strategy The strategy to be used for determining the winner.
     * @return The result of the election.
     */
    public String Hlavni(int strategy) {

        volby = new volby(); // Instantiate the volby class
        volby.volby(strategy); // Execute the election process with the specified strategy
        return volby.determineWinner(); // Determine the winner of the election
    }
}
