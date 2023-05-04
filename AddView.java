import javax.swing.*;
import java.awt.*;
public class AddView {
    private JFrame fr;
    private JPanel p1, p2, p3, p4;
    private JButton bInsert;
    private JLabel lName, lPrice, lType;
    private JTextField tfName, tfPrice;
    private JComboBox cb;
    public AddView() {
        fr = new JFrame("BookAdd");
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        bInsert = new JButton("Insert");
        lName = new JLabel("Name");
        lPrice = new JLabel("Price");
        lType = new JLabel("Type");
        tfName = new JTextField();
        tfPrice = new JTextField();
        cb = new JComboBox();
        cb.addItem("Gereral");
        cb.addItem("Computer");
        cb.addItem("Math&Sci");
        cb.addItem("Photo");
        fr.setLayout(new GridLayout(4,1));
        p1.setLayout(new GridLayout(1,2));
        p2.setLayout(new GridLayout(1,2));
        p3.setLayout(new GridLayout(1,2));
        p4.setLayout(new FlowLayout());
        
        p1.add(lName);
        p1.add(tfName);
        p2.add(lPrice);
        p2.add(tfPrice);
        p3.add(lType);
        p3.add(cb);
        p4.add(bInsert);
        fr.add(p1);
        fr.add(p2);
        fr.add(p3);
        fr.add(p4);
        fr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        fr.setResizable(false);
        fr.setSize(300, 150);
        fr.setVisible(true);
    }
    public JFrame getJFrame() {
        return this.fr;
    }
    public JButton getbInsert() {
        return this.bInsert;
    }
    public JTextField gettfName() {
        return this.tfName;
    }
    public JTextField gettfPrice() {
        return this.tfPrice;
    }
    public JComboBox getCombBox() {
        return this.cb;
    }
}
