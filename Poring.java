import java.awt.*;
import java.net.URL;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Toolkit;
import java.awt.Dimension;
import java.util.Random;
public class Poring implements MouseListener {
    private static int num;
    private JFrame fr;
    private JLabel lImg, ltxt;
    public Poring() {
        this.num += 1;
        fr = new JFrame();
        ImageIcon icon = null;
        URL imageURL = Poring.class.getResource("Sui.jpg");
        if (imageURL != null) {
            icon = new ImageIcon(imageURL);
        }
        Image img = icon.getImage();
        Image newImg = img.getScaledInstance(125,100,Image.SCALE_SMOOTH);
        icon = new ImageIcon(newImg);
        lImg = new JLabel(icon);
        ltxt = new JLabel(this.num+"");
        lImg.addMouseListener(this);
        fr.setLayout(new FlowLayout());
        
        fr.add(lImg);
        fr.add(ltxt);
        fr.pack();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Random random = new Random();
        int intx = random.nextInt(screenSize.width - fr.getWidth());
        int inty = random.nextInt(screenSize.height - fr.getHeight());
        fr.setLocation(intx, inty);
        fr.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        fr.setResizable(false);
        fr.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        num -= 1;
        fr.dispose();
    }
    @Override
    public void mousePressed(MouseEvent e) {}
    @Override
    public void mouseReleased(MouseEvent e) {}
    @Override
    public void mouseEntered(MouseEvent e) {}
    @Override
    public void mouseExited(MouseEvent e) {}
}
