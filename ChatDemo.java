import java.awt.*;
import java.awt.event.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.*;
import java.io.*;
public class ChatDemo implements ActionListener, WindowListener {
    private JButton submit, reset;
    private JFrame fr;
    private JPanel p;
    private JTextArea ta;
    private JTextField tf;
    private String txt;
    public ChatDemo() {
        submit = new JButton("Submit");
        reset = new JButton("Reset");
        fr = new JFrame();
        p = new JPanel();
        ta = new JTextArea(20, 45);
        tf = new JTextField(45);
        submit.addActionListener(this);
        reset.addActionListener(this);
        fr.addWindowListener(this);
        ta.setEditable(false);
        p.setLayout(new FlowLayout());
        p.add(submit);
        p.add(reset);
        fr.add(ta, BorderLayout.NORTH);
        fr.add(tf);
        fr.add(p, BorderLayout.SOUTH);
        
        fr.pack();
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(submit)) {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            if (ta.getText().equals("")) {
                txt = dtf.format(LocalDateTime.now())+" "+tf.getText();
                ta.setText(txt);
            } else {
                txt = ta.getText()+"\n"+dtf.format(LocalDateTime.now())+" "+tf.getText();
                ta.setText(txt);
            }
            tf.setText("");
        } else if (ae.getSource().equals(reset)) {
            ta.setText("");
            txt = "";
        }
    }
    public static void main(String[] args) {
        new ChatDemo();
    }

    @Override
    public void windowOpened(WindowEvent we) {
        try (FileReader fr = new FileReader("ChatDemo.dat")){
            int ch;
            String str = "";
            while ((ch=fr.read())!=-1) {
                str += (char)ch;
            }
            ta.setText(str);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    @Override
    public void windowClosing(WindowEvent we) {
        try (FileWriter fw = new FileWriter("ChatDemo.dat"); ) {
            for (int i = 0; i<ta.getText().length(); i++) {
                fw.write(ta.getText().charAt(i));
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    @Override
    public void windowClosed(WindowEvent we) {}
    @Override
    public void windowIconified(WindowEvent we) {}
    @Override
    public void windowDeiconified(WindowEvent we) {}
    @Override
    public void windowActivated(WindowEvent we) {}
    @Override
    public void windowDeactivated(WindowEvent we) {}
}