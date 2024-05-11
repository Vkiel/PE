import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class storeKit extends JFrame {

    storeKit() {

        setTitle("CATivating Life Mini Games Interface");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        ImageIcon backgroundImage = new ImageIcon("gamebg.jpg");
        Image img = backgroundImage.getImage();
        Image scaledImg = img.getScaledInstance(getWidth(), getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledBackgroundImage = new ImageIcon(scaledImg);
        JLabel backgroundLabel = new JLabel(scaledBackgroundImage);
        setContentPane(backgroundLabel);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 650);
        this.setLayout(new FlowLayout());

    }

}
