import java.awt.*;
import javax.swing.*;
public class CalculatorTwoGUI {
    private JFrame fr;
    private JTextField tf;
    private JPanel p;
    private JButton b7, b8, b9, bpl, b4, b5, b6, bmi, b1, b2, b3, bmu, b0, bc, be, bdi;
    private JButton[] b = {b7, b8, b9, bpl, b4, b5, b6, bmi, b1, b2, b3, bmu, b0, bc, be, bdi};
    private String[] tb = {"7", "8", "9", "+", "4", "5", "6", "-", "1", "2", "3", "x", "0", "c", "=", "/"};
    public CalculatorTwoGUI() {
        fr = new JFrame("My Calculator");
        tf = new JTextField();
        p = new JPanel();
        fr.setLayout(new BorderLayout());
        p.setLayout(new GridLayout(4,4));
        for (int i=0; i<b.length; i++) {
            b[i]  = new JButton(tb[i]);
            p.add(b[i]);
        }
        fr.add(tf, BorderLayout.NORTH);
        fr.add(p);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(300,300);
        fr.setVisible(true);
    }
}