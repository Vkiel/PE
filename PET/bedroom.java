import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class bedroom extends JFrame {

    private JFrame frame = new JFrame();
    private JLabel label = new JLabel();

    public bedroom() {

        setTitle("CATivating Life");
        setSize(1200, 800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        ImageIcon arrow = new ImageIcon("arrowtest.png");
        ImageIcon arrowLeft = new ImageIcon("arrowtestleft.png");
        ImageIcon cat = new ImageIcon("lounging_pusheen.gif");

        ImageIcon backgroundImage = new ImageIcon("bedroomm.png");
        Image img = backgroundImage.getImage();
        Image scaledImg = img.getScaledInstance(getWidth(), getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledBackgroundImage = new ImageIcon(scaledImg);
        JLabel backgroundLabel = new JLabel(scaledBackgroundImage);
        setContentPane(backgroundLabel);

        JButton button = new JButton(arrow);
        JButton leftButton = new JButton(arrowLeft);
        JButton catt = new JButton(cat);

        button.setBounds(1000, 600, 150, 150);

        leftButton.setBounds(25, 600, 150, 150);

        catt.setBounds(500, 500, 200, 150);

        catt.setBackground(null);
        catt.setBorderPainted(false);
        catt.setContentAreaFilled(false);
        add(catt);

        button.setBackground(null);
        button.setBorderPainted(false);
        button.setContentAreaFilled(false);
        add(button);

        leftButton.setBackground(null);
        leftButton.setBorderPainted(false);
        leftButton.setContentAreaFilled(false);
        add(leftButton);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new bathroom();
            }
        });

        leftButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new gaming();
            }
        });

        setVisible(true);
    }

}

/*
 * import java.awt.BorderLayout;
 * import java.awt.Font;
 * import java.awt.Image;
 * import java.awt.event.ActionEvent;
 * import java.awt.event.ActionListener;
 * 
 * import javax.swing.ImageIcon;
 * import javax.swing.JButton;
 * import javax.swing.JFrame;
 * import javax.swing.JLabel;
 * import javax.swing.JPanel;
 * 
 * public class bedroom implements ActionListener {
 * JFrame frame = new JFrame();
 * JLabel label = new JLabel();
 * JLabel imageLabel;
 * JButton button = new JButton("try");
 * JButton leftButton = new JButton();
 * 
 * bedroom() {
 * 
 * JPanel redpanel = new JPanel();
 * redpanel.setBounds(1000, 600, 150, 150);
 * redpanel.setLayout(new BorderLayout());
 * 
 * JPanel greenpanel = new JPanel();
 * greenpanel.setBounds(25, 600, 150, 150);
 * greenpanel.setLayout(new BorderLayout());
 * 
 * ImageIcon arrow = new ImageIcon("arrowtest.png");
 * ImageIcon icon = new ImageIcon("bedroom.png");
 * ImageIcon arrowLeft = new ImageIcon("arrowtestleft.png");
 * ImageIcon resizedIcon = resizeIcon(icon, 1200, 800);
 * 
 * imageLabel = new JLabel(resizedIcon);
 * imageLabel.setBounds(0, 0, 1200, 800);
 * 
 * label.setText("hi");
 * label.setBounds(1000, 0, 100, 50);
 * label.setFont(new Font(null, Font.PLAIN, 25));
 * label.setIcon(arrow);
 * frame.add(imageLabel);
 * button.setIcon(arrow);
 * label.setIcon(arrowLeft);
 * leftButton.setIcon(arrowLeft);
 * 
 * frame.add(label);
 * 
 * frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 * frame.setSize(1200, 800);
 * frame.setLayout(null);
 * redpanel.add(button);
 * frame.setVisible(true);
 * greenpanel.add(leftButton);
 * 
 * frame.add(redpanel);
 * frame.getContentPane().add(redpanel);
 * frame.add(greenpanel);
 * frame.getContentPane().add(greenpanel);
 * 
 * button.addActionListener(new ActionListener() {
 * 
 * @Override
 * public void actionPerformed(ActionEvent e) {
 * frame.dispose();
 * bathroom bath = new bathroom();
 * 
 * }
 * });
 * leftButton.addActionListener(new ActionListener() {
 * 
 * @Override
 * public void actionPerformed(ActionEvent e) {
 * frame.dispose();
 * gaming games = new gaming();
 * 
 * }
 * });
 * 
 * }
 * 
 * private ImageIcon resizeIcon(ImageIcon icon, int width, int height) {
 * Image img = icon.getImage();
 * Image resizedImg = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
 * return new ImageIcon(resizedImg);
 * }
 * }
 * 
 */