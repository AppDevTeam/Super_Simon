import java.awt.*;
import java.awt.event.*;
import java.lang.InterruptedException;
import java.lang.Thread;
import javax.swing.*;
import java.io.*;
import javax.imageio.*;

/**
 *  Manages the display for the Simon game
 *
 *  @author Jacob Kocina
 *  @author Zina Schroeder
 */
public class SimonView extends JPanel {

    private JFrame frame;
    private SimonController controller;

    public SimonView() {
        displayScreen();
    }

    public SimonView(SimonController controller) {
        this();

        this.controller = controller;
    }

    public void displayScreen() {

        //Making the Frame
        frame = new JFrame("Simon Says");
        setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 700);

        //Making the Label
        // JLabel mitaLabel = new JLabel("AppDev Says");
        // mitaLabel.setPreferredSize(new Dimension(700,700));
        // mitaLabel.setHorizontalAlignment(JLabel.CENTER);
        // mitaLabel.setVerticalAlignment(JLabel.CENTER);

        createButton("start");

        //Add the label, setting the background Color, and making everything visible
        //frame.add(mitaLabel, BorderLayout.PAGE_START);
        frame.getContentPane().setBackground(Color.ORANGE);
        frame.setVisible(true);

    }

    /**
     *  This method creates a button that removes itself when clicked
     *  and triggers the Simon game to start.
     *
     *  @param   name of the button image file          
     */
    private void createButton(String name) {
        JButton startButton = new JButton();
        startButton.setBorderPainted(false);
        startButton.setIcon(loadIcon(name));
        frame.add(startButton);

        startButton.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) { 
                
                Object source = e.getSource();
                
                if (source instanceof Component) {
                    Component comp = (Component)source;
                    frame.remove(comp);
                    revalidate();
                    repaint();
                    System.out.println("deleting button: " + comp);
                }

                try {
                    Thread.sleep(100);        
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }

                controller.runSimon();
            } 
        });
    }

    /**
     *  This method accepts takes a number between 0 and 1 and sets the 
     *  display to the corresponding color
     *
     *  @param   color is an integer that holds a value between zero and four             
     */
    public void displayColor(int color)  {

        switch (color)  {
            case 0: // White
                frame.getContentPane().setBackground(Color.WHITE);
                break;
            case 1: // Red
                frame.getContentPane().setBackground(Color.RED);
                break;
            case 2: // Blue
                frame.getContentPane().setBackground(Color.BLUE);
                break;
            case 3: // Green
                frame.getContentPane().setBackground(Color.GREEN);
                break;
            case 4: // Yellow
                frame.getContentPane().setBackground(Color.YELLOW);
                break;
            default:
                frame.getContentPane().setBackground(Color.BLACK);
                break;
        }
    }

    /**
     *  Resets background color to black
     */
    public void reset() {
        System.out.println("Resetting view");
        frame.getContentPane().setBackground(Color.BLACK);
    }

    /**
     *  Loads button image
     */
    private ImageIcon loadIcon(String name) {

        String imageDirectory = "../images/";
        String filePath = imageDirectory + name + ".png";
        
        try {

            Image image = ImageIO.read(new File(filePath));
            ImageIcon icon = new ImageIcon(image);

            return icon;

        } catch (IOException exception) {
            System.out.println("Error loading image");
        }

        return null;
    }
}

