import java.util.*;

/**
 *  Display for the Simon game
 *
 *  @author Zina Schroeder
 *  @version 1.0
 */
public class SimonView {

    // Instance Variables
    private Simon simon;
    private SimonView view;
    private ScoreKeeper scoreKeeper;
    private int round;

    // Constructor
    public SimonController() {

        simon = new Simon();
        view  = new SimonView();
        scoreKeeper = new ScoreKeeper();
        round = 0;
    }

    public runSimon() {

        int turn = 0;
        
        // Prepare for the turn by choosing a color, etc. 
        simon.prepareSimon(round);

        // Display the colors


        // Expect user input


        round++;

    }

    private void listenForInput() {

    }

}
