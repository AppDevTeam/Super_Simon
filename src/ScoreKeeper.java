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
    private static final String SCORES_FILE = "../data/scores.dat";
    private ArrayList<Score> scores;

    // Constructor
    public ScoreKeeper() {

        scores = new ArrayList<Score>();

        loadScores();
    }

    /**
     *  Loads scores from outside source where they are stored
     *  to keep scores between application launches. 
     */
    private void loadScores() {
        
        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(SCORES_FILE))) {

            scores = (ArrayList<Score>) input.readObject();

        } catch (FileNotFoundException e) {
            System.out.println("Loading - File Not Found Error: " + e.getMessage());

        } catch (IOException e) {
            System.out.println("Loading - IO Error: " + e.getMessage());

        } catch (ClassNotFoundException e) {
            System.out.println("Loading - Class Not Found Error: " + e.getMessage());
        } 
    }

    /**
     *  Writes dat file to store scores
     */
    private void outputScores() {
        
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(SCORES_FILE))) { 

            output.writeObject(scores);

        } catch (FileNotFoundException e) {
            System.out.println("Writing - File Not Error: " + e.getMessage());
        
        } catch (IOException e) {
            System.out.println("Writing - IO Error: " + e.getMessage());
        } 
    }

    /**
     *  Loads scores from outside source where they are stored
     *  to keep scores between application launches. 
     *
     *  @return
     */
    // public Boolean isHighScore(int score) {
        
    //     Boolean higher = false;

    //     for (Score highscore : scores) {
    //         if (highscore.getScore() < score) {
    //             higher = true;
    //         }
    //     }

    //     return higher;
    // }

    /**
     *  Adds a new score to the list of high scores. 
     */
    public void addNewScore(String name, int score) {
        Score newScore = new Score(name, score);

        scores.add(newScore);

        Collections.sort(scores);

        while (scores.size() > 20) {
            scores.remove(20);
        }

        outputScores();
    }

    /**
     *  Gets a fancy list of the high scores
     *
     *  @return     pretty high score list
     */
    public String getHighScoreList() {

        String output = "";

        for (int i = 0; i < scores.size(); i++) {
            int listIndex = i + 1;

            output += listIndex + ". " + scores.get(i) + "\n";
        }

        return output;
    }



}
