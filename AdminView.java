import java.awt.*;
import java.net.URL;
import javax.swing.*;
public class AdminView {
    private JFrame fr;
    private JPopupMenu popup;
    private JPanel pUp, pLeft, pUpLeft;
    private JMenuItem miLogout;
    private JLabel lMain, lCheckStock, lAddStock, lCashier, lPromotion, lLogo, lPic;
    public AdminView() {
        fr = new JFrame();
        pUp = new JPanel();
        pLeft = new JPanel();
        lMain = new JLabel(" Main");
        lCheckStock = new JLabel(" CheckStock");
        lAddStock = new JLabel(" AddStock");
        lCashier = new JLabel(" Cashier");
        lPromotion = new JLabel(" Promotion");
        popup = new JPopupMenu();
        miLogout = new JMenuItem("         Logout");
        
        ImageIcon icon = null;
        URL imageURL = LoginAdminView.class.getResource("Image/logomarket.png");
        if (imageURL != null) {
            icon = new ImageIcon(imageURL);
        }
        Image img = icon.getImage();
        Image newImg = img.getScaledInstance(60,60,Image.SCALE_SMOOTH);
        icon = new ImageIcon(newImg);
        lLogo = new JLabel("CatchCoin", icon, SwingConstants.CENTER);
        ImageIcon icon2 = null;
        URL imageURL2 = LoginAdminView.class.getResource("Image/human.png");
        if (imageURL != null) {
            icon2 = new ImageIcon(imageURL2);
        }
        Image img2 = icon2.getImage();
        Image newImg2 = img2.getScaledInstance(60,50,Image.SCALE_SMOOTH);
        icon = new ImageIcon(newImg2);
        lPic = new JLabel("Hi, Admin1234", icon, SwingConstants.CENTER);
        
        Font font = new Font("Arial", Font.PLAIN, 24);
        Color c = new Color(125, 232, 232);
        Color lc = Color.WHITE;
        lMain.setFont(font);
        lCheckStock.setFont(font);
        lAddStock.setFont(font);
        lCashier.setFont(font);
        lPromotion.setFont(font);
        
        miLogout.setFont(font);
        miLogout.setForeground(Color.RED);
        popup.setPreferredSize(new Dimension(220, 60));
        popup.add(miLogout);
        
        lMain.setBounds(10, 200, 220, 50);
        lCheckStock.setBounds(10, 260, 180, 50);
        lAddStock.setBounds(10, 320, 180, 50);
        lCashier.setBounds(10, 380, 180, 50);
        lPromotion.setBounds(10, 440, 180, 50);
        lMain.setBackground(lc);
        lCheckStock.setBackground(lc);
        lAddStock.setBackground(lc);
        lCashier.setBackground(lc);
        lPromotion.setBackground(lc);
        lMain.setOpaque(true);
        lCheckStock.setOpaque(true);
        lAddStock.setOpaque(true);
        lCashier.setOpaque(true);
        lPromotion.setOpaque(true);
        lMain.setEnabled(false);
        
        lLogo.setBounds(0, 0, 220, 60);
        lLogo.setFont(new Font("Arial", Font.BOLD, 28));
        lLogo.setBackground(new Color(100,149,237));
        lLogo.setOpaque(true);
        
        lPic.setFont(font);
        lPic.setBounds(1000, 0, 220, 60);
        lPic.setBackground(new Color(102,178,255));
        lPic.setOpaque(true);
        
        pUp.setBackground(new Color(102,178,255));
        pUp.setBounds(0, 0, 1250, 60);
        pUp.setLayout(null);
        pUp.add(lPic);
        pUp.add(lLogo);
        
        pLeft.setBackground(new Color(135,206,235));
        pLeft.setBounds(0, 0, 220, 750);
        pLeft.setLayout(null);
        pLeft.add(lMain);
        pLeft.add(lCheckStock);
        pLeft.add(lAddStock);
        pLeft.add(lCashier);
        pLeft.add(lPromotion);
        
        fr.setUndecorated(true);
        fr.add(pUp);
        fr.add(pLeft);
        fr.getContentPane().setBackground(Color.WHITE);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(new Dimension(1250,750));
        fr.setLayout(null);
        fr.setLocationRelativeTo(null);
        fr.setVisible(true);
        new AdminController(this);
    }
//    public static void main(String[] args) {
//        new AdminView();
//    }
    public JLabel getlLogo() {
        return this.lLogo;
    }
    public JLabel getlPic() {
        return this.lPic;
    }
    public JLabel getlMain() {
        return this.lMain;
    }
    public JLabel getlCheckStock() {
        return this.lCheckStock;
    }
    public JLabel getlAddStock() {
        return this.lAddStock;
    }
    public JLabel getlCashier() {
        return this.lCashier;
    }
    public JLabel getlPromotion() {
        return this.lPromotion;
    }
    public JMenuItem getmiLogout() {
        return this.miLogout;
    }
    public JFrame getfr() {
        return this.fr;
    }
    public void clickPopup() {
        popup.show(lPic, 0, lPic.getHeight());
    }
    public void setlPic(Color c) {
        lPic.setBackground(c);
    }
    public void setlMain(Color c) {
        lMain.setBackground(c);
    }
    public void setlCheckStock(Color c) {
        lCheckStock.setBackground(c);
    }
    public void setlAddStock(Color c) {
        lAddStock.setBackground(c);
    }
    public void setlCashier(Color c) {
        lCashier.setBackground(c);
    }
    public void setlPromotion(Color c) {
        lPromotion.setBackground(c);
    }
    public void setMainPage() {
        lMain.setBounds(10, 200, 220, 50);
        lCheckStock.setBounds(10, 260, 180, 50);
        lAddStock.setBounds(10, 320, 180, 50);
        lCashier.setBounds(10, 380, 180, 50);
        lPromotion.setBounds(10, 440, 180, 50);
        lMain.setEnabled(false);
        lCheckStock.setEnabled(true);
        lAddStock.setEnabled(true);
        lCashier.setEnabled(true);
        lPromotion.setEnabled(true);
    }
    public void setCheckStockPage() {
        lMain.setBounds(10, 200, 180, 50);
        lCheckStock.setBounds(10, 260, 220, 50);
        lAddStock.setBounds(10, 320, 180, 50);
        lCashier.setBounds(10, 380, 180, 50);
        lPromotion.setBounds(10, 440, 180, 50);
        lMain.setEnabled(true);
        lCheckStock.setEnabled(false);
        lAddStock.setEnabled(true);
        lCashier.setEnabled(true);
        lPromotion.setEnabled(true);
    }
    public void setAddStockPage() {
        lMain.setBounds(10, 200, 180, 50);
        lCheckStock.setBounds(10, 260, 180, 50);
        lAddStock.setBounds(10, 320, 220, 50);
        lCashier.setBounds(10, 380, 180, 50);
        lPromotion.setBounds(10, 440, 180, 50);
        lMain.setEnabled(true);
        lCheckStock.setEnabled(true);
        lAddStock.setEnabled(false);
        lCashier.setEnabled(true);
        lPromotion.setEnabled(true);
    }
    public void setCashierPage() {
        lMain.setBounds(10, 200, 180, 50);
        lCheckStock.setBounds(10, 260, 180, 50);
        lAddStock.setBounds(10, 320, 180, 50);
        lCashier.setBounds(10, 380, 220, 50);
        lPromotion.setBounds(10, 440, 180, 50);
        lMain.setEnabled(true);
        lCheckStock.setEnabled(true);
        lAddStock.setEnabled(true);
        lCashier.setEnabled(false);
        lPromotion.setEnabled(true);
    }
    public void setPromotionPage() {
        lMain.setBounds(10, 200, 180, 50);
        lCheckStock.setBounds(10, 260, 180, 50);
        lAddStock.setBounds(10, 320, 180, 50);
        lCashier.setBounds(10, 380, 180, 50);
        lPromotion.setBounds(10, 440, 220, 50);
        lMain.setEnabled(true);
        lCheckStock.setEnabled(true);
        lAddStock.setEnabled(true);
        lCashier.setEnabled(true);
        lPromotion.setEnabled(false);
    }
}
