import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class bathroom extends JFrame {

  private JFrame frame = new JFrame();
  private JLabel label = new JLabel();

  public bathroom() {

    setTitle("CATivating Life");
    setSize(1200, 800);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setResizable(false);

    ImageIcon arrow = new ImageIcon("arrowtest.png");
    ImageIcon arrowLeft = new ImageIcon("arrowtestleft.png");
    ImageIcon cat = new ImageIcon("sad_pusheen.gif");
    ImageIcon litter = new ImageIcon("lutter.png");

    ImageIcon backgroundImage = new ImageIcon("ba.png");
    Image img = backgroundImage.getImage();
    Image scaledImg = img.getScaledInstance(getWidth(), getHeight(), Image.SCALE_SMOOTH);
    ImageIcon scaledBackgroundImage = new ImageIcon(scaledImg);
    JLabel backgroundLabel = new JLabel(scaledBackgroundImage);
    setContentPane(backgroundLabel);

    JButton button = new JButton(arrow);
    JButton leftButton = new JButton(arrowLeft);
    JButton catt = new JButton(cat);
    JButton lit = new JButton(litter);

    lit.setBounds(200, 500, 200, 200);

    button.setBounds(1000, 600, 150, 150);

    leftButton.setBounds(25, 600, 150, 150);

    catt.setBounds(400, 500, 150, 170);

    lit.setBackground(null);
    lit.setBorderPainted(false);
    lit.setContentAreaFilled(false);
    add(lit);

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
        new kitchen();
      }
    });

    leftButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        dispose();
        new bedroom();
      }
    });

    setVisible(true);
  }

}