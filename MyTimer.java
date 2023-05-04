import java.awt.*;
import javax.swing.*;
public class MyTimer {

    public static void main(String[] args) {
        JFrame fr = new JFrame();
        TimerCantStop timer = new TimerCantStop();
        Thread t = new Thread(timer);
        t.start();
        fr.add(timer);
        fr.setPreferredSize(new Dimension(1050, 300));
        fr.pack();
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
