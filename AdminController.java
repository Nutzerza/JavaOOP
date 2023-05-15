import java.awt.Color;
import java.awt.event.*;
public class AdminController implements MouseListener, ActionListener {
    private AdminView av;
    private CheckStockView csv;
    public AdminController(AdminView av) {
        this.av = av;
        csv = new CheckStockView();
        init();
    }
    public void init() {
        av.getlPic().addMouseListener(this);
        av.getmiLogout().addActionListener(this);
        av.getlMain().addMouseListener(this);
        av.getlCheckStock().addMouseListener(this);
        av.getlCashier().addMouseListener(this);
        av.getlPromotion().addMouseListener(this);
        av.getlLogo().addMouseListener(this);
        av.getfr().add(csv.getDP());
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource().equals(av.getlPic())) {
            av.clickPopup();
        }
        else if (e.getSource().equals(av.getlMain())) {
            av.setMainPage();
            csv.getDP().setVisible(false);
        }
        else if (e.getSource().equals(av.getlCheckStock())) {
            av.setCheckStockPage();
            csv.setStandard(false, true, false);
            csv.getDP().setVisible(true);
        }
        else if (e.getSource().equals(av.getlCashier())) {
            av.setCashierPage();
            csv.getDP().setVisible(false);
        }
        else if (e.getSource().equals(av.getlPromotion())) {
            av.setPromotionPage();
            csv.getDP().setVisible(false);
        }
        else if (e.getSource().equals(av.getlLogo())) {
            av.setMainPage();
        }
    }
    @Override
    public void mousePressed(MouseEvent e) {}
    @Override
    public void mouseReleased(MouseEvent e) {}
    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource().equals(av.getlPic())) {
            av.setlPic(Color.GRAY);
        }
        else if (e.getSource().equals(av.getlMain())) {
            av.setlMain(Color.GRAY);
        }
        else if (e.getSource().equals(av.getlCheckStock())) {
            av.setlCheckStock(Color.GRAY);
        }
        else if (e.getSource().equals(av.getlCashier())) {
            av.setlCashier(Color.GRAY);
        }
        else if (e.getSource().equals(av.getlPromotion())) {
            av.setlPromotion(Color.GRAY);
        }
    }
    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource().equals(av.getlPic())) {
            av.setlPic(new Color(102,178,255));
        }
        else if (e.getSource().equals(av.getlMain())) {
            av.setlMain(Color.WHITE);
        }
        else if (e.getSource().equals(av.getlCheckStock())) {
            av.setlCheckStock(Color.WHITE);
        }
        else if (e.getSource().equals(av.getlCashier())) {
            av.setlCashier(Color.WHITE);
        }
        else if (e.getSource().equals(av.getlPromotion())) {
            av.setlPromotion(Color.WHITE);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(av.getmiLogout())) {
            av.getfr().dispose();
            new LoginAdminView();
        }
    }
}
