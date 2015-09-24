
import java.awt.*;
import java.awt.Dimension;
import java.lang.InterruptedException;
import java.lang.Thread;
import javax.swing.*;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;


/**
 * @author Jacob Kocina
 */
public class SimonView extends JPanel {

    JFrame frame;

    public void displayScreen() {

        //Making the Frame
        frame = new JFrame("Simon Says");
        setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new SimonView());
        frame.setSize(700, 700);

        //Making the Label
        JLabel mitaLabel = new JLabel("MITA App Dev Says follow the colors:");
        mitaLabel.setPreferredSize(new Dimension(700,700));
        mitaLabel.setHorizontalAlignment(JLabel.CENTER);
        mitaLabel.setVerticalAlignment(JLabel.CENTER);

        //Add the label, setting the background Color, and making everything visible
        frame.add(mitaLabel, BorderLayout.PAGE_START);
        frame.getContentPane().setBackground(Color.ORANGE);
        frame.setVisible(true);

        //cycling through the color to make sure it works
        for (int i = 0 ; i < 5 ; i++) {
            try {
                Thread.sleep(3000);
            }catch (InterruptedException ie) {
                System.exit(0);
            }

            this.displayColors(i);
        }

    }
/**
    @Override
    public void paint(Graphics g)  {
        showSimonsColor = (Graphics2D) g;
        showSimonsColor.setColor(Color.BLACK);
        showSimonsColor.fillOval(75, 75, 500, 500);
    }
*/

    /**
     * This method accepts takes a number between 0 and 1 and sets the display to the corresponding color
     * @param color is an integer that holds a value between zero and four to indicate a color
     *              0 = white
     *              1 = red
     *              2 = blue
     *              3 = green
     *              4 = yellow
     */
    public void displayColors(int color)  {

        switch (color)  {

            case 0: frame.getContentPane().setBackground(Color.WHITE);
                break;
            case 1: frame.getContentPane().setBackground(Color.RED);
                break;
            case 2: frame.getContentPane().setBackground(Color.BLUE);
                break;
            case 3: frame.getContentPane().setBackground(Color.GREEN);
                break;
            case 4: frame.getContentPane().setBackground(Color.YELLOW);
                break;
        }
    }

    public static void main(String[] arguments) {

        SimonView sv = new SimonView();
        sv.displayScreen();
    }
}

