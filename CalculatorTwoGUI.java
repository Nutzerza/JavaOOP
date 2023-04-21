import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Arrays;
public class CalculatorTwoGUI implements ActionListener {
    private JFrame fr;
    private JTextField tf;
    private JPanel p;
    private JButton b7, b8, b9, bpl, b4, b5, b6, bmi, b1, b2, b3, bmu, b0, bc, be, bdi;
    private JButton[] b = {b7, b8, b9, bpl, b4, b5, b6, bmi, b1, b2, b3, bmu, b0, bc, be, bdi};
    private String[] tb = {"7", "8", "9", "+", "4", "5", "6", "-", "1", "2", "3", "x", "0", "c", "=", "/"};
    private String ope, num;
    public CalculatorTwoGUI() {
        fr = new JFrame("My Calculator");
        tf = new JTextField();
        p = new JPanel();
        fr.setLayout(new BorderLayout());
        p.setLayout(new GridLayout(4,4));
        for (int i=0; i<b.length; i++) {
            b[i]  = new JButton(tb[i]);
            b[i].addActionListener(this);
            p.add(b[i]);
        }
        fr.add(tf, BorderLayout.NORTH);
        fr.add(p);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(300,300);
        fr.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(b[8])) {
            tf.setText(tf.getText()+"1");
        }
        else if (ae.getSource().equals(b[9])) {
            tf.setText(tf.getText()+"2");
        }
        else if (ae.getSource().equals(b[10])) {
            tf.setText(tf.getText()+"3");
        }
        else if (ae.getSource().equals(b[4])) {
            tf.setText(tf.getText()+"4");
        }
        else if (ae.getSource().equals(b[5])) {
            tf.setText(tf.getText()+"5");
        }
        else if (ae.getSource().equals(b[6])) {
            tf.setText(tf.getText()+"6");
        }
        else if (ae.getSource().equals(b[0])) {
            tf.setText(tf.getText()+"7");
        }
        else if (ae.getSource().equals(b[1])) {
            tf.setText(tf.getText()+"8");
        }
        else if (ae.getSource().equals(b[2])) {
            tf.setText(tf.getText()+"9");
        }
        else if (ae.getSource().equals(b[12])) {
            tf.setText(tf.getText()+"0");
        }
        else if (ae.getSource().equals(b[3])) {
            ope = "plu";
            num = tf.getText();
            tf.setText("");
        }
        else if (ae.getSource().equals(b[7])) {
            ope = "min";
            num = tf.getText();
            tf.setText("");
        }
        else if (ae.getSource().equals(b[11])) {
            ope = "mul";
            num = tf.getText();
            tf.setText("");
        }
        else if (ae.getSource().equals(b[15])) {
            ope = "div";
            num = tf.getText();
            tf.setText("");
        }
        else if (ae.getSource().equals(b[13])) {
            tf.setText("");
        }
        else if (ae.getSource().equals(b[14])) {
            if (ope.equals("plu")) {
                tf.setText((Integer.parseInt(num)+Integer.parseInt(tf.getText()))+"");
            }
            else if (ope.equals("min")) {
                tf.setText((Integer.parseInt(num)-Integer.parseInt(tf.getText()))+"");
            }
            else if (ope.equals("mul")) {
                tf.setText((Integer.parseInt(num)*Integer.parseInt(tf.getText()))+"");
            }
            else if (ope.equals("div")) {
                tf.setText((Integer.parseInt(num)/Integer.parseInt(tf.getText()))+"");
            }
        }
    }
    public static void main(String[] args) {
        new CalculatorTwoGUI();
    }
}