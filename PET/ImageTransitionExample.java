import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class ImageTransitionExample extends JFrame {

    private JLabel roomLabel;
    private ImageIcon roomImage;
    private ImageIcon fridgeClosedImage;
    private ImageIcon fridgeOpenImage;
    private boolean fridgeOpen = false;

    public ImageTransitionExample() {
        setTitle("Room Transition");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Load images
        roomImage = new ImageIcon("kitchenroom.png");
        fridgeClosedImage = new ImageIcon("closed_fridge.png");
        fridgeOpenImage = new ImageIcon("open_fridge.png");

        // Set up room label with initial image
        roomLabel = new JLabel(roomImage);
        roomLabel.addMouseListener(new MouseClickListener());

        // Set up content pane
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(roomLabel, BorderLayout.CENTER);
    }

    private class MouseClickListener implements java.awt.event.MouseListener {
        @Override
        public void mouseClicked(java.awt.event.MouseEvent e) {
            // Toggle between closed and open fridge images when clicked
            if (fridgeOpen) {
                roomLabel.setIcon(fridgeClosedImage);
            } else {
                roomLabel.setIcon(fridgeOpenImage);
            }
            fridgeOpen = !fridgeOpen;
        }

        // Other mouse listener methods
        @Override
        public void mousePressed(java.awt.event.MouseEvent e) {
        }

        @Override
        public void mouseReleased(java.awt.event.MouseEvent e) {
        }

        @Override
        public void mouseEntered(java.awt.event.MouseEvent e) {
        }

        @Override
        public void mouseExited(java.awt.event.MouseEvent e) {
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ImageTransitionExample example = new ImageTransitionExample();
            example.setVisible(true);
        });
    }
}
