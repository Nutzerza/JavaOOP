import java.awt.*;
import javax.swing.*;
public class CalculatorOneGUI {
    private JFrame fr;
    private JTextField tf1, tf2, tf3;
    private JPanel p;
    private JButton b1, b2, b3, b4;
    public CalculatorOneGUI() {
        fr = new JFrame("CalculatorOne");
        tf1 = new JTextField(32);
        tf2 = new JTextField(32);
        tf3 = new JTextField(32);
        tf3.setEditable(false);
        p = new JPanel();
        b1 = new JButton("+");
        b2 = new JButton("-");
        b3 = new JButton("*");
        b4 = new JButton("/");
        p.setLayout(new FlowLayout());
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        fr.add(tf1);
        fr.add(tf2);
        fr.add(p);
        fr.add(tf3);
        fr.setSize(275,180);
        fr.setResizable(false);
        fr.setLayout(new GridLayout(4,1));
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
}
