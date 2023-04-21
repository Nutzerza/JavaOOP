import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class TellerGUI implements ActionListener {
    private JFrame fr;
    private JPanel p1, p2, p3, p4;
    private JTextField tf1, tf2;
    private JButton b1, b2, b3;
    private JLabel l1, l2;
    private Account ac;
    public TellerGUI() {
        ac = new Account(6000, "");
        fr = new JFrame("Teller GUI");
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        l1 = new JLabel("Balance");
        l2 = new JLabel("Amount");
        tf1 = new JTextField(ac.getBalance()+"");
        tf2 = new JTextField();
        b1 = new JButton("Deposit");
        b2 = new JButton("Withdraw");
        b3 = new JButton("Exit");
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        
        fr.setLayout(new GridLayout(4,1));
        p1.setLayout(new GridLayout(1,2));
        p2.setLayout(new GridLayout(1,2));
        p3.setLayout(new FlowLayout());
        tf1.setEditable(false);
        p1.add(l1);
        p1.add(tf1);
        p2.add(l2);
        p2.add(tf2);
        
        p3.add(b1);
        p3.add(b2);
        p3.add(b3);
        
        fr.add(p1);
        fr.add(p2);
        fr.add(p3);
        fr.add(p4);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(b1)) {
            ac.deposit(Integer.parseInt(tf2.getText()));
            tf1.setText(ac.getBalance()+"");
        }
        else if (ae.getSource().equals(b2)) {
            ac.withdraw(Integer.parseInt(tf2.getText()));
            tf1.setText(ac.getBalance()+"");
        }
        else if (ae.getSource().equals(b3)) {
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        new TellerGUI();
    }
}
