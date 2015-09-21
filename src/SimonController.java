import java.util.*;
import java.awt.*;
import org.jfugue.player.Player;

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
    private Player audioPlayer;
    private int round;

    // Constructor
    public SimonController() {

        simon  = new Simon();
        view   = new SimonView();
        audioPlayer = new Player();
        round  = 0;
    }

    public runSimon() {


        // Prepare for the turn by choosing a color, etc. 
        simon.prepareSimon(round);

        // Display the colors
        displayColors();

        // start loop
            // start timer
        
            //listen for user input
                // does user input = colorpattern.get(i)
                    //yes ? i++
                    //no addNewScore(String name, int score) 
                        //   display highscore??
                

        round++;

    }

    private void listenForInput() {

    }

    private void displayColors() {

        for (int color : simon.getColorPattern()) {
            view.showColor(color);

            // Light up correct LED

            // Play sound
            playSound(color);

            // Pause while displaying colors
            Thread.sleep(simon.getTurnLength());

            // Reset color display
        }
    }

    private void playSound(int color) {
        
        switch(color) {
            case 0:
                audioPlayer.play("B");
                break;
            case 1:
                audioPlayer.play("C");
                break;
            case 2:
                audioPlayer.play("D");
                break;
            case 3:
                audioPlayer.play("E");
                break;
            case 4:
                audioPlayer.play("F");
                break;
            default:
                audioPlayer.play("G");
                break;
        }
    }

    private void endGame() {
        // Go to High Score view
    }
}
