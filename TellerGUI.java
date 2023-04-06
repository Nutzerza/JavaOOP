import java.awt.*;
import javax.swing.*;
public class TellerGUI {
    private JFrame fr;
    private JPanel p1, p2;
    private JTextField tf1, tf2;
    private JButton b1, b2, b3;
    private JLabel l1, l2;
    public TellerGUI() {
        fr = new JFrame("Teller GUI");
        p1 = new JPanel();
        p2 = new JPanel();
        l1 = new JLabel("Balance");
        l2 = new JLabel("Amount");
        tf1 = new JTextField("6000", 64);
        tf2 = new JTextField(64);
        b1 = new JButton("Deposit");
        b2 = new JButton("Withdraw");
        b3 = new JButton("Exit");
        fr.setLayout(new BorderLayout());
        tf1.setEditable(false);
        p1.setLayout(new GridLayout(2,2));
        p2.setLayout(new FlowLayout());
        p1.add(l1);
        p1.add(tf1);
        p1.add(l2);
        p1.add(tf2);
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        fr.add(p1, BorderLayout.NORTH);
        fr.add(p2);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(275,150);
        fr.setVisible(true);
    }
}
