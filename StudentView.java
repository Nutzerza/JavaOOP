import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
public class StudentView implements ActionListener, WindowListener {
    private JButton deposit, withdraw;
    private JFrame fr;
    private JPanel p1, pButton;
    private JTextField tfID, tfName, tfMoney;
    private JLabel l1, l2, l3;
    private Student st;
    public StudentView() {
        deposit = new JButton("Deposit");
        withdraw = new JButton("Withdraw");
        fr = new JFrame();
        l1 = new JLabel("ID :");
        l2 = new JLabel("Name :");
        l3 = new JLabel("Money :");
        p1 = new JPanel();
        pButton = new JPanel();
        tfID = new JTextField();
        tfName = new JTextField();
        tfMoney = new JTextField("0");
        st = new Student();
        
        p1.setLayout(new GridLayout(3,2));
        pButton.setLayout(new FlowLayout());
        tfMoney.setEditable(false);
        deposit.addActionListener(this);
        withdraw.addActionListener(this);
        fr.addWindowListener(this);
        
        p1.add(l1);
        p1.add(tfID);
        p1.add(l2);
        p1.add(tfName);
        p1.add(l3);
        p1.add(tfMoney);
        pButton.add(deposit);
        pButton.add(withdraw);
        fr.add(p1, BorderLayout.NORTH);
        fr.add(pButton);
        fr.pack();
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
    public static void main(String[] args) {
        new StudentView();
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(withdraw)) {
            if (st.getMoney()>0) {
                st.setMoney(st.getMoney()-100);
            tfMoney.setText(""+st.getMoney());
            }
        }
        else if (ae.getSource().equals(deposit)) {
            st.setMoney(st.getMoney()+100);
            tfMoney.setText(""+st.getMoney());
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
        try (FileInputStream fin = new FileInputStream("StudentM.dat");
            ObjectInputStream oin = new ObjectInputStream(fin)) {
            st = (Student) oin.readObject();
            tfID.setText(""+st.getID());
            tfName.setText(st.getName());
            tfMoney.setText(""+st.getMoney());
        } catch (IOException ex) {
//            ex.printStackTrace();
        } catch (ClassNotFoundException c) {
//            c.printStackTrace();
        }
    }
    @Override
    public void windowClosing(WindowEvent e) {
        try (FileOutputStream fout = new FileOutputStream("StudentM.dat"); 
            ObjectOutputStream oout = new ObjectOutputStream(fout); ) {
            st.setID(Integer.parseInt(tfID.getText()));
            st.setName(tfName.getText());
            oout.writeObject(st);
        } catch(IOException ex) {
            ex.printStackTrace();
        }
    }
    @Override
    public void windowClosed(WindowEvent e) {}
    @Override
    public void windowIconified(WindowEvent e) {}
    @Override
    public void windowDeiconified(WindowEvent e) {}
    @Override
    public void windowActivated(WindowEvent e) {}
    @Override
    public void windowDeactivated(WindowEvent e) {}
}