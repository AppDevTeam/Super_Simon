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
    private ButtonController buttons;
    private Player audioPlayer;
    private int round;

    // Constructor
    public SimonController() {

        simon       = new Simon();
        buttons     = new ButtonController();
        view        = new SimonView(this);
        audioPlayer = new Player();
        round       = 0;
    }

    public void runSimon() {

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
            view.displayColor(color);

            // Light up correct LED
            buttons.lightLED(color, simon.getTurnLength());

            // Play sound
            playSound(color);

            // Pause while displaying colors
            try {
                Thread.sleep(simon.getTurnLength());        
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }

            // Reset color display
            view.reset();

            // Pause again
            try {
                Thread.sleep(100);        
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
    }

    private void playSound(int tone) {
        
        switch(tone) {
            case 0:
                audioPlayer.play("C ");
                break;
            case 1:
                audioPlayer.play("D ");
                break;
            case 2:
                audioPlayer.play("E ");
                break;
            case 3:
                audioPlayer.play("F ");
                break;
            case 4:
                audioPlayer.play("G ");
                break;
            default:
                audioPlayer.play("A ");
                break;
        }
    }

    private void endGame() {
        // Go to High Score view
    }
}
