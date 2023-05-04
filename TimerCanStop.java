import java.awt.*;
import javax.swing.*;
public class TimerCanStop extends JLabel implements Runnable {
    private static int hour, min, sec;
    private String newHour, newMin, newSec;
    private boolean paused;
    private synchronized void checkPaused() {
        while (paused) {
            try {
                this.wait();
            }
            catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
    public void pauseThread() {
        this.paused = true;
    }
    public synchronized void resumeThread() {
        paused = false;
        this.notify();
    }
    public boolean getState() {
        return this.paused;
    }
    @Override
    public void run() {
        while (true) {
            checkPaused();
            Font font = new Font("Arial", Font.BOLD, 256);
            setFont(font);
            if (sec==60) {
                sec = 0;
                min += 1;
                if (min==60) {
                    min = 0;
                    hour += 1;
                }
            }
            if (hour<10) {
                newHour = "0"+hour;
            }
            else {
                newHour = ""+hour;
            }
            if (min<10) {
                newMin = "0"+min;
            }
            else {
                newMin = ""+min;
            }
            if (sec<10) {
                newSec = "0"+sec;
            }
            else {
                newSec = ""+sec;
            }
            setText(newHour+":"+newMin+":"+newSec);
            int time = 1000;
            try {
                Thread.sleep(time);
            } catch (InterruptedException ex) {
            }
            sec += 1;
        }
    }
}
