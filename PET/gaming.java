import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class gaming extends JFrame {

    private games_face gamesFaceWindow;

    public gaming() {
        setTitle("CATivating Life");
        setSize(1200, 800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        ImageIcon arrow = new ImageIcon("arrowtest.png");
        ImageIcon arrowLeft = new ImageIcon("arrowtestleft.png");
        ImageIcon cat = new ImageIcon("hearts_pusheen.gif");
        ImageIcon miniGameSc = new ImageIcon("gameover.jpg");

        ImageIcon backgroundImage = new ImageIcon("gameroom.png");
        Image img = backgroundImage.getImage();
        Image scaledImg = img.getScaledInstance(getWidth(), getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledBackgroundImage = new ImageIcon(scaledImg);
        JLabel backgroundLabel = new JLabel(scaledBackgroundImage);
        setContentPane(backgroundLabel);

        JButton button = new JButton(arrow);
        JButton leftButton = new JButton(arrowLeft);
        JButton catt = new JButton(cat);
        JButton Screen = new JButton(miniGameSc);

        button.setBounds(1000, 600, 150, 150);
        leftButton.setBounds(25, 600, 150, 150);
        catt.setBounds(500, 550, 180, 160);
        Screen.setBounds(150, 380, 110, 100);

        catt.setBackground(null);
        catt.setBorderPainted(false);
        catt.setContentAreaFilled(false);

        button.setBackground(null);
        button.setBorderPainted(false);
        button.setContentAreaFilled(false);

        leftButton.setBackground(null);
        leftButton.setBorderPainted(false);
        leftButton.setContentAreaFilled(false);

        add(button);
        add(leftButton);
        add(catt);
        add(Screen);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new bedroom();
            }
        });

        leftButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new start();
            }
        });

        Screen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                gamesFaceWindow = new games_face();
                gamesFaceWindow.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosed(WindowEvent e) {

                        gamesFaceWindow = null;
                    }
                });
            }
        });

        setVisible(true);
    }

}

/*
 * TO DO LIST:
 * 
 * // still need to add the game button from the previous code for the
 * mini-game/s.
 * // need to resize so that the zoom in won't be too much.
 * // add function to the cat or find another one since it has bg need one
 * /without bg
 * // functions for the fridge, bed and bathroom
 * // last but not least the sounds in the game gotta find some
 * // and change the starting button lmao
 * // sprites also (?)
 * // stat bar
 */