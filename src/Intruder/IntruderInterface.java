package Intruder;

/**
 * The IntruderInterface interface defines methods related to the intruder's actions.
 */
public interface IntruderInterface {

    /**
     * Calculates the number of destructed votes.
     */
    void calculationDestructedVotes();

    /**
     * Retrieves the number of votes destructed.
     * @return The number of destructed votes.
     */
    int getKolkoHlasovZnici();

    /**
     * Sets the number of destructed votes.
     * @param kolkoHlasovZnici The number of destructed votes to set.
     */
    void setKolkoHlasovZnici(int kolkoHlasovZnici);
}
