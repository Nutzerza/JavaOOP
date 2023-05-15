import java.awt.*;
import java.awt.event.*;
public class CheckStockController implements MouseListener {
    public CheckStockView csv;
    public AddProduct ap;
    public CheckStockController(CheckStockView csv) {
        this.csv = csv;
        ap = new AddProduct();
        csv.getifNewP().add(ap.getpfr());
        init();
    }
    public void init() {
        csv.getLNew().addMouseListener(this);
        csv.getLOld().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource().equals(csv.getLNew())) {
            csv.setNewBofNewp(true);
            csv.setIPVisible(false, true);
        } else if (e.getSource().equals(csv.getLOld())) {
            
        }
    }
    @Override
    public void mousePressed(MouseEvent e) {}
    @Override
    public void mouseReleased(MouseEvent e) {}
    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource().equals(csv.getLNew())) {
            csv.setLNewColor(Color.GRAY);
        } else if (e.getSource().equals(csv.getLOld())) {
            csv.setLOldColor(Color.GRAY);
        }
    }
    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource().equals(csv.getLNew())) {
            csv.setLNewColor(Color.WHITE);
        } else if (e.getSource().equals(csv.getLOld())) {
            csv.setLOldColor(Color.WHITE);
        }
    }
}
