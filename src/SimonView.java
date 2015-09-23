
import java.awt.*;
import javax.swing.*;


/**
 * Created by Jacob on 9/22/2015.
 */
public class SimonView extends JPanel {

    public Graphics2D showSimonsColor;

    public void displayScreen() {

        JFrame frame = new JFrame("Simon Says");
        JLabel mitaLabel = new JLabel("MITA App Dev Says follow the colors:");

        setLayout(new BorderLayout());
        frame.add(mitaLabel, BorderLayout.PAGE_START);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new SimonView());
        frame.setSize(700, 700);
        frame.setVisible(true);

        //just to test different Colors
        SimonView sv = new SimonView();
        for (int i = 0 ; i < 5 ; i ++) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            sv.displayColors(i);
        }

    }

    @Override
    public void paint(Graphics g)  {
        showSimonsColor = (Graphics2D) g;
        showSimonsColor.setColor(Color.BLACK);
        showSimonsColor.fillOval(75, 75, 500, 500);
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
    public void displayColors(int color)  {

        switch (color)  {

            case 0: showSimonsColor.setColor(Color.WHITE);
                break;
            case 1: showSimonsColor.setColor(Color.RED);
                break;
            case 2: showSimonsColor.setColor(Color.BLUE);
                break;
            case 3: showSimonsColor.setColor(Color.GREEN);
                break;
            case 4: showSimonsColor.setColor(Color.YELLOW);
                break;
        }
    }

    public static void main(String[] arguments) {

        SimonView sv = new SimonView();
        sv.displayScreen();
    }
}

