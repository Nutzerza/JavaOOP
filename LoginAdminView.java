import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class LoginAdminView implements ActionListener{
    private JFrame fr;
    private JLabel lUserName, lPassword, lExit;
    private JTextField tfUserName;
    private JPasswordField pfPassword;
    private JPanel pLeft, pExit, pUsername, pPassword, pbLogin;
    private JButton bLogin;
    public LoginAdminView() {
        fr = new JFrame();
        lUserName =  new JLabel("Username    ");
        tfUserName = new JTextField(15);
        lPassword = new JLabel("Password    ");
        pfPassword = new JPasswordField(15);
        pLeft = new JPanel();
        pExit = new JPanel();
        pUsername = new JPanel();
        pPassword = new JPanel();
        pbLogin = new JPanel();
        bLogin = new JButton("Login");
        lExit = new JLabel("X");
        Font fontExit = new Font("TimesNewRoman", Font.CENTER_BASELINE, 16);
        lExit.setFont(fontExit);
        
        pLeft.setSize(new Dimension(350,600));
        pLeft.setBounds(0, 0, 400, 600);
        pLeft.setBackground(new Color(125, 232, 232));
        
        pExit.add(lExit);
        pExit.setSize(new Dimension(40,30));
        pExit.setBounds(750, 0, 40, 30);
        pExit.setBackground(new Color(125, 232, 232));
        
        Font fontText = new Font("Arial", Font.PLAIN, 18);
        lUserName.setFont(fontText);
        tfUserName.setFont(fontText);
        pUsername.setLayout(new FlowLayout());
        pUsername.add(lUserName);
        pUsername.add(tfUserName);
        pUsername.setSize(new Dimension(350,40));
        pUsername.setBounds(425, 175, 350, 40);
        
        lPassword.setFont(fontText);
        pfPassword.setFont(fontText);
        pPassword.setLayout(new FlowLayout());
        pPassword.add(lPassword);
        pPassword.add(pfPassword);
        pPassword.setSize(new Dimension(350,40));
        pPassword.setBounds(425, 225, 350, 40);
        
        bLogin.setFont(fontText);
        pbLogin.add(bLogin);
        pbLogin.setSize(new Dimension(100,75));
        pbLogin.setBounds(550, 275, 100, 75);
        
        fr.add(pLeft);
        fr.add(pExit);
        fr.add(pUsername);
        fr.add(pPassword);
        fr.add(pbLogin);
        
        fr.setUndecorated(true);
        fr.getContentPane().setBackground(Color.WHITE);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(new Dimension(800,500));
        fr.setLayout(null);
        fr.setLocationRelativeTo(null);
        fr.setVisible(true);
    }
  
    public static void main(String[] args) {
        new LoginAdminView();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
//        if (e.getSource().equals()) {
//            System.exit(0);
//        }
    }
}
