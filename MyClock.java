
import java.awt.*;
import java.util.*;
import javax.swing.*;
public class MyClock extends JLabel implements Runnable {
    private String newHour, newMin, newSec;
    
    @Override
    public void run() {
        while(true) {
            Calendar d = Calendar.getInstance();
            int sec = d.get(Calendar.SECOND);
            int min = d.get(Calendar.MINUTE);
            int hour = d.get(Calendar.HOUR_OF_DAY);
            Font font = new Font("Arial", Font.BOLD, 256);
            setFont(font);
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
            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
