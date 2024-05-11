import javax.swing.SwingUtilities;

public class main {
    public static void main(String[] args) {

        LaunchPage launchPage = new LaunchPage();
        SwingUtilities.invokeLater(AttributeBars::new);

    }
}
