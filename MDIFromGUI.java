import java.awt.*;
import javax.swing.*;
public class MDIFromGUI {
    private JFrame fr;
    private JMenuBar mb;
    private JMenu m1, m2, m3, ms1;
    private JMenuItem mi12, mi13, mi14, msi11, msi12; 
    private JDesktopPane dp;
    private JInternalFrame inFr1, inFr2, inFr3;
    public MDIFromGUI() {
        // Create
        fr = new JFrame("SubMenuItem Demo");
        mb = new JMenuBar();
        m1 = new JMenu("File");
        m2 = new JMenu("Edit");
        m3 = new JMenu("View");
        ms1 = new JMenu("New");
        mi12 = new JMenuItem("Open");
        mi13 = new JMenuItem("Save");
        mi14 = new JMenuItem("Exit");
        msi11 = new JMenuItem("Window");
        msi12 = new JMenuItem("Message");

        dp = new JDesktopPane();
        inFr1 = new JInternalFrame("Application 01", true, true, true, true);
        inFr2 = new JInternalFrame("Application 02", true, true, true, true);
        inFr3 = new JInternalFrame("Application 03", true, true, true, true);

        // SetSomething
        fr.setJMenuBar(mb);
        inFr1.setSize(200,100);
        inFr1.setVisible(true);
        inFr1.setLocation(20, 300);

        inFr2.setSize(250,200);
        inFr2.setVisible(true);
        inFr2.setLocation(150, 50);
        
        inFr3.setSize(250,200);
        inFr3.setVisible(true);
        inFr3.setLocation(425, 200);

        // Add
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        m1.add(ms1);
        m1.add(mi12);
        m1.addSeparator();
        m1.add(mi13);
        m1.addSeparator();
        m1.add(mi14);
        ms1.add(msi11);
        ms1.addSeparator();
        ms1.add(msi12);
        dp.add(inFr1);
        dp.add(inFr2);
        dp.add(inFr3);
        fr.add(dp, BorderLayout.CENTER);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(750,500);
        fr.setVisible(true);
    }
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        SwingUtilities.invokeLater(() -> { MDIFromGUI fr = new MDIFromGUI(); });
    }
}
