import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.Timer;

public class AttributeBars extends JFrame {
    private JProgressBar hungerBar;
    private JProgressBar hygieneBar;
    private JProgressBar energyBar;
    private Timer timer;

    public AttributeBars() {
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        JLabel hungerLabel = new JLabel("Hunger:");
        JLabel hygieneLabel = new JLabel("Health:");
        JLabel energyLabel = new JLabel("Energy:");

        hungerBar = new JProgressBar(0, 100);
        hygieneBar = new JProgressBar(0, 100);
        energyBar = new JProgressBar(0, 100);

        hungerBar.setValue(100);
        hygieneBar.setValue(100);
        energyBar.setValue(100);

        add(hungerLabel);
        add(hungerBar);
        add(hygieneLabel);
        add(hygieneBar);
        add(energyLabel);
        add(energyBar);

        timer = new Timer(5000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                decreaseBars();
            }
        });
        timer.start();

        setVisible(true);
    }

    private void decreaseBars() {
        int hungerValue = hungerBar.getValue();
        int healthValue = hygieneBar.getValue();
        int energyValue = energyBar.getValue();

        hungerValue -= 5;
        healthValue -= 3;
        energyValue -= 2;

        hungerValue = Math.max(0, hungerValue);
        healthValue = Math.max(0, healthValue);
        energyValue = Math.max(0, energyValue);

        hungerBar.setValue(hungerValue);
        hygieneBar.setValue(healthValue);
        energyBar.setValue(energyValue);
    }

}
