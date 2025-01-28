import javax.swing.*;
import java.awt.*;

public class JapanFlag extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Set the background to white
        setBackground(Color.WHITE);

        // Dimensions of the flag
        int width = getWidth();
        int height = getHeight();

        // Draw the white background
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, width, height);

        // Draw the red circle (sun)
        int circleDiameter = Math.min(width, height) * 2 / 3; // Circle diameter is 2/3 of the smaller dimension
        int circleX = (width - circleDiameter) / 2; // Center the circle horizontally
        int circleY = (height - circleDiameter) / 2; // Center the circle vertically

        g.setColor(Color.RED);
        g.fillOval(circleX, circleY, circleDiameter, circleDiameter);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Flag of Japan");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300); // Wider than tall
        frame.add(new JapanFlag());
        frame.setVisible(true);
    }
}