import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class CalculatorOneGUI implements ActionListener {
    private JFrame fr;
    private JPanel p;
    private JButton b1, b2, b3, b4;
    private JTextField tf1, tf2, tf3;
    private JButton[] b = {b1, b2, b3, b4};
    private String[] bs = {"Plus", "Minus", "Multiply", "Divide"};
    public CalculatorOneGUI() {
        fr = new JFrame("Calculator");
        p = new JPanel();
        fr.setLayout(new GridLayout(4, 1));
        p.setLayout(new FlowLayout());
        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField();
        for (int i=0; i<b.length; i++) {
            b[i] = new JButton(bs[i]);
            b[i].addActionListener(this);
            p.add(b[i]);
        }
        fr.add(tf1);
        fr.add(tf2);
        fr.add(p);
        fr.add(tf3);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(b[0])) {
            tf3.setText(""+(Integer.parseInt(tf1.getText()) + Integer.parseInt(tf2.getText())));
        }
        else if (ae.getSource().equals(b[1])) {
            tf3.setText(""+(Integer.parseInt(tf1.getText()) - Integer.parseInt(tf2.getText())));
        }
        else if (ae.getSource().equals(b[2])) {
            tf3.setText(""+(Integer.parseInt(tf1.getText()) * Integer.parseInt(tf2.getText())));
        }
        else if (ae.getSource().equals(b[3])) {
            tf3.setText(""+(Integer.parseInt(tf1.getText()) / Integer.parseInt(tf2.getText())));
        }
    }
    public static void main(String[] args) {
        new CalculatorOneGUI();
    }
}