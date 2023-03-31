import java.awt.*;
import javax.swing.*;
public class CalculatorTwoGUI {
    private JFrame fr;
    private JPanel p;
    private JTextField tf;
    private JButton b7, b8, b9, plus, b4, b5, b6, del, b1, b2, b3, mul, b0, cle, eq, div;
    private JButton[] b = {b7, b8, b9, plus, b4, b5, b6, del, b1, b2, b3, mul, b0, cle, eq, div};
    private String[] s = {"7", "8", "9", "+", "4", "5", "6", "-", "1", "2", "3", "x", "0", "c", "=", "/"};
    public CalculatorTwoGUI () {
        fr = new JFrame();
        p = new JPanel();
        tf = new JTextField(32);
        b = new JButton[16];
        for (int i=0; i<b.length; i++) {
            b[i] = new JButton(s[i]);
        }
        p.setLayout(new GridLayout(4,4));
        for (int i=0; i<b.length; i++) {
            p.add(b[i]);
        }
        fr.setLayout(new BorderLayout());
        fr.add(tf, BorderLayout.NORTH);
        fr.add(p);
        fr.setSize(200,200);
        fr.setResizable(false);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
}
