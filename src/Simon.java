import java.util.*;

/**
 *  Stores data for Simon
 *
 *  @author Zina Schroeder
 *  @version 1.0
 */
public class Simon {

    // Instance Variables
    private double turnLength;
    private ArrayList<int> colorPattern;

    // Constructor
    public Simon() {

        turnLength = 2.1; // The time per color press starts at about 2 seconds
        colorPattern = new ArrayList<int>();
    }

    /**
     *  Prepares Simon for the round. 
     *
     *  @param round    The current player round
     */
    public void prepareSimonSays(int round) {

        turnLength = turnLength * 0.95; // Make each turn slightly faster
        colorPattern[round] = generateRandomColor(); // Add a new color to the pattern
    }

    /**
     *  Chooses a random number between 1 and the limit that is determined 
     *  by the number of rounds that have occurred. 
     *
     *  @param round    The current player round
     */
    private int generateRandomColor(int round) {

        int limit = 5;

        if (round < 10) {
            limit = 3;
        } else if (round < 30) {
            limit = 4;
        }

        return (int)(Math.random() * limit + 1);
    }

    /**
     *  Gets Simon's pattern of colors. 
     *
     *  @return   the array of colors
     */
    public ArrayList<int> getColorPattern() {
        return colorPattern;
    }

    /**
     *  Gets the current length of time for a turn. 
     *
     *  @return   time of turn in seconds
     */
    public double getTurnLength() {
        return turnLength;
    }

}