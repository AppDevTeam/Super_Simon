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
    private ArrayList<Integer> colorPattern;

    // Constructor
    public Simon() {

        turnLength = 2100; // in milliseconds
        colorPattern = new ArrayList<Integer>();
    }

    /**
     *  Prepares Simon for the round. 
     *
     *  @param round    The current player round
     */
    public void prepareSimon(int round) {

        turnLength = turnLength * 0.95; // Make each turn slightly faster
        colorPattern.add(generateRandomColor(round)); // Add a new color to the pattern
    }

    /**
     *  Chooses a random number between 1 and the limit that is determined 
     *  by the number of rounds that have occurred. 
     *
     *  @param round    The current player round
     */
    private int generateRandomColor(int round) {

        int limit = 4;

        if (round < 10) {
            limit = 2;
        } else if (round < 30) {
            limit = 3;
        }

        return (int)(Math.random() * limit);
    }

    /**
     *  Gets Simon's pattern of colors. 
     *
     *  @return   the array of colors
     */
    public ArrayList<Integer> getColorPattern() {
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
