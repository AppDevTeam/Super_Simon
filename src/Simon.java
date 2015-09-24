import java.util.*;

/**
 *  Stores data for Simon
 *
 *  @author Zina Schroeder
 *  @version 1.0
 */
public class Simon {

    // Instance Variables
    private int turnLength;
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

        turnLength = (int)(turnLength * 0.95); // Make each turn slightly faster
        colorPattern.add(generateRandomColor(round)); // Add a new color to the pattern
    }

    /**
     *  Chooses a random number between 1 and the limit that is determined 
     *  by the number of rounds that have occurred. 
     *
     *  @param round    The current player round
     */
    private int generateRandomColor(int round) {

        int limit = 5;
        int color;

        // if (round < 10) {
        //     limit = 2;

        // } else if (round < 20) {
        //     limit = 3;
        // }

        color = (int)(Math.random() * limit);
        System.out.println("Choosing " + color + "\n");

        return color;
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
     *  @return   time of turn in milliseconds
     */
    public int getTurnLength() {
        return turnLength;
    }

}
