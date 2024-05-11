import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class tester {

    JFrame frame = new JFrame();
    JLabel label = new JLabel();
    JButton button = new JButton("hello");
    JButton buttontwo = new JButton("hi");
    JPanel panel = new JPanel();

    tester() {

        JPanel redpanel = new JPanel();
        redpanel.setBounds(1000, 600, 150, 150);
        redpanel.setLayout(new BorderLayout());

        JPanel greenpanel = new JPanel();
        greenpanel.setBounds(25, 600, 150, 150);
        greenpanel.setLayout(new BorderLayout());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setLayout(null);
        frame.setVisible(true);

        button.setBounds(1000, 600, 150, 150);

        frame.add(label);
        redpanel.add(button);
        frame.setVisible(true);
        greenpanel.add(buttontwo);

        frame.add(redpanel);
        frame.getContentPane().add(redpanel);
        frame.add(greenpanel);
        frame.getContentPane().add(greenpanel);
        frame.setResizable(false);

    }

}