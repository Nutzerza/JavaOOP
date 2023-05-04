import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class PoringConstructor implements ActionListener {

    private JFrame fr;
    private JButton b;
    private JPanel p;
    public PoringConstructor() {
        fr = new JFrame();
        b = new JButton("Add");
        p = new JPanel();
        b.addActionListener(this);
        p.add(b);
        fr.add(p);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(b)) {
            System.out.println("Kut");
            new Poring();
        }
    }
    public static void main(String[] args) {
        new PoringConstructor();
    }
}
