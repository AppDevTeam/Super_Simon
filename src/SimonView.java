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
 *  @author Zina Schroeder
 *  @version 1.0
 */
public class SimonView extends Frame {

    private JButton[][] board;
    private JPanel panel;

    public void displayScreen() {

        panel = new JPanel(new GridLayout(1, 1));
        board = new JButton[1][1];

        drawScreen();

    }

    private void drawScreen()  {

        board[1][1] = new JButton();
        board[1][1].setOpaque(true);
        board[1][1].setBorderPainted(false);
        board[1][1].setBackGround(Color.black);
    }

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
