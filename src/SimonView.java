//import java.awt.Component;
import java.awt.event.WindowEvent;
import java.lang.Override;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

/**
 *  Display for the Simon game
 *
 * This class is going to accept values to indicate which colors to display
 * 
 *  @author Jacob Kocina
 *  @version 1.0
 */
public class SimonView extends Frame implements WindowListener {

    private Panel panel;
    private Label label;
    private Button rsetButton;

    /**
     * This method begins the process of creating a display by giving variable access to the necessary graphics methods
     */
    public void displayScreen() {

        // A panel that will hold displayed data
        panel = new Panel();

        // A centered label to be put into the panel
        label = new Label("MITA-AppDev says: Follow These Colors", Label.CENTER);

        //A button to reset things maybe
        rsetButton = new Button("Reset");
        drawScreen();

    }

    /**
     * This method sets initializes a display to switch between colors
     */
    private void drawScreen()  {

        //sets layout and size of panel
        setLayout(new BorderLayout(20,20));
        setSize(500, 500);

        //adds the label to the panel
        add(label, BorderLayout.NORTH);

        //adds the reset button to the panel
        add(rsetButton, BorderLayout.SOUTH);

        setTitle("MITA-AppDev Presents Simon Says");
        //sets the panel and everything inside visible
        setVisible(true);

        //Sets up for x being clicked to System.exit(0)
        addWindowListener(this);

    }

    /**
     * This method accepts takes a number between 0 and 1 and sets the display to the corresponding color
     * @param color is an integer that holds a value between zero and four to indicate a color
     *              0 = white
     *              1 = red
     *              2 = blue
     *              3 = green
     *              4 = yellow
     */
    private void displayColors(int color)  {

        switch (color)  {

            case 0:
                    break;
            case 1:
                    break;
            case 2:
                    break;
            case 3:
                    break;
            case 4:
                    break;
        }
    }

    @Override
    public void windowClosing(WindowEvent e)  {
        System.exit(0);
    }

    //These things need to be here for the window listener
    @Override
    public void windowOpened(WindowEvent e) { }
    @Override
    public void windowClosed(WindowEvent e) { }
    @Override
    public void windowIconified(WindowEvent e) { }
    @Override
    public void windowDeiconified(WindowEvent e) { }
    @Override
    public void windowActivated(WindowEvent e) { }
    @Override
    public void windowDeactivated(WindowEvent e) { }

    public static void main(String[] arguements) {

        SimonView sv = new SimonView();
        sv.displayScreen();
    }
}
