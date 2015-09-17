import java.util.*;
import java.io.*;

/**
 *  Manages score data and saves high score list. 
 *
 *  @author Zina Schroeder
 *  @version 1.0
 */
public class ScoreKeeper {

    // Instance Variables
    private int score;  // holds the current score? -Amanda

    // Constructor
    public ScoreKeeper() {

        loadScores();
    }

    private void loadScores() {
        // shouldn't this put the scores in order from highest to lowest 
        // or call a method that does that? -Amanda
    }

}
