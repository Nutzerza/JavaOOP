import java.awt.*;
import javax.swing.*;
public class BookView {
    private JFrame fr;
    private JLabel lName, lPrice, lType;
    private JTextField tfName, tfPrice, tfNum;
    private JButton bAdd, bUpdate, bDelete, bNext, bBack;
    private JPanel p1, p2, p3, p4, p5; 
    private JComboBox cb;
    public BookView() {
        fr = new JFrame();
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        p5 = new JPanel();
        lName = new JLabel("Name");
        lPrice = new JLabel("Price");
        lType = new JLabel("Type");
        tfName = new JTextField();
        tfPrice = new JTextField();
        tfNum = new JTextField("0");
        bAdd = new JButton("Add");
        bUpdate = new JButton("Update");
        bDelete = new JButton("Delete");
        bNext = new JButton(">>>");
        bBack = new JButton("<<<");
        cb = new JComboBox();
        cb.addItem("Gereral");
        cb.addItem("Computer");
        cb.addItem("Math&Sci");
        cb.addItem("Photo");
        fr.setLayout(new GridLayout(5,1));
        p1.setLayout(new GridLayout(1,2));
        p2.setLayout(new GridLayout(1,2));
        p3.setLayout(new GridLayout(1,2));
        p4.setLayout(new FlowLayout());
        p5.setLayout(new FlowLayout());
        p1.add(lName);
        p1.add(tfName);
        p2.add(lPrice);
        p2.add(tfPrice);
        p3.add(lType);
        p3.add(cb);
        p4.add(bBack);
        p4.add(tfNum);
        p4.add(bNext);
        p5.add(bAdd);
        p5.add(bUpdate);
        p5.add(bDelete);
        fr.add(p1);
        fr.add(p2);
        fr.add(p3);
        fr.add(p4);
        fr.add(p5);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
    }
    public JFrame getJFrame() {
        return this.fr;
    }
    public JButton getbAdd() {
        return this.bAdd;
    }
    public JButton getbDelete() {
        return this.bDelete;
    }
    public JButton getbNext() {
        return this.bNext;
    }
    public JButton getbBack() {
        return this.bBack;
    }
    public JTextField gettfNum() {
        return this.tfNum;
    }
    public void settfNum(String t) {
        this.tfNum.setText(t);
    }
    public void settfName(String name) {
        this.tfName.setText(name);
    }
    public void settfPrice(double price) {
        this.tfPrice.setText(""+price);
    }
    public void setcb(String type) {
        this.cb.setSelectedItem(type);
    }
    public void setData(Book b) {
        setData(b.getName(), b.getPrice(), b.getType());
    }
    public void setData(String name, double price, String type) {
        settfName(name);
        settfPrice(price);
        setcb(type);
    }
}
