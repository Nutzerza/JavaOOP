import java.awt.*;
import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameUI;
public class CheckStockView {
    private JPanel p;
    private JLabel lOld, lNew;
    private JDesktopPane dp;
    private JInternalFrame ifTable, ifNewP;
    public CheckStockView() {
        dp = new JDesktopPane();
        ifTable = new JInternalFrame("Increase Amount", false, false, false, false);
        ifNewP = new JInternalFrame("Add New Product", false, false, false, false);
        
        lOld = new JLabel(" Increase Amount");
        lNew = new JLabel(" Add New Product");
        
        Font font = new Font("Arial", Font.PLAIN, 24);
        lOld.setBounds(600, 10, 200, 50);
        lOld.setFont(font);
        lOld.setBackground(Color.WHITE);
        lOld.setOpaque(true);
        
        lNew.setBounds(810, 10, 200, 50);
        lNew.setFont(font);
        lNew.setBackground(Color.WHITE);
        lNew.setOpaque(true);
        
        BasicInternalFrameUI ui = (BasicInternalFrameUI) ifTable.getUI();
        ui.setNorthPane(null);
        ifTable.setBorder(null);
        ifTable.setBounds(0, 70, 1030, 610);
        ifTable.setVisible(true);
        
        BasicInternalFrameUI ui2 = (BasicInternalFrameUI) ifNewP.getUI();
        ui2.setNorthPane(null);
        ifNewP.setBorder(null);
        ifNewP.setBounds(0, 70, 1030, 610);
        ifNewP.setVisible(false);
        
        ifTable.setBackground(Color.WHITE);
        ifNewP.setBackground(Color.red);
        
        dp.add(lOld);
        dp.add(lNew);
        dp.add(ifTable);
        dp.add(ifNewP);
        
        dp.setLayout(null);
        dp.setBackground(new Color(206,224,230));
        dp.setBounds(220, 60, 1030, 690);
        dp.setVisible(false);
        new CheckStockController(this);
    }
    public void setNewBofNewp(boolean b) {
        if (b) {
            lNew.setEnabled(false);
            lNew.setBounds(810, 10, 200, 60);
        }
        else {
            lNew.setBounds(810, 10, 200, 50);
        }
    }
    public JDesktopPane getDP() {
        return this.dp;
    }
    public JInternalFrame getifTable() {
        return this.ifTable;
    }
    public JInternalFrame getifNewP() {
        return this.ifNewP;
    }
    public JLabel getLNew() {
        return this.lNew;
    }
    public JLabel getLOld() {
        return this.lOld;
    }
    public void setIPVisible(boolean bTable, boolean bNew) {
        this.ifTable.setVisible(bTable);
        this.ifNewP.setVisible(bNew);
    }
    public void setLNewColor(Color c) {
        lNew.setBackground(c);
    }
    public void setLOldColor(Color c) {
        lOld.setBackground(c);
    }
    public void setStandard(boolean bof, boolean bT, boolean bN) {
        setNewBofNewp(bof);
        setIPVisible(bT, bN);
    }
}
