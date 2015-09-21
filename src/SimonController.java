import java.util.*;

/**
 *  Handles main game logic for Simon
 *
 *  @author Zina Schroeder
 *  @version 1.0
 */
public class SimonController {

    // Instance Variables
    private Simon simon;
    private SimonView view;
    private int round;

    // Constructor
    public SimonController() {

        simon = new Simon();
        view  = new SimonView();
        round = 0;
    }

    public runSimon() {

        int turn = 0;
        
        // Prepare for the turn by choosing a color, etc. 
        simon.prepareSimon(round);

        // Display the colors
        simon.getColorPattern(); //Added by Hilary
        //Do we connect this code to the arduino code here? - Hilary
        
        // Expect user input


        round++;

    }

    private void listenForInput() {

    }

}
