import javax.swing.Timer;
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.KeyStroke;

class Hello  extends JFrame {
    private TestComp comp, box;
    public Hello() {
        
        KeyPress keyIn = new KeyPress();
        
        comp = new TestComp();
        comp.setPreferredSize(new Dimension(20, 20));
        comp.addKeyListener(keyIn);

        box = new TestComp();
        box.setPreferredSize(new Dimension(20, 20));

        setSize(300, 400);
        setTitle("hello");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(box);
        add(comp);
        comp.setFocusable(true);
        box.setPos(10,10);
        comp.setPos(40, 50);
        /*     ActionListener listener = new TimerListener();
        Timer t = new Timer(1000 / 60 , listener);
        t.start();
        */
    }
    
    
    public class KeyPress extends KeyAdapter {
        public void keyPressed(KeyEvent event) {
            String key = KeyStroke.getKeyStrokeForEvent(event).toString();
            System.out.println(key);
            key = key.replace("pressed ", "");
            
            comp.readKey(key);
        }
        public void keyReleased(KeyEvent event) {
            String key = KeyStroke.getKeyStrokeForEvent(event).toString();
            System.out.println(key);
            key = key.replace("released ", "");
            
            comp.releaseKey(key);
        }
    }
}
