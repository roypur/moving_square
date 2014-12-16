import javax.swing.JComponent;
import java.awt.Graphics;
public class TestComp extends JComponent {
    private int y = 0;
    private int x = 0;
    private int dx = 0, dy = 0;
    private static final int WIDTH = 20, HEIGHT = 20; 
    
    public void paintComponent(Graphics g) {
        x += dx;
        y += dy;
        g.fillRect(x, y, WIDTH, HEIGHT);
            }

    public void readKey(String key) {
        switch (key) {
        case "A": dx = -3;
            break;
        case "D": dx = 3;
            break;
        case "W": dy = -3;
            break;
        case "S": dy = 3;
            break;
        default: break;
        }
        repaint();
    }
    public void releaseKey(String key) {
        switch (key) {
        case "A": dx = 0;
            break;
        case "D": dx = 0;
            break;
        case "W": dy = 0;
            break;
        case "S": dy = 0;
            break;
        default: break;
        }
        repaint();
    }

    public void startMove() {
    }
    
    public void stopMove() {
    }
}
