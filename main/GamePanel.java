import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable{

    public static final int WIDTH = 1280;
    public static final int HEIGHT = 720;
    final int FPS = 60;
    Thread gameThread;

    public GamePanel() {
         
        // Panel Settings
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        this.setBackground(Color.black);
        this.setLayout(null);
    }

    public void launchGame() {
        gameThread = new Thread(this);
        gameThread.start();
    }
    @Override
    public void run() {
        
        // Game Loop (see RyiSnow's video about game loop)
        double drawInterval = 1000000000 / FPS;
        double delta = 0;
        long lastTime = System.nanoTime();
        long currentTime;

        while (gameThread != null) {
            currentTime = System.nanoTime();
            // System.out.println("Current Time: " + currentTime);

            delta += (currentTime - lastTime) / drawInterval;
            lastTime = currentTime;

            if (delta >= 1){
                update();
                repaint();
                delta--;
            }

        }

    }

    private void update() {}

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }

}
