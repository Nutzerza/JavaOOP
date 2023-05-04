
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class MyTimerStop implements MouseListener {
    private TimerCanStop timer;
    public MyTimerStop() {
        JFrame fr = new JFrame();
        timer = new TimerCanStop();
        Thread t = new Thread(timer);
        t.start();
        timer.addMouseListener(this);
        fr.add(timer);
        fr.setPreferredSize(new Dimension(1050, 300));
        fr.pack();
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String args[]) {
        new MyTimerStop();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (timer.getState()) {
            timer.resumeThread();
        }
        else {
            timer.pauseThread();
        }
    }
    @Override
    public void mousePressed(MouseEvent e) {}
    @Override
    public void mouseReleased(MouseEvent e) {}
    @Override
    public void mouseEntered(MouseEvent e) {}
    @Override
    public void mouseExited(MouseEvent e) {}
}
