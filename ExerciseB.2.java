import java.awt.*;
import javax.swing.*;

public class Mickey extends JPanel {

    // Recursive function to draw Mickey Mouse and its ears
    private void drawEars(Graphics g, int x, int y, int radius) {
        if (radius < 3) { // Base case: Stop drawing when radius is smaller than 3 pixels
            return;
        }

        // Draw the main circle (head or ear)
        g.drawOval(x - radius, y - radius, 2 * radius, 2 * radius);

        // Coordinates for the ears
        int leftEarX = x - radius; // Left ear position
        int rightEarX = x + radius; // Right ear position
        int earY = y - radius; // Both ears are above the current circle

        // Recursive calls for left and right ears
        drawEars(g, leftEarX, earY, radius / 2); // Left ear
        drawEars(g, rightEarX, earY, radius / 2); // Right ear
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Set the initial position and radius
        int initialX = getWidth() / 2; // Center of the panel
        int initialY = getHeight() / 2; // Center of the panel
        int initialRadius = 100; // Initial radius of the head

        // Call the recursive function to draw Mickey Mouse with ears on ears
        drawEars(g, initialX, initialY, initialRadius);
    }

    public static void main(String[] args) {
        // Create the frame and panel
        JFrame frame = new JFrame("Mickey Ears on Ears");
        Mickey panel = new Mickey();

        // Set up the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.add(panel);
        frame.setVisible(true);
    }
}
