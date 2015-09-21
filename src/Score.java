import java.io.Serializable;
import java.util.*;

/**
 *  Stores the data for one high score.
 *
 *  @author Zina Schroeder
 *  @version 1.0
 */
public class Score implements Serializable, Comparable<Score>{

    // Instance Variables
    private String playerName;
    private int playerScore;

    // Constructor
    public Score() {

        playerName = "Anonymous";
        playerScore = 0;
    }

    // Convenience constructor
    public Score(String playerName, int playerScore) {

        this();

        this.playerName = playerName;
        this.playerScore = playerScore;
    }

    /**
     *  Allows Score objects to be sorted by their playerScore
     *
     *  @return     difference value to compare
     */
    @Override 
    public int compareTo(Score other) {
        return other.playerScore - this.playerScore;
    }

    /**
     *  Gets the player name
     *
     *  @return     player's name
     */
    public String getPlayerName() {
        return playerName;
    }

    /**
     *  Gets the player score
     *
     *  @return     player's score
     */
    public int getPlayerScore() {
        return playerScore;
    }

    /**
     *  Creates a pretty stringified version of the score data
     *
     *  @return     Pretty score string
     */
    public String toString() {

        String separator = "";
        int spaces = 40 - (playerName.length() + String.valueOf(playerScore).length());

        if (spaces > 0) {
            for (int i = 0; i < spaces; i++) {
                separator += ".";
            }
        }

        return playerName + separator + playerScore;
    }

}
