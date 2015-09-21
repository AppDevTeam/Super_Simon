import java.util.*;
import java.awt.*;
//import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import javax.imageio.*;

/**
 *  Display for the Simon game
 *
 * This class is going to accept values to indicate which colors to display
 * 
 *  @author Jacob Kocina
 *  @version 1.0
 */
public class SimonView extends Frame {

    private JButton[][] board;
    private JPanel panel;

    /**
     * This method begins the process of creating a display by giving variable access to the necessary graphics methods
     */
    public void displayScreen() {

        panel = new JPanel(new GridLayout(1, 1));
        board = new JButton[1][1];

        drawScreen();

    }

    /**
     * This method sets initializes a display to switch between colors
     */
    private void drawScreen()  {

        board[1][1] = new JButton();
        board[1][1].setOpaque(true);
        board[1][1].setBorderPainted(false);
        board[1][1].setBackground(Color.black);
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

            case 0: board[1][1].setBackground(Color.white);
                    break;
            case 1: board[1][1].setBackground(Color.red);
                    break;
            case 2: board[1][1].setBackground(Color.blue);
                    break;
            case 3: board[1][1].setBackground(Color.green);
                    break;
            case 4: board[1][1].setBackground(Color.yellow);
                    break;
        }
    }
}
