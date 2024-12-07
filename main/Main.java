import javax.swing.JFrame;

public class Main {

    // Follow RyiSnow's tutorial
    public static void main(String[] args) {

        JFrame window = new JFrame("Tetris Game");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);

        // Add GamePanel to window
        GamePanel gp = new GamePanel();
        window.add(gp);
        window.pack();

        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}