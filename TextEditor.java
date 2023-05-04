import java.awt.*;
import javax.swing.*;
public class TextEditor {
    private JFrame fr;
    private JTextArea ta;
    private JMenu m;
    private JMenuBar mb;
    private JMenuItem mi1, mi2, mi3, mi4;
    public TextEditor() {
        fr = new JFrame();
        ta = new JTextArea();
        mb = new JMenuBar();
        m = new JMenu("File");
        mi1 = new JMenuItem("New");
        mi2 = new JMenuItem("Open");
        mi3 = new JMenuItem("Save");
        mi4 = new JMenuItem("Close");
        fr.setJMenuBar(mb);
        m.add(mi1);
        m.add(mi2);
        m.add(mi3);
        m.addSeparator();
        m.add(mi4);
        mb.add(m);

        fr.add(ta);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(500,500);
        fr.setVisible(true);
    }
    public static void main(String[] args) {
        new TextEditor();
    }
    public JMenuItem getMenuNew() {
        return this.mi1;
    }
    public JMenuItem getMenuOpen() {
        return this.mi2;
    }
    public JMenuItem getMenuSave() {
        return this.mi3;
    }
    public JMenuItem getMenuClose() {
        return this.mi4;
    }
    public JTextArea getTextArea() {
        return this.ta;
    }
    public JFrame getJFrame() {
        return this.fr;
    }
}
