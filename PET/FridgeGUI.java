import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FridgeGUI extends JFrame {
    private JButton fridgeButton;
    private ImageIcon closedFridgeIcon;
    private ImageIcon openFridgeIcon;
    private boolean isOpen = false;

    public FridgeGUI() {
        setTitle("Fridge Simulator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLayout(new BorderLayout());

        // Load images
        closedFridgeIcon = new ImageIcon("closed_fridge.png");
        openFridgeIcon = new ImageIcon("open_fridge.png");

        fridgeButton = new JButton(closedFridgeIcon);
        fridgeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                toggleFridge(); // Toggle between open and closed fridge images
            }
        });
        add(fridgeButton, BorderLayout.CENTER);

        setVisible(true);
    }

    private void toggleFridge() {
        isOpen = !isOpen;
        if (isOpen) {
            fridgeButton.setIcon(openFridgeIcon);
        } else {
            fridgeButton.setIcon(closedFridgeIcon);
        }
    }

    public static void main(String[] args) {
        new FridgeGUI();
    }
}
